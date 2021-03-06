grammar GLC;

options {
    language=Java;
}

@header {
	import java.util.HashMap;
	import java.util.Map;
}

@members {
	Map<String, Double> map = new HashMap<>();
	String variable = "";
	String variable_temp = "";
	boolean validate_condition = true;
	double condition_validator = 0.0;
	String condition_op = "";
	double validator_aux = 0.0;
}

prog:   commands+;

commands
    : conditional
    | loop
    | expr_attrib
    | SEMICOLON
    | COMMENT
    ;	
    
conditional returns [ double v ]
    :	'if'  e = expr_relat {$v = $e.v;} 'then' commands+ conditional_else? 'end' {if ($v == 1) validate_condition = true;}
    ;

conditional_else 
    : 'else' exec_else 
    ;

exec_else
    : {if (validate_condition){ validate_condition = false;} else {validate_condition = true;}} 
    	commands+ 
      {if (validate_condition) {validate_condition = false;} else {validate_condition = true;}}
    ;	
    
loop returns [ double v ]
    : 'while' e = expr_relat {$v = $e.v;} 'do' commands+ 'end' {if ($v == 1) validate_condition = true;}
    ;
    
expr_attrib returns [ double v ]
    : VARIABLE {variable = $VARIABLE.text;} ATTRIB e = expr_arith {
    		$v = $e.v;
    		//System.out.println("" + $VARIABLE.text + $ATTRIB.text + $expr_arith.text + " --> " + validate_condition);
		if(validate_condition) { 
			System.out.println(variable + " = "  + $v); 
			map.put(variable, $v);
		}
               }
    ;
    
expr_arith returns [ double v ]
    :   (
         CONST {$v = Double.parseDouble($CONST.text);}
    	 | VARIABLE { variable_temp = $VARIABLE.text;
                   	if(map.get(variable_temp) != null) {
			   $v = map.get(variable_temp);
		   	} else {
			   System.out.println("ERROR: Variable " + variable_temp + " does not exist.");
		        }
                    }
        )                   
        ( 
        
        	    '*' e = expr_arith {
			$v *= $e.v;
		    }
		    |'/' e = expr_arith {
			if($e.v == 0) {
				System.out.println("ERROR: Division by 0.");
			} else {
				$v /= $e.v;
			}
		    }
		    |'+' e = expr_arith {
			$v += $e.v;
		    }
		    |'-' e = expr_arith {
			$v -= $e.v;
		    }
	)?
	|	    '(' e = expr_arith {$v = $e.v;} ')'	    
	;  
	
expr_relat returns [ double v ]
    :	e = expr_arith {
 	    condition_validator = $e.v;
        }
    	RELAT_OP {condition_op = $RELAT_OP.text;}
	e = expr_arith {
		validator_aux = $e.v;
		
		if (validate_condition) {
			$v = 1.0;
			if(condition_op.equals("=") && condition_validator == validator_aux) {
				validate_condition = true;
			} else if(condition_op.equals("<>") && condition_validator != validator_aux) {
				validate_condition = true;
			} else if(condition_op.equals("<") && condition_validator < validator_aux) {
				validate_condition = true;
			} else if(condition_op.equals(">") && condition_validator > validator_aux) {
				validate_condition = true;
			} else if(condition_op.equals("<=") && condition_validator <= validator_aux) {
				validate_condition = true;
			} else if(condition_op.equals(">=") && condition_validator >= validator_aux) {
				validate_condition = true;
			} else {				
				System.out.println("not a true condition.");
				validate_condition = false;
				$v = 0.0;
			}
		} else {
			$v = 0.0;
		}		
    	}
    ;
    
VARIABLE  
    : ('a'..'z'|'A'..'Z')+
    ;

CONST :	('0'..'9')+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+
    ;

COMMENT
    :	'//' ~('\n'|'\r')* '\r'? '\n' {skip();}
    |   '/*'.*'*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
    
RELAT_OP
    :	'='|'<>'|'<'|'>'|'<='|'>='
    ;
    
ATTRIB	
    :	':='
    ;

SEMICOLON
    :	';'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
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
	boolean qualquerNome = false;
}

prog:   commands+;

commands
    : conditional
    | loop
    | expr_attrib
    | SEMICOLON
    ;	
    
conditional returns [ double v ]
    :	'if'  e = expr_relat {$v = $e.v;} 'then' commands+ conditional_else? 'end' {if ($v == 1) validate_condition = true;}
    ;

conditional_else
    : 'else' commands+ 
    ;	
    
loop returns [ double v ]
    : 'while' e = expr_relat {$v = $e.v;} 'do' commands+ 'end' {if ($v == 1) validate_condition = true;}
    ;
    
expr_attrib returns [ double v ]
    : VARIABLE {variable = $VARIABLE.text;} ATTRIB e = expr_arith {
    		$v = $e.v;
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
		$v = $e.v; 
		
		if (validate_condition) {
		
			if(condition_op.equals("=") && condition_validator == $v) {
				validate_condition = true;
			} else if(condition_op.equals("<>") && condition_validator != $v) {
				validate_condition = true;
			} else if(condition_op.equals("<") && condition_validator < $v) {
				validate_condition = true;
			} else if(condition_op.equals(">") && condition_validator > $v) {
				validate_condition = true;
			} else if(condition_op.equals("<") && condition_validator <= $v) {
				validate_condition = true;
			} else if(condition_op.equals(">=") && condition_validator >= $v) {
				validate_condition = true;
			} else {
				System.out.println("Sei lá condição é falsa.");
				validate_condition = false;
			}
			
			$v = 1.0;
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
    :	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
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
    
//ARITH_OP
    //: '*'|'/'|'+'|'-'
    //;	
    
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
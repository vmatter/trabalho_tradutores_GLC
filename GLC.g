grammar GLC;

options {
    language=Java;
}
@members {
String s;
}

prog:   commands+;

commands
    : expr_attrib
    | conditional
    | loop
    | SEMICOLON
    ;	
	
expr_arith
    :   VARIABLE ARITH_OP expr_arith
    |	CONST ARITH_OP expr_arith
    |   CONST                    
    |   VARIABLE                    
    |   '(' expr_arith ')'         
    ;    
	
expr_relat
    :	expr_arith RELAT_OP expr_arith
    ;
    
expr_attrib
    : VARIABLE ATTRIB expr_arith
    ;

conditional
    :	'if ' expr_relat ' then' commands conditional_else?
    ;

conditional_else
    : ' else ' commands
    ;	
    
loop
    : 'while ' expr_relat ' do' commands
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
    
ARITH_OP
    : '*'|'/'|'+'|'-'
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

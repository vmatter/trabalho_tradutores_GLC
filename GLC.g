grammar GLC;

options {
    language=Java;
}
@members {
String s;
}
prog:   stat+ ; 

stat	:	ID ATTRIB expr SEMICOLON
	;
	
expr
    :   ID ('*'|'/'|'+'|'-') expr
    |	INT ('*'|'/'|'+'|'-') expr
    |   INT                    
    |   ID                    
    |   '(' expr ')'         
    ;	
    
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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
    : '++'|'+'|'--'|'-'|'*'|'/'
    ;	
    
RELAT_OP
    :	'<'|'<='|'=='|'!='|'>='|'>'
    ;
    
ATTRIB	
    :	':='
    ;

SEMICOLON
    :	';'
    ;
    
INT :	'0'..'9'+
    ;
    
CONDITIONAL 
    :

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

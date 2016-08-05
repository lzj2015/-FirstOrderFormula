
grammar LzjAntlr;
program :  ( (tagState | exp) ';')*;   
tagState: tag (LContent)? exp (RContent)? ;
tag : ( key var )+;
key : '$' | '%' ;
exp : term (to_op term)*;
to_op : '->';
term : factor (or_op factor)*;
or_op : '||';
factor : other (and_op other)*;
and_op : '&&';
other : tagState | preState | logicState |  LContent exp RContent; 
preState: (not_op)? predicate LContent var RContent;
logicState : var ( compare_op var )?;
predicate : Lower;
var : Upper | Digit;
compare_op : '>' | '<' | '=' | '!=' | '>=' | '<=';
LContent : '(';
RContent : ')';
Lower: [a-z] ;
Upper : [A-Z];
Digit : [0-9];
not_op : '~';
WS : [ ' '\t\r\n]+ -> skip ;  
	 
	 


grammar Graalisp;
/*------------------------------------------------------------------
 * A very basic implementation of a Lisp grammar.
 *------------------------------------------------------------------*/

@header {
package net.unit8.graalisp.parser;
}
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
program : expression* EOF ;
expression: OP IDENTIFIER (IDENTIFIER | STRING | NUMBER | expression)* CP;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
IDENTIFIER : ((LETTER (LETTER | DIGIT)*) | PLUS | MINUS | MULT | DIV) ;

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
OP : '(';
CP : ')';

STRING : '"' (LETTER | DIGIT)+ '"';

NUMBER : (DIGIT)+ ;

WHITESPACE : [ \r\n\t] + -> channel (HIDDEN);

DIGIT : '0'..'9';

LETTER : LOWER | UPPER ;

LOWER : ('a'..'z') ;
UPPER : ('A'..'Z') ;
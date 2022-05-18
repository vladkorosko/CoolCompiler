grammar CoolGrammar;

//Parser
program : class+ (COMMENT)*;
type: INT | STRING | TYPE | BOOL | OBJECT;
value: ID COLON type;
attribute_without_semicolon : value (ASSIGN expr)?;
attribute : attribute_without_semicolon SEMICOLON;

assigment : (value | ID) ASSIGN (expr | new) SEMICOLON;

parameters : attribute_without_semicolon (COMMA attribute_without_semicolon)*;

method : (ID | MAIN) LPAREN (parameters)? RPAREN COLON type LBRACE (expr*) RBRACE SEMICOLON;

conditional : IF expr THEN expr ELSE expr FI SEMICOLON;

loop : WHILE expr LOOP expr POOL;

block : LBRACE ((expr SEMICOLON)*) RBRACE;

let : LET (parameters)+ IN expr;

case_option: value CASE_ARROW expr SEMICOLON;

switch_case: CASE expr OF (case_option)+ ESAC;

new : NEW type;

isvoid : ISVOID expr;

ariphemitic_operation: PLUS | MINUS | DIV | MUL | EQUALS | LESS |LESSOREQUALS;

class : CLASS (TYPE | MAIN) (INHERITS TYPE)? LBRACE (attribute)* (method)* RBRACE SEMICOLON;

expr : attribute
    | assigment
    | expr DOT ID LPAREN (expr)? RPAREN
    | ID LPAREN (expr)? RPAREN
    | conditional
    | loop
    | block
    | let
    | switch_case
    | new
    | isvoid
    | expr ariphemitic_operation expr
    | LPAREN expr RPAREN
    | ID
    | TRUE
    | FALSE
    | STRING_VALUE
    | NUM
    | ERROR
    | COMMENT;

//Lexer
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQUALS: '=';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
DOT: '.';
SEMICOLON: ';';
COLON: ':';
LESS: '<';
LESSOREQUALS: '<=';
ASSIGN: '<-';
CASE_ARROW: '=>';
TILDE: '~';
ATSYM: '@';

NOT: ('n'|'N')('o'|'O')('t'|'T');
TRUE: ('t'|'T')('r'|'R')('u'|'U')('e'|'E');
FALSE: ('f'|'F')('a'|'A')('l'|'L')('s'|'S')('e'|'E');

IF: ('i'|'I')('f'|'F');
FI: ('f'|'F')('i'|'I');
THEN: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
CASE: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
WHILE: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
LOOP: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CLASS: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
IN: ('i'|'I')('n'|'N');
INHERITS: ('i'|'I')('n'|'N')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF: ('o'|'O')('f'|'F');
LET: ('l'|'L')('e'|'E')('t'|'T');
NEW: ('n'|'N')('e'|'E')('w'|'W');
ISVOID: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');

WS: [ \t\r\n]+ ->skip;

NUM: [0-9]+;
STRING_VALUE: '"'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'"';
COMMENT: '--'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'--';

INT: 'Int';
BOOL: 'Bool';
STRING: 'String';
OBJECT:'Object';
MAIN:('M'|'m')('ain');

TYPE: [A-Z][a-zA-Z0-9]*;
ID: [a-z]('_'|[a-zA-Z]|[0-9])*;
ERROR: . ;
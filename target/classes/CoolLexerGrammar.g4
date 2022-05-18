lexer grammar CoolLexerGrammar;

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
LT: '<';
LE: '<=';
ASSIGN: '<-';
CASE_ARROW: '=>';
TILDE: '~';
ATSYM: '@';

NOT: ('n'|'N')('o'|'O')('t'|'T');
TRUE: 't'('r'|'R')('u'|'U')('e'|'E');
FALSE: 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');

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
INHERITS: ('i'|'I')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF: ('o'|'O')('f'|'F');
LET: ('l'|'L')('e'|'E')('t'|'T');
NEW: ('n'|'N')('e'|'E')('w'|'W');
ISVOID: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');

WS: [ \t\r\n]+ ->skip;

NUM: [0-9]+;
STRING_VALUE: '"'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'"';
COMMENT: '--'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'--';
BOOL_CONST: (TRUE|FALSE);

INT: 'Int';
STRING: 'String';
OBJECT:'Object';
MAIN:('M'|'m')('ain');
ID: [a-zA-Z]('_'|[a-zA-Z]|[0-9])*;
ERROR: . ;
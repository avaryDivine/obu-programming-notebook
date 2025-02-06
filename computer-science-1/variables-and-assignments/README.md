[Variables / Assignments](variables-and-assignments/README.md)

# HW - 005

## 2.1 - Variables and Assignments (general)
1. Describe and give an example of a variable

   a named item, used to hold a value, x or numDogs...etc
2. Describe and given an example of an assignment

   gives a variable a value, the left side must be a variable, the right side may be an expresion. numDogs = 5 or x = y + 3
## 2.2 - Variables (int)
1. Demonstrate (give an example) of a Java declaration of an integer variable and assignment and an integer literal and an expression

   declaration defines a new variable, specifying its name and its type.

   integer variable: int numDogs; numDogs = 8;

   integer literal: 30
2. Describe the allocation process and its role in variable declarations

  determine memory location to store data
## 2.3 - Identifiers
1. Describe the Java identifier rules

   letters, underscore, dollar signs and digits

   start with underscore, dollar sign, or letter

   upper and lowercase do matter
3. Describe and give examples of Java reserved words

  key word, cannot be used as an identifier

  ex: (new, package, if, short)
## 2.4 - Arithmetic Expressions (general)
1. Describe an (arithmetic) expression

  combination of items like variables, literals, operators
2. Describe the precedence rules for operator evaluation

  1. ()
  2. unary - (negation)
  3. */%
  4. + -
  5. left-to-right
kind of like PEMDAS

# HW - 006
## 2.7 - Floating Point Numbers (double)
1. Describe and give an example of a floating point number and a literal

   float: 458.99         literal: 35.0
2. Describe how to choose between a int or double variable type

   integers are often used for countable values for example number of cookies, number of days,
   whereas double variable types are used for measurments (98.6 degrees) or fractions of countable values (average number of people in a family)
4. Demonstrate (give an example) of Java code for formatting floating point output

   
5. Explain the answer to division by 0.0 and 0.0 divided by 0.0

   0.0 divided by a float results in zero, a float divided by 0.0 results in either infinity or -infinity, 0.0 divided by 0.0 results in "not a number"
6. Demonstrate (give an example) of a floating-point literal in scientific notation
 
   346785.0 in scientific notation is 3.46785E5 
7. Demonstrate (give an example) Java declaration of a floating-point number, assignment, etc.

   
## 2.9 - Constant Variables
1. Demonstrate (give an example) declaration of a constant-valued variable
```
   final double SECONDS_PER_DAY = 86400.0;
```
2. Describe the meaning and use of a constant variable

   a constant variable or a final variable is a variable that cannot be changed, guarantee a variable always has the same value.

## 2.10 - Using Math Methods
1. Explain the purpose and use of the math library / class

   contains math symbols and functions that you can call and use in your program
2. Describe the purpose and use (give examples) of a method

   perform operations such as square root (Math.sqrt(x)), absolute value (Math.abs(x))

# HW - 007
## 2.11 - Integer Division and Modulo
1. Describe integer division

   division that does not generate a fraction, so then 10/4 = 2 instead of 2.5 for example
2. Describe integer modulo

   determines the remainder of the division of two integers, so then 43 % 10 = 3 for example.
3. Demonstrate the use of Java integer division and modulo (no answer needed in the homework)

## 2.12 - Type Conversions
1. Describe the need for type conversions

   allows you to change from one data type to another, 
2. Describe implicit type conversion

   automatic, common conversions carried out by the compiler. int and double types
3. Demonstrate the use of type casting in Java (no answer is needed in the homework)

   
## 2.14 - Characters
1. Demonstrate the use of character variables (no answer is needed in the homework)
2. Discuss the representation of characters as numbers (include discussion of the ASCII standard)

   most characters are coded and stored as numbers, the ASCII is a standard for encoding numbers, 
3. Describe escape sequences and their purpose

   two-character sequence that represents a character such as \n for newline or \t for tab
   
## 2.15 - Strings
1. Describe the Java string data type

   sequence of characters, double quotes, 
2. Demonstrate the use of String variables in Java (no need to answer this in homework)
3. Describe the difference between next() and nextLine() in the Scanner class

   next() reads until next whitespace, nextLine() reads all characters on that one line.

HW-001
1. Basic instruction types for a Java program include import java.util.Scanner which enables a program to get an input.  The scanner part of this code is a text parser that allows the user to input numbers or words. System.out.print() is used to print and output something. .ln at the end of an instruction creates a newline. These are just few of the basic instructions.
2. Computational thinking involves creating a sequence of instructions to solve a problem. When creating a program, computational thinking is required because you must create and understand the steps or sequence of instructions that will be needed to solve the problem or get the intended result.
3. A Java program starts in main() and then the statements are written out, one at a time in mains braces {}. Each statement must have its own line and end in a semicolon. 
4. To enable the program to get input from the user:
import  java.util.Scanner;
5. To print information to the console:
System.out.print("Hello World!");
Putting ln at the end as in System.out.prntln("Hello World!") will create a newline.
6. A syntax error is an error that will appear if you violate the rules of the programming language such as how symbols can be used or combined. One big example is forgetting a semi-colon. A syntax error is also known as a compile-time error because it is detected by the compiler. Another kind of error is a logic error. With a logic error or a bug, the program will compile but may not run correctly or give the desired result. An example of this is using the wrong variable or operation. A warning is when the compiler can accurately compile the program but suggests a possible logic error.
7. An IDE is a software that combines a text editor and compiler it can also contain other tools. Instead of having to install different software to write, compile, test and debug code, a programmer can benefit from an IDE which combines a lot of the software needed to accomplish those tasks.


# Steps for creating a class
1. create file, same name as class.java
2. define the instance variables, top of calss, be sure to give their type
3. Create constructor(s)
   ```
   public ClassName() {
     
   }
   ```
   Rule: public followed by name of class and parameters
4. Implement methods
   a - define the "signiture"
   assume public
5. finish method implementation
6. run ```mvn clean compile```
7. write test cases
8. run ```mvn test```

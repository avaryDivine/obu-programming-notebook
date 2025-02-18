# HW - 009

## 3.2 Detecting Equal Values with Branches
1. Describe and give example Java code to detect if two items are equal

use double equal (==), if numDogs == 6
  
3. Describe and give example Java code to select among two options (you can just print out the result of the selection)

  ```
x = 6;
if (x == 6) {
         System.out.println("True");
      }
else {
         System.out.println("False");
      }
```
3. Describe and give example Java code to select among more than two options (print the result)

```
numPeople = 25;
if (numPeople == 0) {
         System.out.println("not zero");
      }
else if (numPeople == 10) {
         System.out.println("not 10");
      }
else {
          System.out.print("some other value")
      }
```

4. Describe and give example Java code for the correct way to compare strings for equality

   instead of usig == you would use something like equals() or comparesTo()

## 3.4 Detecting Ranges with Branches
1. Describe and give example Java code to detect a range (using logical operators and gaps)

# HW-010

## 3.7 Detecting Multiple features with Branches
1. Describe and give example Java code to detect multiple features

  This has multiple independent if statements/branches, used to detect multiple features
  ```
if (numPeople < 6) {
  tollFee = 3.15;
}
if (numPeople == 3) {
  tollFee = tollFee * 0.5;
}
```
2. Describe and give example Java code to use nested branches
   used to make decisions based on multiple features
```
if (numTickets > 3) {
  if (ticketCost > 200) {
    discount = 30;
  }
  else if (ticketCost > 100) {
    discount = 20;
  }
}
else {
  discount = 0;
}
```
## 3.10 Order of Evaluation
1. List the Java order of evaluation rules for arithmetic, logical and relational operators

  - parentheses ()
  - !
  - arithmetic (using their precedence rules) * / % + -
  - relational operators < <= > >=
  - equality and inequality == !=
  - logical AND &&
  - logical OR ||
2. Describe and give example Java code for a complex logical expression
  

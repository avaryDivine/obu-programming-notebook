# HW-013

## 4.1 Loops(general)
1. Describe a loop body

  loop statements/ the things that are executed every loop
2. Describe a loop iteration

  each time through the loop body/ statements
3. Demonstrate Java implementation to compute an average (no answer needed in the homework)
4. Demonstrate Java implementation to count specific values in a list (no answer needed in the homework)
5. Demonstrate Java implementation to find the maximum value in a list (no answer needed in the homework)
   
## 4.2 While Loops
1. Demonstrate Java code to get a value from the user (int, float / double, char, String, etc.)

  userNum = scnr.nextInt()
  userDoub = scnr.next()
  userChar = scnr.next().charAt()
2. Demonstrate Java implementation of a while loop (provide example code)
```
  while (numPeople < 8) {
    System.out.println("Num people is " + numPeople);
    numPeople = numPeople + 1;
}
```
3. Demonstrate Java implementation of loop expressions (provide example code)

   see num 2
4. Demonstrate Java implementation of a while loop that modifies the loop condition inside the loop (provide example code)

    see num 2
5. Describe an infinite loop and an example of how it can happen

  never altering the value in the body
6. Demonstrate Java implementation of a while loop with a sentinel value (provide example code)

## 4.7 Nested Loops
1. Describe a nested loop

loop that appears in the body in another loop
2. Demonstrate Java implementation of a nested loop (show code example)
```
for (i = 0; i < 6; ++i) {
  for (j = 0; j < 3; ++j) {
    System.out.println(i + j);
  }
}
```

## 4.8 Developing Programs Incrementally
1. Describe incremental program development

writing and testing your code in steps in order to catch errors and mistakes
2. Describe the purpose of "FIXME" or "TODO" comments

reminders to go back and fix or add things in your code

## 4.9 Break and Continue
1. Describe the purpose of a break statement

immediate exit of a loop
2. Describe the purpose of a continue statement

immediate continuation to the loop condition check

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

# HW-014

## 4.4 For Loops
1. Demonstrate Java implementation of a for loop (provide example code)
```
int a;
for (a = 0; a < 8; a = a + 1) {
System.out.println(a);
}
```
2. Compare and contrast for and while loops

for loop iterates a more specific amount of time and ensures that the value is changed and will eventually break the loop
3. Demonstrate Java implementation of a for loop to find the maximum value in a list (provide example code)
```
numValues = scnr.nextInt();

for (i = 0; i < numValues; ++i) {
  value = scnr.nextInt();

  if (i == 0) { 
    max = value;
  }
  else if (value > max) {
    max = value;
  }
}

if (numValues > 0) {
  System.out.println("Max: " + max);
      }
```
## 4.6 Loops and Strings
1. Demonstrate Java implementation of a loop to process each character in a string to count, find, etc. (provide example code)
```
word = scnr.next();

numLetters = 0;
  for (i = 0; i < word.length(); ++i) {
    if (Character.isLetter(word.charAt(i))) {
      numLetters += 1;
    }
}
System.out.println("Num of letters: " + numLetters);
```

# HW-021
## 6.9 Two dimensional arrays
1. Describe how to declare a two-dimensional array in Java (show example code)
```
int [][] myArray = new int[3][3];
```
2. Describe how to initialize a two-dimensional array in Java (show example code)
```
myArray[0][0] = 3;
myArray[0][1] = 5;
```
3. Describe how to iterate over a two-dimensional array in Java (show example code)
```
for(int i = 0; i < myArray.length; ++i) {
         for(int j = 0; j < myArray[i].length; ++j) {

         }
}
```
## 6.10 Enhanced for loop
1. Demonstrate the Java enhanced for loop (show example code)
```
for (int x : myArray) {
   System.out.println(x);
}
```

# HW-020
## 6.7 Using a loop to modify a copy of an array
1. Implement a Java algorithm to modify an array (show example code)
```
for (i = 0; i < array.length; ++i) {
         if ((array[i] % 2) == 0) {
            array[i] = 0;
         }
      }
```
2. Implement a Java algorithm to copy an array (show example code)
```
for (i = 0; i < array.length; ++i) {
         copied[i] = array[i];
      }
```
## 6.8 Debugging example
1. Describe some common errors in reversing an array's elements

- array-index-out-of-bounds exception occurred
- failed to actually swap the array elements, instead the code just copies values in one direction

# HW-019
## 6.4 Iterating through arrays
1. Demonstrate (show code example) the use of a loop to iterate over elements of an array
```
for (i = 0; i < theArray.length; ++i) {
   
}
```
2. Compute the sum of the array elements
```
int sum = 0;
for (i = 0; i < theArray.length; ++i) {
   sum = sum + theArray[i];
}
```
3. Find the maximum value of the array elements
```
max = theArray[0];
for (i = 0; i < theArray.length; ++i) {
   if (theArray[i] > max) {
      max = theArray[i];
}
}
```
4. Find the average of the array elements
```
int sum = 0;
for (i = 0; i < theArray.length; ++i) {
   sum = sum + theArray[i];
}
int average = sum/ theArray.length;
```
5. Find an item (or items) in the array

use index theArray[1]
7. Describe the "accessing out of range array element" error

results in a runtime error, i.e. if you try to access theArray[9] when theArray only has indecies 0-8
## 6.6 Swapping two variables
1. Describe (in detail) an algorithm to swap two variables
```
tempVal = X;
X = Y;
Y = tempVal;
```

[Arrays](arrays/README.md)

# HW-018

## 6.1 - Array Concept
1. Describe the concept of an array

Stores a list of data items
2. Describe an array element

one item in the array
3. Describe the purpose of an index in an array

allows you to access a specific element

## 6.2 - Arrays
1. Demonstrate (show code example) declaration of a Java array
```
int[] studentsGrades = new int[5];
```
2. Describe the purpose of [] in an array declaration

used to indicate that the variable is an array
3. Describe the ordering of array indices

4. Describe the use and purpose of the length property of an array

tells you how many elements are in the array, can be used to loop
5. Demonstrate (show code example) initialization of an array
```
int[] studentsGrades = {80, 92, 67, 79, 85};
```

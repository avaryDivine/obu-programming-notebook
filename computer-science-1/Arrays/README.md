




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

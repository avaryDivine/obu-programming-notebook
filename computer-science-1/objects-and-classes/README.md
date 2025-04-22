[Objects and Classes](computer-science-i/README.md)

# HW-024
## 8.10 Objects and references
1. Define a (object) reference

variable type that refers to an object, 
2. Describe the purpose and use of the new operator

allocates memory for an object, then returns a reference to the object's location in memory
## 8.11 The "this" implicit parameter
1. Define the implicit parameter

object reference before method, 
2. Define 'this' in the context of Java objects

mplicitly-passed object reference is accessible via the keyword this
## 8.12 Primitive and reference types
1. Define a primitive type

stores data for that variable type, 
2. Define a reference type

refer to instance of class
3. Define a wrapper class

built-in reference types that augment the primitive types
4. Define immutable

a programmer cannot change the object via methods or variable assignments after object creation
5. List the allowable relational operators for wrapper classes
## 8.13 Wrapper class conventions
1. Define, compare and contrast autoboxing and unboxing

Autoboxing is the automatic conversion of primitive types to the corresponding wrapper classes. Unboxing is the automatic conversion of wrapper class objects to the corresponding primitive types.

# HW-022
## 8.4 Mutators, accessors, and private helpers
1. Describe a mutator

a method that may modify a classes field
2. Describe an accessor

method that accesses fields but may not modify them
3. Describe a setter / getter

setter is a mutator, getter is an accessor
4. Describe a private helper method

only called from classes other methods, cant be called by other classes

## 8.5 Initializations and constructors
1. Describe the purpose and use of a constructor

   used to initialize all fields, no return type
   
## 7.1
1. Define an object:
   
   grouping of operations and data or methods and variables
3. Define abstraction (aka information hiding, encapsulation):
   
  When user interacts with data on a high level, lowlevel information is hidden

## 7.2
1. Describe a (Java) class:
   
   defines a new type used to group data and methods to create an object
3. Describe public member methods:
   
   all of the operations that a class can use on an object
5. Describe a reference variable:
   
   refers to instance of a class 
7. Describe the purpose and use of the new operator:
   
   allocates an object to the class type
   
   Restaurant favLunchPlace = new Restaurant(); creates a Restaurant object named favLunchPlace.
9. Describe the purpose and use of the member access operator:
    
    "." invokes a method on an object

   favLunchPlace.setRating(4) calls the setRating() method on the favLunchPlace object, which sets the object's rating to 4.

## 7.3
1. Describe the purpose and use of private fields:

   variables that only member methods can access, class users can not access it
3. Describe a (class) method definition:

   

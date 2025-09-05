- Declaring a variable (let, const, var):
```
var aVariable = 67;
let language = "JavaScript";
```

- Constant (can not be changed)
```
const speedOfLight = 30000;
```

- Output:
```
console.log("Hello " + language + "!");
console.log("Try out the JavaScript you learn in this sandbox!");
```

- Identifier Rules
1. letters, digits, underscore and $
2. can not start with a digits
3. can not be a reserved word (while, let, etc.)

- Input:
``` 
let v = prompt('Enter something');
```

- +, -, *, /, %(modulo - integer division remainder)

```
let x = 2;
let y = 3;
let z = "2";
let w = "3";

console.log(x + z); // converts x to a string and performs string concatination
```

- given a string, get a number
```
  let a = parseInt("45"); //parses to a number
  console.log(a + x);
  ```

- function (aka method)
  ```
  function add_two_numbers(x, y) {
      let sum = x + y;
      // return the output
      return sum;
  }

  let result = add_two_numbers(12, 24);
  console.log("results =" + result);


  let my_function = function(x, y) {
      return x * y;
  }

  let result = my_function(34, 56);
  console.log(result);

  let another_function = my_function;
  console.log(another_function(20, 10);

  let weird_function = function(x, y, fn) {
    return(fn(x, y));
  }

  console.log(weird_Function(34, 56, my_function));
  console.log(weird_function(20, 10, my_funtion));
  ```


  # Json
  ```
  {
    "game" : "Mich vs. OU",
    "date" : "09/06/2025",
    "temp" : 76,
    "score" : {
      "Mich" : 76,
      "OU" : 0
    },
    "referees" : ["Joe", "Fred"]
  }
  ```
- working in java script
  ```
  let myData = "{\"name\" : \"Joe\"}";

  //convert to Object
  let myDataObj = JSON.parse(myData);

  console.log("The name is " + myDataObj.name);
  ```
  

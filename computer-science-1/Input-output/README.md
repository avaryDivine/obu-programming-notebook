[Input / Output](input-output/README.md)

# Input/Output

## 5.1 Output and input streams
1. Describe the purpose of the PrintStream class and the System.out object

provides methods for writing data to output, normally puts data into buffer. predefined PrintStream object that is associated with a system's standard output, usually a computer screen
2. Describe the purpose of the InputStream class and the System.in object

provides read methods for extracting data, predefined InputStream object that is associated with a system's standard input, usually a keyboard
3. Describe the purpose of the Scanner class

augments System.in by automatically scanning and converting bytes into the data type
4. Demonstrate the use of the Scanner class (no homework answer is needed)

## 5.2 Output formatting 
1. Describe the purpose of output formatting

adjust the way programs output appears
2. Describe the purpose and use of a format string

specifies the format of the text to print
3. Describe the purpose and use of a format specifier

specifies the type of value to print in its place, begins with %
4. Provide example code for the use of the format string
```
System.out.printf("In game number %d player number %d won!\n", gameNumber, winner);
```

## 5.3 Streams using streams
1. Demonstrate (provide code) for extracting data from a String
```
Scanner inSS = new Scanner(userInfo);
middleName = inSS.next();
```
2. Demonstrate (provide code) for writing to a String
```
PrintWriter ageOSS = new PrintWriter(ageStream);
int userGrade;
userGrade = scnr.nextInt();
ageOSS.print(userGrade);
```

## 5.4 File input
1. Demonstrate (provide code) for opening a file
```
FileInputStream fileByteStream = null;
Scanner inFS = null;
```
2. Demonstrate (provide code) for reading from a file
```
num = inFS.nextInt();
```
3. Demonstrate (provide code) for reading all lines from a file

## 5.5 File output
1. Demonstrate (provide code) for opening and writing to a file
```
fileStream = new FileOutputStream("myoutfile.txt");
outFS = new PrintWriter(fileStream);
outFS.println("Hello");
outFS.println("1 2 3");
```

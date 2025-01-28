[Maven](computer-science-i/README.md)

# HW-003-Maven
1. Describe the purpose of use of maven

  Maven helps build and manage Java projects. It allows the developer to understand the whole development effort. It makes building easy, has a uniform build system and encourages better practices.
  
2. Document the steps for installing maven on your computer (you can include links)

  first you need to download maven:
  https://maven.apache.org/download.cgi

  You need to save it as a zip and be sure to have java installed. You then need to add it as a path and confirm it worked by typing mvn --version into your terminal
  https://maven.apache.org/install.html
  
3. Demonstrate creation of a project

  create a directory and open a shell. then execute a command goal like this one:
mvn archetype:generate "-DgroupId=com.mycompany.app" "-DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

4. Describe the parameters to the command to create a project

   
5. Demonstrate cleaning compiled files

  to clean type mvn clean
  
6. Demonstrate compiling a project

   to compile type mvn compile
   
7. Demonstrate testing a project

   mvn test
   
Demonstrate running a project from the command line


## Testing
In AppTest.java write a test for each of your methods. 

``

@Test

    public void test_002() {
    
        C1 c1 = new C1(1, 2,3);
        
        assertEquals(6, c1.add3());
        
    }
  ``
  
  name the test (test_002) 
  
  create a variable that is of your class C1, give numbers to the constructor
  
  assertEquals(expected value, what method)
  
  once you have your tests, in your terminal type mvn clean and compile, then mvn test, make sure everything run smooth and is green.

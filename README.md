# Training_App
Basic Java application for training.

## Environment Setup
1. Setup Environment
 - [Environment Documentation](https://sites.google.com/view/team930programmingdoc/organization/environment)
2. Install GitHub Desktop
 - [Download Website](https://desktop.github.com/download/)
 - Login to GitHub Desktop
 - Clone this repository
3. Install VSCode Extensions
 - Java Run
 - Gradle
4. Update Extensions & Reload
 - Debugger for Java
 - Language Support for Java
 - Project manager for Java

## Create a Branch
1. Open the "Current Branch" menu on the top bar of GitHub Desktop, and select "New Branch"
2. Name this branch
 - We use \<Your First Name\>-branch for our naming. e.g. luke-branch, evan-branch
3. If not already on branch, switch to it on GitHub Desktop
 - On the "Current Branch" menu on the top bar of GitHub Desktop, select <Name>-branch under "Recent branches"

## Variables
1. Open Variables.java (under app/main/java/_training). What do you think this code does?
2. Run the code and see the result.
 - The code starts with "int" myNum and "int" myOtherNum. "int" stands for *integer*, which is a number without a decimal.
 - It then states the names after "int," which in this case are myNum and myOtherNum. The equals sign means it is this variable to something, saying it is equal to a value. This code sets the numbers to 1 and 2.
 - After this, it makes one last number, myFinalNum. It sets this number equal to the sum of myNum and myOtherNum. Thinking back on Algebra (ugh), you can substitute 1 for myNum and 2 for myOtherNum in the myFinalNum statement. It will become myFinalNum = 1 + 2.
 - The computer then prints the result!
3. Modify the code to include a third number that is multiplied by myFinalNum.
 - Hint: The sign for multiplication in Java is `*`, and Java follows Order of Operations (Parentheses, Multiplication / Division, Addition / Subtraction)
 - The solution is found in VariablesSolution.java

### Variable Types
#### String
 1. Add `String myText = "Hello!";` and `String myOtherText = "Again!";` to Variables.java.
 - A string represents a "string of characters." In other words, string is text!
 2. Add the two strings together into a new variable, myFinalText, and print it out.
 - `String myFinalText = myText + myOtherText;`
 - `System.out.println(myFinalText);`
 - Does it work?
 - What do you think is happening?
 - Try to fix it!
 <details>
 <summary>Click for Answer!</summary>
 When you are adding the two strings together, it adds "Hello!" and "Again!". There isn't a space inbetween, resulting in "Hello!Again!" You can fix it by adding a space after "Hello! " or before " Again!" View the solution if confused.
 </details>

#### Float
 1. Add `float myDecimal 2.5f;` and `float mySecondDecimal 5.0f;` to Variables.java.
 - Float stands for "Floating-point decimal."
 - You must use an f after the number declaration, and it must be a decimal.
 2. Divide myDecimal by mySecondDecimal and store it in myLastDecimal, and print the output.
 - Hint: To divide in java, use `/`.
 - You should get 0.5, which is 1/2. This is true because 2.5 is half of 5.0.
#### Bool
 1. Add the following code to Variables.java and run it.
 ```java
 boolean ateBreakfast = true;
 boolean ateLunch = true;
 boolean ateDinner = false;

 System.out.println(ateBreakfast && ateLunch);
 System.out.println(ateLunch && ateDinner);
 ```
 - A boolean is essentially a yes or no, but instead of yes, we say "true", and instead of no, we say "false".
 - The `&&` means "and." Look through the code. It prints out ateBreakfast && ateLunch, or ateBreakfast *and* ateLunch. We ate both of them (they both are true), so it will say true. Meanwhile, ateLunch is true, but ateDinner is *not*, so on the second print, we did *not* eat lunch and eat dinner.
 - We will talk more about booleans and logic soon.

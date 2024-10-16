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
 1. Add `float myDecimal = 2.5f;` and `float mySecondDecimal = 5.0f;` to Variables.java.
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

## Logic
### If statements
 1. Read through IfStatement.java, and run it.
 - The `||` operator means "or."

<details>
<summary>Click for explanation</summary>
IfStatement.java declares 4 booleans. It then goes into an if statement, which checks if something is true, and then runs code. Inside the parentheses, it has a set of conditions. The first is if you brushedTeeth or tookMints. You brushedTeeth, and didn't take mints, but this is an or, which means only one has to be true. The second condition is if you did your homework, which is false. The third is preparedForRobotics, which is true. Because didHomeWork is false, you aren't preparedForRobotics and *didHomework*, so you can't go (the if statement isn't run).  
</details>
 2. Modify the if statement's ending to the code below.

```java
if ( (brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
    System.out.println("I can go to robotics tonight!");
} else {
    System.out.println("I can't go to robotics yet.");
}
```
 - Now the code is skipping over the if statement, but "else" means otherwise. So, if I did all of my stuff, then I can go, *otherwise*, I can't go.
 - Try to add another if statement to check for each boolean, and see if it's *not* true.
    - Hint: `!(variable)` = not, reverses the boolean
    - For example, `!true` = false, `!false` = true
    - See the solution in IfStatementSolution.java.
 3. Shorten the code to below.

```java
if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
    System.out.println("I can go to robotics tonight!");
} else if (!(brushedTeeth || tookMints)) {
    System.out.println("Gotta freshen up!");
} else if (!didHomework) {
    System.out.println("Oh darn, I gotta do my Math homework!");
} else if (!preparedForRobotics) {
    System.out.println("Oop, I need to finish finding my sponsors!");
}
```
 - Read the code over, substituting in your mind "otherwise" in place of "else."
 - It should make some sense. If I did everything, then I can go. Otherwise, if I didn't (not) freshen up, I need to do that. Otherwise, if I need to finish my homework, I will do that. Otherwise, if I am not prepared for robotics, I need to get prepared.

### While Loops
 1. Open While.java & run it.
 - You may wonder - How come there are 9 lines printed to the console, when there are only 2 println statements?
 - A while loop is a block of code that will run *forever* until a condition is met. In this example, the condition is `hoursWorked < 8`. So, it will loop forever when you have worked less than 8 hours.
 - Every iteration, it will print how many hours you have worked so far, then you will work 1 hour. (You will add 1 to hoursWorked). You will keep doing this when you have worked less than 8 hours, until you pass it, so you don't need to work anymore.
 2. Change the value 8 in the less-than to 5 and run.
 - How did the result change?
 3. Change the `+` in the for loop when incrementing the hoursWorked into a `-`.
 - Uh oh. The code is going to run forever! Look at the console, then stop the code with the stop sign in the top center of your screen.
 - This happens because evey time the while runs, it will decrement the hoursWorked, so it will never go up and past 8 hours. You will work hours backwards somehow, and eventually you will have worked -613620 hours...
 - Think of this happening on the robot. You accidentally make the robot move forward while the distance to the target is more than 5, but instead of decreasing the distance, you increase it... Not good! You always have to be very careful when writing for loops to make sure it doesn't crash when running.
 4. Add an if statement checking if hoursWorked is less than 1 at the top of the loop, and inside the statement, add this code: `break;`
 - What happens?
 - Ok, so working -1 hours and then stopping is not realistic, but this code does show as a check to make sure that something unrealistic doesn't happen, and prevents it becoming a ***major*** problem.
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

### For Loops
 1. Open For.java and read through the code.
 - The code for `for` loops looks a little confusing, but it makes sense when you break it down.
     - `for (int i = 0; i < 20; i++) { }` breaks down into:
 ```java
 int i = 0;
 while(i < 20){
    // Code inside for loop here!
    i++;
 }
 ```
 - Yep, a for loop is only a disguised while loop!
 2. Change the value of how much the loop *iterates*.
 - An iteration is one time the loop runs.
 - Going back to the while example, you would want to change the conditional section to change how many times the loop runs. Look between the while example and the for loop, and find where you would see the conditional.
 3. Why use for instead of while?
 - For loops are more compact, because they have the iterator (counter) built in.
 - With while loops, you need to initialize a variable before the loop, have the conditional statement, and have to remember to increment the variable inside the loop.
 - With for loops, you can just have the declaration, conditional, and increment all together in the statement.
 4. Create a for inside of the existing for.
 - Try showing you are running in quarters of a circle!
 - Remember, 4 is *NOT* less than 4, so it will show you run 0,1,2,3 quarters if you are `i < 4`.
 <details>
 <summary>Click for solution!</summary>
 for(int quarters = 0; quarters < 5; quarters++){
    <br>System.out.println("I ran in " + quarters + " quarters of the " + i + " circle!");
 <br>}
 </details>

 5. Experinment with for loops more.
 - Try making it count backwards! (You will need a greater than in your conditional.)
 - Print the current circle in the quarter loop! (If you have two loops inside eachother.)

## Apply What You Know
 Lets create a handful of math problems and print the results. The point of this task to apply what you have learned so far. To do this, do the following:
 1. Create 4 addition calculations
 - Example: `1 + 2 = 3`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
 2. Create 4 subtraction calculations
 - Example: `1 - 2 = -1`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
 3. Create 4 multiplication calculations
 - Example: `2 * 2 = 4`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice
  4. Create 4 division calculations
 - Example: `4 / 2 = 2`
 - There should be three variables created for each number in each calculation
 - One math problem should be done with integers
 - One math problem should be done with floats
 - One math problem should be down with doubles
 - One math problem of your choice

### Reflection
 1. How well did you do?
 - Think about how many attempts it took to get it right.
    - Even the best programmers have to get it wrong multiple times before their code finally works.
    - It's okay if you needed to get help, even when working on the robot, you may need to get help from your sub-leads to get help with a new problem you have never seen before.
 2. Was it annoying to write so much code?
 - 64+ lines for writing 16 problems must be super annoying, and resulting in lots of copy and pasting.
 - There is an easier way to repeat code that we are going to learn now.

## Functions <!-- TODO: Write Machines explanation -->
 1. Open and run Functions.java.
 - What do you notice about the code?
 - What do you notice about the result?
 2. Break down what you see.
 ```
   This tells Java that we want a *function* in our class
   |     This tells Java we won't return anything
   |     |    This is what we name our function
   |     |    |     These parentheses include paramaters. (none)   
   v     v    v     v
 static void printHi(){
    // This is the code we are running
    System.out.println("Hello!");
 }
 ```
 - This breakdown uses unknown language like class, and paramaters, which we will learn later.
 3. Edit the code in the function.
 - Add some other println to the function. Remember, the code should be put in after the first println, but before the ending curly bracet (`}`).
 - Run the code, and see what happens.
 4. Functions make code easier to write and read.
 - Think back on the MathProblems.java you wrote. How could you improve this with functions?
 - You will need to learn one more thing about functions before you can rewrite MathProblems with functions.

### Parameters <!-- TODO: Continue Machines explanation -->
 1. Open Parameters.java, and run it.
 - What is different about the calls (the function name with parentheses) in main?
 - Change some of the numbers in the parentheses of the calls.
 - Look through the `square(int num)` function. What do you think it does?
 2. Change the square function into a multiply function.
 - While this may seem redundant (Why not just use `*`?), it is easy for practice.
 - Add another parameter into the square function, by adding a comma, and then another variable declaration.

<details>
<summary>Click for solution.</summary>
static void square(int num, int num2)
</details>

 - Rename the function by right-clicking on "square" and in the menu, clicking on "Rename Symbol".
 - Update all of the function calls to use this new paramater with a comma.

<details>
<summary>Click for solution.</summary>
multiply(3, 6);
multiply(2, 9);
</details>

 3. Pass in some variables to `multiply()`.
 - Create some `int` variables in main.
 - Pass in the variables to the `multiply()` function, by just saying their name instead of a number. Example: `multiply(myNum,myNum2);`
 4. Try to pass in a decimal number (double or float) to multiply.
 - `multiply(2.3,6.1);`
 - The red squigglies on `multiply` read: `The method multiply(int, int) in the type ParametersSolution is not applicable for the arguments (double, double).` This is basically telling you that multiply *MUST* take in 2 ints, and cannot take in 2 doubles.
 5. Duplicate (copy & paste) multiply, and modify it to take in 2 doubles, and name it `multiplyDecimals`.
 - Try to change the `multiply(2.3,6.1);` into a `multiplyDecimals(2.3,6.1);`.
 4. Problem with functions currently:
 - What if you didn't want to just print out the result, but pass it into another function, or do something else rather than printing?

### Return Values <!-- TODO: Finish Machines explanation -->
 1. Open Return.java, and look through the code.
 - Run the code. What is it doing?
 - The `return` keyword is put at the end of the function running. It is when the function is done running, and it gives a result.
 - You can use the return value like a variable. This means, you can call the function wherever you would use a variable, even storing the return in a variable!
 2. Remove the variables, replacing them with function calls in the code.
 - Call `square(5)` and `square(2)` in place of squareFive and squareTwo in the println statement.
 - Try adding more `square()` calls in code, like another print statement.
 3. Assign the result from a `square()` to a float.
 - Before running, what do you think will happen?
 - Try fixing the function.
    - Remember - the paramater used in the template is a float.

<details>
<summary>Click for solution.</summary>
static float square(float num){
    //code
}
<br>
Turns into...
<br>
static int square(int num){
    //code
}
</details>

## Object-Oriented Programming
### Why do we do OOP?
 1. Open Robots.java.
 - Look through the code. What is it doing?
 2. Drive the robot around some more.
 - Add more actions for the robot through functions, like turn or intake.
 3. Make another robot.
 - Rename the functions for the current robot by adding a label at the end, like 1.
 - Copy the functions, and edit them to specify that a different robot is doing the actions.
 - Rename the new functions so that you can specify which robot is doing what action in the code.
 - Set the speed for this robot, using a **new** integer variable.
 4. Add another action to both of the robots, with its own parameter.
 - An example would be turn, with a "degrees per second" parameter.
 - Create new variables for each of the robots with their turn speed, passed into the new function.
 #### What is the problem with our method currently?
 This code is becoming very hard to maintain! We need to copy and paste quite a lot, and it is becoming hard to keep track of the robots already. Imagine if we had an entire tournament of robots running on the same code! (This is pretty unrealistic, but just bear with me.)
 
 We need some other way to control multiple robots, that would definitely help with robots. Imagine if, instead of having to manage all of these functions and variables representing the robots properties, when we need a new robot, we can just say "Create a new robot" and give it its properties. We *can* do this, almost literally, with Object-Oriented Programming!
 ### What is it?
 Let's break it down.
 
 Object obviously means object, oriented means that something is focused on it, and programming is... programming. Putting it together, it means "Programming focused on objects."

 Object oriented programming is a style of programming heavily focused on Objects. An object doesn't have to be something physical, though it will be in this training. What do objects have in real life?
 - Objects have properties. A paint can be blue, or it can be pink.
 - Objects can do things. You can drive a car, or a cat can meow.
    - They can do things depending on their properties. If a car doesn't have gas, it won't start. If it does, it will start.
 - One type of object can be another type of object. This may be confusing. 
    - A taco *is* a food.
    - A cat *is* an animal.
    - Mostly, this doesn't work the other way around.
        - A food *isn't* a taco. What if it is a cake?
        - An animal *isn't* a cat. What if it's a dog?
- Objects sometimes "guard" their properties.
    - You can't directly see how much gas is in your car, it is hidden for your safety, but you can estimate how much is in it through the meter on the dashboard.
    - You don't know what someone is thinking unless you ask them, because they want to keep their thoughts ***private***. (This term is important for later)
    - Not all properties are guarded.
        - You can go in a park and see all it has to offer if it is ***public***. (This term is also important for later)
- Objects have a way they are made.
    - You manufacture cars in a factory.
    - Cats are born.
    - Tacos are served.
 
 Literally all of these things that I had just stated are actually concepts in actual Object Oriented Programming!

 Typically instead of saying "Objects", we will say "Class". It may be confusing at first, but that is okay. Properties are sometimes called variables or attributes. The way things are made are called "constructors." Things they can do are translated to methods, which kind of makes sense. The class has a "method" of doing something. Classes hide their properties with statements called ***private*** and ***public***. (Hey, I told you it was important!)

 ### Properties & Constructors

 1. Open Food.java.
 - This isn't in the main structure of the _training folder, it is instead in the Classes folder. We have this for a bit of organization, and so it doesn't interfere with our previous projects.
 2. Break it down.

 ```java
 This tells that the class is public. (something later explained)  
 |      This is what tells Java we want a class.
 |      |     This is what the class is called.
 v      v     v
 public class Food {
 ```
 - The class definition is a little more simple than functions.
 ```java
 These privates say that they are hidden from other classes.
 v
 private float score;
 private boolean tasty;
 private String name;
 ```
 - These all look very familiar... aside from the `private` attachments, they are just like paramaters for functions, but they are all on their own line!
 - These all would be variables, but they *don't* have their equals-signs and what they are. This is because every single Food should have its own value of these, so when we create them, they will be different.
 - Speaking of creating...
 ```java
 public Food(float score, boolean tasty, String name) {
    this.score = score;
    this.tasty = tasty;
    this.name = name;
 }
 ```
 - This looks kind of familiar. It is just a function, stripped down so it doesn't have a return value, doesn't have `static`, and is named the same as the class, `Food`.
    - These are all very important properties of a constructor ~ something called when you create a new object of the class.
    - You can write constructors just like normal functions, just as long as you don't give a return *value*. You can call `return`, but it can't have a value attached to it.
    - It also has `public` on it, because we want *everything* to see this constructor, so we can actually call it to create things.
 - You might notice that we are setting all of these weird variables to the paramaters. They all start with `this`, and use a dot before the variable names stated above.
    - `this` refers to the class that the function is running in. If you had a `Food` called taco, instead of putting `taco` inside of the functions, you would just put `this` so it would work if you had a different food called pasta.
 ---
 3. Create a new Drink class.
 - Create a new file in the Classes folder.
    - Right click on the folder name `Classes` in the explorer on the left, and select "New File..."
    - Open it, and you should see some code including the class definition inside.
 4. Give this Drink some properties.
 - Examples would be color (string), bitterness (integer), or fizzy (boolean).
 - Reference Food.java for how to write properties.
 5. Create a constructor for the Drink.
 - Reference Food.java for the example on the constructor.
 - Remember to use `this.`**[property]**` = `**[constructor parameter]**`;`.
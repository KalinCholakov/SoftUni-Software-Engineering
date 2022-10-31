# Exercises: Encapsulation

This document defines the **exercises** for the ["Java Advanced" course
@ Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) to all below-described
problems in
[<span class="underline">Judge</span>](https://judge.softuni.bg/Contests/1536/Encapsulation-Exercises).

## Class Box

You are given a geometric figure **Box** with fields **length**,
**width,** and **height**. Model a class **Box** that can be
instantiated by the same three parameters. Expose to the outside world
only methods for its **surface area**, **lateral surface area,** and its
**volume** (formulas:
<http://www.mathwords.com/r/rectangular_parallelepiped.htm>).

On the first three lines, you will get the **length**, **width,** and
**height**. On the next three lines print the **surface area**,
**lateral surface area,** and the **volume** of the box.

A box’s side **should not** be zero or a negative number. Add data
validation for each parameter given to the constructor. Make a private
setter that performs **data validation internally**.

| **Box** |                                                  |
| ------- | ------------------------------------------------ |
| \-      | length: double                                   |
| \-      | width: double                                    |
| \-      | height: double                                   |
| \+      | Box (double length, double width, double height) |
| \-      | setLength(double): void                          |
| \-      | setWidth(double): void                           |
| \-      | setHeight(double): void                          |
| \+      | calculateSurfaceArea (): double                  |
| \+      | calculateLateralSurfaceArea (): double           |
| \+      | calculateVolume (): double                       |

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>2</p>
<p>-3</p>
<p>4</p></td>
<td>Width cannot be zero or negative.</td>
</tr>
<tr class="even">
<td><p>2</p>
<p>3</p>
<p>4</p></td>
<td><p>Surface Area - 52.00</p>
<p>Lateral Surface Area - 40.00</p>
<p>Volume – 24.00</p></td>
</tr>
<tr class="odd">
<td><p>1.3</p>
<p>1</p>
<p>6</p></td>
<td><p>Surface Area - 30.20</p>
<p>Lateral Surface Area - 27.60</p>
<p>Volume - 7.80</p></td>
</tr>
</tbody>
</table>

## Animal Farm

You should be familiar with encapsulation already. For this problem,
you’ll need to create a class called **Chicken**. Chicken should
contain several **fields**, a **constructor**, and several **methods**.
Your task is to encapsulate or hide anything that is not intended to be
viewed or modified from outside the class.

| **Chicken** |                                   |
| ----------- | --------------------------------- |
| \-          | name: String                      |
| \-          | age: int                          |
| \+          | Chicken(String, int)              |
| \-          | setName(String) : void            |
| \-          | setAge (int): void                |
| \+          | productPerDay (): double          |
| \+          | toString(): Override              |
| \-          | calculateProductPerDay() : double |

Chicken lives for **15 years**. Chicken has a **name** for sure, at
least **1 symbol** long. Chicken producing eggs:

  - First **6 years** it produces **2 eggs** per day **\[0 - 5\]**.

  - Next **6 years** it produces **1 egg** per day **\[6 - 11\]**.

  - And after that, it produces **0.75 eggs** per day.

### Step 1. Encapsulate Fields

Fields should be **private**. Leaving fields open for modification from
outside the class is potentially dangerous. Make all fields in the
Chicken class private.

In case the value inside a field is needed elsewhere, use **getters** to
reveal it.

### Step 2. Ensure Classes Have a Correct State

Having **getters and setters** is useless if you don’t use them. The
Chicken constructor modifies the fields directly which is wrong when
there are suitable setters available. Modify the constructor to fix this
issue.

### Step 3. Validate Data Properly

Validate the chicken’s **name** (it cannot be null, empty, or
whitespace). In case of an **invalid name**, print the exception message
**"Name cannot be empty."**

Validate the **age** properly, minimum and maximum age are provided,
make use of them. In case of **invalid age**, print the exception
message **"Age should be between 0 and 15."**

### Step 4. Hide Internal Logic

If a method is intended to be used only by descendant classes or
internally to perform some action, there is no point in keeping them
**public**. The **calculateProductPerDay()** method is used by the
**productPerDay()** public method. This means the method can safely be
hidden inside the **Chicken** class by declaring it **private**.

### Step 4. Submit Code to Judge

Submit your code as a **zip file** in Judge. Make sure you have a
**public Main class** with a **public static void main** method in it.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Chichi</p>
<p>10</p></td>
<td>Chicken Chichi (age 10) can produce 1.00 eggs per day.</td>
</tr>
<tr class="even">
<td><p>Chichi</p>
<p>17</p></td>
<td>Age should be between 0 and 15.</td>
</tr>
<tr class="odd">
<td><p>Choko</p>
<p>6</p></td>
<td>Chicken Choko (age 6) can produce 1.00 eggs per day.</td>
</tr>
</tbody>
</table>

## Shopping Spree

Create two classes: class **Person** and class **Product**. Each person
should have a **name**, **money,** and a **bag of products**. Each
product should have a **name** and **cost**. The name cannot be an
**empty** string. Be careful about **white space** in the name. Money
and cost cannot be a **negative** number.

| **Person** |                            |
| ---------- | -------------------------- |
| \-         | name: String               |
| \-         | money: double              |
| \-         | products: List\<Product\>  |
| \+         | Person (String, double)    |
| \-         | setName (String): void     |
| \-         | setMoney (double): void    |
| \+         | buyProduct (Product): void |
| \+         | getName(): String          |

| **Product** |                          |
| ----------- | ------------------------ |
| \-          | name: String             |
| \-          | cost: double             |
| \+          | Product (String, double) |
| \-          | setCost (double): void   |
| \-          | setName (String): void   |
| \+          | getName(): String        |
| \+          | getCost (): double       |

Create a program in which each command corresponds to a person buying a
product. If the person **can afford** a product **add it** to his bag.
If a person **doesn’t have** enough money, **print** an appropriate
exception message:  
**"{Person name} can't afford {Product name}"**

In the first two lines, you are given all people and all products. After
all, purchases print every person in the order of appearance and all
products that he has bought also in order of appearance. If nothing is
bought, **print**:  
**"{Person name} - Nothing bought"**.

Read commands till you find the line with the **"END"** command. In case
of invalid input (negative money exception message: "**Money cannot be
negative**") or empty name: (empty name exception message "**Name cannot
be empty**") break the program with an appropriate message. See the
examples below:

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Peter=11;George=4</p>
<p>Bread=10;Milk=2</p>
<p>Peter Bread</p>
<p>George Milk</p>
<p>George Milk</p>
<p>Peter Milk</p>
<p>END</p></td>
<td><p>Peter bought Bread</p>
<p>George bought Milk</p>
<p>George bought Milk</p>
<p>Peter can't afford Milk</p>
<p>Peter - Bread</p>
<p>George - Milk, Milk</p></td>
</tr>
<tr class="even">
<td><p>Maria=0</p>
<p>Coffee=2</p>
<p>Maria Coffee</p>
<p>END</p></td>
<td><p>Maria can't afford Coffee</p>
<p>Maria – Nothing bought</p></td>
</tr>
<tr class="odd">
<td><p>John=-3</p>
<p>Peppers=1</p>
<p>John Peppers</p>
<p>END</p></td>
<td>Money cannot be negative</td>
</tr>
</tbody>
</table>

### Hint

Judge does not work with **isBlank()** method. You can use
**trim().isEmpty()**.

## Pizza Calories

A Pizza is made of dough and different toppings. You should model a
class **Pizza** which should have a **name**, **dough,** and
**toppings** as fields. Every type of ingredient should have its class.

| **Pizza** |                                     |
| --------- | ----------------------------------- |
| \-        | name: String                        |
| \-        | dought: Dough                       |
| \-        | toppings: List\<Topping\>           |
| \+        | Piza (String, int numberOfToppings) |
| \-        | setToppings(int) : void             |
| \-        | setName(String) : void              |
| \+        | setDough(Dough) : void              |
| \+        | getName(): String                   |
| \+        | addTopping (Topping) : void         |
| \+        | getOverallCalories () : double      |

Every ingredient has **different fields**: the dough can be **white** or
**wholegrain** and in addition, it can be **crispy**, **chewy,** or
**homemade**. The toppings can be of type **meat**, **veggies**,
**cheese,** or **sauce**. Every ingredient should weigh grams and a
method for calculating its calories according to its type. Calories per
gram are calculated through modifiers. Every ingredient has **2 calories
per gram** **as a base** and a **modifier** that gives the exact
calories.

| **Dough** |                                  |
| --------- | -------------------------------- |
| \-        | flourType: String                |
| \-        | bakingTechnique: String          |
| \-        | weight: double                   |
| \+        | Dought (String, String, double)  |
| \-        | setWeight(double): void          |
| \-        | setFlourType(String): void       |
| \-        | setBakingTechnique(String): void |
| \+        | calculateCalories (): double     |

| **Topping** |                               |
| ----------- | ----------------------------- |
| \-          | toppingType: String           |
| \-          | weight: double                |
| \+          | Topping (String, double)      |
| \-          | setToppingType (String): void |
| \-          | setWeight (double): void      |
| \+          | calculateCalories (): double  |

**Your job** is to model the classes in such a way that they are
**properly encapsulated** and to provide a public method for every pizza
that **calculates its calories according to the ingredients it has**.

<table>
<thead>
<tr class="header">
<th><strong>Dough Modifiers</strong></th>
<th><strong>Toppings Modifiers</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><ul>
<li><p>White – 1.5;</p></li>
<li><p>Wholegrain – 1.0;</p></li>
<li><p>Crispy – 0.9;</p></li>
<li><p>Chewy – 1.1;</p></li>
<li><p>Homemade – 1.0;</p></li>
</ul></td>
<td><ul>
<li><p>Meat – 1.2;</p></li>
<li><p>Veggies – 0.8;</p></li>
<li><p>Cheese – 1.1;</p></li>
<li><p>Sauce – 0.9;</p></li>
</ul></td>
</tr>
</tbody>
</table>

For example, the **white** dough has a modifier of **1.5**, a **chewy**
dough has a modifier of **1.1**, which means that a white chewy dough
weighing **100 grams** will have (2 \* 100) \* 1.5 \* 1.1 = **330.00
total calories**.

For example, **meat** has a modifier of **1.2**, which means that meat
weighing **50 grams** will have (2 \* 50) \* 1.2 = 120.00 total
calories.

### Data Validation

**Data Validation must be in the order of the Input Data.**

  - If an invalid flour type or an invalid baking technique is given an
    exception is thrown with the message "**Invalid type of dough.**".

  - If dough weight is outside of the range **\[1..200\]** throw an
    exception with the message "**Dough weight should be in the range
    \[1..200\]**."

  - If topping is not one of the provided types throw an exception with
    the message "**Cannot place {name of invalid argument} on top of
    your pizza.**"

  - If topping weight is outside of the range **\[1..50\]** throw an
    exception with the message "**{Topping type name} weight should be
    in the range \[1..50\].**".

  - If the name of the pizza is **empty, only whitespace** or longer
    than 15 symbols throw an exception with the message "**Pizza name
    should be between 1 and 15 symbols.**".

  - If a number of toppings are outside of the range **\[0..10\]** throw
    an exception with the message "**Number of toppings should be in
    range \[0..10\].**".

The input for a pizza consists of several lines:

  - On the first line is the **pizza name** and the **number of toppings
    it has** in the format:  
    **Pizza {pizzaName} {numberOfToppings}**

  - On the second line you will get input for the **dough** in the
    format:  
    **Dough {flourType} {bakingTechnique} {weightInGrams}**

  - On the next lines, you will receive every topping the pizza has,
    until an**"END"** command is given:  
    **Topping {toppingType} {weightInGrams}**

If the creation of the pizza was **successfully** printed on a single
line the name of the pizza and the **total calories** it has rounded to
the second digit after the decimal point.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Pizza Meatless 2</p>
<p>Dough Wholegrain Crispy 100</p>
<p>Topping Veggies 50</p>
<p>Topping Cheese 50</p>
<p>END</p></td>
<td>Meatless - 370.00</td>
</tr>
<tr class="even">
<td><p>Pizza Bulgarian 20</p>
<p>Dough Type500 Bulgarian 100</p>
<p>Topping Cheese 50</p>
<p>Topping Cheese 50</p>
<p>Topping Salami 20</p>
<p>Topping Meat 10</p>
<p>END</p></td>
<td>Number of toppings should be in range [0..10].</td>
</tr>
<tr class="odd">
<td><p>Pizza Bulgarian 2</p>
<p>Dough Type500 Bulgarian 100</p>
<p>Topping Cheese 50</p>
<p>Topping Cheese 50</p>
<p>Topping Salami 20</p>
<p>Topping Meat 10</p>
<p>END</p></td>
<td>Invalid type of dough.</td>
</tr>
<tr class="even">
<td><p>Pizza Bulgarian 2</p>
<p>Dough White Chewy 100</p>
<p>Topping Parmesan 50</p>
<p>Topping Cheese 50</p>
<p>Topping Salami 20</p>
<p>Topping Meat 10</p>
<p>END</p></td>
<td>Cannot place Parmesan on top of your pizza.</td>
</tr>
</tbody>
</table>

## \*\*Football Team Generator

A football team has a variable number of players, a name, and a rating.

| **Team** |                             |
| -------- | --------------------------- |
| \-       | name: String                |
| \-       | players: List\<Player\>     |
| \+       | Team (String)               |
| \-       | setName(String) : void      |
| \+       | getName(): String           |
| \+       | addPlayer(Player) : void    |
| \+       | removePlayer(String) : void |
| \+       | getRating() : double        |

A **player** has a **name** and **stats** which are the basis for his
skill level. The stats a player has are **endurance**, **sprint**,
**dribble**, **passing,** and **shooting**. Each stat can be in the
range \[0..100\]. The **overall skil**l level of a player is calculated
as the **average** of his stats. Only the name of a player and his stats
should be visible to all of the outside world. Everything else should be
hidden.

| **Player** |                                          |
| ---------- | ---------------------------------------- |
| \-         | name: String                             |
| \-         | endurance: int                           |
| \-         | sprint: int                              |
| \-         | dribble: int                             |
| \-         | passing: int                             |
| \-         | shooting: int                            |
| \+         | Player (String, int, int, int, int, int) |
| \-         | setName(String) : void                   |
| \+         | getName(): String                        |
| \-         | setEndurance (int) : void                |
| \-         | setSprint (int) : void                   |
| \-         | setDribble (int) : void                  |
| \-         | setPassing (int) : void                  |
| \-         | setShooting (int) : void                 |
| \+         | overallSkillLevel() : double             |

A **team** should expose a **name**, a **rating** (calculated by the
average skill level of all players in the team), and **methods** for
**adding** and **removing** players.

Your task is to model the team and the players following the proper
principles of **Encapsulation**. Expose only the fields that need to be
visible and validate data appropriately.

### Input

Your application will receive commands until the "**END**" command is
given. The command can be one of the following:

  - **"Team;{TeamName}"** – add a new team

  - **"Add;{TeamName};{PlayerName};{Endurance};{Sprint};{Dribble};{Passing};{Shooting}"**
    – add a new player to the team

  - **"Remove;{TeamName};{PlayerName}"** – remove the player from the
    team

  - **"Rating;{TeamName}"** – print the team rating, rounded to the
    closest integer

### Data Validation

  - A **name** cannot be null, empty, or white space. If not, print:
    "**A name should not be empty.**"

  - **Stats** should be in the range **\[0..100\]**. If not, print:
    "**{Stat name} should be between 0 and 100.**"

  - If you receive a command to **remove** a missing player, print:
    "**Player {Player name} is not in {Team name} team.**"

  - If you receive a command to **add** a player to a missing team,
    print: "**Team {team name} does not exist.**"

  - If you receive a command to **show** stats for a missing team,
    print: "**Team {team name} does not exist.**"

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Team;Arsenal</p>
<p>Add;Arsenal;Kieran_Gibbs;75;85;84;92;67</p>
<p>Add;Arsenal;Aaron_Ramsey;95;82;82;89;68</p>
<p>Remove;Arsenal;Aaron_Ramsey</p>
<p>Rating;Arsenal</p>
<p>END</p></td>
<td>Arsenal – 81</td>
</tr>
<tr class="even">
<td><p>Team;Arsenal</p>
<p>Add;Arsenal;Kieran_Gibbs;75;85;84;92;67</p>
<p>Add;Arsenal;Aaron_Ramsey;195;82;82;89;68</p>
<p>Remove;Arsenal;Aaron_Ramsey</p>
<p>Rating;Arsenal</p>
<p>END</p></td>
<td><p>Endurance should be between 0 and 100.</p>
<p>Player Aaron_Ramsey is not in Arsenal team.</p>
<p>Arsenal - 81</p></td>
</tr>
<tr class="odd">
<td><p>Team;Arsenal</p>
<p>Rating;Arsenal</p>
<p>END</p></td>
<td>Arsenal – 0</td>
</tr>
</tbody>
</table>

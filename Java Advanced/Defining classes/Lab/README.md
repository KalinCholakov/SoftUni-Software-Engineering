# Lab: Defining Classes

This document defines the **lab** for the ["Java Advanced" course @
Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) to all below-described
problems in
[Judge](https://judge.softuni.org/Contests/1517/Defining-Classes-Lab).

# Part I: Defining Classes

## Car Info

Create a class named **Car**.

The class should have **public** fields for:

  - Brand: **String**

  - Model: **String**

  - Horsepower: **int**

Create a **new class** and ensure **proper naming:**

![](media/image1.png)

Define the fields:

![](media/image2.png)

Create a Test client in the **same** **package:**

![](media/image3.png)

You should now be able to use your class:

![](media/image4.png)

### Private Fields

Change the access modifiers of all class fields to **private.**

When done, go back to the main method you should have **compilation**
errors like this:

![](media/image5.png)

#### Getters and Setters

**Create getters** and **setters** for each class field.

**Getter** for the car brand:

![](media/image6.png)

**Setter** for the car brand:

![](media/image7.png)

Do the same for **all** the fields.

***Fix Main Method***

You should **set** and **get** the **values** by using the correct
methods

![](media/image8.png)

### Create Car Info Method

This method should return the info about any car object in the following
format:

"**The car is: {brand} {model} – {horsePower} HP.**"

You have to figure out how to create a method and use it in the outside
code, as shown below:

![](media/image9.png)

**Test the Program**

Read cars objects, add them to the collection of your choice, and print
each one on the console using the **carInfo()** method. The input
consists of a single integer **N,** the number of lines representing car
objects. On each line you will read car info in the following format
"**{brand} {model} {horsePower}**" separated by single space.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>3</strong></p>
<p><strong>Chevrolet Impala 390</strong></p>
<p><strong>Mercedes Benz 500</strong></p>
<p><strong>Volga 24 49</strong></p></td>
<td><p><strong>The car is: Chevrolet Impala - 390 HP.</strong></p>
<p><strong>The car is: Mercedes Benz - 500 HP.</strong></p>
<p><strong>The car is: Volga 24 - 49 HP.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>This Car 1</strong></p>
<p><strong>Was Made 2</strong></p>
<p><strong>Only For 3</strong></p>
<p><strong>Test Purposes 4</strong></p>
<p><strong>No Way 5</strong></p></td>
<td><p><strong>The car is: This Car - 1 HP.</strong></p>
<p><strong>The car is: Was Made - 2 HP.</strong></p>
<p><strong>The car is: Only For - 3 HP.</strong></p>
<p><strong>The car is: Test Purposes - 4 HP.</strong></p>
<p><strong>The car is: No Way - 5 HP.</strong></p></td>
</tr>
</tbody>
</table>

# Part II: Constructors

## Car Constructors

Make proper constructors for the Car class so you can create car objects
with a different type of input information.

If you miss information about the field of **type String** set the value
to "**unknown**", and for an **integer,** fieldset **-1.**

First, **declare** a **constructor** which takes only the car brand as a
parameter:

![](media/image10.png)

Also, create a **constructor** which **sets** all the **fields**:

![](media/image11.png)

Read information about cars the same way as the previous task, however,
this time uses **constructors** to create the objects, not creating an
object with the **default** constructor. You should be able to handle
**different** **types** of input, the format will be the same as the
previous task, but this time some of the data may be missing. For
example, you can get only the car **brand** – which means you have to
set the car model to "**unknown**" and the Horsepower value to **-1**.
There will be lines with **complete** car data, declare constructor
which sets all the fields.

You have to add the car objects to a **collection** of your choice and
print the data as in the previous task. The input will **always** have
one or three elements on each line.

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
<td><p><strong>2</strong></p>
<p><strong>Chevrolet</strong></p>
<p><strong>Golf Polo 49</strong></p></td>
<td><p><strong>The car is: Chevrolet unknown - -1 HP.</strong></p>
<p><strong>The car is: Golf Polo - 49 HP.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>Was</strong></p>
<p><strong>Only For 3</strong></p>
<p><strong>Test Purposes 4</strong></p>
<p><strong>No Way 5</strong></p></td>
<td><p><strong>The car is: Was unknown - -1 HP.</strong></p>
<p><strong>The car is: Only For - 3 HP.</strong></p>
<p><strong>The car is: Test Purposes - 4 HP.</strong></p>
<p><strong>The car is: No Way - 5 HP.</strong></p></td>
</tr>
</tbody>
</table>

## Bank Account

Create class **BankAccount**.

The class should have **private fields** for:

  - Id: **int** (Starts from **1** and **increments** for every **new**
    **account**)

  - Balance: **double**

  - Interest rate: **double** (Shared for all accounts. **Default value:
    0.02**)

The class should also have **public** methods for:

  - **setInterestRate(double interest):** **void (static)**

  - **getInterest(int Years):** **double**

  - **deposit(double amount):** **void**

Create a test client supporting the following commands:

  - **Create**

  - **Deposit {Id} {Amount}**

  - **SetInterest {Interest}**

  - **GetInterest {ID} {Years}**

  - **End**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Comments</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>Create</strong></p>
<p><strong>Deposit 1 20</strong></p>
<p><strong>GetInterest 1 10</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Account ID1 created</strong></p>
<p><strong>Deposited 20 to ID1</strong></p>
<p><strong>4.00</strong></p></td>
<td></td>
</tr>
<tr class="even">
<td><p><strong>Create</strong></p>
<p><strong>Create</strong></p>
<p><strong>Deposit 1 20</strong></p>
<p><strong>Deposit 3 20</strong></p>
<p><strong>Deposit 2 10</strong></p>
<p><strong>SetInterest 1.5</strong></p>
<p><strong>GetInterest 1 1</strong></p>
<p><strong>GetInterest 2 1</strong></p>
<p><strong>GetInterest 3 1</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Account ID1 created</strong></p>
<p><strong>Account ID2 created</strong></p>
<p><strong>Deposited 20 to ID1</strong></p>
<p><strong>Account does not exist</strong></p>
<p><strong>Deposited 10 to ID2</strong></p>
<p><strong>30.00</strong></p>
<p><strong>15.00</strong></p>
<p><strong>Account does not exist</strong></p></td>
<td><p><strong>Sets the global interest rate to 1.</strong></p>
<p><strong>Prints interest for a bank account with id 1 for 1 year period.</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Create the class as usual and create a **constant** for the default
interest rate:

![](media/image12.png)

Create the static and non-static fields, **all private:**

![](media/image13.png)

Set the id of an account upon creation while **incrementing** the global
account count:

![](media/image14.png)

Create a setter for the global interest rate. Making the method
**static** will let you access it through the class name:

![](media/image15.png)

Implement **deposit()** and **getInterest():**

![](media/image16.png)

# Lab: Methods

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022).

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1260)

# Declaring and Invoking Methods

## Sign of Integer

Create a method that prints the sign of an integer number.

### Example

| **Input** | **Output**                 |
| --------- | -------------------------- |
| 2         | The number 2 is positive.  |
| \-5       | The number -5 is negative. |
| 0         | The number 0 is zero.      |

## Grades

Write a method that **receives a grade** between **2.00** and **6.00**
and **prints the corresponding grade in words:**

  - 2.00 – 2.99 - "**Fail**"

  - 3.00 – 3.49 - "**Poor**"

  - 3.50 – 4.49 - "**Good**"

  - 4.50 – 5.49 - "**Very** **good**"

  - 5.50 – 6.00 - "**Excellent**"

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 3.33      | Poor       |
| 4.50      | Very good  |
| 2.99      | Fail       |

### Hint

Read the grade from the console and pass it to a method:

![](media/image1.png)

Then create the method and make the **if** statements for each case:

![](media/image2.png)

## Printing Triangle

Create a method for printing triangles as shown below:

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
<td><strong>3</strong></td>
<td><p><strong>1</strong></p>
<p><strong>1 2</strong></p>
<p><strong>1 2 3</strong></p>
<p><strong>1 2</strong></p>
<p><strong>1</strong></p></td>
</tr>
<tr class="even">
<td>4</td>
<td><p>1</p>
<p>1 2</p>
<p>1 2 3</p>
<p>1 2 3 4</p>
<p>1 2 3</p>
<p>1 2</p>
<p>1</p></td>
</tr>
</tbody>
</table>

### Hints

After you read the input, create a method **for printing a single line**
from a **given start** to a **given end**. Choose a **meaningful name**
for it, describing its purpose:

![](media/image3.png)

You will need two loops. In the first loop you can print the first half
of the triangle without the middle line:

![](media/image4.png)

Next, print the middle line:

![](media/image5.png)

Lastly, print the rest of the triangle:

![](media/image6.png)

## Calculations

Write a program that receives a string on the first line **("add",
"multiply", "subtract", "divide")** and on the next two lines receives
**two** numbers. Create four methods (for each calculation) and invoke
the right one depending on the command. The method should also print the
result (needs to be void).

### Example

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>subtract</strong></p>
<p><strong>5</strong></p>
<p><strong>4</strong></p></td>
<td><strong>1</strong></td>
</tr>
<tr class="even">
<td><p><strong>divide</strong></p>
<p><strong>8</strong></p>
<p><strong>4</strong></p></td>
<td><strong>2</strong></td>
</tr>
</tbody>
</table>

### Hints

Read the command on the first line and the two numbers, and then make an
if/switch statement for each type of calculation:

![](media/image7.png)

Then create the four methods and print the result:

![](media/image8.png)

## Orders

Write a method that calculates the total price of an order and prints it
on the console. The method should receive **one of the following
products**: coffee, water, coke, snacks; and a **quantity** of the
product. The prices for a single piece of each product are:

  - coffee – 1.50

  - water – 1.00

  - coke – 1.40

  - snacks – 2.00

Print the result rounded to the **second** decimal place.

### Example

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>water</strong></p>
<p><strong>5</strong></p></td>
<td><strong>5.00</strong></td>
</tr>
<tr class="even">
<td><p><strong>coffee</strong></p>
<p><strong>2</strong></p></td>
<td><strong>3.00</strong></td>
</tr>
</tbody>
</table>

### Hint

  - Read the product and the quantity.

  - Create a method the pass the two variables in.

  - Print the result in the method.

# Returning Values and Overloading

## Calculate Rectangle Area

Create a method that calculates and **returns** the
[area](https://www.mathopenref.com/rectanglearea.html) of a rectangle by
given width and length.

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
<td><p><strong>3</strong></p>
<p><strong>4</strong></p></td>
<td><strong>12</strong></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>7</strong></p></td>
<td><strong>35</strong></td>
</tr>
</tbody>
</table>

### Hints

After reading the input, create a method, but this time **instead** of
typing **"static void"** before its name, type **"static double"** as
this will make it **return a value of type double**:

![](media/image9.png)

**Invoke** the method in the main and **save the return value in a new
variable**:

![](media/image10.png)

## Repeat String

Write a method that receives a string and a repeat count **n**
(integer). The method should return a new string (the old one repeated n
times).

### Example

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>abc</strong></p>
<p><strong>3</strong></p></td>
<td><strong>abcabcabc</strong></td>
</tr>
<tr class="even">
<td><p><strong>String</strong></p>
<p><strong>2</strong></p></td>
<td><strong>StringString</strong></td>
</tr>
</tbody>
</table>

### Hints

Firstly read the string and the repeat count n. Then create the method
and pass it the variables:

![](media/image11.png)

## Math Power

Create a method that calculates and returns the value of a number raised
to a given power.

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
<p><strong>8</strong></p></td>
<td><strong>256</strong></td>
</tr>
<tr class="even">
<td><p><strong>5.5</strong></p>
<p><strong>3</strong></p></td>
<td><strong>166.375</strong></td>
</tr>
</tbody>
</table>

### Hints

Create a method that will have two parameters - the number and the
power, and will return a result of type **double**:

![](media/image12.png)

Invoke the method and use **DecimalFormat** to print the result. For the
curious - you can read more
[here](http://tutorials.jenkov.com/java-internationalization/decimalformat.html).

![](media/image13.png)

## Greater of Two Values

You are given two values of the same type as input. The values can be of
type **int**, **char** of **String**. Create a method **getMax()** that
returns the greater of the two values:

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
<td><p><strong>int</strong></p>
<p><strong>2</strong></p>
<p><strong>16</strong></p></td>
<td><strong>16</strong></td>
</tr>
<tr class="even">
<td><p><strong>char</strong></p>
<p><strong>a</strong></p>
<p><strong>z</strong></p></td>
<td><strong>z</strong></td>
</tr>
<tr class="odd">
<td><p><strong>string</strong></p>
<p><strong>Ivan</strong></p>
<p><strong>Todor</strong></p></td>
<td><strong>Todor</strong></td>
</tr>
</tbody>
</table>

### Hints

1.  For this method, you need to create three methods with the same name
    and different signatures.

2.  Create a method that will compare integers:

> ![](media/image14.png)

3.  Create a second method with the same name which will compare
    characters. Follow the logic of the previous method:

![](media/image15.png)

4.  Lastly, you need to create a method to compare strings. This is a
    bit different as strings don't allow to be compared with the
    operators **"\>"** and **"\<"**:

![](media/image16.png)

You need to use the method "**compareTo()**", which returns an integer
value (greater than zero if the compared object is greater, less than
zero if the compared object is lesser, and zero if the two objects are
equal).

5.  The last step is to read the input. Use appropriate variables and
    call the **getMax()** from your **main()**.

## Multiply Evens by Odds

Create a program that reads an **integer** number and **multiplies the
sum of all its even digits** by **the sum of all its odd digits**:

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
<td><strong>12345</strong></td>
<td><strong>54</strong></td>
<td><p><strong>12345 has 2 even digits - 2 and 4. Even digits have a sum of 6.</strong></p>
<p><strong>Also, it has 3 odd digits - 1, 3, and 5. Odd digits have a sum of 9.</strong></p>
<p><strong>Multiply 6 by 9 and you get 54.</strong></p></td>
</tr>
<tr class="even">
<td><strong>-12345</strong></td>
<td><strong>54</strong></td>
<td></td>
</tr>
</tbody>
</table>

### Hints

1.  Create a method with a **name describing its purpose** (like
    **getMultipleOfEvensAndOdds**). The method should have a **single
    integer parameter** and an **integer return value**. Also, the
    method will call two other methods:

> ![](media/image17.png)

2.  Create two other methods each of which will sum either even or odd
    digits.

3.  Implement the logic for summing even digits:

> ![](media/image18.PNG)

4.  Do the same for the method that will sum odd digits.

5.  As you test your solution you may notice that it doesn't work for
    negative numbers. Following the program execution line by line, find
    and fix the bug (**hint: you can use Math.abs()**).

<!-- end list -->

11. **Math Operations**

Write a method that receives **two numbers** and **an operator**,
calculates the result, and returns it. You will be given three lines of
input. The first will be the first number, the second one will be the
operator and the last one will be the second number. The possible
operators are: **/ \* + -**

Print the result rounded up to the **second** decimal point.

### Example

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>5</strong></p>
<p><strong>*</strong></p>
<p><strong>5</strong></p></td>
<td><strong>25</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>+</strong></p>
<p><strong>8</strong></p></td>
<td><strong>12</strong></td>
</tr>
</tbody>
</table>

### Hint

Read the inputs and create a method that returns a double (the result of
the operation):

![](media/image19.png)

# Exercises: Generics

This document defines the **lab** for the ["Java Advanced" course @
Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) to all below-described
problems in
<span class="underline">[Judge](https://judge.softuni.org/Contests/1527).</span>

## Generic Box

Create a **generic class Box** that can store any type. **Override** the
**toString()** method to print the type and the value of the stored data
in the format "**{class full name}: {value}**"**.**

Use the class that you've created and test it with the class
**java.lang.String**. On the first line, you will get **n** - the number
of strings to read from the console. On the next **n** lines, you will
get the actual strings. For each of them, create a box and call its
**toString()** method to print its data on the console.

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
<p><strong>life in a box</strong></p>
<p><strong>box in a life</strong></p></td>
<td><p><strong>java.lang.String: life in a box</strong></p>
<p><strong>java.lang.String: box in a life</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>1</strong></p>
<p><strong>I am a programmer</strong></p></td>
<td><strong>java.lang.String: I am a programmer</strong></td>
</tr>
</tbody>
</table>

## Generic Box of Integer

Use the description of the previous problem but now, test your generic
box with **Integers**.

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
<p><strong>7</strong></p>
<p><strong>123</strong></p>
<p><strong>42</strong></p></td>
<td><p><strong>java.lang.Integer: 7</strong></p>
<p><strong>java.lang.Integer: 123</strong></p>
<p><strong>java.lang.Integer: 42</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>12</strong></p>
<p><strong>13</strong></p>
<p><strong>14</strong></p>
<p><strong>15</strong></p>
<p><strong>16</strong></p></td>
<td><p><strong>java.lang.Integer: 12</strong></p>
<p><strong>java.lang.Integer: 13</strong></p>
<p><strong>java.lang.Integer: 14</strong></p>
<p><strong>java.lang.Integer: 15</strong></p>
<p><strong>java.lang.Integer: 16</strong></p></td>
</tr>
</tbody>
</table>

## Generic Swap Method Strings

Create a generic method that receives a list containing **any type of
data** and swaps the elements at two given indexes.

As in the previous problems, read **n** number of boxes of type
**String** and add them to the list. On the next line, however, you will
receive a **swap** command consisting of **two indexes**. Use the method
you've created to swap the elements corresponding to the given indexes
and **print** **each** element in the list.

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
<p><strong>Peter</strong></p>
<p><strong>George</strong></p>
<p><strong>Swap me with Peter</strong></p>
<p><strong>0 2</strong></p></td>
<td><p><strong>java.lang.String: Swap me with Peter</strong></p>
<p><strong>java.lang.String: George</strong></p>
<p><strong>java.lang.String: Peter</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>2</strong></p>
<p><strong>Uni</strong></p>
<p><strong>Soft</strong></p>
<p><strong>0 1</strong></p></td>
<td><p><strong>java.lang.String: Soft</strong></p>
<p><strong>java.lang.String: Uni</strong></p></td>
</tr>
</tbody>
</table>

## Generic Swap Method Integers

Use the description of the previous problem but now, test your list of
generic boxes with **Integers**.

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
<p><strong>7</strong></p>
<p><strong>123</strong></p>
<p><strong>42</strong></p>
<p><strong>0 2</strong></p></td>
<td><p><strong>java.lang.Integer: 42</strong></p>
<p><strong>java.lang.Integer: 123</strong></p>
<p><strong>java.lang.Integer: 7</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>12</strong></p>
<p><strong>13</strong></p>
<p><strong>14</strong></p>
<p><strong>15</strong></p>
<p><strong>16</strong></p>
<p><strong>3 4</strong></p></td>
<td><p><strong>java.lang.Integer: 12</strong></p>
<p><strong>java.lang.Integer: 13</strong></p>
<p><strong>java.lang.Integer: 14</strong></p>
<p><strong>java.lang.Integer: 16</strong></p>
<p><strong>java.lang.Integer: 15</strong></p></td>
</tr>
</tbody>
</table>

## Generic Count Method Strings

Create a **method** that receives as an argument a **list of any type
that can be compared** and an **element of the given type**. The method
should **return the count of elements that are greater than the value of
the given element**. **Modify your Box class** to support **comparing by
the value** of the data stored.

On the first line, you will receive **n** - the number of elements to
add to the list. On the next **n** lines, you will receive the actual
elements. On the last line, you will get the value of the element to
which you need to compare every element in the list.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>3</strong></p>
<p><strong>aa</strong></p>
<p><strong>aaa</strong></p>
<p><strong>bb</strong></p>
<p><strong>aa</strong></p></td>
<td><strong>2</strong></td>
<td><p><strong>6</strong></p>
<p><strong>a</strong></p>
<p><strong>b</strong></p>
<p><strong>c</strong></p>
<p><strong>d</strong></p>
<p><strong>e</strong></p>
<p><strong>f<br />
g</strong></p></td>
<td><strong>0</strong></td>
</tr>
</tbody>
</table>

## Generic Count Method Doubles

Use the description of the previous problem but now, test your list of
generic boxes with **Doubles**.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>3</strong></p>
<p><strong>7.13</strong></p>
<p><strong>123.22</strong></p>
<p><strong>42.78</strong></p>
<p><strong>7.55</strong></p></td>
<td><strong>2</strong></td>
<td><p><strong>1</strong></p>
<p><strong>1231542.123</strong></p>
<p><strong>1</strong></p></td>
<td><strong>1</strong></td>
</tr>
</tbody>
</table>

## Custom List

Create a generic data structure that can store **any type** that can be
**compared.** Implement functions:

  - **void add(T element)**

  - **T remove(int index)**

  - **boolean contains(T element)**

  - **void swap(int index, int index)**

  - **int countGreaterThan(T element)**

  - **T getMax()**

  - **T getMin()**

Create a command interpreter that reads commands and modifies the custom
list that you have created. Implement the commands:

  - **Add {element}** - Adds the given element to the end of the list.

  - **Remove {index}** - Removes the element at the given index.

  - **Contains {element}** - Prints if the list contains the given
    element (**true** or **false**)**.**

  - **Swap {index1} {index2}** - Swaps the elements at the given
    indexes.

  - **Greater {element}** - Counts the elements that are greater than
    the given element and prints their count

  - **Max** - Prints the maximum element in the list.

  - **Min** - Prints the minimum element in the list.

  - **Print** - Prints all elements in the list, each on a separate
    line.

  - **END** - stops the reading of commands.

**Note**: For the **Judge tests,** use **String** as **T.**

**Examples**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>Add aa</strong></p>
<p><strong>Add bb</strong></p>
<p><strong>Add cc</strong></p>
<p><strong>Max</strong></p>
<p><strong>Min</strong></p>
<p><strong>Greater aa</strong></p>
<p><strong>Swap 0 2</strong></p>
<p><strong>Contains aa</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>cc</strong></p>
<p><strong>aa</strong></p>
<p><strong>2</strong></p>
<p><strong>true</strong></p>
<p><strong>cc</strong></p>
<p><strong>bb</strong></p>
<p><strong>aa</strong></p></td>
<td><p><strong>Add Peter</strong></p>
<p><strong>Add George</strong></p>
<p><strong>Swap 0 0</strong></p>
<p><strong>Swap 1 1</strong></p>
<p><strong>Swap 0 1</strong></p>
<p><strong>Swap 1 0</strong></p>
<p><strong>Swap 0 1</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><strong>George<br />
Peter</strong></td>
</tr>
</tbody>
</table>

## Custom List Sorter

Extend the previous problem by creating an additional **Sorter class**.
It should have a single static **method** **sort()** which can sort
objects of type **CustomList** containing any type that can be compared.
**Extend the command list** to support one additional command **Sort**:

  - **Sort** - Sort the elements in the list in ascending order.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>Add cc</strong></p>
<p><strong>Add bb</strong></p>
<p><strong>Add aa</strong></p>
<p><strong>Sort</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>aa</strong></p>
<p><strong>bb</strong></p>
<p><strong>cc</strong></p></td>
<td><p><strong>Add Peter</strong></p>
<p><strong>Add George</strong></p>
<p><strong>Max</strong></p>
<p><strong>Sort</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>Peter</strong></p>
<p><strong>George</strong></p>
<p><strong>Peter</strong></p></td>
</tr>
</tbody>
</table>

## \*Custom List Iterator

For the print command, you have probably used a **for** a loop. Extend
your custom list class by making it implement **Iterable.** This should
allow you to iterate your list in a **foreach** statement.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>Add aa</strong></p>
<p><strong>Add bb</strong></p>
<p><strong>Add cc</strong></p>
<p><strong>Max</strong></p>
<p><strong>Min</strong></p>
<p><strong>Greater aa</strong></p>
<p><strong>Swap 0 2</strong></p>
<p><strong>Contains aa</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>cc</strong></p>
<p><strong>aa</strong></p>
<p><strong>2</strong></p>
<p><strong>true</strong></p>
<p><strong>cc</strong></p>
<p><strong>bb</strong></p>
<p><strong>aa</strong></p></td>
<td><p><strong>Add Peter</strong></p>
<p><strong>Add George</strong></p>
<p><strong>Swap 0 0</strong></p>
<p><strong>Swap 1 1</strong></p>
<p><strong>Swap 0 1</strong></p>
<p><strong>Swap 1 0</strong></p>
<p><strong>Swap 0 1</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>George</strong></p>
<p><strong>Peter</strong></p></td>
</tr>
</tbody>
</table>

## \*Tuple

*There is something really annoying in the C\# - language. It is called
a **Tuple**. It is a class that contains two objects. The first one is
**item1,** and the second one is **item2**. It is kind of like a
**Map.Entry** except - it **simply has items that are neither key nor
value**. The annoyance comes from the fact that you have no idea what
these objects hold. The class name is telling you nothing, the methods
which it has – too. So let's say we could try to implement it in Java,
just for practicing generics.*

Create a class **Tuple**, which is holding two objects. As we said, the
first one will be an **item1,** and the second one - an **item2**. The
tricky part here is to make the class hold generics. This means that
when you create a new object of class - **Tuple**, there should be a way
to explicitly specify both the items type separately.

### Input

The input consists of three lines:

  - The first one is holding a person's name and an address. They are
    separated by space. Your task is to collect them in the tuple and
    print them on the console. Format:

"**{first name} {last name}** **{address}**"

  - The second line holds a **person's name** and the **amount of beer**
    he can drink. Format:

"**{name} {liters of beer}**"

  - The last line will hold an **Integer** and a **Double**. Format:

"**{Integer} {Double}**"

### Output

  - Print the tuples items in format: "**{item1} -\> {item2}**"

### Constraints

Use the good practices we have learned. Create the class and make it
have getters and setters for its class variables. The input will be
valid, no need to check it explicitly\!

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
<td><p>Sam Johnson Sofia</p>
<p>John 2</p>
<p>23 21.23212321</p></td>
<td><p>Sam Johnson -&gt; Sofia</p>
<p>John -&gt; 2</p>
<p>23 -&gt; 21.23212321</p></td>
</tr>
<tr class="even">
<td><p>Svetlin Nakov Tarnovo</p>
<p>Nakov 300</p>
<p>25 24.355555</p></td>
<td><p>Svetlin Nakov -&gt; Tarnovo</p>
<p>Nakov -&gt; 300</p>
<p>25 -&gt; 24.355555</p></td>
</tr>
</tbody>
</table>

##  \*Threeuple

Now you are aware of a Class, which is probably a bad practice to use.
Anyway, it is a nice example of using generics. Our next task is to
create another Tuple. This time, our task is harder.

Create a Class **Threeuple**. Its name tells us that it will no longer
hold just a pair of objects. The task is simple, our **Threeuple**
should **hold three objects**. Make it have getters and setters. You can
even extend the previous class.

### Input

The input consists of three lines:

  - The first one holds a name, an address, and a town. Format of the
    input:

"**{first name} {last name}** **{address} {town}**"

  - The second line holds a name, beer liters, and a **Boolean
    variable** - drunk or not. Format:

"**{name} {liters of beer} {drunk or not}**"

  - The last line will hold a name, a bank balance (double), and a bank
    name. Format:

"**{name} {account balance} {bank name}**"

### Output

  - Print the **Threeuples** objects in format: "**{firstElement} -\>
    {secondElement} -\> {thirdElement}**"

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
<td><p>Sofia Jackson Izgrev Burgas</p>
<p>Max 18 drunk</p>
<p>Alex 0.10 DSK</p></td>
<td><p>Sofia Jackson -&gt; Izgrev -&gt; Burgas</p>
<p>Max -&gt; 18 -&gt; true</p>
<p>Alex -&gt; 0.1 -&gt; DSK</p></td>
</tr>
<tr class="even">
<td><p>Peter Johnson Tepeto Plovdiv</p>
<p>Sam 18 not</p>
<p>Alex 0.10 NGB</p></td>
<td><p>Peter Johnson -&gt; Tepeto -&gt; Plovdiv</p>
<p>Sam -&gt; 18 -&gt; false</p>
<p>Alex -&gt; 0.1 -&gt; NGB</p></td>
</tr>
</tbody>
</table>

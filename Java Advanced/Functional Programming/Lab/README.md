# Lab: Functional Programming

This document defines the **lab** for the [<span class="underline">"Java
Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1513/Functional-Programming-Lab).

## Sort Even Numbers

Write a program that reads one line of **Integers** separated by **",
"**.

  - Print the **even** numbers.

  - **Sort** them in ascending order.

  - Print them again.

Use 2 **Lambda Expresions** to do so.

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
<td><strong>4, 2, 1, 3, 5, 7, 1, 4, 2, 12</strong></td>
<td><p><strong>4, 2, 4, 2, 12</strong></p>
<p><strong>2, 2, 4, 4, 12</strong></p></td>
</tr>
<tr class="even">
<td>1, 3, 5</td>
<td><em><strong>(no output)</strong></em></td>
</tr>
<tr class="odd">
<td>2, 4, 6</td>
<td><p>2, 4, 6</p>
<p>2, 4, 6</p></td>
</tr>
</tbody>
</table>

### Hints

  - It is up to you what type of data structures you will use to solve
    this problem.

  - Try different ways, of solving this problem, for example:

![](media/image1.png)

## Sum Numbers

Write a program that reads one line of **Integers** separated by **",
"**. Print the **count** of the numbers and their **sum.**

Use a **Function\<String, Integer\>.**

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
<td><strong>4, 2, 1, 3, 5, 7, 1, 4, 2, 12</strong></td>
<td><p><strong>Count = 10</strong></p>
<p><strong>Sum = 41</strong></p></td>
</tr>
<tr class="even">
<td>2, 4, 6</td>
<td><p><strong>Count = 3</strong></p>
<p><strong>Sum = 12</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use Function\<String, Integer\> for parsing integers after you split
    them into a String array.

## Count Uppercase Words

Write a program that reads one line of **text** from the console. Print
the **count** of words that start with an **Uppercase letter**, after
that print all these **words** in the **same order** as you found them
in the text.

Use a **Predicate\<String\>.**

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
<td>The following example shows how to use Predicate</td>
<td><p>2</p>
<p><strong>The</strong></p>
<p><strong>Predicate</strong></p></td>
</tr>
<tr class="even">
<td>Write a program that reads one line of text from console. Print count of words that start with Uppercase, after that print all those words in the same order like you find them in text.</td>
<td><p>3</p>
<p>Write</p>
<p>Print</p>
<p>Uppercase,</p></td>
</tr>
</tbody>
</table>

### Hints

  - Use a **Predicate\<String\>** like an **if-condition.**

## Add VAT

Write a program that reads one line of **Double** prices separated by
**", "**. Print the prices with added **VAT**s for all of them. Format
them to the **2<sup>nd</sup>** digit after the decimal point. The order
of the prices must remain the same.

Use an **UnaryOperator\<Double\>.**

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
<td><strong>1.38, 2.56, 4.4</strong></td>
<td><p><strong>Prices with VAT:</strong></p>
<p><strong>1.66</strong></p>
<p><strong>3.07</strong></p>
<p><strong>5.28</strong></p></td>
</tr>
<tr class="even">
<td><strong>1, 3, 5, 7</strong></td>
<td><p><strong>Prices with VAT:</strong></p>
<p><strong>1.20</strong></p>
<p><strong>3.60</strong></p>
<p><strong>6.00</strong></p>
<p><strong>8.40</strong></p></td>
</tr>
</tbody>
</table>

### Hints

![](media/image2.png)

## Filter by Age

Write a program that reads an integer **N** on the first line. And on
next **N** lines read pairs of **"{name}, {age}".** Then read three more
lines:

  - Condition - "**younger**" or "**older**"

  - Age - **Integer**

  - Format - "**name**", "**age**" or "**name age**"

Depending on the **condition,** print the **pairs** in the right
**format**.

**Don't use any built-in functionality. Write your methods.**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>5</p>
<p>Peter, 20<br />
George, 18<br />
Maria, 29<br />
Idan, 31<br />
Simeon, 16</p>
<p>older</p>
<p>20</p>
<p>name age</p></td>
<td><p>Peter - 20</p>
<p>Maria - 29</p>
<p>Idan - 31</p></td>
<td></td>
<td><p>5</p>
<p>Peter, 20<br />
George, 18<br />
Maria, 29<br />
Idan, 31<br />
Simeon, 16</p>
<p>younger</p>
<p>20</p>
<p>name</p></td>
<td><p>Peter</p>
<p>George</p>
<p>Simeon</p></td>
<td></td>
<td><p>5</p>
<p>Peter, 20<br />
George, 18<br />
Maria, 29<br />
Idan, 31<br />
Simeon, 16</p>
<p>younger</p>
<p>50</p>
<p>age</p></td>
<td><p>20</p>
<p>18</p>
<p>29</p>
<p>31</p>
<p>16</p></td>
</tr>
</tbody>
</table>

## Find Evens or Odds

You are given a **lower** and an **upper** **bound** for a range of
integer numbers. Then a command specifies if you need to list all
**even** **or** **odd** numbers in the given range. Use **predicates**
that need to be **passed to a method.**

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
<td><p>1 10</p>
<p>odd</p></td>
<td>1 3 5 7 9</td>
</tr>
<tr class="even">
<td><p>20 30</p>
<p>even</p></td>
<td>20 22 24 26 28 30</td>
</tr>
</tbody>
</table>

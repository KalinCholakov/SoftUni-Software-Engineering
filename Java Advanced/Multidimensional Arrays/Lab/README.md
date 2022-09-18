# Lab: **Multidimensional Arrays**

This document defines the **lab** for the [<span class="underline">"Java
Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1459/Multidimensional-Arrays-Lab).

## Compare Matrices

Write a program that reads two integer matrices (2D arrays) from the
console and compares them element by element. For better code
reusability, you could make the comparison in a method that returns
**true** if they are equal and **false** if not.

Each matrix definition on the console will contain a line with a
positive integer number **R** – the number of rows in the matrix and
**C** – the number of columns – followed by **R** lines containing the
**C** numbers, separated by spaces (each line will have an equal amount
of numbers.

The matrices will have at most **10** rows and at most **10** columns.

Print **"equal"** if the matrices match and **"not equal"** if they
don't match.

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
<td><p><strong>2 3</strong></p>
<p><strong>1 2 3</strong></p>
<p><strong>2 1 3</strong></p>
<p><strong>2 3</strong></p>
<p><strong>1 2 3</strong></p>
<p><strong>2 1 3</strong></p></td>
<td><strong>equal</strong></td>
</tr>
<tr class="even">
<td><p><strong>2 3</strong></p>
<p><strong>1 2 3</strong></p>
<p><strong>4 5 6</strong></p>
<p><strong>2 2</strong></p>
<p><strong>1 3</strong></p>
<p><strong>4 5</strong></p></td>
<td><strong>not equal</strong></td>
</tr>
</tbody>
</table>

Read matrix:

![](media/image1.png)

Compare method:

![](media/image2.png)

## Positions Of

Write a program that reads a matrix of integers from the console, then a
number, and prints all the positions at which that number appears in the
matrix.

The matrix definition on the console will contain a line with two
positive integer numbers **R** and **C** – the number of rows and
columns in the matrix – followed by **R** lines, each containing **C**
numbers (separated by spaces), representing each row of the matrix.

The number you will need to find the positions will be entered on a
single line after the matrix.

You should print each position on a single line – first print the row,
then the column at which the number appears.

If the number does not appear in the matrix, print **"not found".**

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
<td><p><strong>2 3</strong></p>
<p><strong>1 2 3</strong></p>
<p><strong>4 2 2</strong></p>
<p><strong>2</strong></p></td>
<td><p><strong>0 1</strong></p>
<p><strong>1 1</strong></p>
<p><strong>1 2</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>2 3</strong></p>
<p><strong>1 -2 -3</strong></p>
<p><strong>4 -5 6</strong></p>
<p><strong>5</strong></p></td>
<td><strong>not found</strong></td>
</tr>
</tbody>
</table>

### Hints

1.  Read matrix – look at Problem 1.

2.  Find position:

![](media/image3.png)

## Intersection of Two Matrices

Write a program that reads two char matrices **(A\[\]\[\] and
B\[\]\[\])** of the same order **M \* N** and prints the third matrix
**C\[\]\[\],** which is filled with the intersecting elements of **A and
B**, otherwise set the element to **'\*'**. On the first two lines, you
receive **M** and **N**, then on **2 \* M** lines **N** characters – the
matrices elements.

The matrix elements may be any ASCII char **except** **'\*'.**

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
<p><strong>4</strong></p>
<p><strong>a b c d</strong></p>
<p><strong>a b c d</strong></p>
<p><strong>a b c d</strong></p>
<p><strong>k b c k</strong></p>
<p><strong>a b g d</strong></p>
<p><strong>a k c d</strong></p></td>
<td><p><strong>* b c *</strong></p>
<p><strong>a b * d</strong></p>
<p><strong>a * c d</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>2</strong></p>
<p><strong>1 2</strong></p>
<p><strong>3 4</strong></p>
<p><strong>5 6</strong></p>
<p><strong>7 8</strong></p>
<p><strong>9 1</strong></p>
<p><strong>0 2</strong></p>
<p><strong>3 1</strong></p>
<p><strong>1 6</strong></p>
<p><strong>7 4</strong></p>
<p><strong>1 1</strong></p></td>
<td><p><strong>* 2</strong></p>
<p><strong>3 *</strong></p>
<p><strong>* 6</strong></p>
<p><strong>7 *</strong></p>
<p><strong>* 1</strong></p></td>
</tr>
</tbody>
</table>

## Sum Matrix Elements

Write a program that **reads a matrix** from the console and prints:

  - The count of **rows**

  - The count of **columns**

  - The sum of all **matrix's elements**

On the first line, you will get the matrix dimensions in the format
**"{rows, columns}".** On the next lines, you will get the elements for
each **row** separated by a comma.

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
<td><p><em>3, 6</em></p>
<p><em>7, 1, 3, 3, 2, 1<br />
1, 3, 9, 8, 5, 6<br />
4, 6, 7, 9, 1, 0</em></p></td>
<td><p><strong>3</strong></p>
<p><strong>6</strong></p>
<p><strong>76</strong></p></td>
</tr>
<tr class="even">
<td><p><em>2, 4</em></p>
<p><em>10, 11, 12, 13</em></p>
<p><em>14, 15, 16, 17</em></p></td>
<td><p><strong>2</strong></p>
<p><strong>4</strong></p>
<p><strong>108</strong></p></td>
</tr>
</tbody>
</table>

### Hints

![](media/image4.png)

5.  **Maximum Sum of 2X2 Submatrix**

Write a program that **reads a matrix** from the console. Then find the
biggest sum of a **2x2 submatrix.** Print the submatrix and its sum.

On the first line, you will get the matrix dimensions in the format
**"{rows, columns}".** On the next lines, you will get the elements for
each **row** separated by a comma.

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
<td><p><em>3, 6</em></p>
<p><em>7, 1, 3, 3, 2, 1<br />
1, 3, 9, 8, 5, 6<br />
4, 6, 7, 9, 1, 0</em></p></td>
<td><p><strong>9 8</strong></p>
<p><strong>7 9</strong></p>
<p><strong>33</strong></p></td>
</tr>
<tr class="even">
<td><p><em>2, 4</em></p>
<p><em>10, 11, 12, 13</em></p>
<p><em>14, 15, 16, 17</em></p></td>
<td><p><strong>12 13</strong></p>
<p><strong>16 17</strong></p>
<p><strong>58</strong></p></td>
</tr>
</tbody>
</table>

## Print Diagonals of Square Matrix

Write a program that **reads a matrix** from the console. Then print the
diagonals. The matrix will always be square. On the first line, you read
a single integer **N** the matrix size. Then on each line N elements.
The first diagonal should always start with the element at the **first
row and col**. The second diagonal should start with the element at the
**last row and first col**.

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
<td><p><em>3</em></p>
<p><em>1 2 3</em></p>
<p><em>1 2 3</em></p>
<p><em>1 2 3</em></p></td>
<td><p><strong>1 2 3</strong></p>
<p><strong>1 2 3</strong></p></td>
</tr>
<tr class="even">
<td><p><em>4</em></p>
<p><em>1 2 3 2</em></p>
<p><em>1 1 2 4</em></p>
<p><em>1 2 1 4</em></p>
<p><em>2 2 3 1</em></p></td>
<td><p><strong>1 1 1 1</strong></p>
<p><strong>2 2 2 2</strong></p></td>
</tr>
</tbody>
</table>

**7. \*\* Find the Real Queen**

Write a program that **reads (8 x 8) matrix of characters** from the
console. The matrix represents a chessboard with figures on it. The
figures can be - queens as char **'q'** or **any other ASCII symbol**.
There will be more than one queen, but only **one queen will have a
valid position**, which is not attacked by any other queen and does not
attack any other queen. In another word, in the way of the valid queen,
there are no other queens, but there may be any other ASCII symbol. Your
task is to read the chessboard and find the position of the valid queen.
According to chess rules, the queen can attack all the cells in
horizontal verticals and both diagonals, which cross the queen position.

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
<td><p><em>p a p <strong>a</strong> p a p <strong>a</strong></em></p>
<p><em><strong>p</strong> a p <strong>a</strong> p a <strong>p</strong> a</em></p>
<p><em>p <strong>a</strong> q <strong>a</strong> p <strong>a</strong> q a</em></p>
<p><em>p a <strong>p a p</strong> a p a</em></p>
<p><em><strong>p a p q p a p a</strong></em></p>
<p><em>p a <strong>p a p</strong> a p a</em></p>
<p><em>p <strong>a</strong> q <strong>a</strong> p <strong>a</strong> q a</em></p>
<p><em><strong>p</strong> a p <strong>a</strong> p a <strong>p</strong> a</em></p></td>
<td><strong>4 3</strong></td>
</tr>
<tr class="even">
<td><p><em>1 q q q 1 q q q</em></p>
<p><em>q 1 q q 1 q q 1</em></p>
<p><em>q q 1 q 1 q 1 q</em></p>
<p><em>q q q 1 1 1 q q</em></p>
<p><em>1 1 1 1 <strong>q</strong> 1 1 1</em></p>
<p><em>q q q 1 1 1 q q</em></p>
<p><em>q q 1 q 1 q 1 q</em></p>
<p><em>q 1 q q 1 q q 1</em></p></td>
<td><strong>4 4</strong></td>
</tr>
</tbody>
</table>

## 8\. Wrong Measurements

You will be given the rows of a matrix. Then the matrix itself. Inside
this matrix, there are mistaken values that need to be replaced. You
will receive the wrong value at the last line. Those values should be
replaced with the sum of the nearest elements in the four directions,
**up, down, left, and right**, but only if they are valid values. In the
end, you have to print the fixed measurements.

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
<td><p>3</p>
<p>1 2 4</p>
<p>4 6 7</p>
<p>8 9 4</p>
<p>1 0</p></td>
<td><p><strong>1 2 9</strong></p>
<p><strong>15 6 7</strong></p>
<p><strong>8 9 16</strong></p></td>
</tr>
<tr class="even">
<td><p>3</p>
<p>1 2 4 4</p>
<p>4 6 4 3</p>
<p>8 9 4 2</p>
<p>1 0</p></td>
<td><p><strong>1 2 2 3</strong></p>
<p><strong>15 6 9 3</strong></p>
<p><strong>8 9 11 2</strong></p></td>
</tr>
</tbody>
</table>

> **Exercises: Trees Representation and Traversal (BFS and DFS) -
> Exercises**

This document defines the **lab** for [<span class="underline">"Data
Structures – Fundamentals (Java)" course @ Software
University</span>](https://softuni.bg/trainings/3671/data-structures-fundamentals-with-java-february-2022).
Please submit your solutions (source code) of all below described
problems in
[<span class="underline">Judge</span>](https://judge.softuni.bg/Contests/2199/04-Trees-Representation-and-Traversal-BFS-and-DFS-Exercises).

Write Java code for solving the tasks on the following pages. Code
should compile under the Java 8 and above standards you can write and
locally test your solution with the Java 13 standard, however **Judge
will run the submission with Java 10 JRE**. Avoid submissions with
**features included after Java 10** release doing **otherwise** will
result in **compile time error**.

Any code files that are part of the task are provided as **Skeleton**.
In the beginning import the project skeleton, do not change any of the
interfaces or classes provided. You are free to add additional logic in
form of methods in both interfaces and implementations you are not
allowed to delete or remove any of the code provided. Do not change the
names of the files as they are part of the tests logic. **Do not change
the packages** or move any of the files provided inside the skeleton if
you have to add new file add it in the same package of usage.

Some **tests may be provided** within the skeleton – use those for local
**testing and debugging**, however there **is no guarantee that there
are no hidden tests added inside Judge**.

Please follow the exact instructions on uploading the solutions for each
task. Submit as **.zip archive** the files contained inside
**"...\\src\\main\\java"** folder this should work for all tasks
regardless of current DS implementation.

In order for the solution to compile the tests **successfully** the
project **must** have **single** **Main.java** file containing single
**public static void main(String\[\] args)** method even empty one
within the **Main class**.

Some of the problem will have simple **Benchmark** **tests** inside the
skeleton. You can try to run those with **different** **values** and
**different** **implementations** in order to **observe** behaviour.
However **keep** in mind that the result comes **only as numbers** and
this data may be **misleading** in some situations. Also the tests are
not started from the command prompt which may **influence** the
**accuracy** of the results. Those tests are only added as an
**example** of **different** **data** **structures** **performance** on
their **common** operations.

The Benchmark tool we are using is **JMH** (Java Microbenchmark Harness)
and that is Java harness for building, running, and analyzing,
**nano/micro/milli/macro** benchmarks written in Java and other
languages targeting, the JVM.

**Additional** **information** can be found here:
[JMH](https://openjdk.java.net/projects/code-tools/jmh/) and also there
are other examples over the **internet**.

**Important:** when importing the skeleton **select** **import**
**project** and then **select** **from** **maven** **module**, this way
any following **dependencies** will be **automatically** **resolved**.
The project has **NO** **default** **version** of **JDK so after the
import you may (depends on some configurations) need to specify the SDK,
you can download** **JDK 13** from **[HERE](https://jdk.java.net/13/).**

## The Matrix

You can solve this problem by using **BFS** or **DFS**, you can even try
the both approaches.

You are given a matrix (2D array) of lowercase alphanumeric characters
(**a-z**, **0-9**), a starting position – defined by a start row
**startRow** and a start column **startCol** – and a filling symbol
**fillChar**. Let’s call the symbol originally at **startRow** and
**startCol** the **startChar**. Write a program, which, starting from
the symbol at **startRow** and **startCol**, changes to **fillChar**
every symbol in the matrix which:

  - is equal to **startChar** AND

  - can be reached from **startChar** by going up (**row – 1**), down
    (**row + 1**), left (**col – 1**) and right (**col + 1**) and
    “stepping” ONLY on symbols equal **startChar**

So, you basically start from **startRow** and **startCol** and can move
either by changing the row OR column (not both at once, i.e. you can’t
go diagonally) by **1**, and can only go to positions which have the
**startChar** written on them. Once you find all those positions, you
change them to **fillChar**.

In other words, you need to implement something like the Fill tool in MS
Paint, but for a 2D char array instead of a bitmap.

Study the code inside TheMatrix class and the tests. Implement the two
methods: **solve ()** and **toOutputString ().**

### Input

There are two classes for this problem TheMatrix and TheMatrixTest .You
have to study the code the input is passed upon creation of TheMatrix
object inside the tests.

Two integers will be entered – the number **R** of rows and number **C**
of columns.

On each of the next **R** lines, **C** characters separated by single
spaces will be entered – the symbols of the **R**<sup>th</sup> row of
the matrix, starting from the **0**<sup>th</sup> column and ending at
the **C-1** column.

On the next line, a single character – the **fillChar** – will be
entered.

On the last line, two integers – **startRow** and **startCol** –
separated by a single space, will be entered.

### Output

**Implement the toOutputString ().**

The output should consist of R lines, each consisting of exactly C
characters, **NOT SEPARATED** by spaces, representing the matrix after
the fill operation has been finished.

### Constraints

**0 \< R,** **C \< 20**  
**0 \<= startRow \< R**  
**0 \<= startCol \< C**

All symbols in the input matrix will be lowercase alphanumerics
(**a-z**, **0-9**). The **fillChar** will also be alphanumeric and
lowercase.

The total running time of your program should be no more than **0.1s**

The total memory allowed for use by your program is **5MB**

### Examples

<table>
<thead>
<tr class="header">
<th>Example Input</th>
<th>Expected Output</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>5 3</p>
<p>a a a</p>
<p>a a a</p>
<p>a b a</p>
<p>a b a</p>
<p>a b a</p>
<p>x</p>
<p>0 0</p></td>
<td><p>xxx</p>
<p>xxx</p>
<p>xbx</p>
<p>xbx</p>
<p>xbx</p></td>
</tr>
<tr class="even">
<td><p>5 3</p>
<p>a a a</p>
<p>a a a</p>
<p>a b a</p>
<p>a b a</p>
<p>a b a</p>
<p>x</p>
<p>2 1</p></td>
<td><p>aaa</p>
<p>aaa</p>
<p>axa</p>
<p>axa</p>
<p>axa</p></td>
</tr>
<tr class="odd">
<td><p>5 6</p>
<p>o o 1 1 o o</p>
<p>o 1 o o 1 o</p>
<p>1 o o o o 1</p>
<p>o 1 o o 1 o</p>
<p>o o 1 1 o o</p>
<p>3</p>
<p>2 1</p></td>
<td><p>oo11oo</p>
<p>o1331o</p>
<p>133331</p>
<p>o1331o</p>
<p>oo11oo</p></td>
</tr>
<tr class="even">
<td><p>5 6</p>
<p>o o o o o o</p>
<p>o o o 1 o o</p>
<p>o o 1 o 1 1</p>
<p>o 1 1 w 1 o</p>
<p>1 o o o o o</p>
<p>z</p>
<p>4 1</p></td>
<td><p>oooooo</p>
<p>ooo1oo</p>
<p>oo1o11</p>
<p>o11w1z</p>
<p>1zzzzz</p></td>
</tr>
<tr class="odd">
<td><p>5 6</p>
<p>o 1 o o 1 o</p>
<p>o 1 o o 1 o</p>
<p>o 1 1 1 1 o</p>
<p>o 1 o w 1 o</p>
<p>o o o o o o</p>
<p>z</p>
<p>4 0</p></td>
<td><p>z1oo1z</p>
<p>z1oo1z</p>
<p>z1111z</p>
<p>z1zw1z</p>
<p>zzzzzz</p></td>
</tr>
</tbody>
</table>

## Tree Problems Overview

**You are given a tree of N nodes represented as a set of N-1 pairs of
nodes (parent node, child node). For each problem you have specified
definition of the implementation required to complete the task. You can
use different approaches which you find suitable for the task you are
solving. In general all the problems require basic tree knowledge and
understanding of DFS and BFS traversal algorithms.**

**Example:**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Comments</strong></th>
<th><strong>Tree</strong></th>
<th><strong>Definitions</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p>
<p>27</p>
<p>43</p></td>
<td><p>N = 9</p>
<p>Nodes:</p>
<p>7 19,</p>
<p>7 21,</p>
<p>7 14,</p>
<p>19 1,</p>
<p>19 12,</p>
<p>19 31,</p>
<p>14 23,</p>
<p>14 6</p>
<p>P = 27</p>
<p>S = 43</p></td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
<td><p>Root node: 7</p>
<p>Leaf nodes: 1, 6, 12, 21, 23, 31</p>
<p>Middle nodes: 14, 19</p>
<p>Leftmost deepest node: 1</p>
<p>Longest path:<br />
7 -&gt; 19 -&gt; 1 (length = 3)</p>
<p>Paths of sum 27:<br />
7 -&gt; 19 -&gt; 1<br />
7 -&gt; 14 -&gt; 6</p>
<p>Subtrees of sum 43:<br />
14 + 23 + 6</p></td>
</tr>
</tbody>
</table>

## Create Tree

Write a program to create a tree and find its **root** node then return
it as an entry point to the DS:

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td>Root node: 7</td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

**Hints**

Use the recursive **Tree\<E\>** definition. Keep the **value**,
**parent** and **children** for each tree node:

![](media/image2.png)

Modify the **Tree\<T\>** **constructor** to **assign a parent** for each
child node:

![](media/image3.png)

Use a **Map or Array** to map nodes by their value. This will allow you
to find the tree nodes during the tree construction:

![](media/image4.png)

Write a method to **find the tree node by its value or create a new
node** if it does not exist:

![](media/image5.png)

Create a method for adding an edge to the tree:

![](media/image6.png)

Now you are ready to **create the tree**. You are given the **tree
edges** (parent + child). Use the map to lookup the parent and child
nodes by their values:

![](media/image7.png)

Finally, you can find the root (the node that has no parent)

![](media/image8.png)

## Tree As String

Write a program to create tree from and print it in the following format
(each level indented +2 spaces):

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td><p>7</p>
<p>19</p>
<p>1</p>
<p>12</p>
<p>31</p>
<p>21</p>
<p>14</p>
<p>23</p>
<p>6</p></td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

**Hints**

Find the root and recursively print the tree

## Leaf Nodes

Write a program to read the tree and find all **leaf** nodes (in
increasing order):

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td>Leaf nodes: 1 6 12 21 23 31</td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

**Hints**

Find the all nodes that have no children

## Middle Nodes

Write a program to read the tree and find all **middle** nodes (in
increasing order):

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td>Middle nodes: 14 19</td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

**Hints**

We can say that **middle** **nodes** are the once that have a **parent**
**and at least one child at the same time.**

## \* Deepest Node

Write a program to read the tree and find its deepest node (leftmost):

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td>Deepest node: 1</td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

## Longest Path

Find the **longest path** in the tree (the leftmost if several paths
have the same longest length)

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p></td>
<td>Longest path: 7 19 1</td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

## All Paths With a Given Sum

Find all paths in the tree with **given sum** of their nodes (from the
leftmost to the rightmost)

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p>
<p>27</p></td>
<td><p>Paths of sum 27:</p>
<p>7 19 1</p>
<p>7 14 6</p></td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

##  \* All Subtrees With a Given Sum

Find all **subtrees with given sum** of their nodes (from the leftmost
to the rightmost). Print subtrees in **pre-order** sequence

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Tree</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>7 19</p>
<p>7 21</p>
<p>7 14</p>
<p>19 1</p>
<p>19 12</p>
<p>19 31</p>
<p>14 23</p>
<p>14 6</p>
<p>43</p></td>
<td><p>Subtrees of sum 43:</p>
<p>14 23 6</p></td>
<td><img src="media/image1.png" style="width:2.07607in;height:1.632in" /></td>
</tr>
</tbody>
</table>

## 

"In the beginning there was nothing, which exploded." ― Terry Pratchett,
Lords and Ladies

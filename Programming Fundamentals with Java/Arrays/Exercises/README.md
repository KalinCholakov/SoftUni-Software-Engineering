# Exercise: Arrays

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022).

You can check your solutions in
[Judge](https://judge.softuni.bg/Contests/1247).

## Train

You will be given a count of wagons in a train **n**. On the next **n**
lines, you will receive how many people are going to get on that wagon.
At the end print the whole train and after that the sum of the people on
the train.

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
<p>13</p>
<p>24</p>
<p>8</p></td>
<td><p><strong>13 24 8</strong></p>
<p><strong>45</strong></p></td>
</tr>
<tr class="even">
<td><p>6</p>
<p>3</p>
<p>52</p>
<p>71</p>
<p>13</p>
<p>65</p>
<p>4</p></td>
<td><p><strong>3 52 71 13 65 4</strong></p>
<p><strong>208</strong></p></td>
</tr>
<tr class="odd">
<td><p>1</p>
<p>100</p></td>
<td><p><strong>100</strong></p>
<p><strong>100</strong></p></td>
</tr>
</tbody>
</table>

## Common Elements

Write a program, which prints common elements in two arrays. You have to
compare the elements of the second array to the elements of the first.

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
<td><p>Hey hello 2 4</p>
<p>10 hey 4 hello</p></td>
<td><strong>4 hello</strong></td>
</tr>
<tr class="even">
<td><p>S of t un i</p>
<p>of i 10 un</p></td>
<td>of i un</td>
</tr>
<tr class="odd">
<td><p>i love to code</p>
<p>code i love to</p></td>
<td>code i love to</td>
</tr>
</tbody>
</table>

## Zig-Zag Arrays

Write a program that creates 2 arrays. You will be given an integer
**n**. On the next **n** lines, you get 2 integers. Form 2 arrays as
shown below.

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
<td><p>4</p>
<p>1 5</p>
<p>9 10</p>
<p>31 81</p>
<p>41 20</p></td>
<td><p>1 10 31 20</p>
<p>5 9 81 41</p></td>
</tr>
<tr class="even">
<td><p>2</p>
<p>80 23</p>
<p>31 19</p></td>
<td><p>80 19</p>
<p>23 31</p></td>
</tr>
</tbody>
</table>

## Array Rotation

Write a program that receives an array and the number of rotations you
have to perform (the first element goes at the end) Print the resulting
array.

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
<td><p>51 47 32 61 21</p>
<p>2</p></td>
<td>32 61 21 51 47</td>
</tr>
<tr class="even">
<td><p>32 21 61 1</p>
<p>4</p></td>
<td>32 21 61 1</td>
</tr>
<tr class="odd">
<td><p>2 4 15 31</p>
<p>5</p></td>
<td>4 15 31 2</td>
</tr>
</tbody>
</table>

## Top Integers

Write a program to find all the top integers in an array. A top integer
is an integer that is **bigger** than all the elements to its right.

### Examples

| **Input**           | **Output** |
| ------------------- | ---------- |
| 1 4 3 2             | 4 3 2      |
| 14 24 3 19 15 17    | 24 19 17   |
| 27 19 42 2 13 45 48 | 48         |

## Equal Sums

Write a program that determines if there **exists an element in the
array** such that the **sum of the elements on its left** is **equal**
to the **sum of the elements on its right**. If there are **no elements
to the left/right**, their **sum is considered to be 0**. Print the
**index** that satisfies the required condition or "**no**" if there is
no such index.

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
<td><strong>1 2 3 3</strong></td>
<td><strong>2</strong></td>
<td><p><strong>At a[2] -&gt; left sum = 3, right sum = 3</strong></p>
<p><strong>a[0] + a[1] = a[3]</strong></p></td>
</tr>
<tr class="even">
<td><strong>1 2</strong></td>
<td><strong>no</strong></td>
<td><p><strong>At a[0] -&gt; left sum = 0, right sum = 2</strong></p>
<p><strong>At a[1] -&gt; left sum = 1, right sum = 0</strong></p>
<p><strong>No such index exists</strong></p></td>
</tr>
<tr class="odd">
<td><strong>1</strong></td>
<td><strong>0</strong></td>
<td><strong>At a[0] -&gt; left sum = 0, right sum = 0</strong></td>
</tr>
<tr class="even">
<td><strong>1 2 3</strong></td>
<td><strong>no</strong></td>
<td><strong>No such index exists</strong></td>
</tr>
<tr class="odd">
<td><strong>10 5 5 99 3 4 2 5 1 1 4</strong></td>
<td><strong>3</strong></td>
<td><p><strong>At a[3] -&gt; left sum = 20, right sum = 20</strong></p>
<p><strong>a[0] + a[1] + a[2] = a[4] + a[5] + a[6] + a[7] + a[8] + a[9] + a[10]</strong></p></td>
</tr>
</tbody>
</table>

## Max Sequence of Equal Elements

Write a program that finds the **longest sequence of equal elements** in
an array of integers. If several longest sequences exist, print the
leftmost one.

### Examples

| **Input**               | **Output**  |
| ----------------------- | ----------- |
| **2 1 1 2 3 3 2 2 2 1** | **2 2 2**   |
| **1 1 1 2 3 1 3 3**     | **1 1 1**   |
| **4 4 4 4**             | **4 4 4 4** |
| **0 1 1 5 2 2 6 3 3**   | **1 1**     |

## Magic Sum

Write a program, which prints all unique pairs in an array of integers
whose sum is equal to a given number.

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
<td><p>1 7 6 2 19 23</p>
<p>8</p></td>
<td><p><strong>1 7</strong></p>
<p><strong>6 2</strong></p></td>
</tr>
<tr class="even">
<td><p>14 20 60 13 7 19 8</p>
<p>27</p></td>
<td><p>14 13</p>
<p>20 7</p>
<p>19 8</p></td>
</tr>
</tbody>
</table>

## Array Modifier

You are given **an array with integers**. Write a program to **modify
the elements** after **receiving the following commands:**

  - "**swap {index1} {index2}**" takes **two elements** and **swap their
    places**.

  - "**multiply {index1} {index2}**" takes **element at the
    1<sup>st</sup> index** and **multiply** **it** **with the element at
    2<sup>nd</sup> index**. **Save the product at the 1<sup>st</sup>
    index.**

  - "**decrease**" **decreases** **all elements** in the array **with
    1**.

### Input

On the **first input line,** you will be given **the initial array
values** separated by a single space.

On the **next lines** you will receive commands **until** you receive
the **command "end"**. The **commands are** as follow:

  - "**swap {index1} {index2}**"

  - "**multiply {index1} {index2}**"

  - "**decrease**"

### Output

**The output** should be printed on the console and consist of
**elements** **of the** **modified array** – **separated by a comma and
a single space** "**,** ".

### Constraints

  - **Elements of the array** will be **integer numbers** in the range
    **\[-2<sup>31</sup>...2<sup>31</sup>\].**

  - **Count of the array elements** will be in the range
    **\[2...100\].**

  - **Indexes** **will be always in the range of the array.**

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
<td><p>23 -2 321 87 42 90 -123</p>
<p>swap 1 3</p>
<p>swap 3 6</p>
<p>swap 1 0</p>
<p>multiply 1 2</p>
<p>multiply 2 1</p>
<p>decrease</p>
<p>end</p></td>
<td>86, 7382, 2369942, -124, 41, 89, -3</td>
<td><p>23 -2 321 87 42 90 -123 – initial values</p>
<p>swap 1(-2) and 3(87) ▼</p>
<p>23 87 321 -2 42 90 -123</p>
<p>swap 3(-2) and 6(-123) ▼</p>
<p>23 87 321 -123 42 90 -2</p>
<p>swap 1(87) and 0(23) ▼</p>
<p>87 23 321 -123 42 90 -2</p>
<p>multiply 1(23) 2(321) = 7383 ▼</p>
<p>87 7383 321 -123 42 290 -2</p>
<p>multiply 2(321) 1(7383) = 2369943 ▼</p>
<p>87 7383 2369943 -123 42 90 -2</p>
<p>decrease – all - 1 ▼</p>
<p>86 7383 2369942 -124 41 89 -3</p></td>
</tr>
<tr class="even">
<td><p>1 2 3 4</p>
<p>swap 0 1</p>
<p>swap 1 2</p>
<p>swap 2 3</p>
<p>multiply 1 2</p>
<p>decrease</p>
<p>end</p></td>
<td>1, 11, 3, 0</td>
<td></td>
</tr>
</tbody>
</table>

## Treasure Hunt

*The pirates need to carry a treasure chest safely back to the ship,
looting along the way.*

Create a program that **manages** the **state** of the **treasure
chest** along the way. On the **first line,** you will receive the
**initial loot** of the treasure chest, which is a **string** of
**items** separated by a **"|"**.

**"{loot<sub>1</sub>}|{loot<sub>2</sub>}|{loot<sub>3</sub>} …
{loot<sub>n</sub>}"**

The following lines represent commands **until** **"Yohoho\!"** which
ends the treasure hunt:

  - **"Loot {item<sub>1</sub>} {item<sub>2</sub>}…{item<sub>n</sub>}":**
    
      - Pick up treasure loot along the way. Insert the items at the
        **beginning** of the chest.
    
      - If an item is **already** contained, **don't** insert it.

  - **"Drop {index}":**
    
      - **Remove** the loot at the given **position** and **add** it at
        the **end** of the treasure chest.
    
      - If the index is **invalid,** skip the command.

  - > **"Steal {count}":**
    
      - > Someone steals the **last count** loot items. If there are
        > **fewer items** than the given count, **remove as much** as
        > there are.
    
      - > Print the stolen items separated by **", "**:

**"{item<sub>1</sub>}, {item<sub>2</sub>}, {item<sub>3</sub>} …
{item<sub>n</sub>}"**

In the end, output the **average treasure gain,** which is the **sum**
of all treasure items **length** divided by the **count** of all items
inside the chest **formatted** to the **second decimal** point:

**"Average treasure gain: {averageGain} pirate credits."**

If the chest is **empty,** print the following message:

**"Failed treasure hunt."**

### Input

  - > On the **1<sup>st</sup> line,** you are going to receive the
    > **initial treasure chest (loot separated by "|").**

  - > On the following **lines**, until **"Yohoho\!"**, you will be
    > receiving commands.

### Output

  - Print the output in the **format** **described** **above**.

### Constraints

  - The **loot items** will be strings containing any ASCII code.

  - The **indexes** will be integers in the range \[**-200**…**200**\].

  - The **count** will be an integer in the range \[**1**….**100**\].

### Examples

<table>
<tbody>
<tr class="odd">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="even">
<td><p>Gold|Silver|Bronze|Medallion|Cup</p>
<p>Loot Wood Gold Coins</p>
<p>Loot Silver Pistol</p>
<p>Drop 3</p>
<p>Steal 3</p>
<p>Yohoho!</p></td>
<td><p>Medallion, Cup, Gold</p>
<p>Average treasure gain: 5.40 pirate credits.</p></td>
</tr>
<tr class="odd">
<td><strong>Comments</strong></td>
<td></td>
</tr>
<tr class="even">
<td><p>The first command <strong>"Loot Wood Gold Coins"</strong> adds <strong>Wood</strong> and <strong>Coins</strong> to the chest but <strong>omits</strong> Gold since it is already contained. The chest now has the following items:</p>
<p><strong>Coins Wood Gold Silver Bronze Medallion Cup</strong></p>
<p>The <strong>second</strong> command adds <strong>only Pistol</strong> to the chest</p>
<p>The <strong>third</strong> command <strong>"Drop 3"</strong> removes the <strong>Gold</strong> from the chest, but immediately adds it at the <strong>end</strong>:</p>
<p><strong>Pistol Coins Wood Silver Bronze Medallion Cup Gold</strong></p>
<p>The <strong>fourth</strong> command <strong>"Steal 3"</strong> removes the <strong>last 3</strong> items <strong>Medallion</strong>, <strong>Cup</strong>, <strong>Gold</strong> from the chest and prints them.</p>
<p>In the end calculate the average treasure gain which is the sum of all items length Pistol(<strong>6</strong>) + Coins(<strong>5</strong>) + Wood(<strong>4</strong>) + Silver(<strong>6</strong>) + Bronze(<strong>6</strong>) = <strong>27</strong> and <strong>divide</strong> it by the count 27 / 5 = <strong>5.4</strong> and format it to the <strong>second decimal</strong> point.</p></td>
<td></td>
</tr>
<tr class="odd">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="even">
<td><p>Diamonds|Silver|Shotgun|Gold</p>
<p>Loot Silver Medals Coal</p>
<p>Drop -1</p>
<p>Drop 1</p>
<p>Steal 6</p>
<p>Yohoho!</p></td>
<td><p>Coal, Diamonds, Silver, Shotgun, Gold, Medals</p>
<p>Failed treasure hunt.</p></td>
</tr>
</tbody>
</table>

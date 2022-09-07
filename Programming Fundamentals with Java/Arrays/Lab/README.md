# Lab: Arrays

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni.](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022)

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1248/)

## Day of Week

Enter a **day** number and print the **day name** (in English) or
"**Invalid day\!**". Use an **array of strings**.

### Examples

| **Input** | **Output**        |
| --------- | ----------------- |
| **1**     | **Monday**        |
| **2**     | **Tuesday**       |
| **7**     | **Sunday**        |
| **0**     | **Invalid day\!** |

### Hints

  - Use an **array of strings** holding the day names: {"**Monday**",
    "**Tuesday**", "**Wednesday**", "**Thursday**", "**Friday**",
    "**Saturday**", "**Sunday**"}.

  - Print the element at index (**day-1**) when it is in the range
    **\[1…7\]** or "**Invalid Day\!**" otherwise.

## Print Numbers in Reverse Order

Read n numbers and print them in reverse order.

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
<p>10</p>
<p>20</p>
<p>30</p></td>
<td>30 20 10</td>
</tr>
<tr class="even">
<td><p>3</p>
<p>30</p>
<p>20</p>
<p>10</p></td>
<td><strong>10 20 30</strong></td>
</tr>
<tr class="odd">
<td><p><strong>1</strong></p>
<p><strong>10</strong></p></td>
<td><strong>10</strong></td>
</tr>
</tbody>
</table>

### Solution

First, we need to read **n** from the console.

![](media/image1.png)

Create an **array of an integer** with **n** size.

![](media/image2.png)

Read **n** numbers using for loop and fill the array.

![](media/image3.png)

Print the array in reversed order.

![](media/image4.png)

## Sum Even Numbers

Read an array from the console and sum only the even numbers.

### Examples

| **Input**   | **Output** |
| ----------- | ---------- |
| 1 2 3 4 5 6 | 12         |
| 3 5 7 9     | **0**      |
| 2 4 6 8 10  | **30**     |

### Solution

First, we need to read the array.

![](media/image5.png)

We will need a variable for the sum.

![](media/image6.png)

Iterate through all elements in the array with for loop. If the number
is even add it to the sum.

![](media/image7.png)

Print the total sum.

## Reverse an Array of Strings

Write a program to read **an array of strings**, **reverse** it and
**print** its elements. The input consists of a sequence of
space-separated strings. Print the output on a single line (space
separated).

### Examples

| **Input**      | **Output**     |
| -------------- | -------------- |
| a b c d e      | e d c b a      |
| **-1 hi ho w** | **w ho hi -1** |

### Hints

  - Read the array of strings.

  - **Exchange** the **first** element (at index 0) with the **last**
    element (at index n-1).

  - **Exchange** the **second** element (at index 1) with the element
    **before the** **last** (at index n-2).

  - Continue the same way until the middle of the array is reached.

![](media/image8.png)

## Even and Odd Subtraction

Write a program that calculates the difference between the sum of the
even and the sum of the odd numbers in an array.

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
<td>1 2 3 4 5 6</td>
<td>3</td>
<td><p>2 + 4 + 6 = 12</p>
<p>1 + 3 + 5 = 9</p>
<p>12 – 9 = 3</p></td>
</tr>
<tr class="even">
<td>3 5 7 9</td>
<td>-24</td>
<td></td>
</tr>
<tr class="odd">
<td>2 4 6 8 10</td>
<td><strong>30</strong></td>
<td></td>
</tr>
</tbody>
</table>

### Solution

First, we need to read the array.

![](media/image9.png)

We will need two variables – even and odd sum.

![](media/image10.png)

Iterate through all elements in the array. Check the current number – if
it is even add it to the even sum, otherwise add it to the odd sum.

![](media/image11.png)

Print the difference.

![](media/image12.png)

## Equal Arrays

Read two arrays and print on the console whether they are identical or
not. Arrays are identical if their elements are equal. If the arrays are
identical find the sum of the first one and print on the console the
following message: "**Arrays are identical. Sum: {sum}**", otherwise
find the first index where the arrays differ and print on the console
following message: "**Arrays are not identical. Found difference at
{index} index.**"

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
<td><p>10 20 30</p>
<p>10 20 30</p></td>
<td>Arrays are identical. Sum: 60</td>
</tr>
<tr class="even">
<td><p>1 2 3 4 5</p>
<p>1 2 4 3 5</p></td>
<td><strong>Arrays are not identical. Found difference at 2 index.</strong></td>
</tr>
<tr class="odd">
<td><p><strong>1</strong></p>
<p><strong>10</strong></p></td>
<td><strong>Arrays are not identical. Found difference at 0 index.</strong></td>
</tr>
</tbody>
</table>

### Hints

First, we need to read two arrays.

![](media/image13.png)

Iterate through arrays and compare elements. If the elements are not
equal print the required message and break the loop.

![](media/image14.png)

Think about how to solve the other part of the problem.

## Condense Array to Number

Write a program to read **an array of integers** and **condense** them
by **summing** adjacent couples of elements until a **single integer**
is obtained. For example, if we have 3 elements {2, 10, 3}, we sum the
first two and the second two elements and obtain {2+10, 10+3} = {12,
13}, then we sum again all adjacent elements and obtain {12+13} = {25}.

### Examples

| **Input**     | **Output** | **Comments**                                                                   |
| ------------- | ---------- | ------------------------------------------------------------------------------ |
| 2 10 3        | 25         | 2 10 3 2+10 10+3 12 13 12 + 13 25                                              |
| **5 0 4 1 2** | 35         | **5 0 4 1 2 5+0 0+4 4+1 1+2 5 4 5 3 5+4 4+5 5+3 9 9 8 9+9 9+8 18 17 18+17 35** |
| **1**         | 1          | **1 is already condensed to number**                                           |

### Hints

While we have more than one element in the array **nums\[\]**, repeat
the following:

  - Allocate a new array **condensed\[\]** of size **nums.Length-1**.

  - Sum the numbers from **nums\[\]** to **condensed\[\]**:
    
      - condensed\[i\] = nums\[i\] + nums\[i+1\]

  - nums\[\] = condensed\[\]

The process is illustrated below:

![](media/image15.png)

![](media/image16.png)


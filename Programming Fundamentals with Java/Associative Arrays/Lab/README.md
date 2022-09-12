# Lab: Associative Arrays, Lambda and Stream API

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022)

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1311)

# Associative Arrays

## Count Real Numbers

Read a **list of real numbers** and **print them in ascending order**
along with their **number of occurrences**.

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
<td>8 2 2 8 2</td>
<td><p>2 -&gt; 3</p>
<p>8 -&gt; 2</p></td>
<td></td>
<td>1 5 1 3</td>
<td><p>1 -&gt; 2</p>
<p>3 -&gt; 1</p>
<p>5 -&gt; 1</p></td>
<td></td>
<td>-2 0 0 2</td>
<td><p>-2 -&gt; 1</p>
<p>0 -&gt; 2</p>
<p>2 -&gt; 1</p></td>
</tr>
</tbody>
</table>

### Solution

Read an array of real numbers (**double**).

![](media/image1.png)

Use **TreeMap\<Double,** **Integer\>** named **counts**.

![](media/image2.png)

Pass through each input number **num** and increase **counts** (when
**num** exists in the map) or add it with value 1.

![](media/image3.png)

Pass through all numbers **num** in the map and print the number and its
count of occurrences after formatting it to a decimal place **without
trailing zeros** (otherwise, the output will have too many decimal
places, e.g. 2.500000 instead of 2.5);

![](media/image4.png)

## Word Synonyms

Write a program that keeps a map with synonyms. The **key** of the map
will be the **word**. The **value** will be a **list of all the synonyms
of that word**. You will be given a number **n**. On the next **2 \* n**
lines you will be given a **word** and a **synonym** each on a separate
line like this:

  - **{word}**

  - **{synonym}**

If you get the same word for the second time, just add the new synonym
to the list.

Print the words in the following format:

**{word} - {synonym1, synonym2… synonymN}**

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
<p>cute</p>
<p>adorable</p>
<p>cute</p>
<p>charming</p>
<p>smart</p>
<p>clever</p></td>
<td><p>cute - adorable, charming</p>
<p>smart - clever</p></td>
</tr>
<tr class="even">
<td><p>2</p>
<p>task</p>
<p>problem</p>
<p>task</p>
<p>assignment</p></td>
<td>task – problem, assignment</td>
</tr>
</tbody>
</table>

### Hints

  - Use **LinkedHashMap** (**String -\> ArrayList\<String\>**) to keep
    track of all words.

![](media/image5.png)

  - Read **2 \* n** lines.

  - Add the word in the Map **if it is not present.**

<!-- end list -->

  - Add the synonym **as value** to the given **word.**

> ![](media/image6.png)

  - Print each word with the synonyms in the required format specified
    above.

## Odd Occurrences

Write a program that extracts from a given sequence of words all
elements that are present in it an **odd number of times**
(**case-insensitive**).

  - Words are given in a single line, **space**-separated.

  - Print the result elements in lowercase in their order of appearance.

### Examples

| **Input**                      | **Output**    |
| ------------------------------ | ------------- |
| Java C\# PHP PHP JAVA C java   | java, c\#, c  |
| 3 5 5 hi pi HO Hi 5 ho 3 hi pi | 5, hi         |
| a a A SQL xx a xx a A a XX c   | a, sql, xx, c |

### Hints

Read a line from the console and split it by a space:

![](media/image7.png)

Use a **LinkedHashMap** (**String** -\> **int**) to count the
occurrences of each word:

![](media/image8.png)

Pass through all elements in the array and count each word:

![](media/image9.png)

Create a new **ArrayList** (**String**), which will hold all the words
with **odd occurrences**:

![](media/image10.png)

Now all that is left is to **print** the words, **separated by a comma
and single space** ("**,** ").

![](media/image11.png)

# Stream API

## Word Filter

Read an array of **strings**, take only words which length is **even**.
Print each word on a new line.

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
<td>kiwi orange banana apple</td>
<td><p>kiwi</p>
<p>orange</p>
<p>banana</p></td>
</tr>
<tr class="even">
<td>pizza cake pasta chips</td>
<td>cake</td>
</tr>
</tbody>
</table>

  - Read an array of strings.

  - **Filter** those whose length is even.

> ![](media/image12.png)

  - Print each word on a new line.

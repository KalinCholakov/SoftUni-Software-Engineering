# Exercises: Streams, Files and Directories

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1506/Streams-Files-And-Directories-Exercises).

**For these exercises, you are given a zipped folder with resources that
you will need to use. For each exercise, submit the output of the
program, not the code.**

## Sum Lines

Write a program that reads a text file ("**input.txt**" from the
Resources - Exercises) and prints on the console the **sum** of the
ASCII symbols of each of its lines. Use **BufferedReader** in
combination with **FileReader**.

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
<td><p><strong>On January 1 , 1533 ,</strong></p>
<p><strong>Michael Angelo,</strong></p>
<p><strong>then fifty-seven years old,</strong></p>
<p><strong>writes</strong></p>
<p><strong>from Florence to</strong></p>
<p><strong>Tommaso de' Cavalieri,</strong></p>
<p><strong>a youth of noble Roman family,</strong></p></td>
<td><p><strong>1452</strong></p>
<p><strong>1397</strong></p>
<p><strong>2606</strong></p>
<p><strong>670</strong></p>
<p><strong>1573</strong></p>
<p><strong>2028</strong></p>
<p><strong>2762</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use **try**-with-resources to handle the file.

![](media/image1.png)

  - Create a **BufferedReader** to read each line of the file.

![](media/image2.png)

  - Get the ASCII code of each character in the line and **add** it to
    the **sum** for the current line and print the sum on the console.

![](media/image3.png)

## Sum Bytes

Write a program that reads a text file ("**input.txt**" from the
Resources - Exercises) and prints on the console the **sum** of the
ASCII symbols of all characters inside the file. Use **BufferedReader**
in combination with **FileReader**.

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>On January 1 , 1533 ,</strong></p>
<p><strong>Michael Angelo,</strong></p>
<p><strong>then fifty-seven years old,</strong></p>
<p><strong>writes</strong></p>
<p><strong>from Florence to</strong></p>
<p><strong>Tommaso de' Cavalieri,</strong></p>
<p><strong>a youth of noble Roman family,</strong></p></td>
<td>12488</td>
</tr>
</tbody>
</table>

### Hints

  - You can modify your solution to the previous problem.

  - Use a type that will not overflow like **long** or **BigInteger.**

## ALL CAPITALS\!

Write a program that reads a text file ("**input.txt**" from the
Resources - Exercises) and changes the casing of **all** letters to the
**upper**. Write the output to another file ("**output.txt**").

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
<td><p><strong>On January 1 , 1533 ,</strong></p>
<p><strong>Michael Angelo,</strong></p>
<p><strong>then fifty-seven years old,</strong></p>
<p><strong>writes</strong></p>
<p><strong>from Florence to</strong></p>
<p><strong>Tommaso de' Cavalieri,</strong></p>
<p><strong>a youth of noble Roman family,</strong></p></td>
<td><p><strong>ON JANUARY 1 , 1533 ,</strong></p>
<p><strong>MICHAEL ANGELO,</strong></p>
<p><strong>THEN FIFTY-SEVEN YEARS OLD,</strong></p>
<p><strong>WRITES</strong></p>
<p><strong>FROM FLORENCE TO</strong></p>
<p><strong>TOMMASO DE' CAVALIERI,</strong></p>
<p><strong>A YOUTH OF NOBLE ROMAN FAMILY,</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use **BufferedReader** and **PrintWriter**.

## Count Character Types

Write a program that reads a list of words from the file
("**input.txt**" from the Resources - Exercises) and finds the count of
**vowels**, **consonants,** and **punctuation** marks. Assume that:

  - **a, e, i, o, u** are vowels, only lower case.

  - **All** **others** are consonants.

  - Punctuation marks are **(\! , . ?).**

  - **Do** **not** count whitespace.

Write the results to another file – "**output.txt**".

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
<td><p><strong>On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes</strong></p>
<p><strong>from Florence to Tommaso de' Cavalieri, a youth of noble Roman family,</strong></p></td>
<td><p>Vowels: 41</p>
<p>Consonants: 72</p>
<p>Punctuation: 6</p></td>
</tr>
</tbody>
</table>

### Hints

  - Use **BufferedReader** and **PrintWriter**.

## Line Numbers

Write a program that reads a text file ("**inputLineNumbers.txt**" from
the Resources - Exercises) and **inserts** line numbers in front of each
of its lines. The result should be written to **another** text file –
"**output.txt**".

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
<td><p>Two households, both alike in dignity,</p>
<p>In fair Verona, where we lay our scene,</p>
<p>From ancient grudge break to new,</p>
<p>Where civil blood makes civil hands.</p>
<p>From forth the fatal loins of these two</p>
<p>A pair of star-cross'd lovers take their life;</p>
<p>Whose misadventured piteous overthrows</p>
<p>Do with their death bury their parents' strife.</p></td>
<td><p>1. Two households, both alike in dignity,</p>
<p>2. In fair Verona, where we lay our scene,</p>
<p>3. From ancient grudge break to new,</p>
<p>4. Where civil blood makes civil hands.</p>
<p>5. From forth the fatal loins of these two</p>
<p>6. A pair of star-cross'd lovers take their life;</p>
<p>7. Whose misadventured piteous overthrows</p>
<p>8. Do with their death bury their parents' strife.</p></td>
</tr>
</tbody>
</table>

## Word Count

Write a program that reads a list of words from the file "**words.txt**"
(from the Resources - Exercises) and finds how many times each of the
words is **contained** in another file "**text.txt**" (from the
Resources - Exercises). Matching should be **case-insensitive**.

Write the results in the file "**results.txt**". Sort the words by
frequency in **descending** **order**.

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
<td>of which The</td>
<td><p>of - 6</p>
<p>which - 2</p>
<p>The - 1</p></td>
</tr>
</tbody>
</table>

## Merge Two Files

Write a program that reads the contents of **two** text files
("**inputOne.txt**", "**inputTwo.txt**" from Resources - Exercises) and
**merges** them into a third one.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>File 1</strong></th>
<th><strong>File 2</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>1</p>
<p>2</p>
<p>3</p></td>
<td><p>4</p>
<p>5</p>
<p>6</p></td>
<td><p>1</p>
<p>2</p>
<p>3</p>
<p>4</p>
<p>5</p>
<p>6</p></td>
</tr>
</tbody>
</table>

## Get Folder Size

Write a program that **traverses** a folder and **calculates** its size
in bytes. Use Folder **Exercises** **Resources** in Resources.

### Examples

| **Input**             | **Output**        |
| --------------------- | ----------------- |
| ![](media/image4.png) | Folder size: 2878 |

## Copy a Picture

Write a program that makes a copy of a **.jpg** file using
**FileInputStream**, **FileOutputStream**, and **byte\[\] buffer**. Set
the name of the new file as "**picture-copy.jpg**".

## Serialize Array List

Write a program that saves and loads an **ArrayList** of doubles to a
file using **ObjectInputStream** and **ObjectOutputStream**. Set the
name of the file as "**list.ser**"**.**

## \*Serialize Custom Object

Write a program that saves and loads the information about a custom
object using **ObjectInputStream** and **ObjectOutputStream**.

Create a **simple** **class** called "**Course**" that has a **String
field** containing its **name** and an **integer field** containing the
**number of students** attending the course. Set the name of the save
file as "**course.ser**"**.**

## \*Create Zip Archive

Write a program that reads three **.txt** files and creates a zip
archive named "**files.zip**"**.** Use **FileOutputStream**,
**ZipOutputStream**, and **FileInputStream.**

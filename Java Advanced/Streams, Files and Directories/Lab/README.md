# Lab: Streams, Files and Directories

This document defines the **lab** for the [<span class="underline">"Java
Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1493/Streams-Files-And-Directories-Lab).

**For these lab exercises, you are given a zipped folder with resources
that you will need to use. For each exercise, submit the output of the
program, not the code.**

## Read File

You are given a file named "**input.txt**". Read and **print all** of
its contents as a sequence of **bytes** (the binary representation of
the **ASCII code** for each character) separated by a single comma.

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
<td><strong>On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes…</strong></td>
<td><strong>11101111 10111011 10111111 1001111 1101110 100000 1001010 1100001 1101110 1110101…</strong></td>
</tr>
<tr class="even">
<td><strong>Two households, both alike in dignity,<br />
In fair Verona, where we lay our scene…</strong></td>
<td><strong>1010100 1110111 1101111 100000 1101000 1101111 1110101 1110011 1100101 1101000…</strong></td>
</tr>
</tbody>
</table>

### Hints

  - Create a string variable holding the path to the file. If, for
    example, the file is located in "D:\\".

![](media/image1.png)

  - Use try-with-resources to open the file and to be sure that it will
    be closed after you are done with it.

![](media/image2.png)

  - Use the **read()** method to read each byte of the file until it
    returns **-1**.

![](media/image3.png)

  - Select the program's output and copy it \[Ctrl + C\].

![](media/image4.png)

  - Paste the output in Judge.

![](media/image5.png)

## Write to File

Read the file named "**input.txt**" that is provided for this exercise
and write all its content to a file while skipping any **punctuation**.
Skip the following symbols: "**,**", "**.**", "**\!**", "**?**".

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
<td><strong>On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes</strong></td>
<td><strong>On January 1 1533 Michael Angelo then fifty-seven years old writes</strong></td>
</tr>
<tr class="even">
<td><p><strong>Two households, both alike in dignity.</strong></p>
<p><strong>In fair Verona, where we lay our scene.</strong></p></td>
<td><p><strong>Two households both alike in dignity</strong></p>
<p><strong>In fair Verona where we lay our scene</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Create a **FileInputStream** to read the file.

  - Create a **FileOutputStream** to write to a file.

  - Create a list, containing all characters that you need to skip and
    check if the current char is contained in it.

![](media/image6.png)

## Copy Bytes

Read the file named "**input.txt**" and write to another file every
character's **ASCII representation**.

Write every **space** or **new line** as it is, e.g., a **space** or a
**new line**.

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
<p><strong>…</strong></p></td>
<td><strong>79110 749711011797114121 49 44 49535151 44 771059910497101108 6511010310110811144 116104101110 10210510211612145115101118101110 12110197114115 11110810044 119114105116101115</strong></td>
</tr>
</tbody>
</table>

### Hints

  - Get the value of every byte as a string and then write every digit
    one by one.

![](media/image7.png)

## Extract Integers

Read the file provided, named "**input.txt**" and extracts all integers
that are not a part of a word in a separate file. A **valid integer** is
surrounded by **white spaces**.

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
<p><strong>…</strong></p></td>
<td><p><strong>1</strong></p>
<p><strong>1533</strong></p>
<p><strong>…</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Wrap a **FileInputStream** in a Scanner and use the methods,
    **hasNext()**, **hasNextInt()** and **nextInt().**

![](media/image8.png)

## Write Every Third Line

Read the file provided, named "**input.txt**" and write to another file
all lines whose number is **divisible by 3**. Line numbers start from
one.

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
<td><p><strong>then fifty-seven years old,</strong></p>
<p><strong>Tommaso de' Cavalieri,</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - To get the functionality to read and write lines use
    **BufferedReader** and **PrintWriter.**

  - Wrap streams appropriately.

![](media/image9.png)

## Sort Lines

Read the file provided, named "**input.txt**" and sort all lines. Write
text to another text file. Use **Path** and **Files** Classes.

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
<td><p><strong>C</strong></p>
<p><strong>A</strong></p>
<p><strong>B</strong></p>
<p><strong>D</strong></p></td>
<td><p><strong>A</strong></p>
<p><strong>B</strong></p>
<p><strong>C</strong></p>
<p><strong>D</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - To read all lines together use **Files.readAllLines().**

![](media/image10.png)

  - To sort the list of strings use **Collections.sort().**

![](media/image11.png)

## List Files

You are provided a folder named "**Files-and-Streams**". Create a
program that lists the names and file sizes (**in bytes**) of all files
that are placed directly in it (**do not include files in nested
folders**).

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
<td><img src="media/image12.png" style="width:4.28472in;height:1.22765in" /></td>
<td><p><strong>input.txt: [size in bytes]</strong></p>
<p><strong>output.txt: [size in bytes]</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use the **File** class and its method **listFiles().**

## Nested Folders

You are provided a folder named "**Files-and-Streams**". Create a
program that lists the names of all directories in it (**including all
nested directories**).

On the last line, print the count of all folders, including the root
folder.

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
<td><img src="media/image12.png" style="width:4.28472in;height:1.22765in" /></td>
<td><p><strong>…</strong></p>
<p><strong>Streams-and-Files</strong></p>
<p><strong>Files-and-Streams</strong></p>
<p><strong>Streams-and-Files</strong></p>
<p><strong>Serialization</strong></p>
<p><strong>Streams-and-Files</strong></p>
<p><strong>[folder count] folders</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use the **File** class and its method **listFiles().**

## Serialize Custom Object

Create a class called "**Cube**". It should have properties for
**color**, **width**, **height,** and **depth**.

Create an instance of the class with the following values:

  - Color: "green"

  - Width: 15.3

  - Height: 12.4

  - Depth: 3.0

**Serialize** and **deserialize** the instance created. When saved to a
file, the object should look like something like the example below.

### Examples

| **Input**        | **Output**             |
| ---------------- | ---------------------- |
| ***(no input)*** | ![](media/image13.png) |

### Hints

  - Create a class called **Cube**, which should implement the
    **Serializable** **interface**:

![](media/image14.png)

  - Create a new instance of the **Cube** class and set its properties:

![](media/image15.png)

  - Use **ObjectOutputStream** to **serialize** the object:

![](media/image16.png)

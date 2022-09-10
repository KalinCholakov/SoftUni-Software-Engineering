# Lab: Objects and Classes

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022)

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1319)

# Using the Built-in Java Classes

## Randomize Words

You are given a **list of words in one line**. **Randomize their order**
and print each word on a separate line.

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
<td>Welcome to SoftUni and have fun learning programming</td>
<td><p>learning</p>
<p>Welcome</p>
<p>SoftUni</p>
<p>and</p>
<p>fun</p>
<p>programming</p>
<p>have</p>
<p>to</p></td>
<td>The order of the words in the output will be different after each program execution.</td>
</tr>
<tr class="even">
<td>Java is the best programming language</td>
<td><p>the</p>
<p>programming</p>
<p>best</p>
<p>language</p>
<p>is</p>
<p>Java</p></td>
<td></td>
</tr>
</tbody>
</table>

### Hints

  - **Split** the input string (by space) and create an **array of
    words.**

  - Create a random number generator - an object **rnd** of type
    **Random.**

  - In a **for-loop exchange each number** at positions 0, 1, …,
    **words.Length-1** by a number at a **random. position**. To
    generate a random number in range use **rnd.nextInt(words.length)**.

  - Print each word in the array on a new line.

## Sum Big Numbers

You will receive two numbers **(0 to 10<sup>50</sup>),** print their
sum.

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
<td><p>923847238931983192462832102</p>
<p>934572893617836459843471846187346</p></td>
<td>934573817465075391826664309019448</td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>100</strong></p></td>
<td><strong>104</strong></td>
</tr>
</tbody>
</table>

### Hints

Use the class
[**BigInteger**](https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html)

Import the namespace "**java.math.BigInteger**":

![](media/image1.png)

Use the type **BigInteger** to read the numbers and calculate their sum:

![](media/image2.png)

## Big Factorial

You will receive **N** - the number in the range **\[0 - 1000\]**.
Calculate the **Factorial** of **N** and print the result.

### Examples

| **Input** | **Output**                                                        |
| --------- | ----------------------------------------------------------------- |
| 5         | 120                                                               |
| **50**    | 30414093201713378043612608166064768844377641568960512000000000000 |

# Defining Simple Classes

## Songs

Define a class **Song**, which holds the following information about
songs: **Type List**, **Name,** and **Time**.

On the first line, you will receive the **number of songs** **-** **N**.

On the **next N-lines** you will be receiving data in the following
format: **"{typeList}\_{name}\_{time}".**

On the last line, you will receive "**Type List"** / **"all".** Print
only the **names of the songs** which are from that **Type List** /
**All songs**.

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
<p>favourite_DownTown_3:14</p>
<p>favourite_Kiss_4:16</p>
<p>favourite_Smooth Criminal_4:01</p>
<p>favourite</p></td>
<td><p>DownTown</p>
<p>Kiss</p>
<p>Smooth Criminal</p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p>favourite_DownTown_3:14</p>
<p>listenLater_Andalouse_3:24</p>
<p>favourite_In To The Night_3:58</p>
<p>favourite_Live It Up_3:48</p>
<p>listenLater</p></td>
<td>Andalouse</td>
</tr>
<tr class="odd">
<td><p><strong>2</strong></p>
<p><strong>like_Replay_3:15</strong></p>
<p><strong>ban_Photoshop_3:48</strong></p>
<p><strong>all</strong></p></td>
<td><p>Replay</p>
<p>Photoshop</p></td>
</tr>
</tbody>
</table>

### Solution

Define class Song with fields: **Type List**, **Name,** and **Time**:

![](media/image3.png)

Define getters and setters: use keys **ALT + INS** and generate Getter
and Setter:

![](media/image4.png)

Read the input lines, make the collection, and store the data:

![](media/image5.png)

Finally, read your last line – **Type List** and print the result:

![](media/image6.png)

You can use **Stream API** to filter the collection:

![](media/image7.png)

## Students

Define a class **Student**, which holds the following information about
students: first name, last name, age, and hometown.

Read the list of students until you receive the "**end**" command. After
that, you will receive a city name. Print only students which are from
the given city, in the following format: **"{firstName} {lastName} is
{age} years old"**.

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
<td><p><strong>John Smith 15 Sofia</strong></p>
<p><strong>Peter Ivanov 14 Plovdiv</strong></p>
<p><strong>Linda Bridge 16 Sofia</strong></p>
<p><strong>Simon Stone 12 Varna</strong></p>
<p><strong>end</strong></p>
<p>Sofia</p></td>
<td><p>John Smith is 15 years old</p>
<p>Linda Bridge is 16 years old</p></td>
</tr>
<tr class="even">
<td><p><strong>Anthony Taylor 15 Chicago</strong></p>
<p><strong>David Anderson 16 Washington</strong></p>
<p><strong>Jack Lewis 14 Chicago</strong></p>
<p><strong>David Lee 14 Chicago</strong></p>
<p><strong>end</strong></p>
<p><strong>Chicago</strong></p></td>
<td><p><strong>Anthony Taylor is 15 years old</strong></p>
<p><strong>Jack Lewis is 14 years old</strong></p>
<p><strong>David Lee is 14 years old</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Define a class student with the following properties: **firstName**,
**lastName**, **age,** and **city**:

![](media/image8.png)

Generate constructor in class Student**: ALT + INSERT**

![](media/image9.png)

Read a list of students.

![](media/image10.png)

Read a city name and print only the students which are from the given
city.

You can filter the students with the stream.

![](media/image11.png)

## Students 2.0

Use the class from the previous problem. If you receive a student which
already exists (first name and last name should be **unique**) overwrite
the information.

### Hints

Check if the given student already exists:

![](media/image12.png)

![](media/image13.png)

Overwrite the student information.

First, we have to find the existing student:

![](media/image14.png)

![](media/image15.png)

Finally, we have to overwrite the information:

![](media/image16.png)

We can use **Stream API** as well:

![](media/image17.png)

**findFirst** returns the first occurrence or **null**.

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
<td><p><strong>John Smith 15 Sofia</strong></p>
<p><strong>John Smith 16 Sofia</strong></p>
<p><strong>Linda Bridge 17 Sofia</strong></p>
<p><strong>Simon Stone 12 Varna</strong></p>
<p><strong>end</strong></p>
<p>Sofia</p></td>
<td><p>John Smith is 16 years old</p>
<p>Linda Bridge is 17 years old</p></td>
</tr>
<tr class="even">
<td><p><strong>J S 3 S</strong></p>
<p><strong>Peter Ivanov 14 P</strong></p>
<p><strong>P J 104 S</strong></p>
<p><strong>J P 61 S</strong></p>
<p><strong>Simon Stone 12 Varna</strong></p>
<p><strong>Simon Sone 12 Varna</strong></p>
<p><strong>end</strong></p>
<p><strong>Varna</strong></p></td>
<td><p>Simon Stone is 12 years old</p>
<p>Simon Sone is 12 years old</p></td>
</tr>
</tbody>
</table>

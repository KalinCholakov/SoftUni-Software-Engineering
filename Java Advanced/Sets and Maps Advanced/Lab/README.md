# Lab: Sets and Maps Advanced

This document defines the **lab** for the [<span class="underline">"Java
Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1462/Sets-And-Maps-Advanced-Lab).

## Sets

### Parking Lot

Write a program that:

  - Records **car numbers** for every car that enters the **parking
    lot.**

  - Removes **car number** when the car is out.

When the parking lot is empty, print "**Parking Lot is Empty**".

#### Input

The input will be a string in the format "**{direction, carNumber}**".

The input ends with the string "**END**".

#### Output

Print the output with all car numbers which are in the parking lot.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>IN, CA2844AA</strong></p>
<p><strong>IN, CA1234TA</strong></p>
<p><strong>OUT, CA2844AA</strong></p>
<p><strong>IN, CA9999TT</strong></p>
<p><strong>IN, CA2866HI</strong></p>
<p><strong>OUT, CA1234TA</strong></p>
<p><strong>IN, CA2844AA</strong></p>
<p><strong>OUT, CA2866HI</strong></p>
<p><strong>IN, CA9876HH</strong></p>
<p><strong>IN, CA2822UU</strong></p>
<p>END</p></td>
<td><p><strong>CA9999TT</strong></p>
<p><strong>CA2844AA</strong></p>
<p><strong>CA9876HH</strong></p>
<p><strong>CA2822UU</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>IN, CA2844AA</strong></p>
<p><strong>IN, CA1234TA</strong></p>
<p><strong>OUT, CA2844AA</strong></p>
<p><strong>OUT, CA1234TA</strong></p>
<p><strong>END</strong></p></td>
<td><strong>Parking Lot is Empty</strong></td>
</tr>
</tbody>
</table>

#### Hints

  - Car numbers are **unique.**

  - Use the methods **isEmpty().**

### SoftUni Party

There is a party in SoftUni. Many guests are invited, and they are two
types: **VIP** and **regular**.  
When a guest comes, you have to check if he/she **exists** on any of the
two reservation lists. All reservation numbers will be with **8 chars.**
All **VIP** numbers start with a **digit.**

There will be 2 command lines:

  - First is "**PARTY**" - the party is on, and guests are coming.

  - The second is "**END**" - then the party is over, and no more guests
    will come.

The output shows all guests who didn't come to the party (**VIP** must
be first).

#### Examples

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
<td><p><strong>7IK9Yo0h</strong></p>
<p><strong>9NoBUajQ</strong></p>
<p><strong>Ce8vwPmE</strong></p>
<p><strong>SVQXQCbc</strong></p>
<p><strong>tSzE5t0p</strong></p>
<p><strong>PARTY</strong></p>
<p><strong>9NoBUajQ</strong></p>
<p><strong>Ce8vwPmE</strong></p>
<p><strong>SVQXQCbc</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>2</strong></p>
<p><strong>7IK9Yo0h</strong></p>
<p><strong>tSzE5t0p</strong></p></td>
<td><p><strong>m8rfQBvl</strong></p>
<p><strong>fc1oZCE0</strong></p>
<p><strong>UgffRkOn</strong></p>
<p><strong>7ugX7bm0</strong></p>
<p><strong>9CQBGUeJ</strong></p>
<p><strong>2FQZT3uC</strong></p>
<p><strong>dziNz78I</strong></p>
<p><strong>mdSGyQCJ</strong></p>
<p><strong>LjcVpmDL</strong></p>
<p><strong>fPXNHpm1</strong></p>
<p><strong>HTTbwRmM</strong></p>
<p><strong>B5yTkMQi</strong></p>
<p><strong>8N0FThqG</strong></p>
<p><strong>xys2FYzn</strong></p>
<p><strong>MDzcM9ZK</strong></p>
<p><strong>PARTY</strong></p>
<p><strong>2FQZT3uC</strong></p>
<p><strong>dziNz78I</strong></p>
<p><strong>mdSGyQCJ</strong></p>
<p><strong>LjcVpmDL</strong></p>
<p><strong>fPXNHpm1</strong></p>
<p><strong>HTTbwRmM</strong></p>
<p><strong>B5yTkMQi</strong></p>
<p><strong>8N0FThqG</strong></p>
<p><strong>m8rfQBvl</strong></p>
<p><strong>fc1oZCE0</strong></p>
<p><strong>UgffRkOn</strong></p>
<p><strong>7ugX7bm0</strong></p>
<p><strong>9CQBGUeJ</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>2</strong></p>
<p><strong>MDzcM9ZK</strong></p>
<p><strong>xys2FYzn</strong></p></td>
</tr>
</tbody>
</table>

### "Voina" – Number Game

Write a program that:

  - Reads 20 numbers for both players, separated with " " (single
    space).

<!-- end list -->

  - Every player can hold **unique** numbers.

Each Round, both players get the **top number** from their deck. The
player with the bigger number gets both numbers and adds them to the
**bottom** of his sequence.

The game ends after **50 rounds** or if any player **loses all** of his
numbers.

#### Input

  - Numbers – **Integer**

#### Output

  - Output must be "**First player win\!**", "**Second player win\!**"
    or "**Draw\!**".

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>26 58 16 92 44 65 65 77 57 23 71 57 7 52 85 44 32 70 38 23</p>
<p>43 95 33 51 62 93 57 55 0 31 32 95 68 34 30 51 37 32 11 97</p></td>
<td><strong>Second player win!</strong></td>
</tr>
<tr class="even">
<td><p>74 78 82 42 19 39 29 69 20 42 31 77 57 36 76 26 4 9 83 42</p>
<p>15 43 80 71 22 88 78 35 28 30 46 41 76 51 76 18 14 52 47 38</p></td>
<td><strong>First player win!</strong></td>
</tr>
</tbody>
</table>

#### Hints

  - Use **Iterator\<E\>** and **next()** for finding the top number in
    decks.

  - Think where to check if any player is **without** cards.

  - When you find the top number, be sure to **remove** it
    **immediately**.

#### Solution

You might help yourself with the code below:

![](media/image1.png)

## Maps

### Count Real Numbers

Write a program that counts the occurrence of real **numbers**. The
input is a single line with real numbers separated by a space. Print the
numbers in the order of appearance. All **numbers** must be formatted to
**one digit** after the decimal point.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>-2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3</td>
<td><p><strong>-2.5 -&gt; 3</strong></p>
<p><strong>4.0 -&gt; 2</strong></p>
<p><strong>3.0 -&gt; 4</strong></p>
<p><strong>-5.5 -&gt; 1</strong></p></td>
</tr>
<tr class="even">
<td>2.3 4.5 4.5 5.5 5.5 2.3 3.0 3.0 4.5 4.5 3.0 3.0 4.0 3.0 5.5 3.0 2.3 5.5 4.5 3.0</td>
<td><p>2.3 -&gt; 3</p>
<p>4.5 -&gt; 5</p>
<p>5.5 -&gt; 4</p>
<p>3.0 -&gt; 7</p>
<ol type="1">
<li><p>-&gt; 1</p></li>
</ol></td>
</tr>
</tbody>
</table>

#### Solution

You might help yourself with the code below:

![](media/image2.png)

### Average Students Grades

Write a program, which reads the **name** of a student and their
**grades** and **adds** them to the **student record**, then **prints**
**grades** along with their **average grade – ordered the output by the
students' names**.

#### Input

On the first line **N** – the number of students, then on the next,
**N** lines student name with grade.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>7</p>
<p>Stephan 5.20</p>
<p>Maria 5.50</p>
<p>Stephan 3.20</p>
<p>Maria 2.50</p>
<p>Alex 2.00</p>
<p>Maria 3.46</p>
<p>Alex 3.00</p></td>
<td><p>Alex -&gt; 2.00 3.00 (avg: 2.50)</p>
<p>Maria -&gt; 5.50 2.50 3.46 (avg: 3.82)</p>
<p>Stephan -&gt; 5.20 3.20 (avg: 4.20)</p></td>
</tr>
<tr class="even">
<td><p>4</p>
<p>Alex 4.50</p>
<p>Peter 3.00</p>
<p>Alex 5.00</p>
<p>Peter 3.66</p></td>
<td>Alex -&gt; 4.50 5.00 (avg: 4.75)<br />
Peter -&gt; 3.00 3.66 (avg: 3.33)</td>
</tr>
<tr class="odd">
<td><p>5</p>
<p>George 6.00</p>
<p>George 5.50</p>
<p>George 6.00</p>
<p>Alex 4.40</p>
<p>Peter 3.30</p>
<p>Peter 4.50</p></td>
<td><p>Alex -&gt; 4.40 (avg: 4.40)</p>
<p>George -&gt; 6.00 5.50 6.00 (avg: 5.83)</p>
<p>Peter -&gt; 3.30 (avg: 3.30)</p></td>
</tr>
</tbody>
</table>

#### Hints

  - Use a **TreeMap** (**String** -\> **ArrayList\<Double\>**).

  - Check if the name **exists** before adding the grade. If it doesn't,
    add it to the map.

  - Pass through all **key-value pairs** in the map and print the
    results.

  - Think of a way to get the average grades for each student.

<!-- end list -->

  - You can do that with an ordinary loop or with **Stream API.**

### Product Shop

Write a program that prints information about food shops in Sofia and
the products they store. Until the "**Revision**" command you will
receive an input in the format: "**{shop}, {product}, {price}**".

Keep in mind that if you get a store that already exists, you must
gather product information.

Your output must be ordered by shop name and must be in the format:

**"**{shop}-\>

Product: {product}, Price: {price}**"**

The price should be formatted to one digit after the decimal point.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>lidl, peach, 1.20</p>
<p>lidl, juice, 2.30</p>
<p>fantastico, apple, 1.20</p>
<p>kaufland, banana, 1.10</p>
<p>fantastico, grape, 2.20</p>
<p>Revision</p></td>
<td><p>fantastico-&gt;</p>
<p>Product: apple, Price: 1.2</p>
<p>Product: grape, Price: 2.2</p>
<p>kaufland-&gt;</p>
<p>Product: banana, Price: 1.1</p>
<p>lidl-&gt;</p>
<p>Product: peach, Price: 1.2</p>
<p>Product: juice, Price: 2.3</p></td>
</tr>
<tr class="even">
<td><p>tmarket, peanuts, 2.20</p>
<p>GoGrill, meatballs, 3.30</p>
<p>GoGrill, HotDog, 1.40</p>
<p>tmarket, sweets, 2.20</p>
<p>Revision</p></td>
<td><p>GoGrill-&gt;</p>
<p>Product: meatballs, Price: 3.3</p>
<p>Product: HotDog, Price: 1.4</p>
<p>tmarket-&gt;</p>
<p>Product: peanuts, Price: 2.2</p>
<p>Product: sweets, Price: 2.2</p></td>
</tr>
</tbody>
</table>

### Cities by Continent and Country

Write a program to read **continents**, **countries,** and their
**cities** put them on a **nested map,** and **print** them in the order
of their first appearance.

#### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>9</p>
<p>Europe Bulgaria Sofia</p>
<p>Asia China Beijing</p>
<p>Asia Japan Tokyo</p>
<p>Europe Poland Warsaw</p>
<p>Europe Germany Berlin</p>
<p>Europe Poland Poznan</p>
<p>Europe Bulgaria Plovdiv</p>
<p>Africa Nigeria Abuja</p>
<p>Asia China Shanghai</p></td>
<td><p>Europe:</p>
<p>Bulgaria -&gt; Sofia, Plovdiv</p>
<p>Poland -&gt; Warsaw, Poznan</p>
<p>Germany -&gt; Berlin</p>
<p>Asia:</p>
<p>China -&gt; Beijing, Shanghai</p>
<p>Japan -&gt; Tokyo</p>
<p>Africa:</p>
<p>Nigeria -&gt; Abuja</p></td>
</tr>
<tr class="even">
<td><p>3</p>
<p>Europe Germany Berlin</p>
<p>Europe Bulgaria Varna</p>
<p>Africa Egypt Cairo</p></td>
<td><p>Europe:</p>
<p>Germany -&gt; Berlin</p>
<p>Bulgaria -&gt; Varna</p>
<p>Africa:</p>
<p>Egypt -&gt; Cairo</p></td>
</tr>
<tr class="odd">
<td><p>8</p>
<p>Africa Somalia Mogadishu</p>
<p>Asia India Mumbai</p>
<p>Asia India Delhi</p>
<p>Europe France Paris</p>
<p>Asia India Nagpur</p>
<p>Europe Germany Hamburg</p>
<p>Europe Poland Gdansk</p>
<p>Europe Germany Danzig</p></td>
<td><p>Africa:</p>
<p>Somalia -&gt; Mogadishu</p>
<p>Asia:</p>
<p>India -&gt; Mumbai, Delhi, Nagpur</p>
<p>Europe:</p>
<p>France -&gt; Paris</p>
<p>Germany -&gt; Hamburg, Danzig</p>
<p>Poland -&gt; Gdansk</p></td>
</tr>
</tbody>
</table>

#### Hints

  - Use a **nested** **Map** (**String** **-\>** (**Map -\>
    ArrayList\<String\>)**) .

  - Check if the continent **exists** before adding the country. If it
    doesn't, **add** it to the dictionary.

  - Check if the country **exists** before **adding** the city. If it
    doesn't, add it to the dictionary.

![](media/image3.png)

  - Pass through all **key-value pairs** in the Map and the values'
    key-value pairs and print the results.

### Academy Graduation

Write a program that:

  - Reads from console **number** of students for a track.

  - Reads on **pair of rows**:
    
      - The first line is the **name** of the student.
    
      - The second line is his **score** for a different number of
        courses.

  - Print on console "**{name} is graduated with {average
    scores)**"**.**

#### Examples

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
<p>George</p>
<p>3.75 5</p>
<p>Maria</p>
<p>4.25 6</p>
<p>Peter</p>
<p>6 4.5</p></td>
<td><p><strong>George is graduated with 4.375</strong></p>
<p><strong>Maria is graduated with 5.125</strong></p>
<p><strong>Peter is graduated with 5.25</strong></p></td>
</tr>
<tr class="even">
<td><p>5</p>
<p>George</p>
<p>4.36 5.50 3.30 5.63 2.57 5.75 2.81 4.89</p>
<p>Peter</p>
<p>3.10 5.35 3.30 3.35 5.64 4.99 2.75 4.68</p>
<p>Maria</p>
<p>3.45 3.23 3.03 5.42 5.46 4.15 2.26 5.95</p>
<p>Rosalia</p>
<p>2.08 3.48 3.36 2.73 2.96 4.54 3.70 3.85</p>
<p>John</p>
<p>4.75 4.92 3.78 4.79 4.82 4.75 2.81 2.13</p></td>
<td><p><strong>George is graduated with 4.351249999999999</strong></p>
<p><strong>John is graduated with 4.09375</strong></p>
<p><strong>Maria is graduated with 4.11875</strong></p>
<p><strong>Peter is graduated with 4.145</strong></p>
<p><strong>Rosalia is graduated with 3.3375</strong></p></td>
</tr>
</tbody>
</table>

#### Hints

  - Think about the **proper type** of map.

  - **Value** can be an **array.**

  - **A nested loop** and one more **variable** will be needed for the
    average score.

#### Solution

You might help yourself with the code below:

![](media/image4.png)

### Largest 3 Numbers

Read a **list of integers** and **print the largest 3 of them**. If
there are **less** than 3, print **all** of them.

### Examples

| **Input**        | **Output** |
| ---------------- | ---------- |
| 10 30 15 20 50 5 | 50 30 20   |
| 20 30            | 30 20      |

### Hints

  - Read a list of integers.

  - Order the list using **Stream API.**

> ![](media/image5.png)

  - Print top 3 numbers with **for** loop.

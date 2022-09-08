# Exercise: Lists

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3448/programming-fundamentals-with-java-january-2022).

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1297)

## Train

On the first line, you will be given a **list of wagons** (integers).
Each integer represents **the number of passengers that are currently in
each wagon**. On the next line, you will get **the max capacity of each
wagon** (single integer). Until you receive "**end**" you will be given
two types of input:

  - **Add** **{passengers}** - add a wagon to the end with the given
    number of passengers

  - **{passengers}** - find an existing wagon to **fit all the
    passengers** (**starting from the first wagon**)

At the end **print the final state** of the train (all the wagons
separated by a space)

### Example

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>32 54 21 12 4 0 23</p>
<p>75</p>
<p>Add 10</p>
<p>Add 0</p>
<p>30</p>
<p>10</p>
<p>75</p>
<p>end</p></td>
<td>72 54 21 12 4 75 23 10 0</td>
</tr>
<tr class="even">
<td><p><strong>0 0 0 10 2 4</strong></p>
<p><strong>10</strong></p>
<p><strong>Add 10</strong></p>
<p><strong>10</strong></p>
<p><strong>10</strong></p>
<p><strong>10</strong></p>
<p><strong>8</strong></p>
<p><strong>6</strong></p>
<p><strong>end</strong></p></td>
<td><strong>10 10 10 10 10 10 10</strong></td>
</tr>
</tbody>
</table>

## Change List

Write a program, which reads a **list** of **integers** from the console
and receives **commands**, which **manipulate** the list. Your program
may receive the following commands:

  - **Delete {element}** - delete all elements in the array, which are
    equal to the given element

  - **Insert {element} {position}** - insert element at the given
    position

You should stop the program when you receive the command **"end"**.
Print all numbers in the array separated with a **single** whitespace.

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
<td><p>1 2 3 4 5 5 5 6</p>
<p>Delete 5</p>
<p>Insert 10 1</p>
<p>Delete 5</p>
<p>end</p></td>
<td>1 10 2 3 4 6</td>
</tr>
<tr class="even">
<td><p><strong>20 12 4 319 21 31234 2 41 23 4</strong></p>
<p><strong>Insert 50 2</strong></p>
<p><strong>Insert 50 5</strong></p>
<p><strong>Delete 4</strong></p>
<p><strong>end</strong></p></td>
<td><strong>20 12 50 319 50 21 31234 2 41 23</strong></td>
</tr>
</tbody>
</table>

## House Party

Write a program that keeps track of the guests that are going to a house
party.

On the **first** input line, you are going to receive how many commands
you are going to have. On the **next lines** you are going to receive
some of the following inputs:

  - **"{name} is going\!"**

  - **"{name} is not going\!"**

If you receive the first type of input, you have to add the person if
he/she **is not** on the list. (If he/she is in the list print on the
console: "**{name} is already in the list\!**"). If you receive the
second type of input, you have to remove the person if he/she **is** on
the list. (If not print: "**{name} is not in the list\!**"). At the end
print all guests.

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
<p>Allie is going!</p>
<p>George is going!</p>
<p>John is not going!</p>
<p>George is not going!</p></td>
<td><p><strong>John is not in the list!</strong></p>
<p><strong>Allie</strong></p></td>
</tr>
<tr class="even">
<td><p>5</p>
<p>Tom is going!</p>
<p>Annie is going!</p>
<p>Tom is going!</p>
<p>Garry is going!</p>
<p>Jerry is going!</p></td>
<td><p><strong>Tom is already in the list!</strong></p>
<p><strong>Tom</strong></p>
<p><strong>Annie</strong></p>
<p><strong>Garry</strong></p>
<p><strong>Jerry</strong></p></td>
</tr>
</tbody>
</table>

## List Operations

You will be given numbers (list of integers) on the first input line.
Until you receive **"End"** you will be given operations you have to
apply on the list. The possible commands are:

  - **Add {number}** - add number at the end

  - **Insert {number} {index}** - insert number at given index

  - **Remove {index}** - remove that index

  - **Shift left {count}** - first number becomes last 'count' times

  - **Shift right {count}** - last number becomes first 'count' times

**Note:** The index given may be outside of the bounds of the array. In
that case print **"Invalid index".**

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
<td><p>1 23 29 18 43 21 20</p>
<p>Add 5</p>
<p>Remove 5</p>
<p>Shift left 3</p>
<p>Shift left 1</p>
<p>End</p></td>
<td><strong>43 20 5 1 23 29 18</strong></td>
</tr>
<tr class="even">
<td><p>5 12 42 95 32 1</p>
<p>Insert 3 0</p>
<p>Remove 10</p>
<p>Insert 8 6</p>
<p>Shift right 1</p>
<p>Shift left 2</p>
<p>End</p></td>
<td><p><strong>Invalid index</strong></p>
<p><strong>5 12 42 95 32 8 1 3</strong></p></td>
</tr>
</tbody>
</table>

## Bomb Numbers

Write a program that **reads a sequence of numbers** and a **special
bomb number** with a certain **power**. Your task is to **detonate every
occurrence of the special bomb number** and according to its power -
**his neighbors from left and right**. **Detonations are performed from
left to right and all detonated numbers disappear.** Finally, print the
**sum of the remaining elements** in the sequence.

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
<td><p>1 2 2 4 2 2 2 9</p>
<p>4 2</p></td>
<td>12</td>
<td>The special number is 4 with power 2. After detonation, we left with the sequence [1, 2, 9] with sum 12.</td>
</tr>
<tr class="even">
<td><p><strong>1 4 4 2 8 9 1</strong></p>
<p>9 <strong>3</strong></p></td>
<td><strong>5</strong></td>
<td>The special number is 9 with power 3. After detonation, we left with the sequence [1, 4] with sum 5. Since the 9 has only 1 neighbor from the right we remove just it (one number instead of 3).</td>
</tr>
<tr class="odd">
<td><p><strong>1 7 7 1 2 3</strong></p>
<p><strong>7 1</strong></p></td>
<td><strong>6</strong></td>
<td><strong>Detonations are performed from left to right. We could not detonate the second occurrence of 7 because it’s already destroyed by the first occurrence. The numbers [1, 2, 3] survive. Their sum is 6.</strong></td>
</tr>
<tr class="even">
<td><p><strong>1 1 2 1 1 1 2 1 1 1</strong></p>
<p>2 <strong>1</strong></p></td>
<td><strong>4</strong></td>
<td><strong>The red and yellow numbers disappear in two sequential detonations. The result is the sequence [1, 1, 1, 1]. Sum = 4.</strong></td>
</tr>
</tbody>
</table>

## Cards Game

You will be given two hands of cards, which will be **integer** numbers.
Assume that you have two players. You have to find out the winning deck
and respectively the winner.

You start from the beginning of both hands. Compare the cards from the
first deck to the cards from the second deck. The player, who has a
bigger card, takes both cards and puts them at the **back** of his hand
- **the second player's card is last, and the first person's card (the
winning one) is before it (second to last)** and the player with the
smaller card must **remove** the **card** from his deck. If both
players' cards have the same values - no one wins, and the two cards
must be **removed** **from** the **decks**. The game is over when one of
the decks is left without any cards. You have to print the winner on the
console and the sum of the left cards: **"{First/Second} player wins\!
Sum: {sum}"**.

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
<td><p>20 30 40 50</p>
<p>10 20 30 40</p></td>
<td>First player wins! S<strong>um: 240</strong></td>
</tr>
<tr class="even">
<td><p>10 20 30 40 50</p>
<p>50 40 30 30 10</p></td>
<td><strong>Second player wins! Sum: 50</strong></td>
</tr>
</tbody>
</table>

## Append Arrays

Write a program to **append several arrays** of numbers.

  - Arrays are separated by "**|**".

  - Values are separated by spaces (" ", **one or several**).

  - Order the arrays from the **last** to the **first**, and their
    values from **left** to **right.**

### Examples

| **Input**               | **Output**          |
| ----------------------- | ------------------- |
| **1 2 3 |4 5 6 | 7 8**  | **7 8 4 5 6 1 2 3** |
| **7 | 4 5|1 0| 2 5 |3** | **3 2 5 1 0 4 5 7** |
| **1| 4 5 6 7 | 8 9**    | **8 9 4 5 6 7 1**   |

## \*Anonymous Threat

*Anonymous has created a cyber-hyper virus that steals data from the
CIA. You, as the lead security developer in the CIA, have been tasked to
analyze the software of the virus and observe its actions on the data.
The virus is known for its innovative and unbelievably clever technique
of merging and dividing data into partitions.*

You will receive a **single input line** containing **STRINGS**
separated by **spaces**.  
The strings may contain **any ASCII** character except **whitespace**.

You will then begin receiving commands in one of the following formats:

  - merge {startIndex} {endIndex}

  - divide {index} {partitions}

Every time you receive the **merge command**, you must merge all
elements from the **startIndex** till the **endIndex**. In other words,
you should concatenate them.  
**Example**: **{abc, def, ghi} -\> merge 0 1 -\> {abcdef, ghi}**

If **any** of the **given indexes** is **out of the array**, you must
take **ONLY** the **range** that is **INSIDE** the **array** and
**merge** it.

Every time you receive the **divide command**, you must **DIVIDE** the
**element** at the **given index** into **several small substrings**
with **equal length**. The **count** of the **substrings** should be
**equal** to the **given partitions**.

**Example**: **{abcdef, ghi, jkl} -\> divide 0 3 -\> {ab, cd, ef, ghi,
jkl}**

If the string **CANNOT** be **exactly** **divided** into the **given
partitions**, **make all partitions** **except** the **LAST** with
**EQUAL LENGTHS**, and make the **LAST one** – **the** **LONGEST**.

**Example**: **{abcd, efgh, ijkl} -\> divide 0 3 -\> {a, b, cd, efgh,
ijkl}**

The **input ends** when you receive the command "**3:1**". At that point
you must print the **resulting elements**, **joined** by a **space**.

### Input

  - The **first input line** will contain the **array** of **data.**

  - On the **next several input** lines you will **receive commands** in
    the **format specified above.**

  - The **input ends** when you receive the command "**3:1**".

### Output

  - As output, you must print a single line containing the elements of
    the array, **joined** by a **space**.

### Constrains

  - The **strings** in the **array** may contain any **ASCII character**
    except **whitespace.**

  - The **startIndex** and the **endIndex** will be in the **range
    \[-1000, 1000\].**

  - The **endIndex** will **ALWAYS** be **GREATER** than the
    **startIndex.**

  - The **index** in the **divide command** will **ALWAYS** be
    **INSIDE** the array.

  - The **partitions** will be in the **range \[0, 100\].**

  - Allowed working **time/memory**: **100ms / 16MB.**

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
<td><p><strong>Ivo Johny Tony Bony Mony</strong></p>
<p><strong>merge 0 3</strong></p>
<p><strong>merge 3 4</strong></p>
<p><strong>merge 0 3</strong></p>
<p><strong>3:1</strong></p></td>
<td><strong>IvoJohnyTonyBonyMony</strong></td>
</tr>
<tr class="even">
<td><p><strong>abcd efgh ijkl mnop qrst uvwx yz</strong></p>
<p><strong>merge 4 10</strong></p>
<p><strong>divide 4 5</strong></p>
<p><strong>3:1</strong></p></td>
<td><strong>abcd efgh ijkl mnop qr st uv wx yz</strong></td>
</tr>
</tbody>
</table>

## \*Pokémon Don't Go

*Ely likes to play Pokémon Go a lot. But Pokémon Go bankrupted… So, the
developers made Pokémon Don't Go out of depression. And so, Ely now
plays Pokémon Don't Go. In Pokémon Don't Go, when you walk to a certain
Pokémon, those closest to you, naturally get further, and those further
from you, get closer.*

You will receive a **sequence** of **integers**, separated by **spaces**
- the distances to the Pokémons.  
Then you will begin **receiving integers**, which will **correspond** to
**indexes** in **that** **sequence**.

When you **receive** an **index**, you must **remove** the **element**
at **that index** from the **sequence** (as if you've captured the
Pokémon).

  - You must **INCREASE** the **value** of **all elements** in the
    sequence which are **LESS** or **EQUAL** to the **removed element**,
    with the **value** of the **removed element**.

  - You must **DECREASE** the **value** of **all elements** in the
    sequence which are **GREATER** than the **removed element**, with
    the **value** of the **removed element**.

If the **given index** is **LESS** than **0**, **remove** the **first
element** of the **sequence**, and **COPY** the **last element** to its
place.

If the **given index** is **GREATER** than the **last index** of the
**sequence**, **remove** the **last element** from the sequence, and
**COPY** the **first element** to its place.

The **increasing** and **decreasing** of elements should be done in
these cases, **also**. The **element**, whose value you should use, is
the **REMOVED** element.

The program **ends** when the **sequence** has **no elements** (there
are no Pokémons left for Ely to catch).

### Input

  - On the **first line** of input, you will receive a **sequence** of
    **integers**, **separated** by **spaces.**

  - On the **next several** lines you will receive **integers** – the
    **indexes.**

### Output

  - When the program ends, you must print on the console, the **summed
    up** **value** of **all REMOVED elements.**

### Constrains

  - The input data will consist **ONLY** of **valid integers** in the
    **range \[-2.147.483.648, 2.147.483.647\].**

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
<td><p><strong>4 5 3</strong></p>
<p><strong>1</strong></p>
<p><strong>1</strong></p>
<p><strong>0</strong></p></td>
<td><strong>14</strong></td>
<td><p><strong>The array is {4, 5, 3}. The index is 1.</strong></p>
<p><strong>We remove 5, and we increase all lower than it and decrease all higher than it.</strong></p>
<p><strong>In this case, there are no higher than 5.</strong></p>
<p><strong>The result is {9, 8}.</strong></p>
<p><strong>The index is 1. So we remove 8 and decrease all higher than it.</strong></p>
<p><strong>The result is {1}.</strong></p>
<p><strong>The index is 0. So we remove 1.</strong></p>
<p><strong>There are no elements left, so we print the sum of all removed elements.</strong></p>
<p><strong>5 + 8 + 1 = 14.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>5 10 6 3 5</strong></p>
<p><strong>2</strong></p>
<p><strong>4</strong></p>
<p><strong>1</strong></p>
<p><strong>1</strong></p>
<p><strong>3</strong></p>
<p><strong>0</strong></p>
<p><strong>0</strong></p></td>
<td><strong>51</strong></td>
<td><p><strong>Step 1: {11, 4, 9, 11}</strong></p>
<p><strong>Step 2: {22, 15, 20, 22}</strong></p>
<p><strong>Step 3: {7, 5, 7}</strong></p>
<p><strong>Step 4: {2, 2}</strong></p>
<p><strong>Step 5: {4, 4}</strong></p>
<p><strong>Step 6: {8}</strong></p>
<p><strong>Step 7: {} (empty).</strong></p>
<p><strong>Result = 6 + 11 + 15 + 5 + 2 + 4 + 8 = 51.</strong></p></td>
</tr>
</tbody>
</table>

##  \*SoftUni Course Planning

*You are tasked to help plan the next Programming Fundamentals course by
keeping track of the lessons, that are going to be included in the
course, as well as all the exercises for the lessons.*

On the first input line, you will **receive the initial schedule of
lessons and exercises** that are going to be part of the next course,
separated by **comma and space ", ".** But before the course starts,
there are some changes to be made. Until you receive **"course start"**
you will be given **some commands to modify the course schedule**. The
possible commands are:

**Add:{lessonTitle}** - add the lesson to the end of the schedule, **if
it does not exist**

**Insert:{lessonTitle}:{index}** -insert the lesson to the given index,
**if it does not exist**

**Remove:{lessonTitle}** -remove the lesson, **if it exists**

**Swap:{lessonTitle}:{lessonTitle}** -change the place of the two
lessons, **if they exist**

**Exercise:{lessonTitle}** -add Exercise in the schedule right after the
lesson index**<span class="underline">, if the lesson exists and there
is no exercise already</span>**, in the following format
**"{lessonTitle}-Exercise"**. **If the lesson doesn't exist**, **add the
lesson** at the end of the course schedule**, followed by the
Exercise**.

**Each time you Swap or Remove a lesson, you should do the same with the
Exercises, if there are any, which follow the lessons.**

### Input

  - > On the first line -the initial schedule lessons -strings,
    > separated by comma and space **", ".**

  - > Until **"course start"** you will receive commands in the format
    > described above.

### Output

  - Print the whole course schedule, each lesson on a new line with its
    number(index) in the schedule:  
    **"{lesson index}.{lessonTitle}".**

  - Allowed working **time** / **memory**: **100ms** / **16MB.**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th><strong>Comment</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Data Types, Objects, Lists</p>
<p>Add:Databases</p>
<p>Insert:Arrays:0</p>
<p>Remove:Lists</p>
<p>course start</p></td>
<td><p>1.Arrays</p>
<p>2.Data Types</p>
<p>3.Objects</p>
<p>4.Databases</p></td>
<td><p>We receive the initial schedule.</p>
<p>Next, we add the Databases lesson, because it doesn't exist.</p>
<p>We Insert at the given index lesson Arrays because it's not present in the schedule.</p>
<p>After receiving the last command and removing lesson Lists, we print the whole schedule.</p></td>
</tr>
<tr class="even">
<td><p>Arrays, Lists, Methods</p>
<p>Swap:Arrays:Methods</p>
<p>Exercise:Databases</p>
<p>Swap:Lists:Databases</p>
<p>Insert:Arrays:0</p>
<p>course start</p></td>
<td><p>1.Methods</p>
<p>2.Databases</p>
<p>3.Databases-Exercise</p>
<p>4.Arrays</p>
<p>5.Lists</p></td>
<td><p>We swap the given lessons because both exist.</p>
<p>After receiving the Exercise command, we see that such a lesson doesn't exist, so we add the lesson at the end, followed by the exercise.</p>
<p>We swap Lists and Databases lessons, the Databases-Exercise is also moved after the Databases lesson.</p>
<p>We skip the next command because we already have such a lesson in our schedule.</p></td>
</tr>
</tbody>
</table>

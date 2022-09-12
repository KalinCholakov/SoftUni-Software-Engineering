# Exercise: Associative Arrays, Lambda and Stream API

Problems for exercises and homework for the ["Programming Fundamentals"
course @
SoftUni](https://softuni.bg/trainings/3731/programming-fundamentals-with-java-may-2022).

You can check your solutions in
[Judge.](https://judge.softuni.bg/Contests/1312)

## Count Chars in a String

Write a program, which **counts all characters** in a string **except
space (' ')**.

**Print all occurrences in the following format:**

**"{char} -\> {occurrences}"**

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
<td><strong>text</strong></td>
<td><p>t -&gt; 2</p>
<p>e -&gt; 1</p>
<p>x -&gt; 1</p></td>
</tr>
<tr class="even">
<td><strong>text text text</strong></td>
<td><p>t -&gt; 6</p>
<p>e -&gt; 3</p>
<p>x -&gt; 3</p></td>
</tr>
</tbody>
</table>

## A Miner Task

Until you receive the **"stop"** command, you will be given a sequence
of strings, each on a new line. Every **odd** line on the console is
representing a **resource** (e.g. Gold, Silver, Copper, etc.) and every
**even** - **quantity**. Your task is to collect the resources and print
them each on a new line.

**Print the resources and their quantities in format: "{resource} –\>
{quantity}".**

The quantities inputs will be in the range **\[1 … 2 000 000 000\].**

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Gold</p>
<p>155</p>
<p>Silver</p>
<p>10</p>
<p>Copper</p>
<p>17</p>
<p>stop</p></td>
<td><p>Gold -&gt; 155</p>
<p>Silver -&gt; 10</p>
<p>Copper -&gt; 17</p></td>
<td></td>
<td><p>gold</p>
<p>155</p>
<p>silver</p>
<p>10</p>
<p>copper</p>
<p>17</p>
<p>gold</p>
<p>15</p>
<p>stop</p></td>
<td><p>gold -&gt; 170</p>
<p>silver -&gt; 10</p>
<p>copper -&gt; 17</p></td>
</tr>
</tbody>
</table>

## Legendary Farming

You are playing a game, and your goal is to **win a** **legendary item
-** any legendary item will be good enough. However, it's a tedious
process, and it requires quite a bit of farming. The possible **items**
are:

  - **"Shadowmourne"** - requires **250 Shards**

  - **"Valanyr"** - requires **250 Fragments**

  - **"Dragonwrath"** - requires **250 Motes**

**"Shards", "Fragments",** and **"Motes"** are the **key materials
(case-insensitive),** and everything else is **junk.**

You will be given lines of input in the format:

**"{quantity1} {material1} {quantity2} {material2} … {quantityN}
{materialN}"**

Keep track of the **key materials -** the **first** one that reaches
**250,** **wins** the **race**. At that point, you have to print that
the corresponding legendary item is obtained.

In the end, print the **remaining** **shards, fragments, motes** in the
format:

**"shards: {numberOfShards}**

**fragments: {numberOfFragments}**

**motes: {numberOfMotes}"**

Finally, **print** the collected **junk** items in the order of
appearance.

### Input

  - Each line comes in the following format: **"{quantity1} {material1}
    {quantity2} {material2} … {quantityN} {materialN}"**

### Output

  - On **the** **first line**, print the obtained item in the format:
    "**{Legendary item} obtained\!"** .

  - On **the next three lines**, print the remaining key materials.

  - On the **several final lines**, print the **junk** items.

  - All materials should be printed in the format: **"{material}:
    {quantity}"**.

  - The output should be **lowercase**, except for the first letter of
    the legendary.

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
<td><p>3 Motes 5 stones 5 Shards</p>
<p>6 leathers 255 fragments 7 Shards</p></td>
<td><p>Valanyr obtained!</p>
<p>shards: 5</p>
<p>fragments: 5</p>
<p>motes: 3</p>
<p>stones: 5</p>
<p>leathers: 6</p></td>
</tr>
<tr class="even">
<td><p>123 silver 6 shards 8 shards 5 motes</p>
<p>9 fangs 75 motes 103 MOTES 8 Shards</p>
<p>86 Motes 7 stones 19 silver</p></td>
<td><p>Dragonwrath obtained!</p>
<p>shards: 22</p>
<p>fragments: 0</p>
<p>motes: 19</p>
<p>silver: 123</p>
<p>fangs: 9</p></td>
</tr>
</tbody>
</table>

## Orders

Write a program, which keeps the information about **products** and
their **prices**. Each product has a **name**, a **price,** and its
**quantity**. If the product **doesn't exist** yet, **add** it with its
**starting quantity**.

If you receive a product, which **already exists,** **increases** its
quantity by the input quantity and if its **price is different**,
**replace** the price as well.

You will receive products' **names**, **prices,** and **quantities** on
**new lines**. Until you receive the command "**buy**", keep adding
items. When you do receive the command "**buy**", print the items with
their **names** and the **total price** of all the products with that
name.

**Input**

  - Until you receive "**buy**", the products come in the format:
    "**{name} {price} {quantity}**".

  - The product data is **always** delimited by a **single space.**

**Output**

  - Print information about **each** **product**, following the
    format:  
    "**{productName} -\> {totalPrice}**"

  - **Format** the average total price to the **2<sup>nd</sup> decimal
    place.**

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
<td><p>Beer 2.20 100</p>
<p>IceTea 1.50 50</p>
<p>NukaCola 3.30 80</p>
<p>Water 1.00 500</p>
<p>buy</p></td>
<td><p>Beer -&gt; 220.00</p>
<p>IceTea -&gt; 75.00</p>
<p>NukaCola -&gt; 264.00</p>
<p>Water -&gt; 500.00</p></td>
</tr>
<tr class="even">
<td><p><strong>Beer 2.40 350</strong></p>
<p><strong>Water 1.25 200</strong></p>
<p><strong>IceTea 5.20 100</strong></p>
<p><strong>Beer 1.20 200</strong></p>
<p><strong>IceTea 0.50 120</strong></p>
<p>buy</p></td>
<td><p>Beer -&gt; 660.00</p>
<p>Water -&gt; 250.00</p>
<p>IceTea -&gt; 110.00</p></td>
</tr>
<tr class="odd">
<td><p>CesarSalad 10.20 25</p>
<p>SuperEnergy 0.80 400</p>
<p>Beer 1.35 350</p>
<p>IceCream 1.50 25</p>
<p>buy</p></td>
<td><p>CesarSalad -&gt; 255.00</p>
<p>SuperEnergy -&gt; 320.00</p>
<p>Beer -&gt; 472.50</p>
<p>IceCream -&gt; 37.50</p></td>
</tr>
</tbody>
</table>

## SoftUni Parking

*SoftUni just got a new **parking lot**. It's so fancy, it even has
online **parking validation**. Except, the online service doesn't work.
It can only receive users' data but doesn't know what to do with it.
Good thing you're on the dev team and know how to fix it, right?*

Write a program, which validates parking for an online service. Users
can **register** to park and **unregister** to leave.

The program **receives 2 commands**:

  - "**register {username} {licensePlateNumber}**":
    
      - The system only supports **one car per user** at the moment, so
        if a user tries to register **another license plate**, using the
        **same username**, the system should print:  
        "**ERROR: already registered with plate number
        {licensePlateNumber}**"
    
      - If the aforementioned checks pass successfully, the plate can be
        registered, so the  
        the system should print:  
        "**{****username} registered {licensePlateNumber}
        successfully**"

  - "**unregister {username}**":
    
      - If the user is **not present** in the database, the system
        should print:  
        "**ERROR: user {username} not found**"
    
      - If the aforementioned check passes successfully, the system
        should print:  
        "**{username} unregistered successfully**"

After you execute all of the commands, **print** all the currently
**registered users** and their **license plates** in the format:

  - "**{username} =\> {licensePlateNumber}**"

### Input

  - First line: **n** - **number of commands** – **integer.**

  - Next **n** lines: **commands** in one of **two** possible formats:
    
      - Register: "**register {username} {licensePlateNumber}**"
    
      - Unregister: "**unregister {username}**"

The input will **always** be **valid** and you **do not need** to check
it explicitly.

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
<td><p>5</p>
<p>register John CS1234JS</p>
<p>register George JAVA123S</p>
<p>register Andy AB4142CD</p>
<p>register Jesica VR1223EE</p>
<p>unregister Andy</p></td>
<td><p>John registered CS1234JS successfully</p>
<p>George registered JAVA123S successfully</p>
<p>Andy registered AB4142CD successfully</p>
<p>Jesica registered VR1223EE successfully</p>
<p>Andy unregistered successfully</p>
<p>John =&gt; CS1234JS</p>
<p>George =&gt; JAVA123S</p>
<p>Jesica =&gt; VR1223EE</p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>register Jony AA4132BB</strong></p>
<p><strong>register Jony AA4132BB</strong></p>
<p><strong>register Linda AA9999BB</strong></p>
<p><strong>unregister Jony</strong></p></td>
<td><p><strong>Jony registered AA4132BB successfully</strong></p>
<p><strong>ERROR: already registered with plate number AA4132BB</strong></p>
<p><strong>Linda registered AA9999BB successfully</strong></p>
<p><strong>Jony unregistered successfully</strong></p>
<p><strong>Linda =&gt; AA9999BB</strong></p></td>
</tr>
<tr class="odd">
<td><p>6</p>
<p>register Jacob MM1111XX</p>
<p>register Anthony AB1111XX</p>
<p>unregister Jacob</p>
<p>register Joshua DD1111XX</p>
<p>unregister Lily</p>
<p>register Samantha <strong>AA9999BB</strong></p></td>
<td><p>Jacob registered MM1111XX successfully</p>
<p>Anthony registered AB1111XX successfully</p>
<p>Jacob unregistered successfully</p>
<p>Joshua registered DD1111XX successfully</p>
<p>ERROR: user Lily not found</p>
<p>Samantha registered AA9999BB successfully</p>
<p>Anthony =&gt; AB1111XX</p>
<p>Joshua =&gt; DD1111XX</p>
<p>Samantha =&gt; AA9999BB</p></td>
</tr>
</tbody>
</table>

## Courses

Write a program, which keeps the information about **courses**. Each
course has a **name** and **registered students**.

You will receive the **course** **name** and **student** **name** until
you receive the command "**end**". **Check if such a course already
exists and if not - add the course.** Register the user into the course.
When you do receive the command "**end**", print the courses with their
**names** and **total registered users**. For each contest, print the
registered users.

**Input**

  - Until you receive "**end**", the input come in the format:
    "**{courseName} : {studentName}**".

  - The product data is **always** delimited by " **:** ".

**Output**

  - Print information about **each** **course**, following the format:  
    **"{courseName}: {registeredStudents}"**

  - Print information about each student, following the format:  
    **"-- {studentName}"**

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
<td><p>Programming Fundamentals : John Smith</p>
<p>Programming Fundamentals : Linda Johnson</p>
<p>JS Core : Will Wilson</p>
<p>Java Advanced : Harrison White</p>
<p>end</p></td>
<td><p>Programming Fundamentals: 2</p>
<p>-- John Smith</p>
<p>-- Linda Johnson</p>
<p>JS Core: 1</p>
<p>-- Will Wilson</p>
<p>Java Advanced: 1</p>
<p>-- Harrison White</p></td>
</tr>
<tr class="even">
<td><p><strong>Algorithms : Jay Moore</strong></p>
<p><strong>Programming Basics : Martin Taylor</strong></p>
<p><strong>Python Fundamentals : John Anderson</strong></p>
<p><strong>Python Fundamentals : Andrew Robinson</strong></p>
<p><strong>Algorithms : Bob Jackson</strong></p>
<p><strong>Python Fundamentals : Clark Lewis</strong></p>
<p><strong>end</strong></p></td>
<td><p><strong>Algorithms: 2</strong></p>
<p><strong>-- Jay Moore</strong></p>
<p><strong>-- Bob Jackson</strong></p>
<p><strong>Programming Basics: 1</strong></p>
<p><strong>-- Martin Taylor</strong></p>
<p><strong>Python Fundamentals: 3</strong></p>
<p><strong>-- John Anderson</strong></p>
<p><strong>-- Andrew Robinson</strong></p>
<p><strong>-- Clark Lewis</strong></p></td>
</tr>
</tbody>
</table>

## Student Academy

Write a program, which keeps the information about **students** and
**their grades**.

On the first line, you will receive number **n**. After that, you will
receive **n pair of rows**. First, you will receive the **student's
name**, after that, you will receive his **grade**. **Check if the
student already exists and if not - add him**. Keep track of all grades
for each student.

When you finish reading data, keep students with an **average grade
higher or equal to 4.50**.

**Print the students and their average grade in the format:**

**"{name} –\> {averageGrade}"**

**Format** the average grade to the **2<sup>nd</sup> decimal place**.

### Examples

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
<th></th>
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>5</p>
<p>John</p>
<p>5.5</p>
<p>John</p>
<p>4.5</p>
<p>Alice</p>
<p>6</p>
<p>Alice</p>
<p>3</p>
<p>George</p>
<p>5</p></td>
<td><p>John -&gt; 5.00</p>
<p>Alice -&gt; 4.50</p>
<p>George -&gt; 5.00</p></td>
<td></td>
<td><p>5</p>
<p>Amanda</p>
<p>3.5</p>
<p>Amanda</p>
<p>4</p>
<p>Rob</p>
<p>5.5</p>
<p>Christian</p>
<p>5</p>
<p>Robert</p>
<p>6</p></td>
<td><p>Rob -&gt; 5.50</p>
<p>Christian -&gt; 5.00</p>
<p>Robert -&gt; 6.00</p></td>
</tr>
</tbody>
</table>

## Company Users

Write a program which keeps the information about companies and their
employees.

You will be receiving **company** **names** and an **employees' id**
until you receive the command "**End**" command. **Add** **each
employee** to the given company. Keep in mind that a **company cannot
have two employees with the** **same id**.

Print the **company name** and **each employee's id** in the following
format:

**"{company\_name}**

**-- {id1}**

**-- {id2}**

**…**

**-- {idN}"**

**Input / Constraints**

  - Until you receive "**End**", the input come in the format:
    "**{companyName} -\> {employeeId}**".

  - The input **always** will be valid.

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
<td><p><strong>SoftUni -&gt; AA12345</strong></p>
<p><strong>SoftUni -&gt; BB12345</strong></p>
<p><strong>Microsoft -&gt; CC12345</strong></p>
<p><strong>HP -&gt; BB12345</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>SoftUni</strong></p>
<p><strong>-- AA12345</strong></p>
<p><strong>-- BB12345</strong></p>
<p><strong>Microsoft</strong></p>
<p><strong>-- CC12345</strong></p>
<p><strong>HP</strong></p>
<p><strong>-- BB12345</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>SoftUni -&gt; AA12345</strong></p>
<p><strong>SoftUni -&gt; CC12344</strong></p>
<p><strong>Lenovo -&gt; XX23456</strong></p>
<p><strong>SoftUni -&gt; AA12345</strong></p>
<p><strong>Movement -&gt; DD11111</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>SoftUni</strong></p>
<p><strong>-- AA12345</strong></p>
<p><strong>-- CC12344</strong></p>
<p><strong>Lenovo</strong></p>
<p><strong>-- XX23456</strong></p>
<p><strong>Movement</strong></p>
<p><strong>-- DD11111</strong></p></td>
</tr>
</tbody>
</table>

## \*ForceBook

*The force users are struggling to remember which side is the different
forceUsers from because they switch them too often. So you are tasked to
create a web application to manage their profiles.*

You will receive **several input lines** in one of the following
formats:

"{force\_side} | {force\_user}"

"{force\_user} -\> {force\_side}"

The "**force\_user"** and **"force\_side"** are strings, containing any
character.

If you receive "**force\_side | force\_user"**:

  - **If there is no such force user and no such force side -\> create a
    new force side and add** the **force user** to the corresponding
    side.

  - Only **if there is no such force user** in any **force side** -\>
    **add** the **force user** to the corresponding side.

  - If there is such **force user** already -\> **skip** the command and
    continue to the next operation.

If you receive a **"force\_user -\> force\_side"**:

  - If there is such **force user** already -\> **change their side**.

  - If there is no such **force user** in any **force side** -\> add the
    **force user** to the corresponding **force side**.

  - **If there is no such force user** and no such **force side -\>
    create new force side and add** the **force user** to the
    corresponding side.

  - **Then you should print on the console: "{force\_user} joins the
    {force\_side} side\!"**.

You should **end your program** when you receive the command
**"Lumpawaroo"**. At that point, you should print each force side. For
each side, print the **force users**.

In case there are **no force users on a side**, you **shouldn't print**
the side information.

### Input / Constraints

  - The input comes in the form of commands in one of the formats
    specified above.

  - The input ends when you receive the command "**Lumpawaroo**".

### Output

  - As output for each force side, you must print all the force users.

  - The output format is:

> "Side: {forceSide}, Members: {forceUsers.Count}

\! {forceUser}

\! {forceUser}

\! {forceUser}"

  - In case there are **NO** **forceUsers**, don't print this side.

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
<td><p><strong>Light | Peter</strong></p>
<p><strong>Dark | Kim</strong></p>
<p><strong>Lumpawaroo</strong></p></td>
<td><p><strong>Side: Light, Members: 1</strong></p>
<p><strong>! Peter</strong></p>
<p><strong>Side: Dark, Members: 1</strong></p>
<p><strong>! Kim</strong></p></td>
<td><strong>We register Peter on the Light side and Kim on the Dark side. After receiving "Lumpawaroo", we print both sides.</strong></td>
</tr>
<tr class="even">
<td><p><strong>Lighter | Royal</strong></p>
<p><strong>Darker | DCay</strong></p>
<p><strong>Ivan Ivanov -&gt; Lighter</strong></p>
<p><strong>DCay -&gt; Lighter</strong></p>
<p><strong>Lumpawaroo</strong></p></td>
<td><p><strong>Ivan Ivanov joins the Lighter side!</strong></p>
<p><strong>DCay joins the Lighter side!</strong></p>
<p><strong>Side: Lighter, Members: 3</strong></p>
<p><strong>! Royal</strong></p>
<p><strong>! Ivan Ivanov</strong></p>
<p><strong>! DCay</strong></p></td>
<td><p><strong>Although Ivan Ivanov doesn't have a profile, we register him and add him to the Lighter side.</strong></p>
<p><strong>We remove DCay from the Darker side and add him to the Lighter side.</strong></p>
<p><strong>We print only the Lighter side because the Darker side has no members.</strong></p></td>
</tr>
</tbody>
</table>

## \*SoftUni Exam Results

Judge statistics on the last Programing Fundamentals exam were not
working correctly, so you have the task to take all the submissions and
analyze them properly. You should collect all the submissions and print
the final results and statistics about each language that the
participants submitted their solutions in.

You will be receiving lines in the following format:
**"{username}-{language}-{points}" until you receive "exam finished"**.
**You should store each username and their submissions and points.  
You can receive a command to ban a user for cheating in the following
format: "{username}-banned"**. In that case, you should **remove** the
user from the contest but **preserve his submissions in the total count
of submissions for each language**.

**After receiving "exam finished", print each of the participants in the
following format:**

"Results:

{username} | {points}

{username2} | {points}

…

{usernameN} | {points}"

**After that, print each language, used in the exam in the following
format:**

"Submissions:

{language1} - {submissions\_count}

{language2} - {submissions\_count}

…

{language3} - {submissions\_count}"

### Input / Constraints

Until you receive **"exam finished**", you will be receiving participant
submissions in the following format:
"**{username}-{language}-{points}**"

You can receive a ban command -\> "**{username}-banned**"**.**

The points of the participant will always be a **valid integer in the
range \[0-100\].**

### Output

  - Print the exam results for each participant.

  - **After that, print each language in the format** shown above.

  - Allowed working **time** / **memory**: **100ms** / **16MB.**

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
<td><p>Peter-Java-84</p>
<p>George-C#-84</p>
<p>George-C#-70</p>
<p>Katy-C#-94</p>
<p>exam finished</p></td>
<td><p>Results:</p>
<p>Peter | 84</p>
<p>George | 84</p>
<p>Katy | 94</p>
<p>Submissions:</p>
<p>Java - 1</p>
<p>C# - 3</p></td>
</tr>
<tr class="even">
<td><p>Peter-Java-91</p>
<p>George-C#-84</p>
<p>Katy-Java-90</p>
<p>Katy-C#-50</p>
<p>Katy-banned</p>
<p>exam finished</p></td>
<td><p>Results:</p>
<p>Peter | 91</p>
<p>George | 84</p>
<p>Submissions:</p>
<p>Java - 2</p>
<p>C# - 2</p></td>
</tr>
</tbody>
</table>

###

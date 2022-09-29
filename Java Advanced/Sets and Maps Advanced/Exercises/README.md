# Exercises: Sets and Maps Advanced

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1463/Sets-And-Maps-Exercises).

## Unique Usernames

Write a simple program that reads a sequence of usernames from the
console and keeps a collection with only the unique ones. Print the
collection on the console in order of insertion:

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
<td><p>6</p>
<p>Hello</p>
<p>Hello</p>
<p>Hello</p>
<p>World</p>
<p>Hello</p>
<p>Greetings</p></td>
<td><p>Hello</p>
<p>World</p>
<p>Greetings</p></td>
</tr>
<tr class="even">
<td><p>10</p>
<p>Peter</p>
<p>Maria</p>
<p>Peter</p>
<p>George</p>
<p>Stephen</p>
<p>Maria</p>
<p>Alexander</p>
<p>Peter</p>
<p>Stephen</p>
<p>George</p></td>
<td><p>Peter</p>
<p>Maria</p>
<p>George</p>
<p>Stephen</p>
<p>Alexander</p></td>
</tr>
</tbody>
</table>

## Sets of Elements

On the first line, you are given the length of two sets, **N** and
**M**. On the next **N + M** lines, there are **N** numbers that are in
the **first** set and **M** numbers that are in the **second** one. Find
all non-repeating element that appears in both of them, and print them
in the same order at the console:

Set with length N = 4: {1, **3**, **5**, 7}

Set with length M = 3: {**3**, 4, **5**}

Set that contains all repeating elements -\> {**3**, **5**}

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
<td><p>4 3</p>
<p>1</p>
<p>3</p>
<p>5</p>
<p>7</p>
<p>3</p>
<p>4</p>
<p>5</p></td>
<td>3 5</td>
</tr>
<tr class="even">
<td><p>2 2</p>
<p>1</p>
<p>3</p>
<p>1</p>
<p>5</p></td>
<td>1</td>
</tr>
</tbody>
</table>

## Periodic Table

You are given an **n** number of chemical compounds. You need to keep
track of all chemical elements used in the compounds and at the end,
print all unique ones in ascending order:

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
<p>Ce O</p>
<p>Mo O Ce</p>
<p>Ee</p>
<p>Mo</p></td>
<td>Ce Ee Mo O</td>
</tr>
<tr class="even">
<td><p>3</p>
<p>Ge Ch O Ne</p>
<p>Nb Mo Tc</p>
<p>O Ne</p></td>
<td>Ch Ge Mo Nb Ne O Tc</td>
</tr>
</tbody>
</table>

## Count Symbols

Write a program that reads some text from the console and counts the
occurrences of each character in it. Print the results in
**alphabetical** (lexicographical) order.

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
<td>SoftUni rocks</td>
<td><p>: 1 time/s</p>
<p>S: 1 time/s</p>
<p>U: 1 time/s</p>
<p>c: 1 time/s</p>
<p>f: 1 time/s</p>
<p>i: 1 time/s</p>
<p>k: 1 time/s</p>
<p>n: 1 time/s</p>
<p>o: 2 time/s</p>
<p>r: 1 time/s</p>
<p>s: 1 time/s</p>
<p>t: 1 time/s</p></td>
</tr>
<tr class="even">
<td>Did you know Math.Round rounds to the nearest even integer?</td>
<td><p>: 9 time/s</p>
<p>.: 1 time/s</p>
<p>?: 1 time/s</p>
<p>D: 1 time/s</p>
<p>M: 1 time/s</p>
<p>R: 1 time/s</p>
<p>a: 2 time/s</p>
<p>d: 3 time/s</p>
<p>e: 7 time/s</p>
<p>g: 1 time/s</p>
<p>h: 2 time/s</p>
<p>i: 2 time/s</p>
<p>k: 1 time/s</p>
<p>n: 6 time/s</p>
<p>o: 5 time/s</p>
<p>r: 3 time/s</p>
<p>s: 2 time/s</p>
<p>t: 5 time/s</p>
<p>u: 3 time/s</p>
<p>v: 1 time/s</p>
<p>w: 1 time/s</p>
<p>y: 1 time/s</p></td>
</tr>
</tbody>
</table>

## Phonebook

Write a program that receives some info from the console about
**people** and their **phone numbers**.

You are free to choose how the data is entered. Each **entry** should
have just **one name** and **one number** (both of them strings). If you
receive a name that **already exists** in the phonebook, simply update
its number.

After filling this simple phonebook, upon receiving the **command**
"**search**", your program should be able to perform a search of contact
by name and print her details in the format "**{name} -\> {number}**".
In case the contact isn't found, print "**Contact {name} does not
exist.**".

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
<td><p>John-0888080808</p>
<p><strong>search</strong></p>
<p>Maria</p>
<p>John</p>
<p>stop</p></td>
<td><p>Contact Maria does not exist.</p>
<p>John -&gt; 0888080808</p></td>
</tr>
<tr class="even">
<td><p>John-00359888001122</p>
<p>Peter-0040333111000</p>
<p>George-0049112233</p>
<p>Samuel-0047123123123</p>
<p><strong>search</strong></p>
<p>Samuel</p>
<p>samuel</p>
<p>PeTeR</p>
<p>Peter</p>
<p>stop</p></td>
<td><p>Samuel -&gt; 0047123123123</p>
<p>Contact samuel does not exist.</p>
<p>Contact PeTeR does not exist.</p>
<p>Peter -&gt; 0040333111000</p></td>
</tr>
</tbody>
</table>

## Fix Emails

You are given a sequence of strings, each on a new line, **until you
receive the "stop" command**. The first string is a **name** of a
person. On the second line, you receive his **email**. Your task is to
**collect** their names and emails and **remove** emails whose domain
ends with "us", "uk," or "com" (case insensitive). Print in the
following format:

"**{name} – \> {email}**"

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
<td><p>John</p>
<p>johnDoe@softuni.org</p>
<p>Peter Smith</p>
<p>smith.peter@softuni.org</p>
<p>Taylor Baker</p>
<p>baker@gmail.com</p>
<p>stop</p></td>
<td><p>John -&gt; johnDoe@softuni.org</p>
<p>Peter Smith -&gt; smith.peter@softuni.org</p></td>
</tr>
<tr class="even">
<td><p>Peter Adamas</p>
<p>peter_adams@gmail.com</p>
<p>Anna Foster</p>
<p>foster.anna@yahoo.com</p>
<p>Duke Jenkins</p>
<p>jenkins.duke@softuni.org</p>
<p>stop</p></td>
<td>Duke Jenkins -&gt; jenkins.duke@softuni.org</td>
</tr>
</tbody>
</table>

## Hands Of Cards

You are given a sequence of people and what cards he draws from the deck
for every person. The input will be **separate** lines in the
**format**:

"**{personName}: {PT, PT, PT,… PT}**"

Where **P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)** is the **power** of
the card and **T (S, H, D, C)** is the **type**. The input ends when a
"**JOKER**" is drawn. The name can contain any ASCII symbol except
"**:**". The input will always be valid, and in the format described,
there is no need to check it.

A single person **cannot** <span class="underline"> </span> **have**
<span class="underline"> </span> **more** <span class="underline">
</span> **than** <span class="underline"> </span> **one** card with the
same power and type. If he draws such a card, he **discards** it. The
people are playing with **multiple** <span class="underline"> </span>
**decks**. Each card has a value that is **calculated** by the power
multiplied by the type. Powers **2 to 10** have the same value, and **J
to A** is **11 to 14**. Types are mapped to multipliers the following
way (**S -\> 4, H-\> 3, D -\> 2, C -\> 1**).

Finally, print out the **total** **value** **each** **player** has in
his hand in the format:

"**{personName}: {value}**"

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
<td><p>Peter: 2C, 4H, 9H, AS, QS</p>
<p>Slav: 3H, 10S, JC, KD, 5S, 10S</p>
<p>Alex: QH, QC, QS, QD</p>
<p>Slav: 6H, 7S, KC, KD, 5S, 10C</p>
<p>Alex: QH, QC, JS, JD, JC</p>
<p>Peter: JD, JD, JD, JD, JD, JD</p>
<p>JOKER</p></td>
<td><p>Peter: 167</p>
<p>Slav: 175</p>
<p>Alex: 197</p></td>
</tr>
<tr class="even">
<td><p>Jonathan Davis: JD, JD, JD, JD</p>
<p>JOKER</p></td>
<td>Jonathan Davis: 22</td>
</tr>
</tbody>
</table>

## \*User Logs

Marian is a famous system administrator. The person to overcome the
security of his servers has not yet been born. However, there is a new
type of threat where users flood the server with messages that are hard
to be detected since they change their IP address all the time. Well,
Marian is a system administrator and is not so into programming.
Therefore, he needs a skillful programmer to track the user logs of his
servers. You are the chosen one to help him\!

You are given an input in the format:

"**IP={IP.Address} message={A\&sample\&message} user={username}**"

Your task is to **parse** the **IP** and the **username** from the
input, and for **every user**, you have to display **every IP** from
which the corresponding user has sent a message and the **count of the
messages** sent with the corresponding IP. In the output, the usernames
must be **sorted alphabetically,** while their IP addresses should be
displayed in the **order of their first appearance.** The output should
be in the following format:

"**username:**

**{IP} =\> {count}, {IP} =\> {count}.**"

For example, given the following input - **IP=192.23.30.40
message='Hello\&derps.' user=destroyer**, you have to get the username
**destroyer** and the IP **192.23.30.40** and display it in the
following format:

"**destroyer:**

**192.23.30.40 =\> 1.** "

The username destroyer has sent a message from IP 192.23.30.40 once.

Check the examples below. They will further clarify the assignment.

### Input

The input comes from the console as a **varying number** of lines. You
have to parse every command until the command that follows is
"**end**"**.** The input will be in the format displayed above. There is
no need to check it explicitly.

### Output

For every user found, you have to display each log in the format:

The IP addresses must be split with a comma, and each line of IP
addresses must end with a dot.

### Constraints

  - The number of commands will be in the range **\[1..50\].**

  - The IP addresses will be in the format of either **IPv4** or
    **IPv6**
    
      - **Example: IPv4 -** 123.45.67.89 , **IPv6 -**
        2001:db8::ff00:42:8329

  - The messages will be in the format: **This\&is\&a\&message.**

  - The username will be a string with a length in the range
    **\[3..50\].**

  - > Time limit: **300ms**/**16MB.**

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
<td><p>IP=192.23.30.40 message='Hello&amp;derps.' user=destroyer</p>
<p>IP=192.23.30.41 message='Hello&amp;yall.' user=destroyer</p>
<p>IP=192.23.30.40 message='Hello&amp;hi.' user=destroyer</p>
<p>IP=192.23.30.42 message='Hello&amp;Dudes.' user=destroyer</p>
<p>end</p></td>
<td><p>destroyer:</p>
<p>192.23.30.40 =&gt; 2, 192.23.30.41 =&gt; 1, 192.23.30.42 =&gt; 1.</p></td>
</tr>
<tr class="even">
<td><p>IP=FE80:0000:0000:0000:0202:B3FF:FE1E:8329 message='Hey&amp;son' user=mother</p>
<p>IP=192.23.33.40 message='Hi&amp;mom!' user=child0</p>
<p>IP=192.23.30.40 message='Hi&amp;from&amp;me&amp;too' user=child1</p>
<p>IP=192.23.30.42 message='spam' user=destroyer</p>
<p>IP=192.23.30.42 message='spam' user=destroyer</p>
<p>IP=192.23.50.40 message='' user=yetAnotherUsername</p>
<p>IP=192.23.50.40 message='comment' user=yetAnotherUsername</p>
<p>IP=192.23.155.40 message='Hello.' user=unknown</p>
<p>end</p></td>
<td><p>child0:</p>
<p>192.23.33.40 =&gt; 1.</p>
<p>child1:</p>
<p>192.23.30.40 =&gt; 1.</p>
<p>destroyer:</p>
<p>192.23.30.42 =&gt; 2.</p>
<p>mother:</p>
<p>FE80:0000:0000:0000:0202:B3FF:FE1E:8329 =&gt; 1.</p>
<p>unknown:</p>
<p>192.23.155.40 =&gt; 1.</p>
<p>yetAnotherUsername:</p>
<p>192.23.50.40 =&gt; 2.</p></td>
</tr>
</tbody>
</table>

## \*Population Counter

So many people\! It's hard to count them all. But that's your job as a
statistician. You get raw data for a given city, and you need to
aggregate it.

On each input line, you'll be given data in the format:
"**city|country|population**". There will be **no redundant whitespaces
anywhere** in the input. Aggregate the data **by country and by city**
and print it on the console. **For** **each** country, print its **total
population** and on separate lines the data for each of its cities.
**Countries** should be ordered by **their total population in
descending order,** and within each country, the **cities** should be
ordered by **the same criterion**. If two countries/cities have the same
population, keep them in the **order** in which they were **entered.**
Check out the examples. Follow the output format strictly\!

### Input

  - The input data should be read from the console.

  - It consists of a variable number of lines and ends when the command
    "**report**" is received.

  - The input data will always be valid and in the format described.
    There is no need to check it explicitly.

### Output

  - The output should be printed on the console.

  - Print the aggregated data for each country and city in the format
    shown below.

### Constraints

  - The name of the city, country, and population count will be
    separated from each other by **a pipe (**"**|**"**)**.

  - The **number of input lines** will be in the range **\[2 … 50\]**.

  - A city-country pair will not be repeated.

  - The **population count** of each city will be an integer in the
    range **\[0 … 2 000 000 000\]**.

  - Time limit: **100ms/16MB**.

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
<td><p>Sofia|Bulgaria|1000000</p>
<p>report</p></td>
<td><p>Bulgaria (total population: 1000000)</p>
<p>=&gt;Sofia: 1000000</p></td>
</tr>
<tr class="even">
<td><p>Sofia|Bulgaria|1</p>
<p>Veliko Tarnovo|Bulgaria|2</p>
<p>London|UK|4</p>
<p>Rome|Italy|3</p>
<p>report</p></td>
<td><p>UK (total population: 4)</p>
<p>=&gt;London: 4</p>
<p>Bulgaria (total population: 3)</p>
<p>=&gt;Veliko Tarnovo: 2</p>
<p>=&gt;Sofia: 1</p>
<p>Italy (total population: 3)</p>
<p>=&gt;Rome: 3</p></td>
</tr>
</tbody>
</table>

## \*Logs Aggregator

You are given a sequence of access logs in format "**{IP} {user}
{duration}**". For example:

  - > 192.168.0.11 peter 33

  - > 10.10.17.33 alex 12

  - > 10.10.17.35 peter 30

  - > 10.10.17.34 peter 120

  - > 10.10.17.34 peter 120

  - > 212.50.118.81 alex 46

  - > 212.50.118.81 alex 4

Write a program to aggregate the logs data and print **for each user**
the **total duration** of his sessions and a **list of unique IP
addresses** in the format "**{user}: {duration} \[IP<sub>1</sub>,
IP<sub>2</sub>, ...\]**". Order the **users alphabetically**. Order the
**IPs alphabetically**. In our example, the output should be the
following:

  - > alex: 62 \[10.10.17.33, 212.50.118.81\]

  - > peter: 303 \[10.10.17.34, 10.10.17.35, 192.168.0.11\]

### Input

The input comes from the console. At the first line, a number **n**
stays, which says how many log lines will follow. Each of the next n
lines holds a log information in format "**{IP} {user} {duration}**".
The input data will always be **valid** and in the format described.
There is no need to check it explicitly.

### Output

Print **one line for each user** (order users alphabetically). For each
user print its sum of durations and all of his sessions' IPs, ordered
alphabetically in format "**{user}: {duration} \[{IP<sub>1</sub>},
{IP<sub>2</sub>}, ...\]**". Remove any duplicated values in the IP
addresses and order them alphabetically (like we order strings).

### Constraints

  - The **count** of the order lines **n** is in the range
    **\[1…1000\]**.

  - The **{IP}** is a standard IP address in format **a.b.c.d** where
    **a**, **b**, **c,** and **d** are integers in the range
    **\[0…255\]**.

  - The **{user}** consists of only of **Latin characters**, with a
    length of **\[1…20\]**.

  - The **{duration}** is an integer number in the range **\[1…1000\]**.

  - > Time limit: **300ms/16 MB**.

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
<td><p>7</p>
<p>192.168.0.11 peter 33</p>
<p>10.10.17.33 alex 12</p>
<p>10.10.17.35 peter 30</p>
<p>10.10.17.34 peter 120</p>
<p>10.10.17.34 peter 120</p>
<p>212.50.118.81 alex 46</p>
<p>212.50.118.81 alex 4</p></td>
<td><p>alex: 62 [10.10.17.33, 212.50.118.81]</p>
<p>peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]</p></td>
</tr>
<tr class="even">
<td><p>2</p>
<p>84.238.140.178 nakov 25</p>
<p>84.238.140.178 nakov 35</p></td>
<td>nakov: 60 [84.238.140.178]</td>
</tr>
</tbody>
</table>

## \*Legendary Farming

You've beaten all the content, and the last thing left to accomplish is
to own a legendary item. However, it's a tedious process and requires
quite a bit of farming. Anyway, you are not too pretentious – any
legendary will do. The possible items are:

  - **Shadowmourne** – requires **250 Shards**;

  - **Valanyr** – requires **250 Fragments**;

  - **Dragonwrath** – requires **250 Motes**;

**Shards, Fragments,** and **Motes** are the **key materials**, all else
is **junk.** You will be given lines of input, such as  
**2 motes 3 ores 15 stones.** Keep track of the **key materials -** the
**first** that reaches the **250 mark** **wins** the **race**. At that
point, print the corresponding legendary obtained. Then, print the
**remaining** shards, fragments, and motes, ordered by **quantity** in
**descending** order, each on a new line. Finally, print the collected
**junk** items in **alphabetical** order.

### Input

  - Each line of input is in format "**{quantity} {material} {quantity}
    {material} … {quantity} {material}**".

### Output

  - On the first line, print the obtained item in the format
    "**{Legendary item} obtained\!**".

  - On the next three lines, print the remaining key materials in
    descending order by quantity.
    
      - If two key materials have the same quantity, print them in
        alphabetical order.

  - On the final several lines, print the junk items in alphabetical
    order.
    
      - All materials are printed in format "**{material}:
        {quantity}**".
    
      - All output should be **lowercase**, except the first letter of
        the legendary.

### Constraints

  - The quantity-material pairs are between 1 and 25 per line.

  - The number of lines is in the range **\[1..10\].**

  - All materials are case-insensitive.

  - Allowed time: **250ms/16MB.**

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
<p>fragments: 5</p>
<p>shards: 5</p>
<p>motes: 3</p>
<p>leathers: 6</p>
<p>stones: 5</p></td>
</tr>
<tr class="even">
<td><p>123 silver 6 shards 8 shards 5 motes</p>
<p>9 fangs 75 motes 103 MOTES 8 Shards</p>
<p>86 Motes 7 stones 19 silver</p></td>
<td><p>Dragonwrath obtained!</p>
<p>shards: 22</p>
<p>motes: 19</p>
<p>fragments: 0</p>
<p>fangs: 9</p>
<p>silver: 123</p></td>
</tr>
</tbody>
</table>

## \*\*\*Сръбско Unleashed

Admit it – the СРЪБСКО is your favorite sort of music. You never miss a
concert, and you have become quite the geek concerning everything
involved with СРЪБСКО. You can't decide between all the singers you know
who your favorite one is. One way to find out is to keep a statistic of
how much money their concerts make. Write a program that does all the
boring calculations for you.

On each input line you’ll be given data in format: "**{singer} @{venue}
{ticketsPrice} {ticketsCount}**". There will be **no redundant
whitespaces anywhere** in the input. Aggregate the data **by venue and
by the singer**. For each venue, print the singer and the **total**
**amount** of money his/her concerts have made on a separate line.
**Venues** should be kept in the **same order** they were entered, the
**singers** should be **sorted by how much money** they have made in
**descending order**. If two singers have made the same amount of money,
keep them **in the order** in which **they were entered.**

Keep in mind that if a line is in **incorrect** **format**, it should be
**skipped,** and its data should not be added to the output. Each of the
four tokens must be separated by **a space**, everything else is
**invalid**. The venue should be denoted with **@** in front of it, such
as @Sunny Beach

**SKIP THOSE**: Ceca@Belgrade125 12378, Ceca @Belgrade12312 123

The singer and town name may consist of one to three words.

### Input

  - The input data should be read from the console.

  - It consists of a variable number of lines and ends when the command
    "**End**" is received.

  - The input data will always be valid and in the format described.
    There is no need to check it explicitly.

### Output

  - The output should be printed on the console.

  - Print the aggregated data for each venue and singer in the below
    format.

  - Format for singer lines is "**\# {singer} -\> {total money}**".

### Constraints

  - The **number of input lines** will be in the range **\[2 … 50\]**.

  - The **ticket price** will be an integer in the range **\[0 …
    200\]**.

  - The **ticket count** will be an integer in the range **\[0 … 100
    000\]**

  - **Singers** and **venues** are case-sensitive.

  - Allowed time: **100ms/16 MB.**

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
<td><p>Lepa Brena @Sunny Beach 25 3500</p>
<p>Dragana @Sunny Beach 23 3500</p>
<p>Ceca @Sunny Beach 28 3500</p>
<p>Mile Kitic @Sunny Beach 21 3500</p>
<p>Ceca @Sunny Beach 35 3500</p>
<p>Ceca @Sunny Beach 70 15000</p>
<p>Saban Saolic @Sunny Beach 120 35000</p>
<p>End</p></td>
<td><p>Sunny Beach</p>
<p># Saban Saolic -&gt; 4200000</p>
<p># Ceca -&gt; 1270500</p>
<p># Lepa Brena -&gt; 87500</p>
<p># Dragana -&gt; 80500</p>
<p># Mile Kitic -&gt; 73500</p></td>
</tr>
<tr class="even">
<td><p>Lepa Brena @Sunny Beach 25 3500</p>
<p>Dragana@Belgrade23 3500</p>
<p>Ceca @Sunny Beach 28 3500</p>
<p>Mile Kitic @Sunny Beach 21 3500</p>
<p>Ceca @Belgrade 35 3500</p>
<p>Ceca @Sunny Beach 70 15000</p>
<p>Saban Saolic @Sunny Beach 120 35000</p>
<p>End</p></td>
<td><p>Sunny Beach</p>
<p># Saban Saolic -&gt; 4200000</p>
<p># Ceca -&gt; 1148000</p>
<p># Lepa Brena -&gt; 87500</p>
<p># Mile Kitic -&gt; 73500</p>
<p>Belgrade</p>
<p># Ceca -&gt; 122500</p></td>
</tr>
</tbody>
</table>

## \*\*\*Dragon Army

Heroes III is the best game ever. Everyone loves it, and everyone plays
it all the time. John is not an exclusion from this rule. His favorite
units in the game are all **types** of dragons – black, red, gold,
azure, etc… He likes them so much that he gives them **names** and keeps
logs of their **stats**: **damage, health,** and **armor**. The process
of aggregating all the data is quite tedious, so he would like to have a
program doing it. Since he is no programmer, it's your task to help him

You need to categorize dragons by their **type**. For each dragon,
identified by **name,** keep information about his **stats.** Type is
**preserved** as in the input order, but dragons are **sorted**
alphabetically by name. For each type, you should also print the average
**damage**, **health,** and **armor** of the dragons. For each dragon,
print his stats.

There **may** be **missing** stats in the input, though. If a stat is
missing, you should assign its default values. Default values are as
follows: **health - 250**, **damage - 45**, and **armor - 10**. Missing
stat will be marked by **null**.

The input is in the following format "**{type} {name} {damage} {health}
{armor}**"**.** Any of the integers may be assigned a null value. See
the examples below for a better understanding of your task.

If the same dragon is added a second time, the new stats should
**overwrite** the previous ones. Two dragons are considered **equal** if
they match by **both** name and type.

### Input

  - On the first line, you are given the number N -\> the number of
    dragons to follow.

  - On the next N lines, you are given input in the above-described
    format. There will be a single space separating each element.

### Output

  - Print the aggregated data on the console.

  - For each type, print average stats of its dragons in format
    "**{Type}::({damage}/{health}/{armor})**".

  - Damage, health, and armor should be rounded to two digits after the
    decimal separator.

  - For each dragon, print its stats in format "**-{Name} -\> damage:
    {damage}, health: {health}, armor: {armor}**".

### Constraints

  - N is in the range **\[1…100\].**

  - The dragon type and name are one word only, starting with a capital
    letter.

  - Damage health and armor are integers in the range **\[0 … 100000\]**
    or **null.**

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
<p>Red Bazgargal 100 2500 25</p>
<p>Black Dargonax 200 3500 18</p>
<p>Red Obsidion 220 2200 35</p>
<p>Blue Kerizsa 60 2100 20</p>
<p>Blue Algordox 65 1800 50</p></td>
<td><p>Red::(160.00/2350.00/30.00)</p>
<p>-Bazgargal -&gt; damage: 100, health: 2500, armor: 25</p>
<p>-Obsidion -&gt; damage: 220, health: 2200, armor: 35</p>
<p>Black::(200.00/3500.00/18.00)</p>
<p>-Dargonax -&gt; damage: 200, health: 3500, armor: 18</p>
<p>Blue::(62.50/1950.00/35.00)</p>
<p>-Algordox -&gt; damage: 65, health: 1800, armor: 50</p>
<p>-Kerizsa -&gt; damage: 60, health: 2100, armor: 20</p></td>
</tr>
<tr class="even">
<td><p>4</p>
<p>Gold Zzazx null 1000 10</p>
<p>Gold Traxx 500 null 0</p>
<p>Gold Xaarxx 250 1000 null</p>
<p>Gold Ardrax 100 1055 50</p></td>
<td><p>Gold::(223.75/826.25/17.50)</p>
<p>-Ardrax -&gt; damage: 100, health: 1055, armor: 50</p>
<p>-Traxx -&gt; damage: 500, health: 250, armor: 0</p>
<p>-Xaarxx -&gt; damage: 250, health: 1000, armor: 10</p>
<p>-Zzazx -&gt; damage: 45, health: 1000, armor: 10</p></td>
</tr>
</tbody>
</table>

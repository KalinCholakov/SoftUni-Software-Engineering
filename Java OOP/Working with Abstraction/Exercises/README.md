# Exercises: Working with Abstraction

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.bg/Contests/1576/Working-with-Abstraction-Exercise).

## Card Suit

Create an **enumeration type** that has as its constants the **four
suits** of a deck of playing cards (CLUBS, DIAMONDS, HEARTS, SPADES).
Iterate over the values of the enumeration type and print all **ordinal
values** and **names**.

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
<td><strong>Card Suits</strong></td>
<td><p><strong>Card Suits:</strong></p>
<p><strong>Ordinal value: 0; Name value: CLUBS</strong></p>
<p><strong>Ordinal value: 1; Name value: DIAMONDS</strong></p>
<p><strong>Ordinal value: 2; Name value: HEARTS</strong></p>
<p><strong>Ordinal value: 3; Name value: SPADES</strong></p></td>
</tr>
</tbody>
</table>

## Card Rank

Create an **enumeration type** that has as its constants the **thirteen
ranks** of a deck of playing cards (ACE, TWO, THREE, FOUR, FIVE, SIX,
SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING). Iterate over the values of
the enumeration type and print all ordinal values and names.

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
<td><strong>Card Ranks</strong></td>
<td><p><strong>Card Ranks:</strong></p>
<p><strong>Ordinal value: 0; Name value: ACE</strong></p>
<p><strong>Ordinal value: 1; Name value: TWO</strong></p>
<p><strong>Ordinal value: 2; Name value: THREE</strong></p>
<p><strong>Ordinal value: 3; Name value: FOUR</strong></p>
<p><strong>Ordinal value: 4; Name value: FIVE</strong></p>
<p><strong>Ordinal value: 5; Name value: SIX</strong></p>
<p><strong>Ordinal value: 6; Name value: SEVEN</strong></p>
<p><strong>Ordinal value: 7; Name value: EIGHT</strong></p>
<p><strong>Ordinal value: 8; Name value: NINE</strong></p>
<p><strong>Ordinal value: 9; Name value: TEN</strong></p>
<p><strong>Ordinal value: 10; Name value: JACK</strong></p>
<p><strong>Ordinal value: 11; Name value: QUEEN</strong></p>
<p><strong>Ordinal value: 12; Name value: KING</strong></p></td>
</tr>
</tbody>
</table>

## Cards with Power

Create a program that generates a **deck of cards (class Card)** that
have power. The power of a card is calculated by **adding** the power of
its rank plus the power of its suit.

**Rank powers** are as follows: (ACE - 14, TWO - 2, THREE - 3, FOUR - 4,
FIVE - 5, SIX - 6, SEVEN - 7, EIGHT - 8, NINE - 9, TEN - 10, JACK - 11,
QUEEN - 12, KING - 13).

**Suit powers** are as follows: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26,
SPADES - 39).

You will get a command consisting of **two** lines. On the **first**
line, you will receive the Rank of the card and on the **second** line,
you will get the suit of the card.

Print the output in the **format:** "**Card name: {card name} of {suit
name}; Card power: {power of rank + power of suit}**".

### Note

Try using the enumeration types you have created in the previous
problems but extending them with constructors and methods. Try using the
**Enum.valueOf().**

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
<td><p><strong>TWO</strong></p>
<p><strong>CLUBS</strong></p></td>
<td><strong>Card name: TWO of CLUBS; Card power: 2</strong></td>
</tr>
<tr class="even">
<td><p><strong>ACE</strong></p>
<p><strong>SPADES</strong></p></td>
<td><strong>Card name: ACE of SPADES; Card power: 53</strong></td>
</tr>
</tbody>
</table>

## Traffic Lights

Implement a simple state machine in the form of a traffic light. Every
traffic light has **three** possible signals - **red**, **green,** and
**yellow**. Each traffic light can be **updated**, which changes the
color of its signal (e.g. if it is currently red, it changes to green,
if it is green it changes to yellow). The order of signals is **red -\>
green -\> yellow -\> red** and so on.

On the first line, you will be given multiple traffic light signals in
the **format** "**RED GREEN YELLOW**". They may be 3, **more,** or
**less** than 3. You need to make as many traffic lights as there are
signals in the input.

On the second line, you will receive the **n** number of times you need
to change each traffic light's signal.

Your output should consist of **n** number of lines, including **each**
updated traffic light's signal. To better understand the problem, see
the example below.

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
<td><p><strong>GREEN RED YELLOW</strong></p>
<p><strong>4</strong></p></td>
<td><p>YELLOW GREEN RED</p>
<p>RED YELLOW GREEN</p>
<p>GREEN RED YELLOW</p>
<p>YELLOW GREEN RED</p></td>
</tr>
<tr class="even">
<td><p><strong>RED RED RED GREEN GREEN GREEN</strong></p>
<p><strong>6</strong></p></td>
<td><p>GREEN GREEN GREEN YELLOW YELLOW YELLOW</p>
<p>YELLOW YELLOW YELLOW RED RED RED</p>
<p>RED RED RED GREEN GREEN GREEN</p>
<p>GREEN GREEN GREEN YELLOW YELLOW YELLOW</p>
<p>YELLOW YELLOW YELLOW RED RED RED</p>
<p>RED RED RED GREEN GREEN GREEN</p></td>
</tr>
</tbody>
</table>

# Exercises: Working with Abstraction

In this section, your job is to download the [source
code](https://softuni.bg/downloads/svn/java-fundamentals/2019-May/Java-OOP/01.%20Java-OOP-Working-with-Abstraction/01.%20Java-OOP-Working-with-Abstraction-Exercise-Resources.zip)
for every problem and **refactor** it.

## Jedi Galaxy

Peter is Jedi and so he starts gathering stars to grow stronger.

His galaxy is represented as a two-dimensional array. Every cell in the
matrix is a star that has a **value**. Peter starts at the given **col**
and **row**. He can move only on the diagonal **from the lowest left to
the upper right** and **adds** to his score all the stars (values) from
the cells he **passes through**. Unfortunately, there is always an Evil
power that tries to prevent his success.

Evil power starts at the given **row** and **col** and instantly
destroys all-stars on the opposite diagonal – **From the lowest right to
the upper left.**

Peter **adds** the values only of the stars that are **not**
**destroyed** by the evil power.

You will receive **two** integers, separated by space, which represent
the two-dimensional array - the first being the rows and the second
being the columns. Then, you must fill the two-dimensional array with
increasing integers starting from 0, and continuing on every row, like
this:  
**first row: 0, 1, 2… m  
second row: n+1, n+2, n+3… n + n.**

**Example:**

![](media/image1.png)Peter starts with coordinates row = 5, col = -1. He
must collect all stars with value \[20, 16, 12, 8, 4\]. Evil starts with
coordinates row = 5, col = 5. Evil destroys all-stars in the range \[24,
18, 12, 6, 0\]. The star with a value of **12** is the cross point for
Peter and The Evil, so Peter skips the stars and collects only those who
are not in the evil range.

![](media/image2.png)You will also receive multiple pairs of commands in
the form of 2 integers separated by a single space. The first two
integers will represent Peter’s start coordinates. The second one will
represent the Evil Power’s start coordinates.

The input ends when you receive the command "**Let the Force be with
you**". When that happens, you must print the value of all-stars that
Peter has collected successfully.

### Input

  - > On the first line, you will receive the number **N**, **M** -\>
    > the dimensions of the matrix. You must then fill the matrix
    > according to these dimensions.

  - > On the next several lines you will begin receiving **2** integers
    > separated by a single **space**, which represent Peter’s **row**
    > and **col**. On the next line, you will receive the Evil Power’s
    > **coordinates**.

  - > There will always be **at least 2 lines** of input to represent at
    > least 1 path of Peter and the Evil force.

  - > When you receive the command, "**Let the Force be with you**" the
    > input ends.

### Output

> • The output is simple. Print the sum of the values from all-stars
> that Peter has collected.

### Constraints

  - > The dimensions of the matrix will be **integers** in the **range**
    > **\[5, 2000\].**

  - > The given rows will be valid **integers** in the **range \[0,
    > 2000\].**

  - > The given columns will be valid **integers** in **the range
    > \[-2<sup>31</sup> + 1, 2<sup>31</sup> - 1\].**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>5 5</strong></p>
<p><strong>5 -1</strong></p>
<p><strong>5 5</strong></p>
<p><strong>Let the Force be with you</strong></p></td>
<td><strong>48</strong></td>
</tr>
<tr class="even">
<td><p><strong>5 5</strong></p>
<p><strong>4 -1</strong></p>
<p><strong>4 5</strong></p>
<p><strong>Let the Force be with you</strong></p></td>
<td><strong>29</strong></td>
</tr>
</tbody>
</table>

## Greedy Times

Finally, you have unlocked the safe and reached the treasure\! Inside
there are all kinds of gems, cash in different currencies, and gold
bullions. Next to you, there is a bag which unfortunately has limited
space. You don’t have much time so you need to take as much wealth as
possible\! But to get a bigger amount of the most valuable items, you
need to keep the following rules:

  - > The **gold amount** in your bag should **always** **be** **more**
    > than **or equal** to the **gem** **amount** at **any** time

  - > The **gem amount** should **always** **be** **more** than **or**
    > **equal** to the **cash** **amount** at **any** time

If you read an **item** that **breaks** one of **these rules** you
**should not put** it in the **bag**. You should **always** be careful
**not** to **exceed** the overall **bag’s capacity** because it will
tear down and you will **lose** everything\! You will receive the
**content** **of** the **safe** on a **single line** in the **format**
"**{item} {quantity}**" pairs, separated by **whitespace**. You need to
gather **only** **three** **types** of items:

  - Cash - All **three letter** items

  - Gem - All **items** which **end** on "**Gem**" (at least 4 symbols)

  - Gold - this type has **only one item** with the name - "**Gold**"

Each **item** that **does not** fall **in** one of the **above
categories** is **useless** and you should **skip it**. Reading item’s
**names** should be **CASE-INSENSITIVE, except** when the **item is**
**Cash**. You should **aggregate** **items’ quantities** that have the
**same** **name**.

If you’ve kept the rules you should escape successfully with a bag full
of wealth. Now it’s time to review what you have managed to get out of
the safe. **Print all** the **types** ordered by the **total amount** in
**descending order**. Inside a type, **order** the **items** first
**alphabetically** in **descending** order and **then by** their
**amount** in **ascending** order. Use the format described below for
each type.

### Input

  - On the **first line**, you will receive a **number** that represents
    the **capacity** of the **bag.**

  - On the **second line**, you will receive a **sequence** of **item
    and quantity** pairs.

### Output

Print **only** the **types** from which you **have items in the bag**
ordered by **Total Amount** **descending**. Inside a type order, the
**items** are **first** **alphabetically** in **descending** order and
**then** by an **amount** in **ascending** **order**. Use the following
format for each type:

**"\<{type}\> ${total amount}"**

**"\#\#{item} - {amount}"** - each item on new line

### Constraints

  - Bag’s **max capacity** will **always** be a **positive number.**

  - All **quantities** will be **positive** **integer** in the **range
    \[0 … 2100000000\].**

  - Each item of type **gem** will have a **name** - **at** **least 4**
    symbols.

  - Time limit: 0.1 sec. Memory limit: 16 MB.

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
<td><p><strong>150</strong></p>
<p><strong>Gold 28 Rubygem 16 USD 9 GBP 8</strong></p></td>
<td><p><strong>&lt;Gold&gt; $28</strong></p>
<p><strong>##Gold - 28</strong></p>
<p><strong>&lt;Gem&gt; $16</strong></p>
<p><strong>##Rubygem - 16</strong></p>
<p><strong>&lt;Cash&gt; $9</strong></p>
<p><strong>##USD - 9</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>24000010</strong></p>
<p><strong>USD 1030 Gold 300000 EmeraldGem 900000 Topazgem 290000 CHF 280000 Gold 10000000 JPN 10000 Rubygem 10000000 KLM 3120010</strong></p></td>
<td><p><strong>&lt;Gold&gt; $10300000</strong></p>
<p><strong>##Gold - 10300000</strong></p>
<p><strong>&lt;Gem&gt; $10290000</strong></p>
<p><strong>##Topazgem - 290000</strong></p>
<p><strong>##Rubygem - 10000000</strong></p>
<p><strong>&lt;Cash&gt; $3410010</strong></p>
<p><strong>##KLM - 3120010</strong></p>
<p><strong>##JPN - 10000</strong></p>
<p><strong>##CHF - 280000</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>80345</strong></p>
<p><strong>RubyGem 70000 JAV 10960 Bau 60000 Gold 80000</strong></p></td>
<td><p><strong>&lt;Gold&gt; $80000</strong></p>
<p><strong>##Gold - 80000</strong></p></td>
</tr>
</tbody>
</table>

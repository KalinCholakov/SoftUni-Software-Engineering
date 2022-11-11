# Exercises: Reflection

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.bg/Contests/1605/Reflection-Exercises).

## Harvesting Fields

You are given a **RichSoilLand** class with lots of fields (look at the
provided skeleton). Like the good farmer you are, you must harvest them.
Harvesting means that you must print each **field** in a certain format
(see output).

### Input

You will receive a maximum of 100 lines with one of the following
commands:

  - **private -** print all private fields

  - **protected** - print all protected fields

  - **public** - print all public fields

  - **all** - print ALL declared fields

  - **HARVEST** - end the input

### Output

For each command, you must print the **fields** that have the **given
access modifier** as described in the input section. The format in which
the fields should be printed is:

"**{access modifier} {field type} {field name}**"

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
<td><p><strong>protected</strong></p>
<p><strong>HARVEST</strong></p></td>
<td><p><strong>protected String testString</strong></p>
<p><strong>protected double aDouble</strong></p>
<p><strong>protected byte testByte</strong></p>
<p><strong>protected StringBuilder aBuffer</strong></p>
<p><strong>protected BigInteger testBigNumber</strong></p>
<p><strong>protected float testFloat</strong></p>
<p><strong>protected Object testPredicate</strong></p>
<p><strong>protected Object fatherMotherObject</strong></p>
<p><strong>protected String moarString</strong></p>
<p><strong>protected Exception inheritableException</strong></p>
<p><strong>protected Stream moarStreamz</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>private</strong></p>
<p><strong>public</strong></p>
<p><strong>private</strong></p>
<p><strong>HARVEST</strong></p></td>
<td><p><strong>private int testInt</strong></p>
<p><strong>private long testLong</strong></p>
<p><strong>private Calendar aCalendar</strong></p>
<p><strong>private char testChar</strong></p>
<p><strong>private BigInteger testBigInt</strong></p>
<p><strong>private Thread aThread</strong></p>
<p><strong>private Object aPredicate</strong></p>
<p><strong>private Object hiddenObject</strong></p>
<p><strong>private String anotherString</strong></p>
<p><strong>private Exception internalException</strong></p>
<p><strong>private Stream secretStream</strong></p>
<p><strong>public double testDouble</strong></p>
<p><strong>public String aString</strong></p>
<p><strong>public StringBuilder aBuilder</strong></p>
<p><strong>public short testShort</strong></p>
<p><strong>public byte aByte</strong></p>
<p><strong>public float aFloat</strong></p>
<p><strong>public Thread testThread</strong></p>
<p><strong>public Object anObject</strong></p>
<p><strong>public int anotherIntBitesTheDust</strong></p>
<p><strong>public Exception justException</strong></p>
<p><strong>public Stream aStream</strong></p>
<p><strong>private int testInt</strong></p>
<p><strong>private long testLong</strong></p>
<p><strong>private Calendar aCalendar</strong></p>
<p><strong>private char testChar</strong></p>
<p><strong>private BigInteger testBigInt</strong></p>
<p><strong>private Thread aThread</strong></p>
<p><strong>private Object aPredicate</strong></p>
<p><strong>private Object hiddenObject</strong></p>
<p><strong>private String anotherString</strong></p>
<p><strong>private Exception internalException</strong></p>
<p><strong>private Stream secretStream</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>all</strong></p>
<p><strong>HARVEST</strong></p></td>
<td><p><strong>private int testInt</strong></p>
<p><strong>public double testDouble</strong></p>
<p><strong>protected String testString</strong></p>
<p><strong>private long testLong</strong></p>
<p><strong>protected double aDouble</strong></p>
<p><strong>public String aString</strong></p>
<p><strong>private Calendar aCalendar</strong></p>
<p><strong>public StringBuilder aBuilder</strong></p>
<p><strong>private char testChar</strong></p>
<p><strong>public short testShort</strong></p>
<p><strong>protected byte testByte</strong></p>
<p><strong>public byte aByte</strong></p>
<p><strong>protected StringBuilder aBuffer</strong></p>
<p><strong>private BigInteger testBigInt</strong></p>
<p><strong>protected BigInteger testBigNumber</strong></p>
<p><strong>protected float testFloat</strong></p>
<p><strong>public float aFloat</strong></p>
<p><strong>private Thread aThread</strong></p>
<p><strong>public Thread testThread</strong></p>
<p><strong>private Object aPredicate</strong></p>
<p><strong>protected Object testPredicate</strong></p>
<p><strong>public Object anObject</strong></p>
<p><strong>private Object hiddenObject</strong></p>
<p><strong>protected Object fatherMotherObject</strong></p>
<p><strong>private String anotherString</strong></p>
<p><strong>protected String moarString</strong></p>
<p><strong>public int anotherIntBitesTheDust</strong></p>
<p><strong>private Exception internalException</strong></p>
<p><strong>protected Exception inheritableException</strong></p>
<p><strong>public Exception justException</strong></p>
<p><strong>public Stream aStream</strong></p>
<p><strong>protected Stream moarStreamz</strong></p>
<p><strong>private Stream secretStream</strong></p></td>
</tr>
</tbody>
</table>

## Black Box Integer

You are helping a buddy of yours who is still in the OOP Basics course -
his name is John. He is rather slow and made a class with all private
members. Your tasks are to **instantiate** an object from his class
(always with start value 0) and then **invoke** the different methods it
has. Your restriction is to **not** change anything in the class itself
(consider it a black box). You can look at his class but don't touch
anything\! The class itself is called **BlackBoxInt.** It is a wrapper
for the **int** primitive. The methods it has are:

![](media/image1.png)

### Input

The input will consist of lines in the form:

**"{command name}\_{value}"**

Input will always be valid and in the format described, so there is no
need to check it explicitly. You stop receiving input when you encounter
the command "**END**".

### Output

Each command (except the **"END"** one) should print the current value
of **innerValue** of the **BlackBoxInt** object you instantiated.
**Don't cheat** by overriding **toString** in the class - you must get
the value from the **private** field.

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
<td><p><strong>add_999999</strong></p>
<p><strong>subtract_19</strong></p>
<p><strong>divide_4</strong></p>
<p><strong>multiply_2</strong></p>
<p><strong>rightShift_1</strong></p>
<p><strong>leftShift_3</strong></p>
<p><strong>END</strong></p></td>
<td><p>999999</p>
<p>999980</p>
<p>249995</p>
<p>499990</p>
<p>249995</p>
<p>1999960</p></td>
</tr>
<tr class="even">
<td><p><strong>subtract_3000</strong></p>
<p><strong>add_556677</strong></p>
<p><strong>add_889915</strong></p>
<p><strong>rightShift_3</strong></p>
<p><strong>leftShift_3</strong></p>
<p><strong>END</strong></p></td>
<td><p>-3000</p>
<p>553677</p>
<p>1443592</p>
<p>180449</p>
<p>1443592</p></td>
</tr>
</tbody>
</table>

## BarracksWars – A New Factory

You are given a small console-based project called Barracks (the code
for it is included in the provided skeleton).

The general functionality of the project is adding new units to its
repository and printing a report with statistics about the units
currently in the repository. First, let's go over the original task
before the project was created:

### Input

The input consists of commands each on a separate line. Commands that
execute the functionality are:

  - **add {Archer/Swordsman/Pikeman/{…}}** - adds a unit to the
    repository

  - **report** - prints a lexicological ordered statistic about the
    units in the repository

  - **fight** - ends the input

### Output

Each command except **fight** should print output on the console.

  - **add** should print: "**{Archer/Swordsman/Pikeman/{…}} added\!**"

  - **report** should print all the info in the repository in the
    format: "**{UnitType} -\> {UnitQuantity}**", sorted by UnitType

### Constraints

  - Input will consist of no more than **1000** lines.

  - **report** command will never be given before any valid add command
    was provided.

**Your Task**

**1)** You have to **study the code of the project and figure out how it
works**. However, there are parts of it that are not implemented (left
with TODOs (**TODO** window will be useful)). You must implement the
functionality of the **createUnit** method in the **UnitFactoryImpl**
class so that it creates a unit based on the unit type received as a
parameter. Implement it in such a way that whenever you add a new unit
it will be creatable without the need to change anything in the
**UnitFactoryImpl** class (psst - use reflection). You can use the
approach called **Simple Factory**.

**2)** Add two new unit classes (there will be tests that require them)
- **Horseman** with 50 health and 10 attacks and **Gunner** with 20
health and 20 attacks.

If you do everything correctly for this problem, you should write code
only in the **factories** and **units** packages.

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
<td><p><strong>add Swordsman</strong></p>
<p><strong>add Archer</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>report</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>report</strong></p>
<p><strong>fight</strong></p></td>
<td><p>Swordsman added!</p>
<p>Archer added!</p>
<p>Pikeman added!</p>
<p>Archer -&gt; 1</p>
<p>Pikeman -&gt; 1</p>
<p>Swordsman -&gt; 1</p>
<p>Pikeman added!</p>
<p>Pikeman added!</p>
<p>Archer -&gt; 1</p>
<p>Pikeman -&gt; 3</p>
<p>Swordsman -&gt; 1</p></td>
</tr>
<tr class="even">
<td><p><strong>add Pikeman</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Horseman</strong></p>
<p><strong>add Archer</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Horseman</strong></p>
<p><strong>report</strong></p>
<p><strong>fight</strong></p></td>
<td><p>Pikeman added!</p>
<p>Pikeman added!</p>
<p>Gunner added!</p>
<p>Horseman added!</p>
<p>Archer added!</p>
<p>Gunner added!</p>
<p>Gunner added!</p>
<p>Horseman added!</p>
<p>Archer -&gt; 1</p>
<p>Gunner -&gt; 3</p>
<p>Horseman -&gt; 2</p>
<p>Pikeman -&gt; 2</p></td>
</tr>
</tbody>
</table>

## BarracksWars – the Commands Strike Back

As you might have noticed commands in the project from **Problem 3** are
implemented via a switch case with method calls in the **Engine** class.
Although this approach works it is flawed when you add a new command
because you have to add a new case for it. In some projects, you might
not have access to the engine and this would not work. Imagine this
project will be outsourced and the outsourcing firm will not have access
to the engine. Make it so whenever they want to add a new command they
won't have to change anything in the **Engine.**

To do so employ the design pattern called [**Command
Pattern**](https://www.baeldung.com/java-command-pattern). Here is how
the base (abstract) command should look like:

![](media/image2.png)

Notice how all commands that extend this one will have both a
**Repository** and a **UnitFactory** although not all of them need
these. Leave it like this for this problem, because for the reflection
to work we need all constructors to accept the same parameters. We will
see how to go around this issue in **Problem 5**.

Once you've implemented the pattern add a new command. It will have the
following syntax:

  - **retire** **{UnitType}** - All it has to do is **remove** a unit of
    the provided type from the repository.
    
      - If there are no such units currently in the repository print:
        "**No such units in** **repository.**"
    
      - If there is such a unit currently in the repository, print:
        "**{UnitType} retired\!**"

To implement this command, you will also have to implement a
corresponding method in the **UnitRepository**.

If you do everything correctly for this problem, you should
write/refactor code only in the **core** and **data** packages.

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
<td><p><strong>retire Archer</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Horseman</strong></p>
<p><strong>add Archer</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Horseman</strong></p>
<p><strong>report</strong></p>
<p><strong>retire Gunner</strong></p>
<p><strong>retire Archer</strong></p>
<p><strong>report</strong></p>
<p><strong>retire Swordsman</strong></p>
<p><strong>retire Archer</strong></p>
<p><strong>fight</strong></p></td>
<td><p>No such units in repository.</p>
<p>Pikeman added!</p>
<p>Pikeman added!</p>
<p>Gunner added!</p>
<p>Horseman added!</p>
<p>Archer added!</p>
<p>Gunner added!</p>
<p>Gunner added!</p>
<p>Horseman added!</p>
<p>Archer -&gt; 1</p>
<p>Gunner -&gt; 3</p>
<p>Horseman -&gt; 2</p>
<p>Pikeman -&gt; 2</p>
<p>Gunner retired!</p>
<p>Archer retired!</p>
<p>Archer -&gt; 0</p>
<p>Gunner -&gt; 2</p>
<p>Horseman -&gt; 2</p>
<p>Pikeman -&gt; 2</p>
<p>No such units in repository.</p>
<p>No such units in repository.</p></td>
</tr>
<tr class="even">
<td><p><strong>add Pikeman</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Horseman</strong></p>
<p><strong>report</strong></p>
<p><strong>add Gunner</strong></p>
<p><strong>add Pikeman</strong></p>
<p><strong>retire Pikeman</strong></p>
<p><strong>retire Gunner</strong></p>
<p><strong>report</strong></p>
<p><strong>fight</strong></p></td>
<td><p>Pikeman added!</p>
<p>Gunner added!</p>
<p>Horseman added!</p>
<p>Gunner -&gt; 1</p>
<p>Horseman -&gt; 1</p>
<p>Pikeman -&gt; 1</p>
<p>Gunner added!</p>
<p>Pikeman added!</p>
<p>Pikeman retired!</p>
<p>Gunner retired!</p>
<p>Gunner -&gt; 1</p>
<p>Horseman -&gt; 1</p>
<p>Pikeman -&gt; 1</p></td>
</tr>
</tbody>
</table>

## \* BarracksWars – Return of the Dependencies

In the final part of this epic problem trilogy, we will resolve the
issue where all Commands received all utility classes as parameters in
their constructors. We can accomplish this by using an approach called
**dependency injection container**. This approach is used in many
frameworks like **Spring** for instance.

We will do a little twist on that approach. Remove all fields from the
abstract command except the **data.** Instead, put whatever fields each
command needs in the concrete class. Create an annotation called
**Inject** and make it so it can be used only on fields. Put the
annotation over the fields we need to set through reflection. Once
you've prepared all of this, write the necessary reflection code in the
**Command Interpreter** (which you should have refactored out from the
engine in **Problem 4**).

Use the tests from Problem 4 to test your solution.

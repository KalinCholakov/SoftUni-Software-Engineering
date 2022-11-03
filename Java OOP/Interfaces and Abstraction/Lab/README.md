# Lab: **Interfaces and Abstraction**

This document defines the **lab** for the ["Java Advanced" course @
Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) to all below-described
problems in
[Judge](https://judge.softuni.bg/Contests/1581/Interfaces-and-Abstraction-Lab).

## Car Shop

Build hierarchy from **classes** and **interfaces** for this UML
diagram:

<table>
<thead>
<tr class="header">
<th><p>&lt;&lt;inteface&gt;&gt;</p>
<p>&lt;&lt;Car&gt;&gt;</p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>+TIRES: Integer</strong></td>
</tr>
<tr class="even">
<td><p><strong>+getModel(): String</strong></p>
<p><strong>+getColor(): String</strong></p>
<p><strong>+getHorsePower(): Integer</strong></p>
<p><strong>+countryProduced(): String</strong></p></td>
</tr>
</tbody>
</table>

|                          |
| ------------------------ |
| **\<\<Serializable\>\>** |

| Seat                    |
| ----------------------- |
| **+toString(): String** |

Your hierarchy has to be used with this code.

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>public static void</strong> main(String[] args) {<br />
Car seat = <strong>new</strong> Seat(<strong>"Leon"</strong>, <strong>"gray"</strong>, 110, <strong>"Spain"</strong>);<br />
<br />
System.<em><strong>out</strong></em>.println(String.<em>format</em>(<br />
<strong>"%s is %s color and have %s horse power"</strong>,<br />
seat.getModel(),<br />
seat.getColor(),<br />
seat.getHorsePower()));<br />
System.<em><strong>out</strong></em>.println(seat.toString());<br />
}</td>
</tr>
</tbody>
</table>

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
<td></td>
<td><p><strong>Leon is gray color and have 110 horse power</strong></p>
<p><strong>This is Leon produced in Spain and have 4 tires</strong></p></td>
</tr>
</tbody>
</table>

### Solution

![](media/image1.png)

**Note:** consider using the wrapper classes in the **Seat**
constructor**.**

## Car Shop Extend

|                 |
| --------------- |
| **\<\<Car\>\>** |

Extend the previous problem:

<table>
<thead>
<tr class="header">
<th>CarImpl</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+CarImpl(model, color, horsePower, countryProduced)</strong></p>
<p><strong>+toString(): String</strong></p></td>
</tr>
</tbody>
</table>

<table>
<thead>
<tr class="header">
<th>&lt;&lt;Rentable&gt;&gt;</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+getMinRentDay(): Integer</strong></p>
<p><strong>+getPricePerDay(): Double</strong></p></td>
</tr>
</tbody>
</table>

| \<\<Sellable\>\>        |
| ----------------------- |
| **+getPrice(): Double** |

| Seat                    |
| ----------------------- |
| **-price: Double**      |
| **+toString(): String** |

<table>
<thead>
<tr class="header">
<th>Audi</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>-minRentDay: Integer</strong></p>
<p><strong>-pricePerDay: Double</strong></p></td>
</tr>
<tr class="even">
<td><strong>+toString(): String</strong></td>
</tr>
</tbody>
</table>

Your hierarchy has to be used with this code:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>public static void</strong> main(String[] args) {<br />
Sellable seat = <strong>new</strong> Seat(<strong>"Leon"</strong>, <strong>"Gray"</strong>, 110, <strong>"Spain"</strong>, 11111.1);<br />
Rentable audi = <strong>new</strong> Audi(<strong>"A4"</strong>, <strong>"Gray"</strong>, 110, <strong>"Germany"</strong>, 3, 99.9);<br />
<br />
<em>printCarInfo</em>(seat);<br />
<em>printCarInfo</em>(audi);<br />
}<br />
<br />
<strong>private static void</strong> printCarInfo(Car car) {<br />
System.<em><strong>out</strong></em>.println(String.<em>format</em>(<br />
<strong>"%s is %s color and have %s horse power"</strong>,<br />
car.getModel(),<br />
car.getColor(),<br />
car.getHorsePower()));<br />
System.<em><strong>out</strong></em>.println(car.toString());<br />
}</td>
</tr>
</tbody>
</table>

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
<td></td>
<td><p><strong>Leon is Gray color and have 110 horse power</strong></p>
<p><strong>This is Leon produced in Spain and have 4 tires</strong></p>
<p><strong>Leon sells for 11111,100000</strong></p>
<p><strong>A4 is Gray color and have 110 horse power</strong></p>
<p><strong>This is A4 produced in Germany and have 4 tires</strong></p>
<p><strong>Minimum rental period of 3 days. Price per day 99,900000</strong></p></td>
</tr>
</tbody>
</table>

## Say Hello

Build hierarchy from classes and interfaces for this **UML** diagram:

<table>
<thead>
<tr class="header">
<th>&lt;&lt;Person&gt;&gt;</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+getName(): String</strong></p>
<p><strong>+sayHello(): String</strong></p></td>
</tr>
</tbody>
</table>

| Chinese                 |
| ----------------------- |
| **-name: String**       |
| **+sayHello(): String** |

| Bulgarian               |
| ----------------------- |
| **-name: String**       |
| **+sayHello(): String** |

| European          |
| ----------------- |
| **-name: String** |
|                   |

Your hierarchy has to be used with this code:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>public static void</strong> main(String[] args) {<br />
List&lt;Person&gt; persons = <strong>new</strong> ArrayList&lt;&gt;();</p>
<p>persons.add(<strong>new</strong> Bulgarian(<strong>"Peter"</strong>));<br />
persons.add(<strong>new</strong> European(<strong>"Peter"</strong>));<br />
persons.add(<strong>new</strong> Chinese(<strong>"Peter"</strong>));<br />
<br />
<strong>for</strong> (Person person : persons) {<br />
<em>print</em>(person);<br />
}<br />
}<br />
<br />
<strong>private static void</strong> print(Person person) {<br />
System.<em><strong>out</strong></em>.println(person.sayHello());<br />
}</p></td>
</tr>
</tbody>
</table>

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
<td></td>
<td><p><strong>Здравей</strong></p>
<p><strong>Hello</strong></p>
<p><strong>Djydjybydjy</strong></p></td>
</tr>
</tbody>
</table>

## Say Hello Extend

Build hierarchy from classes and interfaces for this **UML** diagram

<table>
<thead>
<tr class="header">
<th>Bulgarian</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+Bulgarian(name)</strong></p>
<p><strong>+sayHello(): String</strong></p></td>
</tr>
</tbody>
</table>

<table>
<thead>
<tr class="header">
<th>&lt;&lt;Person&gt;&gt;</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+getName(): String</strong></p>
<p><strong>+sayHello(): String</strong></p></td>
</tr>
</tbody>
</table>

<table>
<thead>
<tr class="header">
<th><p><em>(Abstract)</em></p>
<p><em>BasePerson</em></p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>-name: String</strong></td>
</tr>
<tr class="even">
<td><p><strong>#BasePerson(name)</strong></p>
<p><strong>+getName(): String</strong></p>
<p><strong>-setName(): void</strong></p></td>
</tr>
</tbody>
</table>

<table>
<thead>
<tr class="header">
<th>European</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+European(name)</strong></p>
<p><strong>+sayHello(): String</strong></p></td>
</tr>
</tbody>
</table>

<table>
<thead>
<tr class="header">
<th>Chinese</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>+Chinese(name)</strong></p>
<p><strong>+sayHello(): String</strong></p></td>
</tr>
</tbody>
</table>

Your hierarchy has to be used with this code:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>public static void</strong> main(String[] args) {<br />
List&lt;Person&gt; persons = <strong>new</strong> ArrayList&lt;&gt;();</p>
<p>persons.add(<strong>new</strong> Bulgarian(<strong>"Peter"</strong>));<br />
persons.add(<strong>new</strong> European(<strong>"Peter"</strong>));<br />
persons.add(<strong>new</strong> Chinese(<strong>"Peter"</strong>));<br />
<br />
<strong>for</strong> (Person person : persons) {<br />
<em>print</em>(person);<br />
}<br />
}<br />
<br />
<strong>private static void</strong> print(Person person) {<br />
System.<em><strong>out</strong></em>.println(person.sayHello());<br />
}</p></td>
</tr>
</tbody>
</table>

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
<td></td>
<td><p><strong>Здравей</strong></p>
<p><strong>Hello</strong></p>
<p><strong>Djydjybydjy</strong></p></td>
</tr>
</tbody>
</table>

## Border Control

It’s the future, you’re the ruler of a totalitarian dystopian society
inhabited by **citizens** and **robots**, since you’re afraid of
rebellions you decide to implement strict control of who enters your
city. Your soldiers check the **Id**s of everyone who enters and leaves.

You will receive from the console an **unknown** amount of lines until
the command "**End**" is received, on each line, there will be the
information for either **a citizen** or **a robot** who tries to enter
your city in the format  
"**{name} {age} {id}**" for citizens and "**{model} {id}**" for robots.

After the end command on the next line, you will receive a single number
representing **the last digits of fake ids**, all citizens or robots
whose **Id** ends with the specified digits must be detained.

The output of your program should consist of all detained **Id**s each
on a separate line (the order of printing doesn’t matter).

| **Robot** |                           |
| --------- | ------------------------- |
| **-**     | **id: String**            |
| **-**     | **model: String**         |
| **+**     | **Robot(String, String)** |
| **+**     | **getId(): String**       |
| **+**     | **getModel(): String**    |

| **Citizen** |                                  |
| ----------- | -------------------------------- |
| **-**       | **name: String**                 |
| **-**       | **age: int**                     |
| **-**       | **id: String**                   |
| **+**       | **Citizen(String, int, String)** |
| **+**       | **getName(): String**            |
| **+**       | **getAge(): int**                |
| **+**       | **getId(): String**              |

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Interface&gt;&gt;</strong></p>
<p><strong>Identifiable</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>+</strong></td>
<td><strong>getId(): String</strong></td>
</tr>
</tbody>
</table>

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
<td><p>Peter 22 9010101122</p>
<p>MK-13 558833251</p>
<p>MK-12 33283122</p>
<p>End</p>
<p>122</p></td>
<td><p>9010101122</p>
<p>33283122</p></td>
</tr>
<tr class="even">
<td><p>Teo 31 7801211340</p>
<p>Anna 29 8007181534</p>
<p>IV-228 999999</p>
<p>Simon 54 3401018380</p>
<p>KKK-666 80808080</p>
<p>End</p>
<p>340</p></td>
<td>7801211340</td>
</tr>
</tbody>
</table>

## Ferrari

Model an application that contains a **class Ferrari** and an
**interface**. Your task is simple, you have a **car - Ferrari**, its
model is "**488-Spider**" and it has a **driver**. Your Ferrari should
have the functionality to **use brakes** and **push the gas pedal**.
When the **brakes** are pushed down print "**Brakes\!**", and when the
**gas pedal** is pushed down - "**brum-brum-brum-brrrrr**". As you may
have guessed this functionality is typical for all cars, so you should
**implement an interface** to describe it.

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Interface&gt;&gt;</strong></p>
<p><strong>Car</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>+</strong></td>
<td><strong>brakes() : String</strong></td>
</tr>
<tr class="even">
<td><strong>+</strong></td>
<td><strong>gas() : String</strong></td>
</tr>
</tbody>
</table>

Your task is to **create a Ferrari** and **set the driver's name** to
the passed one in the input. After that, print the info. Take a look at
the Examples to understand the task better.

| **Ferrari** |                        |
| ----------- | ---------------------- |
| **-**       | **driverName: String** |
| **-**       | **model: String**      |
| **+**       | **Ferrari (String)**   |
| **+**       | **brakes() : String**  |
| **+**       | **gas() : String**     |
| **+**       | **toString(): String** |

### Input

On the **single input line**, you will be given the **driver's name**.

### Output

On the **single output line**, print the model, the messages from the
brakes and gas pedal methods, and the driver's name. In the following
format:

"**{model}/{brakes}/{gas}/{driver's name}**"

### Constraints

**The input will always be valid, no need to check it explicitly\!** The
Driver's name may contain any ASCII characters.

### Example

| **Input**       | **Output**                                                   |
| --------------- | ------------------------------------------------------------ |
| Dominic Toretto | 488-Spider/Brakes\!/brum-brum-brum-brrrrr/Dominic Toretto    |
| Brian O'Conner  | **488-Spider/Brakes\!/brum-brum-brum-brrrrr/Brian O'Conner** |

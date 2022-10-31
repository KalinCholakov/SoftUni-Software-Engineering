# Lab: Encapsulation

This document defines the **lab** for the ["Java Advanced" course @
Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) of all below described
problems in
[Judge](https://judge.softuni.bg/Contests/1535/Encapsulation-Lab).

## Sort by Name and Age

Create a class **Person**, which should have **private** fields for:

  - > **firstName**: **String**

  - > **lastName**: **String**

  - > **age**: **int**

  - > **toString()** - **override**

You should be able to use the class like this:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>public static void</strong> main(String[] args) <strong>throws</strong> IOException {<br />
BufferedReader reader = <strong>new</strong> BufferedReader(<strong>new</strong> InputStreamReader(System.<em><strong>in</strong></em>));<br />
<strong>int</strong> n = Integer.<em>parseInt</em>(reader.readLine());<br />
<br />
List&lt;Person&gt; people = <strong>new</strong> ArrayList&lt;&gt;();<br />
<br />
<strong>for</strong> (<strong>int</strong> i = 0; i &lt; n; i++) {<br />
String[] input = reader.readLine().split(<strong>" "</strong>);<br />
people.add(<strong>new</strong> Person(input[0], input[1], Integer.<em>parseInt</em>(input[2])));<br />
}<br />
<br />
Collections.<em>sort</em>(people, (firstPerson, secondPerson) -&gt; {<br />
<strong>int</strong> sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());<br />
<br />
<strong>if</strong> (sComp != 0) {<br />
<strong>return</strong> sComp;<br />
} <strong>else</strong> {<br />
<strong>return</strong> Integer.compare(firstPerson.getAge(), secondPerson.getAge());<br />
}<br />
});<br />
<br />
<strong>for</strong> (Person person : people) {<br />
System.<em><strong>out</strong></em>.println(person.toString());<br />
}<br />
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
<td><p><strong>5</strong></p>
<p><strong>Angel Ivanov 65</strong></p>
<p><strong>Boris Georgiev 57</strong></p>
<p><strong>Veny Ivanov 27</strong></p>
<p><strong>Angel Harizanov 44</strong></p>
<p><strong>Boris Angelov 35</strong></p></td>
<td><p><strong>Angel Harizanov is 44 years old.</strong></p>
<p><strong>Angel Ivanov is 65 years old.</strong></p>
<p><strong>Boris Angelov is 35 years old.</strong></p>
<p><strong>Boris Georgiev is 57 years old.</strong></p>
<p><strong>Veny Ivanov is 27 years old.</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>Sara Cameron 21</strong></p>
<p><strong>John Petrovich 53</strong></p>
<p><strong>Anna Glen 21</strong></p>
<p><strong>John Alekseevich 43</strong></p></td>
<td><p><strong>Anna Glen is 21 years old.</strong></p>
<p><strong>John Alekseevich is 43 years old.</strong></p>
<p><strong>John Petrovich is 53 years old.</strong></p>
<p><strong>Sara Cameron is 21 years old.</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Create a **new class** and ensure **proper naming**. Define the
**private** fields:

![](media/image1.png)

Create getters and apply them access modifiers, which are as strict as
possible:

![](media/image2.png)

Override **toString()** method:

![](media/image3.png)

## Salary Increase

Read person with their **names**, **age,** and **salary**. Read
**percent bonus** to every person salary. People younger **than 30** get
a half bonus. Expand **Person** from the previous task. Add **salary**
**field** and **getter** and **setter** with proper **access**.

New **fields** and **methods**

  - **salary**: **double**

  - > **increaseSalary(double bonus)**

You should be able to use the class like this:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>public static void</strong> main(String[] args) <strong>throws</strong> IOException {<br />
BufferedReader reader = <strong>new</strong> BufferedReader(<strong>new</strong> InputStreamReader(System.<em><strong>in</strong></em>));<br />
<strong>int</strong> n = Integer.<em>parseInt</em>(reader.readLine());<br />
List&lt;Person&gt; people = <strong>new</strong> ArrayList&lt;&gt;();<br />
<strong>for</strong> (<strong>int</strong> i = 0; i &lt; n; i++) {<br />
String[] input = reader.readLine().split(<strong>" "</strong>);<br />
people.add(<strong>new</strong> Person(input[0], input[1], Integer.<em>parseInt</em>(input[2]), Double.<em>parseDouble</em>(input[3])));<br />
}<br />
<strong>double</strong> bonus = Double.<em>parseDouble</em>(reader.readLine());<br />
<strong>for</strong> (Person person : people) {<br />
person.increaseSalary(bonus);<br />
System.<em><strong>out</strong></em>.println(person.toString());<br />
}<br />
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
<td><p><strong>5</strong></p>
<p><strong>Angel Ivanov 65 2200</strong></p>
<p><strong>Boris Georgiev 57 3333</strong></p>
<p><strong>Veny Ivanov 27 600</strong></p>
<p><strong>Angel Harizanov 44 666.66</strong></p>
<p><strong>Boris Angelov 35 559.4</strong></p>
<p><strong>20</strong></p></td>
<td><p><strong>Angel Ivanov gets 2640.0 leva</strong></p>
<p><strong>Boiko Georgiev gets 3999.6 leva</strong></p>
<p><strong>Veny Ivanov gets 660.0 leva</strong></p>
<p><strong>Angel Harizanov gets 799.992 leva</strong></p>
<p><strong>Boris Angelov gets 671.28 leva</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>Sara Cameron 21 1200</strong></p>
<p><strong>John Petrovich 53 850.50</strong></p>
<p><strong>Anna Glen 21 1640</strong></p>
<p><strong>John Alekseevich 43 2100</strong></p>
<p><strong>13</strong></p></td>
<td><p><strong>Sara Cameron gets 1278.0 leva</strong></p>
<p><strong>John Petrovich gets 961.065 leva</strong></p>
<p><strong>Anna Glen gets 1746.6 leva</strong></p>
<p><strong>John Alekseevich gets 2373.0 leva</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Add a new **private** field for **salary** and proper **setters** and
**getters** for it:

![](media/image4.png)

Add new **method**, which will **increase** salary with a bonus:

![](media/image5.png)

Refactor **constructor** and **toString()** method for this task.

## Validation Data

Expand **Person** with proper validation for every field:

  - **Names must be at least 3 symbols**

  - **Age must not be zero or negative**

  - **Salary can't be less than 460.0**

Print proper message to end-user (look at an example for messages).

Don't use **System.out.println()** in **Person** class.

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
<td><p><strong>5</strong></p>
<p><strong>Asen Ivanov -6 2200</strong></p>
<p><strong>B Borisov 57 3333</strong></p>
<p><strong>Ventsislav Ivanov 27 600</strong></p>
<p><strong>Asen H 44 666.66</strong></p>
<p><strong>Boiko Angelov 35 300</strong></p>
<p><strong>20</strong></p></td>
<td><p><strong>Age cannot be zero or negative integer</strong></p>
<p><strong>First name cannot be less than 3 symbols</strong></p>
<p><strong>Last name cannot be less than 3 symbols</strong></p>
<p><strong>Salary cannot be less than 460 leva</strong></p>
<p><strong>Ventsislav Ivanov gets 660.0 leva</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>Sara Cameron 21 1200</strong></p>
<p><strong>John Petrovich -53 850.50</strong></p>
<p><strong>Anna Glen 21 430</strong></p>
<p><strong>John Alekseevich 0 2100</strong></p>
<p><strong>13</strong></p></td>
<td><p><strong>Age cannot be zero or negative integer</strong></p>
<p><strong>Salary cannot be less than 460 leva</strong></p>
<p><strong>Age cannot be zero or negative integer</strong></p>
<p><strong>Sara Cameron gets 1278.0 leva</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Add **validation** to all **setters** in **Person**. Validation may look
like this or something similar: ![](media/image6.png)

## First and Reserve Team

Create a **Team** class. Add to this team all people you read. All
people **younger** than 40 go on the **first team**, others go on the
**reverse team**. At the end print first and reserve team sizes.

The class should have **private fields** for:

  - **name**: **String**

  - **firstTeam**: **List\<Person\>**

  - **reserveTeam**: **List\<Person\>**

The class should have **constructors**:

  - **Team(String name)**

The class should also have private method for **setName** and **public
methods** for:

  - getName(): String

  - **addPlayer(Person person)**: **void**

  - **getFirstTeam()**: **List\<Person\>
    (Collections.unmodifiableList)**

  - **getReserveTeam()**: **List\<Person\>
    (Collections.unmodifiableList)**

You should be able to use the class like this:

![](media/image7.png)

You should **NOT** be able to use the class like this:

![](media/image8.png)![](media/image9.png)

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
<td><p><strong>5</strong></p>
<p><strong>Asen Ivanov 20 2200</strong></p>
<p><strong>Boiko Borisov 57 3333</strong></p>
<p><strong>Ventsislav Ivanov 27 600</strong></p>
<p><strong>Grigor Dimitrov 25 666.66</strong></p>
<p><strong>Boiko Angelov 35 555</strong></p></td>
<td><p><strong>First team have 4 players</strong></p>
<p><strong>Reserve team have 1 players</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>Sara Cameron 21 1200</strong></p>
<p><strong>John Petrovich 53 850.50</strong></p>
<p><strong>Anna Glen 21 475</strong></p>
<p><strong>John Alekseevich 27 2100</strong></p></td>
<td><p><strong>First team have 3 players</strong></p>
<p><strong>Reserve team have 1 players</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Add a new class Team. Its fields and constructor look like this:

![](media/image10.png)

**firstTeam** and **reserveTeam** have only **getters**:

![](media/image11.png)

There will be only one method, which adds players to teams:

![](media/image12.png)

# Lab: Polymorphism

This document defines the **lab** for the ["Java Advanced" course @
Software University](https://softuni.bg/modules/59/java-advanced).
Please submit your solutions (source code) to all below-described
problems in
[Judge](https://judge.softuni.bg/Contests/1592/Polymorphism-Lab).

## Math Operation

Create a class **MathOperation**, which should have method **add()**.
Method **add()** has to be invoked with **two, three,** or **four
Integers.**

You should be able to use the class like this:

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>public static void</strong> main(String[] args) <strong>throws</strong> IOException {<br />
MathOperation math = <strong>new</strong> MathOperation();<br />
System.<em><strong>out</strong></em>.println(math.add(2, 2));<br />
System.<em><strong>out</strong></em>.println(math.add(3, 3, 3));<br />
System.<em><strong>out</strong></em>.println(math.add(4, 4, 4, 4));</p>
<p>}</p></td>
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
<td><p><strong>4</strong></p>
<p><strong>9</strong></p>
<p><strong>16</strong></p></td>
</tr>
</tbody>
</table>

### Solution

Class **MathOperation** should look like this:

![](media/image1.JPG)

## Shapes

Create class hierarchy, starting with abstract class **Shape**:

  - **Fields:**
    
      - **perimeter: Double**
    
      - **area: Double**

  - **Encapsulation for these fields**

  - **Abstract methods:**
    
      - **calculatePerimeter()**
    
      - **calculateArea()**

Extend Shape class with two children:

  - **Rectangle**

  - **Circle**

Each of them needs to have:

  - **Fields:**

> For **Rectangle**

  - **height: Double**

  - **width: Double**

> For **Circle**

  - **radius: Double**

<!-- end list -->

  - **Encapsulation for these fields**

  - **Public constructor**

  - **Concrete methods for calculations (perimeter and area)**

## Animals

Create a class **Animal**, which holds two fields:

  - **name: String**

  - **favouriteFood: String**

The **Animal** has one abstract method **explainSelf(): String.  
**You should add two new classes - **Cat** and **Dog. Override** the
**explainSelf()** method by adding concrete animal sound on a new line.
(Look at examples below)

You should be able to use the class like this:

<table>
<thead>
<tr class="header">
<th>Main</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>public static void</strong> main(String[] args) {<br />
Animal cat = <strong>new</strong> Cat(<strong>"Oscar"</strong>, <strong>"Whiskas"</strong>);<br />
Animal dog = <strong>new</strong> Dog(<strong>"Rocky"</strong>, <strong>"Meat"</strong>);<br />
System.<em><strong>out</strong></em>.println(cat.explainSelf());<br />
System.<em><strong>out</strong></em>.println(dog.explainSelf());<br />
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
<td><p><strong>I am Oscar and my favourite food is Whiskas</strong></p>
<p><strong>MEEOW</strong></p>
<p><strong>I am Rocky and my favourite food is Meat</strong></p>
<p><strong>DJAAF</strong></p></td>
</tr>
</tbody>
</table>

### Solution

![](media/image2.png)

![](media/image3.png)

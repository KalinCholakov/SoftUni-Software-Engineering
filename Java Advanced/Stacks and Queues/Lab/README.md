# **Lab: Stacks and Queues**

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1437/Stacks-and-Queues-Lab).

# Working with Stacks

## Browser History

Write a program that takes two types of browser instructions:

  - Normal navigation: a URL is set, given by a string;

  - The string "**back"** sets the current URL to the last set URL

After each instruction, the program should print the current URL. If the
**back** instruction can't be executed, print  
**"no previous URLs". The input ends with the "Home" command, and then
you simply have to stop the program.**

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
<td><p><strong>https//softuni.bg/</strong></p>
<p><strong>back</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>back</strong></p>
<p><strong>https//softuni.bg/trainings/2056</strong></p>
<p><strong>back</strong></p>
<p><strong>https//softuni.bg/trainings/live</strong></p>
<p><strong>https//softuni.bg/trainings/live/details</strong></p>
<p><strong>Home</strong></p></td>
<td><p><strong>https//softuni.bg/</strong></p>
<p><strong>no previous URLs</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>https//softuni.bg/</strong></p>
<p><strong>https//softuni.bg/trainings/2056</strong></p>
<p><strong>https//softuni.bg/</strong></p>
<p><strong>https//softuni.bg/trainings/live</strong></p>
<p><strong>https//softuni.bg/trainings/live/details</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>back</strong></p>
<p><strong>back</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>back</strong></p>
<p><strong>https//google.bg/java/oop</strong></p>
<p><strong>Home</strong></p></td>
<td><p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>https//google.bg/</strong></p>
<p><strong>no previous URLs</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/java/oop</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use **ArrayDeque\<\>**.

  - Use **String** to keep the current page.

  - Use **push()**, when moving to the next page.

  - Use **pop()**, when going back.

## Simple Calculator

**Create a simple calculator** that can **evaluate simple expressions**
that will not hold any operator different from addition and subtraction.
There will not be parentheses or operator precedence.

Solve the problem **using a Stack**.

### Examples

| **Input**              | **Output** |
| ---------------------- | ---------- |
| **2 + 5 + 10 - 2 - 1** | **14**     |
| **2 - 2 + 5**          | **5**      |

### Hints

  - Use an **ArrayDeque\<\>.**

  - Consider using the **add()** method.

  - You can either
    
      - add the elements and then pop them out
    
      - or push them and reverse the stack

## Decimal to Binary Converter

Create a simple program that **can convert a decimal number to its
binary representation**. Implement an elegant solution **using a
Stack**.

**Print the binary representation** back at the terminal.

### Examples

| **Input** | **Output**      |
| --------- | --------------- |
| **10**    | **1010**        |
| **1024**  | **10000000000** |

### Hints

  - If the given number is 0, just print 0.

  - Else, while the number is greater than zero, divide it by 2 and push
    the reminder into the stack.

![](media/image1.png)

  - When you are done dividing, pop all reminders from the stack, which
    is the binary representation.

<!-- end list -->

4.  **Matching Brackets**

We are given an arithmetical expression with brackets. Scan through the
string and extract each sub-expression.

Print the result back at the terminal.

**Examples**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5</strong></td>
<td><p><strong>(2 + 3)</strong></p>
<p><strong>(3 + 1)</strong></p>
<p><strong>(2 - (2 + 3) * 4 / (3 + 1))</strong></p></td>
</tr>
<tr class="even">
<td><strong>(2 + 3) - (2 + 3)</strong></td>
<td><p><strong>(2 + 3)</strong></p>
<p><strong>(2 + 3)</strong></p></td>
</tr>
</tbody>
</table>

**Hints**

  - Use a stack, namely an **ArrayDeque()**.

  - Scan through the expression searching for brackets:
    
      - If you find an opening bracket, push the index into the stack.
    
      - If you find a closing bracket, pop the topmost element from the
        stack. This is the index of the opening bracket.
    
      - Use the current and the popped index to extract the
        sub-expression.

![](media/image2.png)

# Working with Queues

5.  **Printer Queue**

The printer queue is a simple way to control the order of files sent to
a printer device. We know that a single printer can be shared between
multiple devices. So to preserve the order of the files sent, we can use
a queue.

Write a program which takes filenames until the "**print**" command is
received. Then as output, print the filenames in the order of printing.
Some of the tasks may be **canceled**. If you receive "**cancel**" you
have to remove the first file to be printed. If there is no current file
to be printed, print "**Printer is on standby**".

**Examples**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Lab.docx</p>
<p>cancel</p>
<p>cancel</p>
<p>Presentation.pptx</p>
<p>NoteNothing.txt</p>
<p>SomeCode.java</p>
<p>cancel</p>
<p>print</p></td>
<td><p>Canceled Lab.docx</p>
<p>Printer is on standby</p>
<p>Canceled Presentation.pptx</p>
<p>NoteNothing.txt</p>
<p>SomeCode.java</p></td>
</tr>
<tr class="even">
<td><p>Presentation.pptx</p>
<p>cancel</p>
<p>Text.txt</p>
<p>cancel</p>
<p>cancel</p>
<p>cancel</p>
<p>print</p></td>
<td><p>Canceled Presentation.pptx</p>
<p>Canceled Text.txt</p>
<p>Printer is on standby</p>
<p>Printer is on standby</p></td>
</tr>
</tbody>
</table>

### Hints

  - Use an **ArrayDeque\<\>**.

  - Use **offer()**, when adding the file.

  - Use **pollFirst()**, when printing the file.

## Hot Potato

Hot potato is a game in which **children form a circle and start passing
a hot potato**. The counting starts with the first kid. **Every
n<sup>th</sup> toss, the child left with the potato leaves the game**.
When a kid leaves the game, it passes the potato forward. This continues
repeating **until there is only one kid left**.

Create a program that simulates the game of Hot Potato. **Print every
kid that is removed from the circle**. In the end, **print the kid that
is left last**.

**Examples**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Sam John Sara</p>
<p>2</p></td>
<td><p>Removed John</p>
<p>Removed Sam</p>
<p>Last is Sara</p></td>
</tr>
<tr class="even">
<td><p>George Peter Sam John Zak</p>
<p>10</p></td>
<td><p>Removed Zak</p>
<p>Removed Peter</p>
<p>Removed Sam</p>
<p>Removed George</p>
<p>Last is John</p></td>
</tr>
<tr class="odd">
<td><p>George Peter Misha Sara Kendal</p>
<p>1</p></td>
<td><p>Removed George</p>
<p>Removed Peter</p>
<p>Removed Misha</p>
<p>Removed Sara</p>
<p>Last is Kendal</p></td>
</tr>
</tbody>
</table>

7.  **Math Potato**

Rework the previous problem so that a **child is removed only on a
composite (not prime) cycle** (cycles start from 1).

If a **cycle is prime**, **print the child's name.**

As before, print the name of the child that is left last.

**Examples**

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Maria Peter George</p>
<p>2</p></td>
<td><p>Removed Peter</p>
<p>Prime Maria</p>
<p>Prime George</p>
<p>Removed Maria</p>
<p>Last is George</p></td>
</tr>
<tr class="even">
<td><p>George Peter Misha Sara Kendal</p>
<p>10</p></td>
<td><p>Removed Kendal</p>
<p>Prime Peter</p>
<p>Prime Misha</p>
<p>Removed Sara</p>
<p>Prime George</p>
<p>Removed George</p>
<p>Prime Misha</p>
<p>Removed Peter</p>
<p>Last is Misha</p></td>
</tr>
</tbody>
</table>

## Browser History Upgrade

Extend "Browser History" with a "**forward**" instruction, which visits
URLs that were navigated away from by "**back**".

Each forward instruction visits the next most recent such URL. If normal
navigation happens, all potential forward URLs are removed until a new
back instruction is given if the forward instruction can't be executed,
print  
"**no next URLs**"**.**

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
<td><p><strong>forward</strong></p>
<p><strong>https//softuni.bg/</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>back</strong></p>
<p><strong>forward</strong></p>
<p><strong>https//softuni.bg/trainings/2056</strong></p>
<p><strong>back</strong></p>
<p><strong>forward</strong></p>
<p><strong>forward</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>Home</strong></p></td>
<td><p><strong>no next URLs</strong></p>
<p><strong>https//softuni.bg/</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>https//softuni.bg/</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>https//softuni.bg/trainings/2056</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p>
<p><strong>https//softuni.bg/trainings/2056</strong></p>
<p><strong>no next URLs</strong></p>
<p><strong>https//softuni.bg/trainings/courses</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>back</strong></p>
<p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>back</strong></p>
<p><strong>forward</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>back</strong></p>
<p><strong>forward</strong></p>
<p><strong>https//google.bg/java/oop</strong></p>
<p><strong>back</strong></p>
<p><strong>https//google.bg/java/oop</strong></p>
<p><strong>Home</strong></p></td>
<td><p><strong>no previous URLs</strong></p>
<p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>https//google.bg/</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>https//google.bg/softuni</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>https//google.bg/java/oop</strong></p>
<p><strong>https//google.bg/java/advanced</strong></p>
<p><strong>https//google.bg/java/oop</strong></p></td>
</tr>
</tbody>
</table>

### Hints

  - Use the solution from Browser History.

  - Use **ArrayDequeue\<\>** as the queue to keep the forward pages.

  - Use the **clear()** method to reset the forward pages.

  - Use **addFirst()** when adding a page to the forward pages.

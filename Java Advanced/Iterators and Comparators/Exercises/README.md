**Exercises: Iterators and Comparators**

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1543/Iterators-and-Comparators-Exercises).

## ListyIterator

Create a class **ListyIterator**, it should receive the collection of
**Strings** which it will iterate, through its constructor. You should
store the elements in a **List**. The class should have three main
functions:

  - **Move** - should move an internal **index** position to the next
    index in the list, the method should **return true** if it
    successfully moved and **false** if there is no next index.

  - **HasNext** - should **return** **true** if there is a next index
    **and false** if the index is already at the **last** element of the
    list.

  - **Print** - should **print** the element at the current internal
    index, calling **Print** on a collection without elements should
    **throw** an appropriate **exception** with the message "**Invalid
    Operation\!**".

By default, the internal index should be pointing to the
**0<sup>th</sup> index** of the List. Your program should support the
following commands:

| **Command**          | **Return Type** | **Description**                                                                                                                                                      |
| -------------------- | --------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Create {e1 e2 …}** | void            | Creates a ListyIterator from the specified collection. In case of a Create command without any elements, you should create a ListyIterator with an empty collection. |
| **Move**             | boolean         | This command should move the internal index to the next index.                                                                                                       |
| **Print**            | **void**        | This command should print the element at the current internal index.                                                                                                 |
| **HasNext**          | **boolean**     | Returns whether the collection has the next element.                                                                                                                 |
| **END**              | **void**        | Stops the input.                                                                                                                                                     |

### Input

Input will come from the console as **lines** of commands. The first
line will **always** be the "**Create**" command in the input, and it
will always be the first command passed. The last command received will
**always** be the "**END**" command.

### Output

For every command from the input (with the exception of the "**END**"
and "**Create**" commands), print the result of that command on the
console, each on a **new** **line**. In the case of "**Move**" or
"**HasNext**" commands, print the **returned** **value** of the method,
in the case of a "**Print**" command you don't have to do anything
additional as the method itself should already print on the console.
Your program should catch **any** **exceptions** **thrown** because of
validations (calling Print on an empty collection) and print their
messages instead.

### Constraints

  - The number of commands received will be **between** **\[1…100\]**.

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
<td><p><strong>Create</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td>Invalid Operation!</td>
</tr>
<tr class="even">
<td><p><strong>Create Peter George</strong></p>
<p><strong>HasNext</strong></p>
<p><strong>Print</strong></p>
<p><strong>Move</strong></p>
<p><strong>Print</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>true</strong></p>
<p><strong>Peter</strong></p>
<p><strong>true</strong></p>
<p><strong>George</strong></p></td>
</tr>
</tbody>
</table>

## Collection

Using the ListyIterator from the last problem, extend it by implementing
the **Iterable** interface, and implement **all** methods desired by the
interface manually. Add a new method to the class **PrintAll()**, the
method should **foreach** the collection and print all elements on a
**single** **line** separated by a space.

### Input

Input will come from the console as **lines** of commands. The first
line will always be the "**Create**" command in the input and it will
always be the first command passed. The **last** command received will
always be the "**END**" command.

### Output

For every command from the input (with the exception of the "**END**"
and "**Create**" commands) print the result of that command on the
console, each on a **new** **line**. In the case of **Move** or
**HasNext** commands print the returned value of the method, in the case
of a "**Print**" command, you don't have to do anything additional as
the method itself should already print on the console. In the case of a
"**PrintAll**" command, you should print all elements on a single
**line** separated by **spaces**. Your program should catch **any**
**exceptions** thrown because of validations and print their messages
instead.

### Constraints

  - **Do not use the built-in iterators\!**

  - The number of commands received will be **between** **\[1…100\]**.

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
<td><p><strong>Create Sam George Peter</strong></p>
<p><strong>PrintAll</strong></p>
<p><strong>Move</strong></p>
<p><strong>Move</strong></p>
<p><strong>Print</strong></p>
<p><strong>HasNext</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>Sam George Peter</strong></p>
<p><strong>true</strong></p>
<p><strong>true</strong></p>
<p><strong>Peter</strong></p>
<p><strong>false</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>Create 1 2 3 4 5</strong></p>
<p><strong>Move</strong></p>
<p><strong>PrintAll</strong></p>
<p><strong>END</strong></p></td>
<td><p><strong>true</strong></p>
<p><strong>1 2 3 4 5</strong></p></td>
</tr>
</tbody>
</table>

## Stack Iterator

Since you have passed the basics algorithms course, now you have a task
to create your custom stack. You are aware of the Stack structure. There
is a collection to store the elements and two functions (not from the
functional programming) - to **push** an element and to **pop** it. Keep
in mind that the first element, which is popped, is the **last** in the
collection. The push method adds an element to the **top** of the
collection, and the pop method returns the **top** element and
**removes** it.

Write your custom implementation of **Stack\<Integer\>** and implement
your custom **iterator**. There is a way that IntelliJ could help you,
your Stack class should implement the **Iterable\<Integer\>** interface,
and your **Iterator** **Class** should implement the
**Iterator\<Integer\>** interface. Your Custom Iterator should follow
the rules of the **Abstract** **Data** **Type** - **Stack**. As we said,
the first element is the element at the top and so on. Iterators are
used only for iterating through the collection, they **should** **not**
remove or mutate the elements.

### Input

The input will come from the console as lines of commands. Commands
**always** will be "**Push**"**,** "**Pop**" and "**END**", followed by
integers for the **push** command and **no** **other** input for the
**pop** command.

### Output

When you receive "**END**", the input is over. Foreach the stack
**twice** and print all elements. Each element should be on a **new
line**.

### Constraints

  - The elements in the push command will be **valid** integers
    **between** **\[2<sup>-32</sup>…2<sup>32</sup>-1\]**.

  - There will be no more than **16** **elements** in the "**Push**"
    command.

  - If the "**Pop**" command **could** **not** be executed as expected
    (e.g., no elements in the stack), print on the console: "**No
    elements**".

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
<td><p><strong>Push 1, 2, 3, 4</strong></p>
<p><strong>Pop</strong></p>
<p><strong>Pop</strong></p>
<p><strong>END</strong></p></td>
<td><p>2</p>
<p>1</p>
<p>2</p>
<p>1</p></td>
</tr>
<tr class="even">
<td><p>Push 1, 2, 3, 4</p>
<p>Pop</p>
<p>Pop</p>
<p>Pop</p>
<p>Pop</p>
<p>Pop</p>
<p>END</p></td>
<td>No elements</td>
</tr>
</tbody>
</table>

## Froggy

Let's play a game. You have a tiny little **Frog** and a **Lake** with
numbers. The **Lake** and its numbers, you will get by an input from the
console. Imagine, your **Frog** belongs to the **Lake**. The **Frog**
**jumps** only when the "**END**" command is received. When the **Frog**
starts jumping, print on the console **each** **number** the **Frog**
has stepped over. To calculate the jumps, use the guidelines:

The jumps start from the **0<sup>th</sup> index**. And follows the
pattern - first, all even indexes in **ascending** order(0-\>2-\>4-\>6
and so on) and then all odd indexes in **ascending** order
(1-\>3-\>5-\>7 and so on). Consider the **0<sup>th</sup>** index as
**even**.

**Long story short:** Create a Class **Lake**, it should implement the
interface - **Iterable**. Inside the **Lake**, create a Class - **Frog**
and implement the interface **Iterator**. Keep in mind that you will be
given **integers** only.

### Input

The input will consist of two lines. First line - the **initial**
numbers of the lake, **separated** by a comma and a single space. The
second line - command is "**END**".

### Output

When you receive "**END**", the input is over. **Foreach through** the
collection of numbers the **Frog** has jumped over and prints **each**
element.

The output should be printed on a **single** line in the format:

"**{number}, {second number}, {third number} …**"

### Constraints

  - **Lake's** numbers will be **valid** integers in the **range**
    **\[2<sup>-32</sup>…2<sup>32</sup>-1\]**.

  - The command will always be **valid** - "**END**".

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
<td><p><strong>1, 2, 3, 4, 5, 6, 7, 8</strong></p>
<p><strong>END</strong></p></td>
<td>1, 3, 5, 7, 2, 4, 6, 8</td>
</tr>
<tr class="even">
<td><p><strong>1, 2, 3</strong></p>
<p><strong>END</strong></p></td>
<td><strong>1, 3, 2</strong></td>
</tr>
</tbody>
</table>

## Comparing Objects

There is a Comparable interface, but probably you already know. Your
task is simple. Create a **Class** **Person**. Each person should have a
**name**, **age,** and **town**. You should implement the interface -
**Comparable** and try to override the **compareTo** method. When you
compare two people, first you should compare their **names**, after that
- their **age** and last but not least - compare their **town**.

### Input

On single lines, you will be given people in the format:

"**{name} {age} {town}**"

Collect them till you receive "**END**".

After that, you will receive an integer **N** - the **N<sup>th</sup>**
person in your collection.

### Output

On the single output line, you should bring statistics, how many people
are **equal** to him, how many people are **not** equal to him, and the
**total** number of people in your collection.

Format:

  - "**{number of equal people} {number of not equal people} {total
    number of people}**"

If there are no equal people, print: **"No matches".**

### Constraints

  - Names, ages, and addresses will be **valid.**

  - Input number will be always а **valid** integer in the **range
    \[2…100\].**

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
<td><p><strong>Peter 22 Varna</strong></p>
<p><strong>George 14 Sofia</strong></p>
<p><strong>END</strong></p>
<p><strong>2</strong></p></td>
<td>No matches</td>
</tr>
<tr class="even">
<td><p><strong>Peter 22 Varna</strong></p>
<p><strong>George 22 Varna</strong></p>
<p><strong>George 22 Varna</strong></p>
<p><strong>END</strong></p>
<p><strong>2</strong></p></td>
<td><strong>2 1 3</strong></td>
</tr>
</tbody>
</table>

## Strategy Pattern

An interesting pattern you may have heard of is the Strategy Pattern, if
we have multiple ways to do a task (let's say sort a collection) it
allows the client to choose the way that most fits his needs. A famous
implementation of the pattern in Java is the **Collections**.**sort()**
method that takes a Comparator.

Create a class **Person** that holds **name** and **age**. Create 2
Comparators for Person (classes that implement the
**Comparator\<Person\> interface**). The first comparator should compare
people based on the **length of their name** as a first parameter, if 2
people have a name with the **same** length, perform a
**case-insensitive** compare based on the **first letter of their name**
instead. The second comparator should compare them based on their
**age**. Create 2 **TreeSets** of type Person, the first should
implement the name comparator, and the second should implement the age
comparator.

### Input

On the first line of input, you will receive a number **N**. On each of
the next **N** lines, you will receive information about people in the
format "**{name} {age}**". Add the people from the input into **both**
sets (both sets should hold all the people passed in from the input).

### Output

**Foreach** the sets and print each person from the set on a **new**
**line** in the same format that you received them. Start with the set
that implements the name comparator.

### Constraints

  - A person's name will be a string that contains **only**
    alphanumerical characters with a length **between** **\[1…50\]**
    symbols.

  - A person's age will be a **positive** integer **between**
    **\[1…100\]**.

  - The number of people **N** will be a **positive** integer
    **between** **\[0…100\]**.

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
<td><p><strong>3</strong></p>
<p><strong>Peter 20</strong></p>
<p><strong>George 100</strong></p>
<p><strong>Sam 1</strong></p></td>
<td><p>Sam 1</p>
<p>Peter 20</p>
<p>George 100</p>
<p>Sam 1</p>
<p>Peter 20</p>
<p>George 100</p></td>
</tr>
<tr class="even">
<td><p><strong>5</strong></p>
<p><strong>John 17</strong></p>
<p><strong>Alex 33</strong></p>
<p><strong>Samuel 25</strong></p>
<p><strong>Sam 99</strong></p>
<p><strong>George 3</strong></p></td>
<td><p><strong>Sam 99</strong></p>
<p><strong>Alex 33</strong></p>
<p><strong>John 17</strong></p>
<p><strong>George 3</strong></p>
<p><strong>Samuel 25</strong></p>
<p><strong>George 3</strong></p>
<p><strong>John 17</strong></p>
<p><strong>Samuel 25</strong></p>
<p><strong>Alex 33</strong></p>
<p><strong>Sam 99</strong></p></td>
</tr>
</tbody>
</table>

## \*Equality Logic

Create a **class** **Person** holding **name** and **age**. A person
with the **same** name and age should be considered the same, override
any methods needed to enforce this logic. Your class should work with
**both** standards and hashed collections. Create a **TreeSet** and a
**HashSet** of type Person.

### Input

On the first line of input, you will receive a number **N**. On each of
the next **N** lines, you will receive information about people in the
format "**{name} {age}**". Add the people from the input into **both**
sets (both sets should hold all the people passed in from the input).

### Output

The output should consist of **exactly** 2 lines. On the first, you
should print the **size** of the **TreeSet,** and on the second - the
**size** of the **HashSet**.

### Constraints

  - A person's name will be a string that contains **only**
    alphanumerical characters with a length **between** **\[1…50\]**
    symbols.

  - A person's age will be a **positive** integer **between**
    **\[1…100\]**.

  - The number of people **N** will be a positive integer **between**
    **\[0…100\]**.

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
<td><p><strong>4</strong></p>
<p><strong>Peter 20</strong></p>
<p><strong>Petter 20</strong></p>
<p><strong>George 15</strong></p>
<p><strong>Peter 21</strong></p></td>
<td><p>4</p>
<p>4</p></td>
</tr>
<tr class="even">
<td><p><strong>7</strong></p>
<p><strong>George 17</strong></p>
<p><strong>george 17</strong></p>
<p><strong>Peter 25</strong></p>
<p><strong>George 18</strong></p>
<p><strong>George 17</strong></p>
<p><strong>Petter 25</strong></p>
<p><strong>Peter 25</strong></p></td>
<td><p><strong>5</strong></p>
<p><strong>5</strong></p></td>
</tr>
</tbody>
</table>

### Hint

You should override **both** the equals and **hashCode** methods. You
can check online for the implementation of hashCode - it doesn't have to
be perfect, but it should be good enough to produce the same hash code
for objects with the **same** name and age and different enough hash
codes for objects with **different** names and/or age.

## \*Pet Clinics

You are a young and ambitious owner of Pet Clinics Holding. You ask your
employees to create a program that will store all information about the
pets in the database. Each pet should have a **name**, **age,** and
**kind**.

Your application should support a few basic operations such as
**creating** a pet, **creating** a clinic, **adding** a pet to a clinic,
**releasing** a pet from a clinic, **printing** information about a
**specific** room in a clinic, or printing information about **all**
rooms in a clinic.

Clinics should have an **odd** number of rooms, attempting to create a
clinic with an **even** number should **fail** and **throw** an
appropriate **exception**.

### Accommodation Order

For example, let us take a look at a clinic with 5 rooms. The **first**
room where a pet will be treated is the **central** one (room 3).
Therefore, the order in which an animal is entering is: the first animal
is going to the **centre**(3) room, and after that, the next pets are
entering first to the **left** (2) and then to the **right** (4) room.
The last rooms in which pets can enter are room 1 and room 5. In case a
room is already occupied, we skip it and go to the next room in the
above order. Your task is to model the application and make it support
some commands.

The first pet enters room 3. -\> 1 2 **3** 4 5

After that, the next pet enters room 2. -\> 1 **2** 3 4 5

The third pet would enter room 4. -\> 1 2 3 **4** 5

And the last two pets would be going to rooms - 1 and 5. -\> **1** 2 3 4
**5**

Now when we have covered adding the pets, it is time to find a way to
release them. The process of releasing them is not so simple, when the
release method is called, we start from the **centre** room (3) and
continue **right** (4, 5… and so on) until we find a pet or reach the
**last** room. If we reach the last room, we start from the **first**
(1) and again move right until we reach the **centre** room (3). If a
pet is found, we **remove** it from the collection, stop further search
and **return** **true**, if a pet is **NOT** found, the operation
**returns** **false**.

When a print command for a room is called, if the room contains a pet,
we print the pet on a single line in the format "**{pet name} {pet age}
{pet kind}**". Alternatively, if the room is empty, print **"Room
empty**" instead. When a print command for a clinic is called, it should
print **all** rooms in the clinic in **order** of their number.

### Commands

<table>
<thead>
<tr class="header">
<th><strong>Command</strong></th>
<th><strong>Return Type</strong></th>
<th><strong>Description</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Create Pet {name} {age} {kind}</strong></td>
<td>void</td>
<td><p><strong>Creates a pet with the specified name and age.</strong></p>
<p>(true if the operation is successful and false if it isn't)</p></td>
</tr>
<tr class="even">
<td><strong>Create Clinic {name} {rooms}</strong></td>
<td>void</td>
<td><p><strong>Creates a Clinic with the specified name and number of rooms.</strong></p>
<p>(if the rooms are not odd, throw an exception)</p></td>
</tr>
<tr class="odd">
<td><strong>Add {pet's name} {clinic's name}</strong></td>
<td>boolean</td>
<td><p><strong>This command should add the given pet to the specified clinic.</strong></p>
<p>(true if the operation is successful and false if it isn't).</p></td>
</tr>
<tr class="even">
<td><strong>Release {clinic's name}</strong></td>
<td>boolean</td>
<td><p><strong>This command should release an animal from the specified clinic.</strong></p>
<p>(true if the operation is successful and false if it isn't).</p></td>
</tr>
<tr class="odd">
<td><strong>HasEmptyRooms {clinic’s name}</strong></td>
<td><strong>boolean</strong></td>
<td><p><strong>Returns whether the clinic has any empty rooms.</strong></p>
<p>(true if it has and false if it doesn't).</p></td>
</tr>
<tr class="even">
<td><strong>Print {clinic's name}</strong></td>
<td><strong>void</strong></td>
<td><strong>This command should print each room in the specified clinic, ordered by room number.</strong></td>
</tr>
<tr class="odd">
<td><strong>Print {clinic's name} {room}</strong></td>
<td><strong>void</strong></td>
<td><strong>Prints on a single line the content of the specified room.</strong></td>
</tr>
</tbody>
</table>

### Input

On the first line, you will be given an integer **N** - the number of
commands you will receive. On each of the next **N** lines, you will
receive a command.

### Output

For each command with a boolean **return** type received through the
input, you should print its return value on a **separate** line. In case
of a method **throwing** an **exception** (such as trying to create a
clinic with an even number of rooms or trying to add a pet that doesn't
exist), you should **catch** the exceptions and instead print "**Invalid
Operation\!**".

  - The "**Print**" command with a clinic and a room should print
    information for that room in the format **specified** above.

  - The "**Print**" command with only a clinic should print information
    **for** **each** room in the clinic in **order** of their numbers.

### Constraints

  - The number of commands **N** - will be a valid integer **between**
    **\[1…1000\]**, no need to check it explicitly.

  - **Pet names**, **Clinic names**, and **kinds** will be strings
    consisting only of alphabetical characters with a length **between**
    **\[1…50\]** characters.

  - **Pet** **age** will be a positive integer **between**
    **\[1…100\]**.

  - **Clinic rooms** will be a positive integer **between**
    **\[1…101\]**.

  - **Room number** in a "**Print**" command will always be **between**
    **1** and the **number of rooms** in that Clinic.

  - Input will consist **only** of **correct commands and always** have
    the correct type of parameters.

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
<td><p><strong>9</strong></p>
<p><strong>Create Pet George 7 Cat</strong></p>
<p><strong>Create Clinic Sofia 4</strong></p>
<p><strong>Create Clinic Sofiq 1</strong></p>
<p><strong>HasEmptyRooms Sofiq</strong></p>
<p><strong>Release Sofiq</strong></p>
<p><strong>Add George Sofiq</strong></p>
<p><strong>HasEmptyRooms Sofiq</strong></p>
<p><strong>Create Pet Sharo 2 Dog</strong></p>
<p><strong>Add Sharo Sofiq</strong></p></td>
<td><p>Invalid Operation!</p>
<p>true</p>
<p>false</p>
<p>true</p>
<p>false</p>
<p>false</p></td>
</tr>
<tr class="even">
<td><p><strong>8</strong></p>
<p><strong>Create Pet George 7 Cat</strong></p>
<p><strong>Create Pet Sam 1 Cata</strong></p>
<p><strong>Create Clinic Rim 5</strong></p>
<p><strong>Add George Rim</strong></p>
<p><strong>Add Sam Rim</strong></p>
<p><strong>Print Rim 3</strong></p>
<p><strong>Release Rim</strong></p>
<p><strong>Print Rim</strong></p></td>
<td><p><strong>true</strong></p>
<p><strong>true</strong></p>
<p><strong>George 7 Cat</strong></p>
<p><strong>true</strong></p>
<p><strong>Room empty</strong></p>
<p><strong>Sam 1 Cata</strong></p>
<p><strong>Room empty</strong></p>
<p><strong>Room empty</strong></p>
<p><strong>Room empty</strong></p></td>
</tr>
</tbody>
</table>

## \*\*\*Linked List Traversal

You need to write your simplified implementation of a generic Linked
List that has an Iterator. The list should support the **Add** and
**Remove** operations, should reveal the amount of elements it has with
a **getSize** function and should have an implemented iterator (should
be **foreachable**). The **add** method should add the new element at
the end of the collection. The **remove** method should remove the first
occurrence of the item starting at the beginning of the collection, if
the element is successfully removed, the method **returns** **true**,
alternatively, if the element passed is not in the collection, the
method should **return** **false**. The **getSize** method should
**return** the number of elements currently in the list. The
**iterator** should iterate over the collection starting from the first
entered element.

### Input

On the first line of input, you will receive a number **N**. On each of
the next **N** lines, you will receive a command in one of the following
formats:

  - **"Add {number}"** - adds a number to your linked list.

  - **"Remove {number}"** - removes the first occurrence of the number
    from the linked list. If there is no such element, this command
    leaves the collection **unchanged**.

### Output

The output should consist of exactly 2 lines. First, you should print
the result of calling the **getSize** function on the Linked list. On
the next lines, you should print **all** **elements** of the collection
by calling **foreach** on the collection.

### Constraints

  - All numbers in the input will be **valid** integers **between**
    **\[2<sup>-32</sup>…2<sup>32</sup>-1\]**.

  - All commands received through the input will be **valid** (will be
    only "**Add**" or "**Remove**").

  - The number **N** will be a positive integer **between**
    **\[1…500\]**.

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
<p><strong>Add 7</strong></p>
<p><strong>Add -50</strong></p>
<p><strong>Remove 3</strong></p>
<p><strong>Remove 7</strong></p>
<p><strong>Add 20</strong></p></td>
<td><p>2</p>
<p>-50 20</p></td>
</tr>
<tr class="even">
<td><p><strong>6</strong></p>
<p><strong>Add 13</strong></p>
<p><strong>Add 4</strong></p>
<p><strong>Add 20</strong></p>
<p><strong>Add 4</strong></p>
<p><strong>Remove 4</strong></p>
<p><strong>Add 4</strong></p></td>
<td><p><strong>4</strong></p>
<p><strong>13 20 4 4</strong></p></td>
</tr>
</tbody>
</table>

### Hint

You can use the Linked List from your **Workshop**.

# Exercises: Defining Classes

This document defines the **exercises** for the
[<span class="underline">"Java Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your solutions (source code) to all below-described problems in
[<span class="underline">Judge</span>](https://judge.softuni.org/Contests/1518/Defining-Classes-Exercises).

**Note:** For these exercises, you are allowed to have multiple classes
in the same file.

## Opinion Poll

Create a Person class with two fields **String name** and **int age**.
Write a program that reads from the console **N** lines of personal
information and then prints all people whose **age** is **more than 30**
years, **sorted in alphabetical order**.

**Note:** you can use the **stream()** to filter people.

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
<td><p>3</p>
<p>Peter 12</p>
<p>Steven 31</p>
<p>John 48</p></td>
<td><p><strong>John - 48</strong></p>
<p><strong>Steven – 31</strong></p></td>
</tr>
<tr class="even">
<td><p>5</p>
<p>Sofia 33</p>
<p>Thomas 88</p>
<p>Camilla 22</p>
<p>Robert 44</p>
<p>Owen 11</p></td>
<td><p><strong>Robert - 44</strong></p>
<p><strong>Sofia - 33</strong></p>
<p><strong>Thomas - 88</strong></p></td>
</tr>
</tbody>
</table>

## Company Roster

Define a class **Employee** that holds the following information:
**name, salary, position, department, email,** and **age**. The **name,
salary**, **position,** and **department** are **mandatory,** while the
rest are **optional**.

Your task is to write a program that takes **N** lines of information
about employees from the console and calculates the department with the
highest average salary, and prints for each employee in that department
his **name, salary, email, and age** - **sorted by salary in descending
order**. If an employee **doesn't have** an **email** – in place of that
field, you should print "**n/a**" instead, if he doesn't have an **age**
– print "**-1**" instead. The **salary** should be printed to **two
decimal places** after the separator.

**Hint**: you can define a **Department** class that holds a list of
employees.

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
<p>Peter 120.00 Dev Development peter@abv.bg 28</p>
<p>Tina 333.33 Manager Marketing 33</p>
<p>Sam 840.20 ProjectLeader Development sam@sam.com</p>
<p>George 0.20 Freeloader Nowhere 18</p></td>
<td><p><strong>Highest Average Salary: Development</strong></p>
<p><strong>Sam 840.20 sam@sam.com -1</strong></p>
<p><strong>Peter 120.00 peter@abv.bg 28</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>6</strong></p>
<p><strong>Silver 496.37 Temp Coding silver@yahoo.com</strong></p>
<p><strong>Sam 610.13 Manager Sales</strong></p>
<p><strong>John 609.99 Manager Sales john@abv.bg 44</strong></p>
<p><strong>Venci 0.02 Director BeerDrinking beer@beer.br 23</strong></p>
<p><strong>Andre 700.00 Director Coding</strong></p>
<p><strong>Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey</strong></p></td>
<td><p><strong>Highest Average Salary: Sales</strong></p>
<p><strong>Sam 610.13 n/a -1</strong></p>
<p><strong>John 609.99 john@abv.bg 44</strong></p></td>
</tr>
</tbody>
</table>

## \* Speed Racing

Your task is to implement a program that keeps track of cars and their
fuel and supports methods for moving the cars. Define a class **Car**
that keeps track of a car information **Model, fuel amount, fuel cost
for 1 kilometer,** and **distance traveled**. A Car Model is **unique**
- there will never be 2 cars with the same model.

On the first line of the input, you will receive a number **N** - the
number of cars you need to track, on **each** of the next **N** lines
you will receive information for a car in the following format
"**{Model} {FuelAmount} {FuelCostFor1km}**", all **cars start at 0
kilometers traveled**.  
After the **N** lines, until the command "**End**" is received, you will
receive commands in the following format "**Drive {CarModel}
{amountOfKm}**", implement a method in the **Car** class to calculate
whether a car **can** move that distance or **not**. If yes, the car
**fuel amount** should be **reduced** by the amount of used fuel, and
its **distance traveled** should be increased by the amount of
kilometers traveled, otherwise, the car should not move (Its fuel amount
and distance traveled should stay the same) and you should print on the
console "**Insufficient fuel for the drive**". After the "**End**"
command is received, print each car in order of appearing in input, and
its current fuel amount and distance traveled in the format "**{Model}
{fuelAmount} {distanceTraveled}**", where the fuel amount should be
printed to **two decimal places** after the separator.

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
<td><p><strong>2</strong></p>
<p><strong>AudiA4 23 0.3</strong></p>
<p><strong>BMW-M2 45 0.42</strong></p>
<p><strong>Drive BMW-M2 56</strong></p>
<p><strong>Drive AudiA4 5</strong></p>
<p><strong>Drive AudiA4 13</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>AudiA4 17.60 18</strong></p>
<p><strong>BMW-M2 21.48 56</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>3</strong></p>
<p><strong>AudiA4 18 0.34</strong></p>
<p><strong>BMW-M2 33 0.41</strong></p>
<p><strong>Ferrari-488Spider 50 0.47</strong></p>
<p><strong>Drive Ferrari-488Spider 97</strong></p>
<p><strong>Drive Ferrari-488Spider 35</strong></p>
<p><strong>Drive AudiA4 85</strong></p>
<p><strong>Drive AudiA4 50</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Insufficient fuel for the drive</strong></p>
<p><strong>Insufficient fuel for the drive</strong></p>
<p><strong>AudiA4 1.00 50</strong></p>
<p><strong>BMW-M2 33.00 0</strong></p>
<p><strong>Ferrari-488Spider 4.41 97</strong></p></td>
</tr>
</tbody>
</table>

##  Raw Data

You are the owner of a courier company, and you want to make a system
for tracking your cars and their cargo. Define a class **Car** that
holds information about the **model, engine, cargo,** and a **collection
of exactly 4 tires**. The engine, cargo, and tire **should be separate
classes**, create a constructor that receives all information about the
Car and creates and initializes its inner components (engine, cargo, and
tires).

On the first line of the input, you will receive a number **N** - the
number of cars you have, on each of the next **N** lines, you will
receive information about a car in the format:

"**{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
{Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure}
{Tire\]’3Age} {Tire4Pressure} {Tire4Age}"**, where the speed, power,
weight and tire age are **integers**, tire pressure is a **double.**

After the **N** lines, you will receive a single line with one of 2
commands "**fragile**" or "**flamable**", if the command is
"**fragile**" print all cars whose **Cargo Type is** "**fragile**" with
a **tire** whose **pressure is** **\< 1** if the command is
"**flamable**" print all cars whose **Cargo Type is** "**flamable**" and
have **Engine Power \> 250**. The cars should be printed in order of
appearing in the input.

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
<td><p><strong>2</strong></p>
<p><strong>ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4</strong></p>
<p><strong>Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1</strong></p>
<p><strong>fragile</strong></p></td>
<td><strong>Citroen2CV</strong></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1</strong></p>
<p><strong>ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1</strong></p>
<p><strong>DaciaDokker 230 275 1400 flamable 2.2 1 2.3 1 2.4 1 2 1</strong></p>
<p><strong>Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2</strong></p>
<p><strong>flamable</strong></p></td>
<td><p><strong>ChevroletExpress</strong></p>
<p><strong>DaciaDokker</strong></p></td>
</tr>
</tbody>
</table>

## Car Salesman

Define two classes **Car** and **Engine.** A **Car** has a **model,
engine, weight,** and **color**. An Engine has a **model**, **power,
displacement,** and **efficiency**. A Car's **weight**, color, Engine
displacements, and **efficiency** are **optional**.

On the first line, you will read a number **N** which will specify how
many lines of engines you will receive, on each of the next **N** lines,
you will receive information about an **Engine** in the following format
"**{Model} {Power} {Displacement} {Efficiency}**". After the lines with
engines, on the next line, you will receive a number **M** – specifying
the number of Cars that will follow, on each of the next **M** lines the
information about a **Car** will follow in the following format
"**{Model} {Engine} {Weight} {Color}**", where the engine in the format
will be the **model of an existing** **Engine**. When creating the
object for a **Car**, you should keep a **reference to the real engine**
in it, instead of just the engine's model, **note** that the optional
properties **might be missing** from the formats.

Your task is to print each car (in the **order** you **received** them)
and its information in the format defined below. If any of the optional
fields have not been given, print "**n/a**" in its place instead of:

**{CarModel}:  
{EngineModel}:  
Power: {EnginePower}  
Displacement: {EngineDisplacement}  
Efficiency: {EngineEfficiency}  
Weight: {CarWeight}  
Color: {CarColor}**

### Optional

Override the class **ToString()** methods to have a reusable way of
displaying the objects.

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
<td><p><strong>2</strong></p>
<p><strong>V8-101 220 50</strong></p>
<p><strong>V4-33 140 28 B</strong></p>
<p><strong>3</strong></p>
<p><strong>FordFocus V4-33 1300 Silver</strong></p>
<p><strong>FordMustang V8-101</strong></p>
<p><strong>VolkswagenGolf V4-33 Orange</strong></p></td>
<td><p><strong>FordFocus:</strong></p>
<p><strong>V4-33:</strong></p>
<p><strong>Power: 140</strong></p>
<p><strong>Displacement: 28</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: 1300</strong></p>
<p><strong>Color: Silver</strong></p>
<p><strong>FordMustang:</strong></p>
<p><strong>V8-101:</strong></p>
<p><strong>Power: 220</strong></p>
<p><strong>Displacement: 50</strong></p>
<p><strong>Efficiency: n/a</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: n/a</strong></p>
<p><strong>VolkswagenGolf:</strong></p>
<p><strong>V4-33:</strong></p>
<p><strong>Power: 140</strong></p>
<p><strong>Displacement: 28</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: Orange</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>4</strong></p>
<p><strong>DSL-10 280 B</strong></p>
<p><strong>V7-55 200 35</strong></p>
<p><strong>DSL-13 305 55 A+</strong></p>
<p><strong>V7-54 190 30 D</strong></p>
<p><strong>4</strong></p>
<p><strong>FordMondeo DSL-13 Purple</strong></p>
<p><strong>VolkswagenPolo V7-54 1200 Yellow</strong></p>
<p><strong>VolkswagenPassat DSL-10 1375 Blue</strong></p>
<p><strong>FordFusion DSL-13</strong></p></td>
<td><p><strong>FordMondeo:</strong></p>
<p><strong>DSL-13:</strong></p>
<p><strong>Power: 305</strong></p>
<p><strong>Displacement: 55</strong></p>
<p><strong>Efficiency: A+</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: Purple</strong></p>
<p><strong>VolkswagenPolo:</strong></p>
<p><strong>V7-54:</strong></p>
<p><strong>Power: 190</strong></p>
<p><strong>Displacement: 30</strong></p>
<p><strong>Efficiency: D</strong></p>
<p><strong>Weight: 1200</strong></p>
<p><strong>Color: Yellow</strong></p>
<p><strong>VolkswagenPassat:</strong></p>
<p><strong>DSL-10:</strong></p>
<p><strong>Power: 280</strong></p>
<p><strong>Displacement: n/a</strong></p>
<p><strong>Efficiency: B</strong></p>
<p><strong>Weight: 1375</strong></p>
<p><strong>Color: Blue</strong></p>
<p><strong>FordFusion:</strong></p>
<p><strong>DSL-13:</strong></p>
<p><strong>Power: 305</strong></p>
<p><strong>Displacement: 55</strong></p>
<p><strong>Efficiency: A+</strong></p>
<p><strong>Weight: n/a</strong></p>
<p><strong>Color: n/a</strong></p></td>
</tr>
</tbody>
</table>

## Pokémon Trainer

You want to be the best pokemon trainer, like no one ever was, so you
set out to catch pokemon. Define a class **Trainer** and a class
**Pokemon**. The trainer has a **name**, a **number of badges,** and a
**collection of pokemon**. Pokemon has a **name**, an **element,** and
**health**, all values are **mandatory**. Every Trainer **starts with 0
badges**.

From the console, you will receive an unknown number of lines until you
receive the command "**Tournament**", each line will carry information
about a pokemon and the trainer who caught it in the format
"**{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}**" where
**TrainerName** is the name of the Trainer who caught the pokemon, names
are **unique** there cannot be 2 trainers with the same name. After
receiving the command "**Tournament**" an unknown number of lines
containing one of three elements "**Fire**", "**Water**", and
"**Electricity**" will follow until the command "**End**" is received.
For every command, you must check if a trainer has **at least 1**
pokemon with the given element, if he does he receives 1 badge,
otherwise, all his pokemon **lose 10 health**, if a pokemon falls **to 0
or less health, he dies** and must be deleted from the trainer's
collection. After the command "**End**" is received, you should print
all trainers **sorted by the amount of badges they have in descending
order** (if two trainers have the same amount of badges, they should be
sorted by order of appearance in the input) in the format
"**{TrainerName} {Badges} {NumberOfPokemon}**".

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
<td><p><strong>Peter Charizard Fire 100</strong></p>
<p><strong>George Squirtle Water 38</strong></p>
<p><strong>Peter Pikachu Electricity 10</strong></p>
<p><strong>Tournament</strong></p>
<p><strong>Fire</strong></p>
<p><strong>Electricity</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Peter 2 2</strong></p>
<p><strong>George 0 1</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>Sam Blastoise Water 18</strong></p>
<p><strong>Alex Pikachu Electricity 22</strong></p>
<p><strong>John Kadabra Psychic 90</strong></p>
<p><strong>Tournament</strong></p>
<p><strong>Fire</strong></p>
<p><strong>Electricity</strong></p>
<p><strong>Fire</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Alex 1 1</strong></p>
<p><strong>Sam 0 0</strong></p>
<p><strong>John 0 1</strong></p></td>
</tr>
</tbody>
</table>

## Google

*Google is always watching you, so it should come as no surprise that
they know everything about you (even your pokemon collection), since
you're really good at writing classes, Google asked you to design a
Class that can hold all the information they need for people.*

You will receive an unknown number of rows from the console until you
receive the "**End**" command, on each of those lines, there will be
information about a person in one of the following formats:

  - "**{Name} company {companyName} {department} {salary}**"

  - "**{Name} pokemon {pokemonName} {pokemonType}**"

  - "**{Name} parents {parentName} {parentBirthday}**"

  - "**{Name} children {childName} {childBirthday}**"

  - "**{Name} car {carModel} {carSpeed}**"

You should structure all information about a person in a class with
nested subclasses. People's names are **unique** - there won't be 2
people with the same name, a person can also have **only 1** **company**
and **car**, but can have **multiple** **parents, children,** and
**pokemons**. After the command "**End**" is received on the next line,
you will receive a **single** name, you should **print** all information
about that person. **Note** that information can change **during** the
**input**, for instance, if we receive multiple lines which specify a
person's company, only the **last one** should be the one remembered.
The salary must be formatted to **two decimal places** after the
separator.

**Note**: print the information in the format:

"**{personName}**

**Company:**

**{companyName} {companyDepartment} {salary}**

**...**

**Children:**

**{childName} {childBirthday}**

**{childName} {childBirthday}**"

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
<td><p><strong>PeterSmith company PeshInc Management 1000.00</strong></p>
<p><strong>JohnJohnson car Trabant 30</strong></p>
<p><strong>PeterSmith pokemon Pikachu Electricity</strong></p>
<p><strong>PeterSmith parents PoshoPeshev 22/02/1920</strong></p>
<p><strong>JohnJohnson pokemon Electrode Electricity</strong></p>
<p><strong>End</strong></p>
<p><strong>JohnJohnson</strong></p></td>
<td><p><strong>JohnJohnson</strong></p>
<p><strong>Company:</strong></p>
<p><strong>Car:</strong></p>
<p><strong>Trabant 30</strong></p>
<p><strong>Pokemon:</strong></p>
<p><strong>Electrode Electricity</strong></p>
<p><strong>Parents:</strong></p>
<p><strong>Children:</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>GeorgeJohnson pokemon Onyx Rock</strong></p>
<p><strong>GeorgeJohnson parents SaraJohnson 13/03/1933</strong></p>
<p><strong>AlexAlexson pokemon Moltres Fire</strong></p>
<p><strong>GeorgeJohnson company JeleInc Jelior 777.77</strong></p>
<p><strong>GeorgeJohnson children SamJohnson 01/01/2001</strong></p>
<p><strong>SmithSmithon pokemon Blastoise Water</strong></p>
<p><strong>GeorgeJohnson car AudiA4 180</strong></p>
<p><strong>GeorgeJohnson pokemon Charizard Fire</strong></p>
<p><strong>End</strong></p>
<p><strong>GeorgeJohnson</strong></p></td>
<td><p><strong>GeorgeJohnson</strong></p>
<p><strong>Company:</strong></p>
<p><strong>JeleInc Jelior 777.77</strong></p>
<p><strong>Car:</strong></p>
<p><strong>AudiA4 180</strong></p>
<p><strong>Pokemon:</strong></p>
<p><strong>Onyx Rock</strong></p>
<p><strong>Charizard Fire</strong></p>
<p><strong>Parents:</strong></p>
<p><strong>SaraJohnson 13/03/1933</strong></p>
<p><strong>Children:</strong></p>
<p><strong>SamJohnson 01/01/2001</strong></p></td>
</tr>
</tbody>
</table>

## \*\*\* Family Tree

*You want to build your family tree, so you went to ask your
grandmother, sadly your grandmother keeps remembering information about
your predecessors in pieces, so it falls to you to group the information
and build the family tree.*

On the first line of the input, you will receive either a name or a
birthdate in the format "**{FirstName} {LastName}**" or
"**day/month/year**" - your task is to find information about the person
in the family tree. On the next lines, until the command "**End**" is
received, you will receive information about your predecessors that you
will use to build the family tree.

The information will be in one of the following formats:

  - "**{FirstName} {LastName} – {FirstName} {LastName}**"

  - "**{FirstName} {LastName} – {day/month/year}**"

  - "**{day/month/year} – {FirstName} {LastName}**"

  - "**{day/month/year} – {day/month/year}**"

  - "**{FirstName} {LastName} {day/month/year}**"

The first 4 formats reveal a family tie – **the person on the left is
the parent of the person on the right** (as you can see the format does
**not** need to contain names, for example, the 4<sup>th</sup> format
means the person born on the left date is parent to the person born on
the right date). The last format ties **different** information together
– i.e. **the person with that name was born on that date**. **Names**
and **birthdates** are **unique** – there won't be 2 people with the
same name or birthdate, there will **always** be enough entries to
construct the family tree (all people's names and birthdates are known,
and they have **at least** **one** connection to another person in the
tree).

After the command "**End**" is received, you should print all
information about the person whose name or birthdate you received on the
first line – his **name, birthday, parents, and children** (check the
examples for the format). The people in the parents and children lists
should be **ordered** by their **first** **appearance** in the input
(regardless if they appeared as a birthdate or a name, for example, in
the first input, Peter is before Sara because he first appeared in the
first line, while she appears in the third).

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
<td><p><strong>Peter Johnson</strong></p>
<p><strong>11/11/1951 - 23/5/1980</strong></p>
<p><strong>Sara Johnson - 23/5/1980</strong></p>
<p><strong>Sara Johnson 9/2/1953</strong></p>
<p><strong>Peter Johnson - George Johnson</strong></p>
<p><strong>George Johnson 1/1/2005</strong></p>
<p><strong>Sam Johnson 11/11/1951</strong></p>
<p><strong>Peter Johnson 23/5/1980</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>Peter Johnson 23/5/1980</strong></p>
<p><strong>Parents:</strong></p>
<p><strong>Sam Johnson 11/11/1951</strong></p>
<p><strong>Sara Johnson 9/2/1953</strong></p>
<p><strong>Children:</strong></p>
<p><strong>George Johnson 1/1/2005</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>13/12/1993</strong></p>
<p><strong>25/3/1934 - 4/4/1961</strong></p>
<p><strong>Peter Samthon 25/3/1934</strong></p>
<p><strong>4/4/1961 - George Samthon</strong></p>
<p><strong>Sam Samthon - Sara Samthon</strong></p>
<p><strong>George Samthon 13/12/1993</strong></p>
<p><strong>Sara Samthon 7/7/1995</strong></p>
<p><strong>Sam Samthon 4/4/1961</strong></p>
<p><strong>End</strong></p></td>
<td><p><strong>George Samthon 13/12/1993</strong></p>
<p><strong>Parents:</strong></p>
<p><strong>Sam Samthon 4/4/1961</strong></p>
<p><strong>Children:</strong></p></td>
</tr>
</tbody>
</table>

## \*\* Cat Lady

*Sara has many cats in her house of various breeds, since some breeds
have specific characteristics, Sara needs some way to catalog the cats.
Help her by creating a class hierarchy with all her breeds of cats so
that she can easily check their characteristics.*

Sara has 3 specific breeds of cats "**Siamese**", "**Cymric**" and the
very famous Bulgarian breed "**Street** **Extraordinaire**", each breed
has a **specific** characteristic about which information should be
kept. For the Siamese cats their **ear** **size** should be kept, for
Cymric cats - the **length** of **their** **fur** in millimeters and for
the Street Extraordinaire, the **decibels** of their **meowing** during
the night.

From the console, you will receive lines of cat information until the
command "**End**" is received, the information will come in one of the
following formats:

  - "**Siamese {name} {earSize}**"

  - "**Cymric {name} {furLength}**"

  - "**StreetExtraordinaire {name} {decibelsOfMeows}**"

On the last line, after the "**End**" command, you will receive the
**name** of a cat, and you should print that cat. Round the numbers
**two digits** after the decimal separator.

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
<td><p><strong>StreetExtraordinaire Maca 85</strong></p>
<p><strong>Siamese Sim 4</strong></p>
<p><strong>Cymric Tom 28</strong></p>
<p><strong>End</strong></p>
<p><strong>Tom</strong></p></td>
<td><strong>Cymric Tom 28.00</strong></td>
</tr>
<tr class="even">
<td><p><strong>StreetExtraordinaire Koti 80</strong></p>
<p><strong>StreetExtraordinaire Maca 100</strong></p>
<p><strong>Cymric Tim 31</strong></p>
<p><strong>End</strong></p>
<p><strong>Maca</strong></p></td>
<td><strong>StreetExtraordinaire Maca 100.00</strong></td>
</tr>
</tbody>
</table>

### Hint

Use class inheritance to represent the cat hierarchy and override the
**ToString()** methods of concrete breeds to allow for easy printing of
the cat, regardless of what breed it is.

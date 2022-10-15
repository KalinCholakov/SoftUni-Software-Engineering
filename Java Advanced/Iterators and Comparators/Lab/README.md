# Lab: **Iterators and Comparators**

This document defines the **lab** for the [<span class="underline">"Java
Advanced" course @ Software
University</span>](https://softuni.bg/modules/59/java-advanced). Please
submit your  
solutions (source code) of all below-described problems in
<span class="underline">[Judge](https://judge.softuni.org/Contests/1542/Iterators-and-Comparators-Lab).</span>

## Book

Create a class **Book** from the **UML diagram** below:

| **Book** |                              |
| -------- | ---------------------------- |
| \-       | title: String                |
| \-       | year: int                    |
| \-       | authors: List\<String\>      |
| \-       | setTitle(String)             |
| \-       | setYear(String)              |
| \-       | setAuthors(String…)          |
| \+       | getTitle(): String           |
| \+       | getYear(): int               |
| \+       | getAuthors(): List\<String\> |

You can use only **one constructor**. There **can be no authors**, **one
author,** or **many authors**.

### Examples

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>public static void</strong> main(String[] args) {</p>
<blockquote>
<p>Book bookOne = <strong>new</strong> Book(<strong>"Animal Farm"</strong>, 2003, <strong>"George Orwell"</strong>);</p>
<p>Book bookThree = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 2002);</p>
<p>Book bookTwo = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 1930, <strong>"Dorothy Sayers"</strong>, <strong>"Robert Eustace"</strong>);</p>
<p>List&lt;Book&gt; books = <strong>new</strong> ArrayList&lt;&gt;();<br />
books.add(bookOne);<br />
books.add(bookTwo);<br />
books.add(bookThree);</p>
<p>}</p>
</blockquote></td>
</tr>
</tbody>
</table>

### Solution

![](media/image1.png)

## Library

Create a class **Library** from the **UML diagram** below:

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Iterable&lt;Book&gt;&gt;&gt;</strong></p>
<p><strong>Library</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>-</td>
<td>books: Book[]</td>
</tr>
<tr class="even">
<td>+</td>
<td>iterator(): Iterator&lt;Book&gt;</td>
</tr>
</tbody>
</table>

Create a **nested class** **LibIterator** from the **UML diagram**
below:

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Iterator&lt;Book&gt;&gt;&gt;</strong></p>
<p><strong>LibIterator</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>-</td>
<td>counter: int</td>
</tr>
<tr class="even">
<td>+</td>
<td>hasNext(): boolean</td>
</tr>
<tr class="odd">
<td>+</td>
<td>next(): Book</td>
</tr>
</tbody>
</table>

### Examples

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p><strong>public static void</strong> main(String[] args) {<br />
Book bookOne = <strong>new</strong> Book(<strong>"Animal Farm"</strong>, 2003, <strong>"George Orwell"</strong>);</p>
<p>Book bookThree = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 2002);<br />
Book bookTwo = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 1930, <strong>"Dorothy Sayers"</strong>, <strong>"Robert Eustace"</strong>);<br />
<br />
Library library = <strong>new</strong> Library&lt;&gt;(bookOne, bookTwo, boоkThree);<br />
<br />
<strong>for</strong> (Book book: library) {<br />
System.<em><strong>out</strong></em>.println(book.getTitle());<br />
}</p>
</blockquote>
<p>}</p></td>
</tr>
</tbody>
</table>

### Solution

![](media/image2.png)

## Comparable Book

Expand Book by implementing **Comparable\<Book\>.**

The book has to be **compared by title**. When the title is equal,
**compare** them by **year.**

Expand **Book** from **UML diagram** below:

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Comparable&lt;Book&gt;&gt;&gt;</strong></p>
<p><strong>Book</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>-</td>
<td>title: String</td>
</tr>
<tr class="even">
<td>-</td>
<td>year: int</td>
</tr>
<tr class="odd">
<td>-</td>
<td>authors: List&lt;String&gt;</td>
</tr>
<tr class="even">
<td>-</td>
<td>setTitle(String)</td>
</tr>
<tr class="odd">
<td>-</td>
<td>setYear(String)</td>
</tr>
<tr class="even">
<td>-</td>
<td>setAuthors(String…)</td>
</tr>
<tr class="odd">
<td>+</td>
<td>getTitle(): String</td>
</tr>
<tr class="even">
<td>+</td>
<td>getYear(): int</td>
</tr>
<tr class="odd">
<td>+</td>
<td>getAuthors(): List&lt;String&gt;</td>
</tr>
<tr class="even">
<td>+</td>
<td><strong>compareTo(Book): int</strong></td>
</tr>
</tbody>
</table>

You can use only **one constructor**. There **can be no authors**, **one
author,** or **many authors**.

### Examples

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p><strong>public static void</strong> main(String[] args) {<br />
Book bookOne = <strong>new</strong> Book(<strong>"Animal Farm"</strong>, 2003, <strong>"George Orwell"</strong>);<br />
Book bookThree = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 2002);<br />
Book bookTwo = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 1930, <strong>"Dorothy Sayers"</strong>, <strong>"Robert Eustace"</strong>);<br />
<br />
<strong>if</strong> (bookOne.compareTo(bookTwo) &gt; 0) {<br />
System.<em><strong>out</strong></em>.println(String.<em>format</em>(<strong>"%s is before %s"</strong>, bookOne, bookTwo));<br />
} <strong>else if</strong> (bookOne.compareTo(bookTwo) &lt; 0) {<br />
System.<em><strong>out</strong></em>.println(String.<em>format</em>(<strong>"%s is before %s"</strong>, bookTwo, bookOne));<br />
} <strong>else</strong> {<br />
System.<em><strong>out</strong></em>.println(<strong>"Book are equal"</strong>);<br />
}</p>
<p>}</p>
</blockquote></td>
</tr>
</tbody>
</table>

## Book Comparator

Create a class **BookComparator** from the **UML diagram** below:

<table>
<thead>
<tr class="header">
<th><p><strong>&lt;&lt;Comparator&lt;Book&gt;&gt;&gt;</strong></p>
<p><strong>BookComparator</strong></p></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>+</td>
<td><strong>compare(Book, Book): int</strong></td>
</tr>
</tbody>
</table>

**BookComparator** has to **compare** two books by:

1.  Book title.

2.  Year of publishing a book.

### Examples

<table>
<thead>
<tr class="header">
<th>Main.java</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p><strong>public static void</strong> main(String[] args) {<br />
Book bookOne = <strong>new</strong> Book(<strong>"Animal Farm"</strong>, 2003, <strong>"George Orwell"</strong>);<br />
Book bookThree = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 2002);<br />
Book bookTwo = <strong>new</strong> Book(<strong>"The Documents in the Case"</strong>, 1930, <strong>"Dorothy Sayers"</strong>, <strong>"Robert Eustace"</strong>);<br />
<br />
List&lt;Book&gt; books = <strong>new</strong> ArrayList&lt;&gt;();<br />
books.add(bookOne);<br />
books.add(bookTwo);<br />
books.add(bookThree);<br />
<br />
books.sort(<strong>new</strong> BookComparator());<br />
<br />
<strong>for</strong> (Book : books) {<br />
System.<em><strong>out</strong></em>.println(book.getTitle() + book.getYear());<br />
}</p>
<p>}</p>
</blockquote></td>
</tr>
</tbody>
</table>

### Output

The possible outputs are:

  - **"In {cityName} Burger Bus earned {profit} leva."**

  - **"Burger Bus total profit: {totalProfit} leva."**

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
<p>Sofia</p>
<p>895.67</p>
<p>213.50</p>
<p>Plovdiv</p>
<p>2563.20</p>
<p>890.26</p>
<p>Burgas</p>
<p>2360.55</p>
<p>600.00</p></td>
<td><p>In Sofia Burger Bus earned 682.17 leva.</p>
<p>In Plovdiv Burger Bus earned 1672.94 leva.</p>
<p>In Burgas Burger Bus earned 1460.55 leva.</p>
<p>Burger Bus total profit: 3815.66 leva.</p></td>
</tr>
<tr class="even">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="odd">
<td><p>5</p>
<p>Lille</p>
<p>2226.00</p>
<p>1200.60</p>
<p>Rennes</p>
<p>6320.60</p>
<p>5460.20</p>
<p>Reims</p>
<p>600.20</p>
<p>452.32</p>
<p>Bordeaux</p>
<p>6925.30</p>
<p>2650.40</p>
<p>Montpellier</p>
<p>680.50</p>
<p>290.20</p></td>
<td><p>In Lille Burger Bus earned 1025.40 leva.</p>
<p>In Rennes Burger Bus earned 860.40 leva.</p>
<p>In Reims Burger Bus earned -78.28 leva.</p>
<p>In Bordeaux Burger Bus earned 4274.90 leva.</p>
<p>In Montpellier Burger Bus earned 322.25 leva.</p>
<p>Burger Bus total profit: 6404.67 leva.</p></td>
</tr>
</tbody>
</table>

### JS Input / Output

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>(["3",</p>
<p>"Sofia",</p>
<p>"895.67",</p>
<p>"213.50",</p>
<p>"Plovdiv",</p>
<p>"2563.20",</p>
<p>"890.26",</p>
<p>"Burgas",</p>
<p>"2360.55",</p>
<p>"600.00"])</p></td>
<td><p>In Sofia Burger Bus earned 682.17 leva.</p>
<p>In Plovdiv Burger Bus earned 1672.94 leva.</p>
<p>In Burgas Burger Bus earned 1460.55 leva.</p>
<p>Burger Bus total profit: 3815.66 leva.</p></td>
</tr>
<tr class="even">
<td><strong>Input</strong></td>
<td><strong>Output</strong></td>
</tr>
<tr class="odd">
<td><p>(["5",</p>
<p>"Lille",</p>
<p>"2226.00",</p>
<p>"1200.60",</p>
<p>"Rennes",</p>
<p>"6320.60",</p>
<p>"5460.20",</p>
<p>"Reims",</p>
<p>"600.20",</p>
<p>"452.32",</p>
<p>"Bordeaux",</p>
<p>"6925.30",</p>
<p>"2650.40",</p>
<p>"Montpellier",</p>
<p>"680.50",</p>
<p>"290.20"])</p></td>
<td><p>In Lille Burger Bus earned 1025.40 leva.</p>
<p>In Rennes Burger Bus earned 860.40 leva.</p>
<p>In Reims Burger Bus earned -78.28 leva.</p>
<p>In Bordeaux Burger Bus earned 4274.90 leva.</p>
<p>In Montpellier Burger Bus earned 322.25 leva.</p>
<p>Burger Bus total profit: 6404.67 leva.</p></td>
</tr>
</tbody>
</table>

### Input

  - The **possible** commands are:
    
      - **"Blacklist {name}"**
    
      - **"Error {index}"**
    
      - **"Change {index} {new name}"**
    
      - **"Report"**

### Output

  - The **possible** outputs are:
    
      - **"{name****} was blacklisted."**
    
      - **"{name} was not found."**
    
      - **"{name} was lost due to an error."**
    
      - **"{current name} changed his username to {new name}."**
    
      - **"Blacklisted names: {number of blacklisted names}"**
    
      - **"Lost names: {number of lost names}"**

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
<td><p><strong>Mike, John, Eddie</strong></p>
<p><strong>Blacklist Mike</strong></p>
<p><strong>Error 0</strong></p>
<p><strong>Report</strong></p></td>
<td><p><strong>Mike was blacklisted.</strong></p>
<p><strong>Blacklisted names: 1</strong></p>
<p><strong>Lost names: 0</strong></p>
<p><strong>Blacklisted John Eddie</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>Mike, John, Eddie, William</strong></p>
<p><strong>Error 3</strong></p>
<p><strong>Error 3</strong></p>
<p><strong>Change 0 Mike123</strong></p>
<p><strong>Report</strong></p></td>
<td><p><strong>William was lost due to an error.</strong></p>
<p><strong>Mike changed his username to Mike123.</strong></p>
<p><strong>Blacklisted names: 0</strong></p>
<p><strong>Lost names: 1</strong></p>
<p><strong>Mike123 John Eddie Lost</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>Mike, John, Eddie, William</strong></p>
<p><strong>Blacklist Maya</strong></p>
<p><strong>Error 1</strong></p>
<p><strong>Change 4 George</strong></p>
<p><strong>Report</strong></p></td>
<td><p><strong>Maya was not found.</strong></p>
<p><strong>John was lost due to an error.</strong></p>
<p><strong>Blacklisted names: 0</strong></p>
<p><strong>Lost names: 1</strong></p>
<p><strong>Mike Lost Eddie William</strong></p></td>
</tr>
</tbody>
</table>

### JS Examples

The input will be provided as an array of strings.

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><strong>(["Mike, John, Eddie",</strong></p>
<p><strong>"Blacklist Mike",</strong></p>
<p><strong>"Error 0",</strong></p>
<p><strong>"Report"])</strong></p></td>
<td><p><strong>Mike was blacklisted.</strong></p>
<p><strong>Blacklisted names: 1</strong></p>
<p><strong>Lost names: 0</strong></p>
<p><strong>Blacklisted John Eddie</strong></p></td>
</tr>
<tr class="even">
<td><p><strong>(["Mike, John, Eddie, William",</strong></p>
<p><strong>"Error 3",</strong></p>
<p><strong>"Error 3",</strong></p>
<p><strong>"Change 0 Mike123",</strong></p>
<p><strong>"Report"])</strong></p></td>
<td><p><strong>William was lost due to an error.</strong></p>
<p><strong>Mike changed his username to Mike123.</strong></p>
<p><strong>Blacklisted names: 0</strong></p>
<p><strong>Lost names: 1</strong></p>
<p><strong>Mike123 John Eddie Lost</strong></p></td>
</tr>
<tr class="odd">
<td><p><strong>(["Mike, John, Eddie, William",</strong></p>
<p><strong>"Blacklist Maya",</strong></p>
<p><strong>"Error 1",</strong></p>
<p><strong>"Change 4 George",</strong></p>
<p><strong>"Report"])</strong></p></td>
<td><p><strong>Maya was not found.</strong></p>
<p><strong>John was lost due to an error.</strong></p>
<p><strong>Blacklisted names: 0</strong></p>
<p><strong>Lost names: 1</strong></p>
<p><strong>Mike Lost Eddie William</strong></p></td>
</tr>
</tbody>
</table>

### Input

  - The possible commands are:
    
      - **"Chat {message}"**
    
      - **"Delete {message}"**
    
      - **"Edit {message} {editedVersion}"**
    
      - **"Pin {message}"**
    
      - **"Spam {message1} {message2} {messageN}"**
    
      - **"end"**

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
<td><p>Chat Hello</p>
<p>Chat darling</p>
<p>Edit darling Darling</p>
<p>Spam how are you</p>
<p>Delete Darling</p>
<p>end</p></td>
<td><p>Hello</p>
<p>how</p>
<p>are</p>
<p>you</p></td>
</tr>
<tr class="even">
<td><p>Chat Hello</p>
<p>Delete John</p>
<p>Pin Hi</p>
<p>end</p></td>
<td>Hello</td>
</tr>
<tr class="odd">
<td><p>Chat John</p>
<p>Spam Let's go to the zoo</p>
<p>Edit zoo cinema</p>
<p>Chat tonight</p>
<p>Pin John</p>
<p>end</p></td>
<td><p>Let's</p>
<p>go</p>
<p>to</p>
<p>the</p>
<p>cinema</p>
<p>tonight</p>
<p>John</p></td>
</tr>
</tbody>
</table>

### JS Examples

The input will be an array of strings.

<table>
<thead>
<tr class="header">
<th><strong>Input</strong></th>
<th><strong>Output</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>(["Chat Hello",</p>
<p>"Chat darling",</p>
<p>"Edit darling Darling",</p>
<p>"Spam how are you",</p>
<p>"Delete Darling",</p>
<p>"end"])</p></td>
<td><p>Hello</p>
<p>how</p>
<p>are</p>
<p>you</p></td>
</tr>
<tr class="even">
<td><p>(["Chat Hello",</p>
<p>"Delete John",</p>
<p>"Pin Hi",</p>
<p>"end"])</p></td>
<td>Hello</td>
</tr>
<tr class="odd">
<td><p>(["Chat John",</p>
<p>"Spam Let's go to the zoo",</p>
<p>"Edit zoo cinema",</p>
<p>"Chat tonight",</p>
<p>"Pin John",</p>
<p>"end"])</p></td>
<td><p>Let's</p>
<p>go</p>
<p>to</p>
<p>the</p>
<p>cinema</p>
<p>tonight</p>
<p>John</p></td>
</tr>
</tbody>
</table>

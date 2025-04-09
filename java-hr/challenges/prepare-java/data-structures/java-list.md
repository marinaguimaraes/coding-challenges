For this problem, we have $2$ types of queries you can perform on a List:

Insert $y$ at index $x$:
```
Insert
x y
```
Delete the element at index $x$:
```
Delete
x
```
Given a list, $L$, of $N$ integers, perform $Q$ queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

### Input Format

The first line contains an integer, $N$ (the initial number of elements in $L$).
The second line contains $N$ space-separated integers describing $L$.
The third line contains an integer, $Q$ (the number of queries).
The $2Q$ subsequent lines describe the queries, and each query is described over two lines:

- If the first line of a query contains the String `Insert`, then the second line contains two space separated integers `x y`, and the value $y$ must be inserted into $L$ at index $x$.
- If the first line of a query contains the String `Delete`, then the second line contains index $x$, whose element must be deleted from $L$.

#### Constraints

- $1 \le N \le 4000$
- $1 \le Q \le 4000$
- Each element in is a 32-bit integer.

### Output Format

Print the updated list $L$ as a single line of space-separated integers.

### Sample Input
```
5
12 0 1 78 12
2
Insert
5 23
Delete
0
```

### Sample Output
```
0 1 78 12 23
```

### Explanation

$L = [12,0,1,78,12]$\
$Q_0 =$ Insert 23 at index $5$.\
$L_0 = [12,0,1,78,12,23]$\
$Q_1 =$ Delete the element at index $0$\
$L_1 = [0,1,78,12,23]$

Having performed all $Q$ queries, we print $L_1$ as a single line of space-separated integers.
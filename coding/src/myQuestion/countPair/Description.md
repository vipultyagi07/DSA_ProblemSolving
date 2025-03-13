
## Given two sorted arrays, count the number of pair from both array in such a way the element from array1 > array2 then it is a valid pair

Example 

### array1
```bash
[2,3,5,6］
```

### array2
```bash
[2,2,4,4,8]
```

answer
```bash
10
```

### Explanation

Possible pairs, where `left array element` >  `right array element`
```bash
(3,2), (3,2), (5,2), (5,2), (5,4), (5,4), (6,2), (6,2), (6,4), (6,4)
```

### Expexcted TC

less then O(n*n)


### Solution 

[CountPair.java](CountPair.java)
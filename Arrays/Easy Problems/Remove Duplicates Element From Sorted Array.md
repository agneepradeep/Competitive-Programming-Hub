# Remove Duplicate Elements from Sorted Array

## Problem
Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

## Approach
### Brute Force Approach
1. Declare a new Data structure `Set` which basically does not store duplicate elements.
2. Traverse the Array and append the elements to the set.
3. Traverse the Set and reassign the elements of the array.

### Optimal Approach
- **Two Pointer Approach**
1. Declare 2 Variables namely `i` and `j`.
2. Traverse the Array concurrently with j and check whether array[j] != array[i] if true just replace array[i+1] = array[j].
## Pseudocode
### Brute Force Approach
```vbnet
Function removeDuplicates(arr):
    Initialize an empty HashSet called set

    For each element in arr:
        Add the element to the set

    Set k to the size of the set (number of unique elements)
    
    Initialize j to 0

    For each element x in set:
        Set arr[j] to x
        Increment j by 1

    Return k
```
### Optimal Force Approach
```vbnet
Function removeDuplicates(arr):
    Initialize i to 0

    For j from 1 to length of arr - 1:
        If arr[i] is not equal to arr[j]:
            Increment i by 1
            Set arr[i] to arr[j]

    Return i + 1

```

## Code
### Brute Force Approach
``` java []
static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
```
- **Space Complexity** - $O(n)$
- **Time Complexity** - $O(n*log(n))+O(n)$

### Optimal Approach
``` java []
static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    } 
```
- **Space Complexity** - $O(1)$
- **Time Complexity** - $O(n)$
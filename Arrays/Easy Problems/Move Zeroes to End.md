# Move Zeroes to End of Array

## Problem Statement
You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

```vbnet
Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation:
 All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input:
 1,2,0,1,0,4,0
Output:
 1,2,1,4,0,0,0
Explanation:
 All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
```

## Approach
### Complex Approach

1. **Initialization**:
   - Start with two variables: 
     - `i` as the current index that is being checked.
     - `j` as a pointer used to find the next non-zero element after `i`.
   - Use a `temp` variable for swapping the elements.

2. **Iterating Through the Array**:
   - Loop through the array from index `0` to `n-1` using `i`.
   - For each element at index `i`, check if it's a `0`. If it is, proceed to the next steps. If not, continue to the next element (`i+1`).

3. **Finding the Next Non-Zero Element**:
   - When a `0` is found at index `i`, set `j` to `i+1` and begin another loop to search for the next non-zero element in the array starting from `i+1`.
   - This loop increments `j` until a non-zero element is found or the end of the array (`j == n`) is reached.

4. **Swapping**:
   - Once a non-zero element is found at index `j`, swap the elements at `i` and `j`. This effectively moves the `0` to the right and brings the non-zero element forward.
   - If no non-zero element is found (i.e., `j == n`), there is nothing to swap, and the algorithm continues.

5. **Continue Until End of Array**:
   - The outer loop continues for all elements in the array. Each time a `0` is found, the inner loop is used to find the next non-zero element and swap it.

6. **Return the Result**:
   - After the loop completes, the array will have all `0`s moved to the end, with non-zero elements retaining their relative order. The array is then returned.


### Simple Approach

1. **Initialization**:
   - Start by initializing a pointer `j` to `0`. This pointer will track the position where the next non-zero element should be placed.

2. **First Loop - Shifting Non-Zero Elements**:
   - Loop through the array from index `0` to `n-1` using the variable `i`.
   - For each element at index `i`, check if it is not `0`.
     - If it’s a non-zero element, place it at position `j` in the array (`a[j] = a[i]`), and then increment `j`.
     - This ensures that all non-zero elements are shifted to the left, keeping their original relative order.

3. **Second Loop - Filling Zeros**:
   - After processing all the elements, `j` will be pointing to the index where the first `0` should be placed.
   - From index `j` to `n-1`, fill the array with `0`s. This will effectively push all zeros to the end of the array.

4. **Return the Result**:
   - Once the zeros are moved to the end and non-zero elements are in place, return the modified array.

### Time Complexity:
- **First loop**: The array is traversed once to move all non-zero elements, which takes **O(n)** time.
- **Second loop**: Another pass through the array is made to set the remaining elements to `0`, which also takes **O(n)** time.
- Therefore, the overall time complexity is **O(n)**.



## Pseudocode
### Complex Approach
```vbnet []
Function moveZeros(n, a):
    Initialize j to 0
    Declare temp variable for swapping

    For i from 0 to n-1:
        If a[i] is 0:
            Set j to i+1
            For j from i+1 to n-1:
                If a[j] is not 0:
                    Break from the inner loop

            If j is not equal to n:
                Swap a[i] with a[j]

    Return array a

```
### Simple Approach
``` vbnet []
Function moveZeros(n, a):
    Initialize j to 0

    For i from 0 to n-1:
        If a[i] is not 0:
            Set a[j] to a[i]
            Increment j by 1

    For i from j to n-1:
        Set a[i] to 0

    Return array a

```
## Complexity
### Complex Approach
- **Space Complexity** - $O(1)$
- **Time Complexity** - $O(n^2)$
### Simple Approach
- **Space Complexity** - $O(1)$
- **Time Complexity** - $O(n)$

## Code
### Complex Approach
```java []
public class Solution {
        public static int[] moveZeros(int n, int []a) {
        int j = 0;
        int temp;

        for(int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i+1;
                for (j = i+1; j<n ;j++) {
                    if (a[j] != 0) {
                        break;
                    }
                }
                if (j != n) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return a;
    }
}
```

### Simple Approach
```java []
public class Solution {
        public static int[] moveZeros(int n, int []a) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }
}
```
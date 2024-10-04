# Maximum Consecutive Ones

## Problem Statement
Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
```
Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1} 

Output: 2

Explanation: There are two consecutive 1's in the array. 
```
## Approach
Here’s a step-by-step approach to solve the problem described by the pseudocode, where the goal is to find the maximum number of consecutive `1`s in a binary array:

### Problem Understanding:
You are given an array of binary numbers (consisting of only `0`s and `1`s). You need to find the length of the longest contiguous segment where the array contains only `1`s.

### Approach:

1. **Initialize Counters:**
   - `maxCount`: This will store the maximum number of consecutive `1`s found so far. Initialize it to `0`.
   - `tempCount`: This will keep track of the current streak of consecutive `1`s. Initialize it to `0`.

2. **Iterate Over the Array:**
   - Loop through each element of the array `nums`.
   - For each element:
     - If the element is `1`, increment `tempCount` because it's part of a consecutive streak of `1`s.
     - If the element is `0`, reset `tempCount` to `0` because the streak is broken.

3. **Update Maximum Count:**
   - During the iteration, if the current `tempCount` (the length of the current streak) exceeds `maxCount`, update `maxCount` to be equal to `tempCount`. This ensures that `maxCount` will always contain the longest streak encountered so far.

4. **Return the Result:**
   - After finishing the loop, return the value of `maxCount`, which will be the length of the longest contiguous segment of `1`s.

## Pseudocode
```vbnet []
Initialize maxCount to 0
Initialize tempCount to 0

For each element in the array:
    If the current element is 0:
        Set tempCount to 0
    Else:
        Increment tempCount by 1

        If tempCount is greater than maxCount:
            Set maxCount to tempCount

Return maxCount
```

## Complexity
**Space Complexity** - $O(1)$  
**Time Complexity** - $O(n)$

## Code
```java []
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int tempCount = 0;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {
                tempCount = 0;
            } else {
                tempCount ++;

                if (tempCount > maxCount) maxCount = tempCount;
            }
        }
        return maxCount;
    }
}
```
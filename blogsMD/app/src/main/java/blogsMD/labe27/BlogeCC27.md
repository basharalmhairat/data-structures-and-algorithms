Merge Sort is a sorting algorithm,
which is commonly used in computer science. Merge Sort is a divide and conquer
algorithm. It works by recursively breaking down a problem into two or more 
sub-problems of the same or related type, until these become simple enough to
be solved directly. The solutions to the sub-problems are then combined to give
a solution to the original problem. So Merge Sort first divides the array into
equal halves and then combines them in a sorted manner.

![](../../../../../../../../../../Downloads/CC27.png)
The big O of merge sort for space complexity is O(n)
because as n grows we have allocated that much more space to memory
(from each of the arrays we have to split and merge).
The big O runtime complexity is O(n log b), because we have to split(decompose)
the input array O(log n) times. For example with an array of 32 inputs, 
we have to split the array 5 times (2^5), and then n comparisons to merge 
the arrays back together. This results in O(log n) * O (n) which is equal to O (n log n).
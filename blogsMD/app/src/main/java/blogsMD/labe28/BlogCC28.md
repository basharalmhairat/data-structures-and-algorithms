# Quicksort

Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle. It has
an average O(n log n) complexity and it's one of the most used sorting algorithms,
especially for big data volumes.

The key process in quickSort is partition(). Target of partitions is, given an array
and an element x of array as pivot, put x at its correct position in sorted array and
put all smaller elements (smaller than x) before x, and put all greater elements
(greater than x) after x. All this should be done in linear time.


1.Always pick first element as pivot.
2.Always pick last element as pivot (implemented below)
3.Pick a random element as pivot.
4.Pick median as pivot.


![](../../../../../../../../../../Downloads/Whiteboard(5).png)


This function takes last element as pivot, places
the pivot element at its correct position in sorted
array, and places all smaller (smaller than pivot)
to left of pivot and all greater elements to right
of pivot 


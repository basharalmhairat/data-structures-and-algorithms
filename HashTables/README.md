# Hashtables

In computing, a hash table, also known as hash map, is a data structure that implements a set abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.

---
## Challenge
Implement a Hashtable Class with the following methods:

set ,get, contains, keys, hash.

---
## Approach & Efficiency

Time  : O(1)

Space : O(n)

---
## API

### set:

Arguments: key, value
Returns: nothing
This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
Should a given key already exist, replace its value from the value argument given to this method.

### get:

Arguments: key
Returns: Value associated with that key in the table

### contains:

Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

### keys:

Returns: Collection of keys

###hash:

Arguments: key
Returns: Index in the collection for that key
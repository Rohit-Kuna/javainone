🔹 1. Arrays.sort()

Package: java.util.Arrays
Use: Sorts arrays (both primitive and object types).
Overloads:

Arrays.sort(int[] arr)
Arrays.sort(String[] arr)
Arrays.sort(Object[] arr, Comparator)


Algorithm:

Dual-Pivot Quicksort for primitives.
TimSort for objects (a hybrid of merge sort and insertion sort).



🔹 2. Collections.sort()

Package: java.util.Collections
Use: Sorts List implementations like ArrayList, LinkedList.
Signature:

Collections.sort(List<T> list)
Collections.sort(List<T> list, Comparator<? super T> c)


Algorithm: TimSort (optimized for partially sorted data).


🔹 3. List.sort() (Java 8+)

Package: java.util.List
Use: Sorts a list using a comparator.

list.sort(Comparator.naturalOrder());
list.sort(Comparator.reverseOrder());

Advantage: More modern and functional-style than Collections.sort().


🔹 4. Stream.sorted() (Java 8+)

Package: java.util.stream
Use: Returns a sorted stream (does not modify the original collection).
Examples:
list.stream().sorted().collect(Collectors.toList());



🔹 5. PriorityQueue (for implicit sorting)

Package: java.util
Use: Maintains elements in a sorted (heap) order.
Note: Not a sorting method per se, but useful for ordered retrieval.


🔹 6. TreeSet / TreeMap

Package: java.util
Use: Automatically keeps elements/keys in sorted order.
Note: Uses Red-Black Tree internally.
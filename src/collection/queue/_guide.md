- Queue #interface (queue)
    - LinkedList #implementation_class
    - ArrayDeque #implementation_class
- PriorityQueue <-> PriorityQueue #implementation_class (min/max-heaps)
- Deque #interface (double ended queue)
    - LinkedList #implementation_class
    - ArrayDeque #implementation_class

# ArrayDeque vs LinkedList
- ArrayDeque is faster than LinkedList when used as a stack / queue
- ArrayDeque uses a circular array internal, but if an ele is removed at front the elements are not shifted
- But the indexes are manipulated in circular way using mod, hence faster than Linkedlist
vs
- Use LinkedList only when we want to remove from middle is a requirement

public interface Iterable<T> {
    Iterator<T> iterator();
}


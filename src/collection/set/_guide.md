
floor(k)    // closest <= k
ceiling(k) // closest >= k
lower(k)   // strictly <
higher(k)  // strictly >

# Interfaces
- Set
- SortedSet
- NavigableSet

# Implementaion Classes
- HashSet
- LinkedHashSet
- TreeSet

# For TreeSet object when to use which reference type
- Set -> sorted but simple Set ops
- SortedSet -> sorted + basic navigation
    - first()
    - last()
    - subSet(from s, to e]
    - headSet(to e)
    - tailSet(from s)
- NavigableSet -> sorted + SortedSet ops + advance navigation
    - floor(k)    // closest <= k
    - ceiling(k) // closest >= k
    - lower(k)   // strictly <
    - higher(k)  // strictly >



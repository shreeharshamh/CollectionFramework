HashSet
-------
-> underlying data structure    : Hashtable
-> Duplicates                   : Not allowed
        when we try to add duplicate, there will be no RE or CE
        however, return type for add method is boolen and the compiler
        returns false
-> Insertion order              : Not Preserved
        all objects will be inserted based on hash code of objects
        and insertion order wont be Preserved
-> Heterogenous                 : Allowed
-> Null insertion               : Possible
-> Implements Serializable & Cloneable Interface
-> If our frequent operation is search operation, then HashSet is the best choice.

for all below 
HashSet
LinkedHashSet
HashMap
IdentityHashMap
HashMap
HashTable 
hashing related data structures, the constructors are common

Constructors
------------
1. HashSet<Object> hashSet = new HashSet<>();
    creates an empty HashSet with 
        default initial capacity = 16
        default fill ratio = 0.75
        fill ratio is also known as load factor
    When a HashSet reaches 75% of fill capacity of default initial capacity of 16, then only a new HashSet will be created
    with bigger capacity will be created.

2. HashSet<Object> hashSet = new HashSet<>(int initialCapacity);
3. HashSet<Object> hashSet = new HashSet<>(int initialCapacity, float loadFactor);
4. HashSet<Object> hashSet = new HashSet<>(Collectionc C);


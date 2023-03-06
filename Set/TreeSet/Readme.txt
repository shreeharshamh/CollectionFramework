TreeSet
-------
-> Underlying data structure : Balanced Tree
-> Duplicates                : Not Allowed
-> Insertion order           : Not preserved but objects will be inserted
                               in some order
-> Heterogenous objects      : Not Allowed
                               If you try to add heterogenous objects, then we get
                               runtime exception (RE:CCE) Class Cast Exception.
-> Null Insertion            : Possible only once.

TreeSet Constructors
--------------------
1. TreeSet<Object> t = new TreeSet<>();
    all the elements will be inserted according to Default Natural Sorting Order (DNSO).
    Ascending order if Numbers 
    Alphabetical order if Strings

2. TreeSet<Object> t = new TreeSet<>(Comparator C);
    elements will be inserted according to customized sorting order
    Comparator is required to define the customized sorting.

3. TreeSet<Object> t = new TreeSet<>(Collection C);
4. TreeSet<Object> t = new TreeSet<>(SortedSet S);

Note : If you're expecting DNSO, then compulsorily the Objects should be Homogenous and Comparable.
       otherwise, there will be class cast exception (CCE).


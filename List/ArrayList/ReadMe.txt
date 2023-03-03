ArrayList
---------
-> Duplicates           allowed
-> Insertion order      preserved
-> Heterogenous objects allowed
-> Null Insertion       possible

Note :
Usually we can use Collections to hold and transfer Objects from one place to another place,
to provide support for this requirement every Collection already implements Serializable and
Cloneable interfaces.

ArrayList 
Vector       
        both implements RandomAccess(Interface) (java.util package, Marker(I))
        we can access any element in the ArrayListat the same speed.


Methods : 
---------
add(int index, Object O);
addAll(int index, Collection C);
remove(int index);
indexOf(element);
lastIndexOf(element);

Constructors :
--------------
below given are the three constructors in ArrayList

1. ArrayList arrayList = new ArrayList();
2. ArrayList arrayList = new ArrayList(int initialCapacity);
3. ArrayList arrayList = new ArrayList(Collection C);


Pros and Cons
-------------
-> best choise when our frequent operation is retrieval operations
-> worst choice when our frequent operation is shifting operations
-> every method in ArrayList is non-synchronized
-> multiple threads are allowed to operate on ArrayList and not thread safe.
-> performance of system is relatively high

Synchronized ArrayList
----------------------
ArrayList arrayList = new ArrayList();
List list = Collections.synchronizedList(arrayList);

----------------------------------------------------------------------------------
LinkedList
----------
-> Duplicates       allowed
-> Insertion order  preserved

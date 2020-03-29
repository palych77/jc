package ru.prg.collection;


public interface IList {
    int size();

    boolean isEmpty();

    boolean contains(Object var1);

    Object[] toArray();

    boolean add(Object var1);

    boolean remove(Object var1);

    boolean containsAll(IList var1);

    boolean addAll(IList var1);

    boolean removeAll(IList var1);

    void clear();

    boolean equals(Object var1);

    int hashCode();


}

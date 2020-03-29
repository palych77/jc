package ru.prg.collection;

public class PList {
    private int size = 0;
    private int initSize = 10;

    private int[] elements = null;

    public PList() {
        this(10);
        size = initSize;
    }

    public PList(int initSize) {
        elements = new int[initSize];
        size = initSize;
    }



    Integer get(int index) {
        return  elements[index];

    }

    void add(int index, Integer elem) {
        int[] elementsNew = new int[this.elements.length+1];
        System.arraycopy(elements,0,elementsNew,0,index);
        elementsNew[index] = elem;
        System.arraycopy(elements,index,elementsNew,index+1,elements.length-index);
        this.elements = elementsNew;
        size++;
    }

    void add(Integer elem) {
        int[] elementsNew = new int[this.elements.length+1];
        //System.out.println(elementsNew.length);
        System.arraycopy(this.elements,0,elementsNew,0,this.elements.length);
        elementsNew[elementsNew.length - 1] = elem;
        this.elements = elementsNew;
        size++;
    }

    public Integer getSize() {return this.size;}
}

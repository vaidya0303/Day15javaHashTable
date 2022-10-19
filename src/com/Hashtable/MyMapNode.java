package com.Hashtable;

/**
 *
 * create a method name as MyMapNode
 */
public class MyMapNode <K, V> {
    K key;
    V value;
    MyMapNode<K, V> next;

    /**
     * create constructor name same as class name and they are passing parameter
     * @param key
     * @param value
     */
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    /**
     * here we use getter and setter
     * method setKey is passing passing parameter this is the set the key
     * getKey is return the key
     * @return key
     */
    public K getKey() {
        return key;
    }
/*
 * setter method
 * it is parameterised method
 */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * here we use getValue and SetValue method
     * getValue is no parameter passed they just return value
     * @return value
     */
    public V getValue() {
        return value;
    }

    /**
     * here used seValue method
     * this is parameterised method coz parameter passed
     * here set the value
     *
     */
    public void setValue(V value) {
        this.value = value;
    }

    /*
     * create a method getNext this is return next value
     */
    public MyMapNode<K, V> getNext() {
        return next;
    }
/*
 * here method create setNet set the key and value
 */
    public void setNext(MyMapNode<K, V> next) {
        this.next = next;
    }


    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node{" + "Key=").append(key).append(" Value=").append(value).append("}");
        if(next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
package com.Hashtable;

/*
 * create a class name as MyMapNode key and value pair
 */
public class MyMapNode <K, V> {
    K key;
    V value;
    MyMapNode<K, V> next;

    /**
     * create parameterised constructor
     * they initialinze key ,value and ,next is null
     * @param key
     * @param value
     */
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    /**
     * getter and setter used
     *
     * @return key
     */
    public K getKey() {
        return key;
    }

    /**
     * setKey is passing the parameter like key
     * they set the key
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * here we create getValue method
     * @return value
     */
    public V getValue() {
        return value;
    }

    /**
     * method create name as setValue
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next;
    }

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
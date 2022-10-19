package com.Hashtable;

/**
 * create class class name as MyMapNode.
 *
 */
public class MyMapNode <K,V>{

    K key;
    V value;
    MyMapNode<K, V> next;

    /**
     *  cretae constructor name as MyMaoNode and passing key and value
     *  here
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
       * 1st get key and set key
       * getkey is return key setkey is set the key
       */
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;

    }

    /**
     * here we used getvalue method and setvalue
     * set is set the value
     * and get value is return value
     * @return return is value
     */
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next = (MyMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode{" + " Key= ").append(key).append(" Value= ").append(value).append('}');
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
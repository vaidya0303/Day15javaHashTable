package com.Hashtable;  // package name

/** Ability to find frequency of words in a large paragraph phrase “Paranoids are not paranoid because they are
 * paranoid but because they keep putting themselves deliberately into paranoid avoidable situations”
 * - Use hashcode to find index of the words in the para
 * - Create LinkedList for each index and store the words and its frequency
 * - Use LinkedList to do the Hash Table Operation
 * - To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode
 *
 */

/**
 * main class in this program
 */
public class HashTableMain {

    /**
     *
     * main method all code execute in main method
     */
    public static void main(String[] args) {

        MyHashMap<String, Integer> hashTable = new MyHashMap();
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        /**
         *  Storing given sentence in an array.
         * Converting the sentence to lower case and removing spaces.
         */

        String[] sentenceArray = sentence.toLowerCase().split(" ");

        /**
         *  Iterating over the array.
         */

        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            /**
             * If not found, frequency of the word StayWith 1
             */

            if( value == null)
                value = 1;
            else
            /**
             *   If found, frequency of the word increases by 1
             */

                value = value + 1;
            hashTable.add(word , value);
        }
        System.out.println(hashTable);
    }
}
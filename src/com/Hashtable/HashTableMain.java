package com.Hashtable;  // package name

/** Ability to find frequency of words in a sentence like “To be or not to be”
 * - Use LinkedList to do the Hash Table Operation
 * - To do this we create MyMapNode with Key Value Pair and create LinkedList of MyMapNode
 *
 */
public class HashTableMain {

    public static void main(String[] args) {

        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "To be or not to be";

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

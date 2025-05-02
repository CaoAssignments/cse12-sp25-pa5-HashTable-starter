public class MyHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 5;
    private static final double LOAD_FACTOR = 0.8;
    private static final int EXPAND_CAPACITY_RATIO = 2;
    private static final int HASH_CODE_MASK = 0x7fffffff;

    Node[] hashTable;
    int size;

    public MyHashMap() {
        /* Add your implementation here */
        // TODO
    }

    public MyHashMap(int initialCapacity) {
        /* Add your implementation here */
        // TODO
    }

    public V get(K key) {
        /* Add your implementation here */
        return null; // TODO
    }

    public V put(K key, V value) {
        /* Add your implementation here */
        return null; //TODO
    }

    public V remove(K key) {
        /* Add your implementation here */
        return null; // TODO
    }

    public int size() {
        /* Add your implementation here */
        return 0; // TODO
    }

    public int getCapacity() {
        /* Add your implementation here */
        return 0; // TODO
    }

    public void clear() {
        /* Add your implementation here */
        // TODO
    }

    public boolean isEmpty() {
        /* Add your implementation here */
        return false; // TODO
    }

    public void expandCapacity() {
        /* Add your implementation here */
        // TODO
    }

    public int getHash(K key, int capacity) {
        /* Add your implementation here */
        // TODO: Add checks for invalid inputs

        // Hashing function is given here. DO NOT MODIFY THIS
        return (key.hashCode() & HASH_CODE_MASK) % capacity;
    }

    /**
     * A Node class that holds (key, value) pairs and references to the next node in the linked list
     */
    protected class Node<K,V> {
        K key;
        V value;
        Node next;

        /**
         * Constructor to create a single node
         * @param key key to store in this node
         * @param value value to store in this node
         */
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        /**
         * Accessor to get the next node in the list
         * @return the next node
         */
        public Node getNext() {
            return this.next;
        }

        /**
         * Set the next node in the list
         * @param n the new next node
         */
        public void setNext(Node n) {
            next = n;
        }

        /**
         * Accessor to get the node's key
         * @return this node's key
         */
        public K getKey() {
            return this.key;
        }

        /**
         * Set the node's key
         * @param key the new key
         */
        public void setKey(K key) {
            this.key = key;
        }

        /**
         * Accessor to get the node's value
         * @return this node's value
         */
        public V getValue() {
            return this.value;
        }

        /**
         * Set the node's value
         * @param value the new value
         */
        public void setValue(V value) {
            this.value = value;
        }

        /**
         * Check if this node is equal to another node
         * @param other the other node to check equality with
         * @return whether or not this node is equal to the other node
         */
        public boolean equals(Node<K, V> other) {
            return this.key.equals(other.key) && this.value.equals(other.value);
        }
    }
}

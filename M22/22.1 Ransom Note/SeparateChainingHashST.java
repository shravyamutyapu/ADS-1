/**
 * solution class.
 * @param <Key> tag.
 * @param <Value> tag.
 */
public class SeparateChainingHashST<Key, Value> {
    /**
     * private variable.
     */
    private static final int INIT_CAPACITY = 4;
    /**
     * private value N .
     */
    private int n;
    /**
     * private value M .
     */
    private int m;
    /**
     * array.
     * // array of linked-list symbol tables.
     */
    private SequentialSearchST<Key, Value>[] st;
    /**
     * Initializes an empty symbol table.
     */
    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * @param m1 the initial number of chains
     */
    public SeparateChainingHashST(final int m1) {
       this.m = m1;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m1];
        for (int i = 0; i < m1; i++) {
            st[i] = new SequentialSearchST<Key, Value>();
        }
    }

    // resize the hash table to have the given number of chains,
    // rehashing all of the keys
    // private void resize(int chains) {
    //     SeparateChainingHashST<Key, Value>
    //temp = new SeparateChainingHashST<Key, Value>(chains);
    //     for (int i = 0; i < m; i++) {
    //         for (Key key : st[i].keys()) {
    //             temp.put(key, st[i].get(key));
    //         }
    //     }
    //     this.m  = temp.m;
    //     this.n  = temp.n;
    //     this.st = temp.st;
    // }

    // hash value between 0 and m-1
    /**
     * hash method.
     * @param key [description]
     * @return int[description]
     */
    private int hash(final Key key) {
        /**
         * magic number.
         */
        final int magic = 0x7fffffff;
        return (key.hashCode() & magic) % m;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns true if this symbol table contains the specified key.
     *
     * @param key key value.
     * @return {@code true} if this symbol table contains {@code key};
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(final Key key) {
    if (key == null) {
        throw new
        IllegalArgumentException("argument to contains() is null");
    }
        return get(key) != null;
    }

    /**
     * Returns the value associated with the specified key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with {@code key} in the symbol table;
     *         {@code null} if no such value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(final Key key) {
        if (key == null) {
            throw
        new IllegalArgumentException("argument to get() is null");
    }
        int i = hash(key);
        return st[i].get(key);
    }

    /**
     * Inserts the specified key-value pair
     * into the symbol table, overwriting the old
     * value with the new value if the symbol
     * table already contains the specified key.
     * Deletes the specified key (and its associated
     * value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(final Key key, final Value val) {
        if (key == null) {
            throw
            new IllegalArgumentException("first argument to put() is null");
        }
        if (val == null) {
            delete(key);
            return;
        }

        // double table size if average length of list >= 10
        // if (n >= 10*m) resize(2*m);

        int i = hash(key);
        if (!st[i].contains(key)) {
            n++;
        }
        st[i].put(key, val);
    }

    /**
     * Removes the specified key and.
     * its associated value from this symbol table
     * (if the key is in this symbol table).
     *
     * @param  key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(final Key key) {
if (key == null) {
    throw
    new IllegalArgumentException("argument to delete() is null");
    }
        int i = hash(key);
        if (st[i].contains(key)) {
            n--;
        }
        st[i].delete(key);

        // halve table size if average length of list <= 2
        // if (m > INIT_CAPACITY && n <= 2*m) resize(m/2);
    }

    // return keys in symbol table as an Iterable
    // public Iterable<Key> keys() {
    //     Queue<Key> queue = new Queue<Key>();
    //     for (int i = 0; i < m; i++) {
    //         for (Key key : st[i].keys())
    //             queue.enqueue(key);
    //     }
    //     return queue;
    // }


    // /**
    //  * Unit tests the {@code SeparateChainingHashST}
    // data type.
    //  *
    //  * @param args the command-line arguments
    //  */
    // public static void main(String[] args) {
    //     SeparateChainingHashST
    //<String, Integer> st = new
    //SeparateChainingHashST<String, Integer>();
    //     for (int i = 0; !StdIn.isEmpty(); i++) {
    //         String key = StdIn.readString();
    //         st.put(key, i);
    //     }

    //     // print keys
    //     for (String s : st.keys())
    //         StdOut.println(s + " " + st.get(s));

    // }

}

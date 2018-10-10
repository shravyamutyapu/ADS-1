/**
 * Search table class.
 */
class SearchTable {
    /**
     * private array that takes in keys.
     */
    private String[] keys;
    /**
     * private int array values.
     */
    private int[] values;
    /**
     * size variable.
     */
    private int size = 0;
    /**
     * search table constructor.
     * @param len [description]
     */
    SearchTable(int len) {
        keys = new String[len];
        values = new int[len];
    }
    /**
     * rank method is similar to binary search.
     * @param str
     * @return the index at which key is present.
     */

    public int rank(String str) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (keys[mid].compareTo(str) < 0) {
                low = mid + 1;
            } else if (keys[mid].compareTo(str) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
    /**
     * It is like insert method.
     * @param key [description]
     * @param value [description]
     */

    public void put(final String key, final int value) {
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            values[i] = value;
            return;
        }
        if (size == 0) {
            keys[size] = key;
            values[size] = value;
            size++;
            return;
        }
        for (int j = size; j > i; j--) {
            values[j] = values[j - 1];
            keys[j] = keys[j - 1];
        }
        values[i] = value;
        keys[i] = key;
        size++;
    }
    /**
     * checks the element's presence.
     * @param key .
     * @return true/false [description]
     */
    public boolean contains(final String key) {
        int i = rank(key);
        return keys[i].equals(key);
    }
    /**
     * return the element near to the key.
     * @param key [description]
     * @return String[description]
     */

    public String floor(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return keys[i];
        } else if (i == 0) {
            return null;
        } else {
            return keys[i - 1];
        }
    }
    /**
     * method returns the index of key.
     * @param String [description]
     * @return [description]
     */
    public String get(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return values[i] + "";
        } else {
            return null;
        }
    }
    /**
     * returns all keys.
     */
    public void keys() {
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + " " + values[i]);
        }
    }
    /**
     * @return max element[description]
     */
    public String max() {
        return keys[size - 1];
    }
    /**
     * deletes the min element.
     */
    public void deleteMin() {
        for (int j = 0; j < size - 1; j++) {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        keys[size] = null;
        values[size] = 0;
        size--;
    }
}
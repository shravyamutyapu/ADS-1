class SearchTable {
    private String[] keys;

    private int[] values;

    private int size = 0;

    SearchTable(int len) {
        keys = new String[len];
        values = new int[len];
    }

    public int rank(String k) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (keys[mid].compareTo(k) < 0) {
                low = mid + 1;
            } else if (keys[mid].compareTo(k) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }

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

    public boolean contains(final String key) {
        int i = rank(key);
        return keys[i].equals(key);
    }

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

    public String get(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return values[i] + "";
        } else {
            return null;
        }
    }

    public void keys() {
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + "" + values[i]);
        }
    }

    public String max() {
        return keys[size];
    }

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
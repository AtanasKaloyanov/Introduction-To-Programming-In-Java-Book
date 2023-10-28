package org.example.Dictionaries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HashDictionary<K, V> implements Dictionary<K, V> {
    private static final int DEFAULT_CAPACITY = 2;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private List<DictionaryEntry<K, V>>[] table;
    private float loadFactor;
    private int threshold;
    private int size;

    public HashDictionary() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    @SuppressWarnings("Not checked")
    public HashDictionary(int capacity, float loadFactor) {
        this.table = new List[capacity];
        this.loadFactor = loadFactor;
        this.threshold = (int) (this.table.length * this.loadFactor);
    }

    @Override
    public void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    public List<DictionaryEntry<K, V>> findChain(K key, boolean createIfMissing) {
        int index = key.hashCode();
        index = index % this.table.length;
        if (table[index] == null && createIfMissing) {
            table[index] = new ArrayList<>();
        }
        return table[index];
    }
    @Override
    public V get(K key) {
        List<DictionaryEntry<K, V>> chain = findChain(key, false);
        if (chain != null) {
            for (DictionaryEntry<K, V> dictionaryEntry : chain) {
                if (dictionaryEntry.getKey().equals(key)) {
                    return dictionaryEntry.getValue();
                }
            }
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<DictionaryEntry<K, V>> iterator() {
        return null;
    }
}

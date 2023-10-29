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

    public List<DictionaryEntry<K, V>> findChain(K key, boolean createIfMissing) {
        int index = key.hashCode();
        index = index % this.table.length;
        if (table[index] == null && createIfMissing) {
            table[index] = new ArrayList<>();
        }
        return table[index];
    }

    @Override
    public V put(K key, V value) {
        List<DictionaryEntry<K, V>> chain = findChain(key, true);
        for (int i = 0; i < chain.size(); i++) {
            DictionaryEntry<K, V> entry = chain.get(i);
            if (entry.getKey().equals(key)) {
                DictionaryEntry<K, V> newEntry = new DictionaryEntry<>();
                chain.set(i, newEntry);
                return entry.getValue();
            }
        }
        chain.add(new DictionaryEntry<>(key, value));
        if (size++ >= threshold) {
            expand();
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    private void expand() {
        int newCapacity = 2 * this.table.length;
        List<DictionaryEntry<K, V>>[] oldTable = this.table;
        this.table = new List[newCapacity];
        this.threshold = (int) (newCapacity * this.loadFactor);
        for (List<DictionaryEntry<K, V>> oldChain : oldTable) {
            if (oldChain != null) {
                for (DictionaryEntry<K, V> dictionaryEntry : oldChain) {
                    List<DictionaryEntry<K, V>> chain = findChain(dictionaryEntry.getKey(), true);
                    chain.add(dictionaryEntry);
                }
            }
        }
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
    public boolean remove(K key) {
        List<DictionaryEntry<K, V>> entries = findChain(key, true);
        if (entries != null) {
            for (int i = 0; i < entries.size(); i++) {
                DictionaryEntry<K, V> currentEntry = entries.get(i);
                if (currentEntry.getKey().equals(key)) {
                    entries.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<DictionaryEntry<K, V>> iterator() {
       List<DictionaryEntry<K, V>> entries = new ArrayList<>(this.table.length);
       for (List<DictionaryEntry<K, V>> currentEntries : this.table) {
           if (currentEntries != null) {
               entries.addAll(currentEntries);
           }
       }
       return entries.iterator();
    }
}



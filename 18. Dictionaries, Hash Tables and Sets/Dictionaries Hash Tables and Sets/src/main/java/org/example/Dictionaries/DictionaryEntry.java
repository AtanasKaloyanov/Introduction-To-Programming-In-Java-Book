package org.example.Dictionaries;

public class DictionaryEntry<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public  String toString() {
        return String.format("[%s, %s]", key, value);
    }
}

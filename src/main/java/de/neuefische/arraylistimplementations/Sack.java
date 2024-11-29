/*
Write a class 'Sack' that functions like an ArrayList. It can only use primitive data types and arrays.
Implement step by step the methods add, get, size, remove last, remove by index, and so on.*/

package de.neuefische.arraylistimplementations;

import java.util.Arrays;

public class Sack {
    private Object[] content;

    public Sack(Object[] content) {
        this.content = content;
    }

    public Object[] getAll() {
        return content;
    }

    public int getSize() {
        return content.length;
    }

    public void add (Object type) {
        int newLength = this.getSize() + 1;
        content = Arrays.copyOf(content, newLength);
        content[newLength - 1] = type;
    }

    public void removeLast() {
        int newLength = this.getSize() - 1;
        content = Arrays.copyOf(content, newLength);
    }

    public void removeByIndex(int index) {
        int newLength = this.getSize() - 1;
        Object[] newcontent = new Object[newLength];

        Object[] firstPart = Arrays.copyOfRange(content, 0, index);
        Object[] secondPart = Arrays.copyOfRange(content, index + 1, content.length);

        for (int i = 0; i < firstPart.length; i++) {
            newcontent[i] = firstPart[i];
        }
        for (int i = 0; i < secondPart.length; i++) {
            newcontent[firstPart.length + i] = secondPart[i];
        }

        content = newcontent;

    }
}

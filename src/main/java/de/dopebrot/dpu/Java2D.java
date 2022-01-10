package de.dopebrot.dpu;

import java.awt.*;
import java.util.ArrayList;

public class Java2D {

    private final Object object;
    private final int size;
    private final ArrayList<Object> xArray = new ArrayList<>();
    private final ArrayList<ArrayList<Object>> yArray = new ArrayList<>();

    public Java2D(Object object, int capacity) {
        this.size = capacity;
        this.object = object;
        yArray.ensureCapacity(size);
        xArray.ensureCapacity(size);
        fillNulls();
    }

    public Object get(int x, int y) {
        if (yArray.size() >= x && yArray.size() >= y) {
            if (yArray.get(x) != null && xArray.get(y) != null) {
                if (xArray.get(y).getClass() == object.getClass()) {
                    return yArray.get(x).get(y);
                } else throw new ArrayIndexOutOfBoundsException();
            } else throw new NullPointerException();
        } else throw new ArrayIndexOutOfBoundsException();
    }

    private void fillNulls() {
        if (size >= 1) {
            for (int i = 0; i < size; i++) {
                yArray.add(xArray);
                xArray.add(null);
            }
        } else throw new IndexOutOfBoundsException();
    }


    // sets integer at x and y
    public void set(int x, int y, Object value) {
        if (object.getClass() == value.getClass()) {
            if (yArray.size() >= x && yArray.size() >= y) {
                if (yArray.get(x).isEmpty()) {
                    yArray.add(x, xArray);
                } else yArray.set(x, xArray);
                if (y > xArray.size()) {
                    xArray.add(y, value);
                } else xArray.set(y, value);
            } else throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        } else throw new IllegalComponentStateException("Object does not match the array");
    }

}

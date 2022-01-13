package de.dopebrot.dpu.array;

import java.awt.*;
import java.util.ArrayList;

public class Java3D {

    private final Object object;
    private final int size;
    private final ArrayList<ArrayList<ArrayList<Object>>> xArray = new ArrayList<>();
    private final ArrayList<ArrayList<Object>> yArray = new ArrayList<>();
    private final ArrayList<Object> zArray = new ArrayList<>();

    public Java3D(Object object, int capacity) {
        this.size = capacity;
        this.object = object;
        xArray.ensureCapacity(size);
        yArray.ensureCapacity(size);
        zArray.ensureCapacity(size);
        fillNulls();
    }
    public Object get(int x, int y, int z) {
        if (xArray.size() >= x && yArray.size() >= y && zArray.size() >= z) {
            if (xArray.get(x) != null && yArray.get(y) != null && zArray.get(z) != null) {
                if (zArray.get(z).equals(object)) {
                    return xArray.get(x).get(y).get(z);
                } else throw new IllegalComponentStateException("input Object is not equal to saved object");
            } else throw new NullPointerException("Array value is null");
        } else throw new ArrayIndexOutOfBoundsException("Array is out of bounds");
    }
    private void fillNulls() {
        if (size >= 1) {
            for (int i = 0; i < size; i++) {
                xArray.add(yArray);
                yArray.add(zArray);
                zArray.add(null);
            }
        } else throw new IndexOutOfBoundsException();
    }
    // sets integer at x and y
    public void set(int x, int y, int z, Object value) {
        if (xArray.size() >= x && yArray.size() >= y && zArray.size() >= z) {
            if (xArray.get(x) != null && yArray.get(y) != null && zArray.get(z) != null) {
                if (zArray.get(z).getClass() == value.getClass()) {
                    zArray.set(z, value);
                    yArray.set(y, zArray);
                    xArray.set(x, yArray);
                } else throw new IllegalComponentStateException("input Object is not equal to saved object");
            } else throw new NullPointerException("Array value is null");
        } else throw new ArrayIndexOutOfBoundsException("Array is out of bounds");
    }

}

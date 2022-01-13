package de.dopebrot.dpu.math;

public class MathHelper {

    // DPB Math

    public Object min(Object object, Object min) {
        if (object instanceof Integer) {
            if ((Integer) object < (Integer) min) {
                return (Integer) min;
            }
        } else if (object instanceof Double) {
            if ((Double) object < (Double) min) {
                return (Double) min;
            }
        } else if (object instanceof Float) {
            if ((Float) object < (Float) min) {
                return (Float) min;
            }
        } else if (object instanceof Short) {
            if ((Short) object < (Short) min) {
                return (Short) min;
            }
        } else if (object instanceof Byte) {
            if ((Byte) object < (Byte) min) {
                return (Byte) min;
            }
        }
        return null;
    }

    public Object max(Object object, Object max) {
        if (object instanceof Integer) {
            if ((Integer) object > (Integer) max) {
                return (Integer) max;
            }
        } else if (object instanceof Double) {
            if ((Double) object > (Double) max) {
                return (Double) max;
            }
        } else if (object instanceof Float) {
            if ((Float) object > (Float) max) {
                return (Float) max;
            }
        } else if (object instanceof Short) {
            if ((Short) object > (Short) max) {
                return (Short) max;
            }
        } else if (object instanceof Byte) {
            if ((Byte) object > (Byte) max) {
                return (Byte) max;
            }
        }
        return null;
    }

}

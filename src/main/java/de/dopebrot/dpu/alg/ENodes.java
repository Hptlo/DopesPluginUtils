package de.dopebrot.dpu.alg;

public enum ENodes {
    END((short) 0),
    START((short) 1),
    NORMAL((short) 2),
    CLOSED((short) 3),
    MID((short) 4);

    public short id;

    ENodes(short id) {
        this.id = id;
    }


}

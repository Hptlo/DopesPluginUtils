package de.dopebrot.dpu.bukkit;

public enum EHead {

    // easy skull

    SKELETON((byte) 0),
    WITHER((byte) 1),
    ZOMBIE((byte) 2),
    PLAYER((byte) 3),
    CREEPER((byte) 4);

    public byte id;

    EHead(byte id) {
        this.id = id;
    }


}

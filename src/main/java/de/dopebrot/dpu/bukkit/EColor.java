package de.dopebrot.dpu.bukkit;

public enum EColor {

    // All dyes and there color id

    DYE_INK_SAC((byte) 0),
    DYE_BLACK((byte) 0),
    DYE_ROSE_RED((byte) 1),
    DYE_RED((byte) 1),
    DYE_CACTURS_GREEN((byte) 2),
    DYE_GREEN((byte) 2),
    DYE_COCOA_BEANS((byte) 3),
    DYE_BROWN((byte) 3),
    DYE_LAPISLAZULI((byte) 4),
    DYE_BLUE((byte) 4),
    DYE_PURPLE((byte) 5),
    DYE_CYAN((byte) 6),
    DYE_LIGHT_GRAY((byte) 7),
    DYE_GRAY((byte) 8),
    DYE_PINK((byte) 9),
    DYE_LIME((byte) 10),
    DYE_YELLOW((byte) 11),
    DYE_LIGHT_BLUE((byte) 12),
    DYE_MAGENTA((byte) 13),
    DYE_ORANGE((byte) 14),
    DYE_BONE_MEAL((byte) 15),
    DYE_WHITE((byte) 15),

    // All blocks and there color id

    BLOCK_WHITE((byte) 0),
    BLOCK_ORANGE((byte) 1),
    BLOCK_MAGENTA((byte) 2),
    BLOCK_LIGHT_BLUE((byte) 3),
    BLOCK_YELLOW((byte) 4),
    BLOCK_LIME((byte) 5),
    BLOCK_PINK((byte) 6),
    BLOCK_GRAY((byte) 7),
    BLOCK_LIGHT_GRAY((byte) 8),
    BLOCK_CYAN((byte) 9),
    BLOCK_PURPLE((byte) 10),
    BLOCK_BLUE((byte) 11),
    BLOCK_BROWN((byte) 12),
    BLOCK_GREEN((byte) 13),
    BLOCK_RED((byte) 14),
    BLOCK_BLACK((byte) 15);

    public byte id;

    EColor(byte id) {
        this.id = id;
    }


    }

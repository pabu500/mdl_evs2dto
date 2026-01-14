package org.pabuff.dto;

public enum MeterPhaseTypeEnum {
    SINGLE_PHASE("single_phase", "Single Phase", "1p"),
    THREE_PHASE("three_phase", "Three Phase", "3p"),
    THREE_PHASE_DIRECT("three_phase_direct", "Three Phase Direct", "3pd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    MeterPhaseTypeEnum(String value, String label, String tag) {
        this.value = value;
        this.label = label;
        this.tag = tag;
    }

    // Getters
    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public String getTag() {
        return tag;
    }

    // Reverse lookup by value
    public static MeterPhaseTypeEnum fromValue(String value) {
        for (MeterPhaseTypeEnum type : MeterPhaseTypeEnum.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static MeterPhaseTypeEnum fromTag(String tag) {
        for (MeterPhaseTypeEnum type : MeterPhaseTypeEnum.values()) {
            if (type.tag.equalsIgnoreCase(tag)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static MeterPhaseTypeEnum fromLabel(String label) {
        for (MeterPhaseTypeEnum type : MeterPhaseTypeEnum.values()) {
            if (type.label.equalsIgnoreCase(label)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

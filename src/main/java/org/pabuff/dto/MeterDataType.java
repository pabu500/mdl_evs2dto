package org.pabuff.dto;

public enum MeterDataType {
    amr("amr", "AMR", "amr"),
    manual("manual", "Manual", "manual"),;

    private final String value;
    private final String label;
    private final String tag;

    MeterDataType(String value, String label, String tag) {
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
    public static MeterDataType fromValue(String value) {
        for (MeterDataType status : MeterDataType.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static MeterDataType fromTag(String tag) {
        for (MeterDataType status : MeterDataType.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static MeterDataType fromLabel(String label) {
        for (MeterDataType status : MeterDataType.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}


package org.pabuff.dto;

public enum DeviceCatLcSatusEnum {
    provisioned("prov", "Provisioned", "prov"),
    cip("cip", "Commission in Progress", "cip"),
    maintenance("maint", "Maintenance", "maint"),
    normal("normal", "Normal", "norm"),
    decommissioned("dc", "Decommissioned", "dc"),
    mfd("mfd", "Marked for Delete", "mfd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    DeviceCatLcSatusEnum(String value, String label, String tag) {
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
    public static DeviceCatLcSatusEnum fromValue(String value) {
        for (DeviceCatLcSatusEnum status : DeviceCatLcSatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static DeviceCatLcSatusEnum fromTag(String tag) {
        for (DeviceCatLcSatusEnum status : DeviceCatLcSatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static DeviceCatLcSatusEnum fromLabel(String label) {
        for (DeviceCatLcSatusEnum status : DeviceCatLcSatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

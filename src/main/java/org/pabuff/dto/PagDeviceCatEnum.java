package org.pabuff.dto;

public enum PagDeviceCatEnum {
    meter("meter", "Meter", "m"),
    sensor("sensor", "Sensor", "s"),
    camera("camera", "Camera", "cam"),
    lock("lock", "Lock", "l"),
    gateway("gateway", "Gateway", "gw"),
    meterGroup("meter_group", "Meter Group", "mg"),
    mcu("mcu", "MCU", "mcu"),
    motherboard("motherboard", "Motherboard", "mb");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PagDeviceCatEnum(String value, String label, String tag) {
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
    public static PagDeviceCatEnum fromValue(String value) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagDeviceCatEnum fromTag(String tag) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagDeviceCatEnum fromLabel(String label) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

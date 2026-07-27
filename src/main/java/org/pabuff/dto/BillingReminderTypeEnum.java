package org.pabuff.dto;

public enum BillingReminderTypeEnum {
    firstAndSecond("fs", "First and Second", "fs"),
    firstOnly("fo", "First Only", "fo"),
    none("none", "None", "none"),;

    private final String value;
    private final String label;
    private final String tag;

    BillingReminderTypeEnum(String value, String label, String tag) {
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
    public static BillingReminderTypeEnum fromValue(String value) {
        for (BillingReminderTypeEnum status : BillingReminderTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static BillingReminderTypeEnum fromTag(String tag) {
        for (BillingReminderTypeEnum status : BillingReminderTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static BillingReminderTypeEnum fromLabel(String label) {
        for (BillingReminderTypeEnum status : BillingReminderTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

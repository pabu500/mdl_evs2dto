package org.pabuff.dto;

public enum PagAclCheckTypeEnum {
    normal("normal", "Device", "device"),
    none("none", "None", "none"),;

    private String value;
    private String label;
    private String tag;

    PagAclCheckTypeEnum(String value, String label, String tag) {
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
    public static PagAclCheckTypeEnum fromValue(String value) {
        for (PagAclCheckTypeEnum status : PagAclCheckTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagAclCheckTypeEnum fromTag(String tag) {
        for (PagAclCheckTypeEnum status : PagAclCheckTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagAclCheckTypeEnum fromLabel(String label) {
        for (PagAclCheckTypeEnum status : PagAclCheckTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

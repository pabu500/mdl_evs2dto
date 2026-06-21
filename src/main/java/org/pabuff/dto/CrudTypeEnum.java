package org.pabuff.dto;

public enum CrudTypeEnum {
    create("create", "Create", "c"),
    read("read", "Read", "r"),
    update("update", "Update", "u"),
    delete("delete", "Delete", "d"),
    list("list", "List", "l");

    private final String value;
    private final String label;
    private final String tag;

    CrudTypeEnum(String value, String label, String tag) {
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
    public static CrudTypeEnum fromValue(String value) {
        for (CrudTypeEnum status : CrudTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static CrudTypeEnum fromTag(String tag) {
        for (CrudTypeEnum status : CrudTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static CrudTypeEnum fromLabel(String label) {
        for (CrudTypeEnum status : CrudTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

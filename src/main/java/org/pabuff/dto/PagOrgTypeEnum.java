package org.pabuff.dto;

public enum PagOrgTypeEnum {
    amgr("amgr", "Asset Manager", "amgr"),
    landlord("landlord", "Landlord", "landlord"),;

    private final String value;
    private final String label;
    private final String tag;

    PagOrgTypeEnum(String value, String label, String tag) {
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
    public static PagOrgTypeEnum fromValue(String value) {
        for (PagOrgTypeEnum status : PagOrgTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagOrgTypeEnum fromTag(String tag) {
        for (PagOrgTypeEnum status : PagOrgTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagOrgTypeEnum fromLabel(String label) {
        for (PagOrgTypeEnum status : PagOrgTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

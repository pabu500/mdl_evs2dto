package org.pabuff.dto;

public enum PagTenantLcStatusEnum {
    ONBOARDING("onb", "Onboarding", "onb"),
    NORMAL("normal", "Normal", "norm"),
    OFFBOARDING("offb", "Offboarding", "offb"),
    TERMINATED("terminated", "Terminated", "term"),
    MARKED_FOR_DELETE("mfd", "Marked for Delete", "mfd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PagTenantLcStatusEnum(String value, String label, String tag) {
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
    public static PagTenantLcStatusEnum fromValue(String value) {
        for (PagTenantLcStatusEnum status : PagTenantLcStatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagTenantLcStatusEnum fromTag(String tag) {
        for (PagTenantLcStatusEnum status : PagTenantLcStatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagTenantLcStatusEnum fromLabel(String label) {
        for (PagTenantLcStatusEnum status : PagTenantLcStatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

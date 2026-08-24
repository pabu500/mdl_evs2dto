package org.pabuff.dto;

import lombok.Getter;

@Getter
public enum PagProjectLcSatusEnum {
    cip("cip", "Commissioning in Progress", "cip"),
    active("active", "Active", "act"),
    inactive("inactive", "Inactive", "ina"),
    dc("dc", "Decommissioned", "dc"),
    mfd("mfd", "Marked for Delete", "mfd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PagProjectLcSatusEnum(String value, String label, String tag) {
        this.value = value;
        this.label = label;
        this.tag = tag;
    }

    // Reverse lookup by value
    public static PagProjectLcSatusEnum fromValue(String value) {
        for (PagProjectLcSatusEnum status : PagProjectLcSatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagProjectLcSatusEnum fromTag(String tag) {
        for (PagProjectLcSatusEnum status : PagProjectLcSatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagProjectLcSatusEnum fromLabel(String label) {
        for (PagProjectLcSatusEnum status : PagProjectLcSatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

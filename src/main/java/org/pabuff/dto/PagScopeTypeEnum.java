package org.pabuff.dto;

public enum PagScopeTypeEnum {
    location("location", "Location", "loc"),
    locationGroup("location_group", "Location Group", "lg"),
    building("building", "Building", "b"),
    site("site", "Site", "s"),
    siteGroup("site_group", "Site Group", "sg"),
    project("project", "Project", "p"),
    none("none", "None", "n"),;

    private final String value;
    private final String label;
    private final String tag;

    PagScopeTypeEnum(String value, String label, String tag) {
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
    public static PagScopeTypeEnum fromValue(String value) {
        for (PagScopeTypeEnum status : PagScopeTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagScopeTypeEnum fromTag(String tag) {
        for (PagScopeTypeEnum status : PagScopeTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagScopeTypeEnum fromLabel(String label) {
        for (PagScopeTypeEnum status : PagScopeTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

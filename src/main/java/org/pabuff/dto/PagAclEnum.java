package org.pabuff.dto;
import lombok.Getter;

@Getter
public enum PagAclEnum {
    resource("res", "Resource", "res"),
    permission("perm", "Permission", "perm"),;

    // Getters
    private final String value;
    private final String label;
    private final String tag;

    PagAclEnum(String value, String label, String tag) {
        this.value = value;
        this.label = label;
        this.tag = tag;
    }

    // Reverse lookup by value
    public static PagAclEnum fromValue(String value) {
        for (PagAclEnum status : PagAclEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagAclEnum fromTag(String tag) {
        for (PagAclEnum status : PagAclEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagAclEnum fromLabel(String label) {
        for (PagAclEnum status : PagAclEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

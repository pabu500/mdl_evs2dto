package org.pabuff.dto;
import lombok.Getter;

@Getter
public enum PagAclTypeEnum {
    resource("res", "Resource", "res"),
    permission("perm", "Permission", "perm"),;

    // Getters
    private final String value;
    private final String label;
    private final String tag;

    PagAclTypeEnum(String value, String label, String tag) {
        this.value = value;
        this.label = label;
        this.tag = tag;
    }

    // Reverse lookup by value
    public static PagAclTypeEnum fromValue(String value) {
        for (PagAclTypeEnum status : PagAclTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagAclTypeEnum fromTag(String tag) {
        for (PagAclTypeEnum status : PagAclTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagAclTypeEnum fromLabel(String label) {
        for (PagAclTypeEnum status : PagAclTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

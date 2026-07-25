package org.pabuff.dto;

public enum PagIdTypeEnum {
    indexType("id", "Index", "id"),
    nameType("name", "Name", "name"),
    labelType("label", "Label", "label"),
    snType("sn", "Serial Number", "sn"),
    tagType("tag", "Tag", "tag"),
    usernameType("username", "Username", "username"),
    emailType("email", "Email", "email"),
    phoneNumberType("phoneNumber", "Phone Number", "phoneNumber"),
    accountNumberType("account_number", "Account Number", "account_number"),
    iccidType("iccid", "ICCID", "iccid"),
    ipType("ip", "IP Address", "ip"),
    macType("mac", "MAC Address", "mac"),;

    private final String value;
    private final String label;
    private final String tag;

    PagIdTypeEnum(String value, String label, String tag) {
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
    public static PagIdTypeEnum fromValue(String value) {
        for (PagIdTypeEnum status : PagIdTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagIdTypeEnum fromTag(String tag) {
        for (PagIdTypeEnum status : PagIdTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagIdTypeEnum fromLabel(String label) {
        for (PagIdTypeEnum status : PagIdTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

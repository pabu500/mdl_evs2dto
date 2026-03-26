package org.pabuff.dto;

public enum PagItemKindEnum2 {
    device("device", "Device", "device"),
    scope("scope", "Scope", "scope"),
    user("user", "User", "user"),
    role("role", "Role", "role"),
    tenant("tenant", "Tenant", "tenant"),
    jobType("job_type", "Job Type", "jobType"),
    billing("billing", "Billing", "billing"),
    meterGroup("meter_group", "Meter Group", "meterGroup"),
    finance("finance", "Finance", "finance"),
//    amgr("amgr", "Asset Manager", "amgr"),
//    landlord("landlord", "Landlord", "landlord"),;
    org("org", "Organization", "org"),;

    private final String value;
    private final String label;
    private final String tag;

    PagItemKindEnum2(String value, String label, String tag) {
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
    public static PagItemKindEnum2 fromValue(String value) {
        for (PagItemKindEnum2 status : PagItemKindEnum2.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagItemKindEnum2 fromTag(String tag) {
        for (PagItemKindEnum2 status : PagItemKindEnum2.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagItemKindEnum2 fromLabel(String label) {
        for (PagItemKindEnum2 status : PagItemKindEnum2.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

package org.pabuff.dto;

public enum PagTariff {
    tariffPackage("tariff_package", "Tariff Package", "tp"),
    tariffRate("tariff_rate", "Tariff Rate", "tr"),
    tariffPackageType("tariff_package_type", "Tariff Package Type", "tpt");

    private final String value;
    private final String label;
    private final String tag;

    PagTariff(String value, String label, String tag) {
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
    public static PagTariff fromValue(String value) {
        for (PagTariff status : PagTariff.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagTariff fromTag(String tag) {
        for (PagTariff status : PagTariff.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagTariff fromLabel(String label) {
        for (PagTariff status : PagTariff.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

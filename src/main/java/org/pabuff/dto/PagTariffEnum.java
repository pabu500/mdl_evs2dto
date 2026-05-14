package org.pabuff.dto;

public enum PagTariffEnum {
    tariffPackage("tariff_package", "Tariff Package", "tp"),
    tariffRate("tariff_rate", "Tariff Rate", "tr"),
    tariffPackageType("tariff_package_type", "Tariff Package Type", "tpt");

    private final String value;
    private final String label;
    private final String tag;

    PagTariffEnum(String value, String label, String tag) {
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
    public static PagTariffEnum fromValue(String value) {
        for (PagTariffEnum status : PagTariffEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagTariffEnum fromTag(String tag) {
        for (PagTariffEnum status : PagTariffEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagTariffEnum fromLabel(String label) {
        for (PagTariffEnum status : PagTariffEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

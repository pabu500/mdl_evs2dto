package org.pabuff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PagRoleTypeEnum {
    admin("admin", "Admin Role", "admin"),
    subAdmin("sub_admin", "Sub-Admin Role", "sub-admin"),
    ops("ops", "Operations Role", "ops"),
    siteOps("site_ops", "Site Operations Role", "site-ops"),
    billingOps("billing_ops", "Billing Operations Role", "billing-ops"),
    consumer("consumer", "Consumer Role", "consumer"),
    tenant("tenant", "Tenant Role", "tenant");

    private final String value;
    private final String label;
    private final String tag;

    // Reverse lookup by value
    public static PagRoleTypeEnum fromValue(String value) {
        for (PagRoleTypeEnum enumItem : PagRoleTypeEnum.values()) {
            if (enumItem.value.equalsIgnoreCase(value)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagRoleTypeEnum fromTag(String tag) {
        for (PagRoleTypeEnum enumItem : PagRoleTypeEnum.values()) {
            if (enumItem.tag.equalsIgnoreCase(tag)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagRoleTypeEnum fromLabel(String label) {
        for (PagRoleTypeEnum enumItem : PagRoleTypeEnum.values()) {
            if (enumItem.label.equalsIgnoreCase(label)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

package org.pabuff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PagPortalTypeEnum {
    pagConsole("pag-console", "PAG Console", "op"),
    pagEmsTp("pag-ems-tp", "PAG EMS Tenant Portal", "tp"),
    pagEvsCp("pag-evs-cp", "PAG EVS Consumer Portal", "cp"),
    pagConsoleApp("pag-console-app", "PAG Console App", "opa"),
    pagCmApp("pag-cm-app", "PAG CM App", "cma"),
    dmsPtw("dms-ptw", "DMS PTW Portal", "ptw");

    private final String value;
    private final String label;
    private final String tag;

    // Reverse lookup by value
    public static PagPortalTypeEnum fromValue(String value) {
        for (PagPortalTypeEnum enumItem : PagPortalTypeEnum.values()) {
            if (enumItem.value.equalsIgnoreCase(value)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagPortalTypeEnum fromTag(String tag) {
        for (PagPortalTypeEnum enumItem : PagPortalTypeEnum.values()) {
            if (enumItem.tag.equalsIgnoreCase(tag)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagPortalTypeEnum fromLabel(String label) {
        for (PagPortalTypeEnum enumItem : PagPortalTypeEnum.values()) {
            if (enumItem.label.equalsIgnoreCase(label)) {
                return enumItem;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}

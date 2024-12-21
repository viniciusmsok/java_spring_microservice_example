package br.com.vanguardasistemas.core.telephone;

import lombok.*;

@Getter
public enum TelephoneType {
    MOBILE("MOBILE", "Mobile", "MOB"),
    HOME("HOME", "Home", "HOM"),
    WORK("WORK", "Work", "WOR"),
    FAX("FAX", "Fax", "FAX"),
    OTHER("OTHER", "Other", "OTH");

    private final String type;
    private final String description;
    private final String alias;

    TelephoneType(String type, String description, String alias) {
        this.type = type;
        this.description = description;
        this.alias = alias;
    }

    public static TelephoneType from(String sentence) {
        for (TelephoneType option : TelephoneType.values()) {
            if ((option.getType().equalsIgnoreCase(sentence))
                    || (option.getAlias().equalsIgnoreCase(sentence))){
                return option;
            }
        }

        throw new IllegalArgumentException("Invalid sentence: '" + sentence + "'");
    }
}

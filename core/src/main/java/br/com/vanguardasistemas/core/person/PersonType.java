package br.com.vanguardasistemas.core.person;

import lombok.*;

@Getter
public enum PersonType {
    NATURAL("NATURAL", "Natural", "NAT"),
    LEGAL("LEGAL", "Legal", "LEG");

    private final String type;
    private final String description;
    private final String alias;

    PersonType(String type, String description, String alias) {
        this.type = type;
        this.description = description;
        this.alias = alias;
    }

    public static PersonType from(String sentence) {
        for (PersonType option : PersonType.values()) {
            if ((option.getType().equalsIgnoreCase(sentence))
            || (option.getAlias().equalsIgnoreCase(sentence))){
                return option;
            }
        }

        throw new IllegalArgumentException("Invalid sentence: '" + sentence + "'");
    }
}

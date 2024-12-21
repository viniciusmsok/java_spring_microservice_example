package br.com.vanguardasistemas.usecase.person.implementations;

import lombok.*;

@Getter
@AllArgsConstructor
public enum PersonErrorCode {
    INVALID_PERSON_ID("Invalid person ID", "INVALID_PERSON_ID"),
    INVALID_MAIN_NAME("Invalid main name", "INVALID_MAIN_NAME"),
    INVALID_SOCIAL_NAME("Invalid social name", "INVALID_SOCIAL_NAME"),
    INVALID_MAIN_COUNTRY_CODE("Invalid main country code", "INVALID_MAIN_COUNTRY_CODE"),
    INVALID_NATIONAL_CODE("Invalid national code", "INVALID_NATIONAL_CODE"),
    INVALID_EMAIL("Invalid e-mail", "INVALID_EMAIL"),
    NOT_ENOUGH_PARAMETERS("Not enough parameters", "NOT_ENOUGH_PARAMETERS"),
    PERSON_ALREADY_REGISTERED("Person already registered", "PERSON_ALREADY_REGISTERED");

    @NonNull
    private final String message;

    @NonNull
    private final String code;
}

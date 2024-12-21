package br.com.vanguardasistemas.usecase.person.implementations;

import lombok.*;

@Getter
public class PersonFindParams {
    private final Long personId;
    private final String personType;
    private final String partialMainName;
    private final String partialSocialName;
    private final String mainCountryCode;
    private final String nationalId;

    public PersonFindParams(
        Long personId,
        String personType,
        String partialMainName,
        String partialSocialName,
        String mainCountryCode,
        String nationalId
    ) throws PersonException {
        this.personId = personId;
        this.personType = personType;
        this.partialMainName = partialMainName;
        this.partialSocialName = partialSocialName;
        this.mainCountryCode = mainCountryCode;
        this.nationalId = nationalId;

        if ((this.personId != null) && (this.personId < 0)) {
            throw new PersonException(PersonErrorCode.INVALID_PERSON_ID);
        }

        if ((this.partialMainName != null) && (this.partialMainName.length() < 3)) {
            throw new PersonException(PersonErrorCode.INVALID_MAIN_NAME);
        }

        if ((this.partialSocialName != null) && (this.partialSocialName.length() < 3)) {
            throw new PersonException(PersonErrorCode.INVALID_SOCIAL_NAME);
        }

        if ((this.mainCountryCode != null) && (this.mainCountryCode.length() != 3)) {
            throw new PersonException(PersonErrorCode.INVALID_MAIN_COUNTRY_CODE);
        }

        if ((this.personId != null) ||
            (this.partialMainName != null) ||
            (this.partialSocialName != null) ||
            (this.nationalId != null)
        ) {
            return;
        }

        throw new PersonException(PersonErrorCode.NOT_ENOUGH_PARAMETERS);
    }
}

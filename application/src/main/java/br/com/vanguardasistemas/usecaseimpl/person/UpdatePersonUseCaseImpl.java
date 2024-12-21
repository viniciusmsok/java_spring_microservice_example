package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.gateway.person.UpdatePersonGateway;
import br.com.vanguardasistemas.usecase.person.interfaces.*;
import br.com.vanguardasistemas.usecase.person.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdatePersonUseCaseImpl implements UpdatePersonUseCase {
    @Autowired
    private CheckPersonNationalIdUseCase checkPersonNationalIdUseCase;

    @Autowired
    private CheckPersonExistsUseCase checkPersonExistsUseCase;

    @Autowired
    private CheckPersonEmailUseCase checkPersonEmailUseCase;

    @Autowired
    private UpdatePersonGateway updatePersonGateway;

    @Override
    public Person update(PersonUpdate person) throws PersonException {
        PersonCheckNationalIdParams paramsValidate = new PersonCheckNationalIdParams(
            person.getPersonId(),
            person.getPersonType(),
            person.getNationalId(),
            person.getMainCountryCode()
        );

        if (this.checkPersonNationalIdUseCase.validate(paramsValidate)) {
            throw new PersonException(PersonErrorCode.INVALID_NATIONAL_CODE);
        }

        if (this.checkPersonEmailUseCase.check(person.getEmailDescription())) {
            throw new PersonException(PersonErrorCode.INVALID_EMAIL);
        }

        PersonCheckExistsParams paramsExists = new PersonCheckExistsParams(
                person.getPersonId(),
                person.getNationalId(),
                person.getMainCountryCode()
        );

        if (this.checkPersonExistsUseCase.exists(paramsExists)) {
            throw new PersonException(PersonErrorCode.PERSON_ALREADY_REGISTERED);
        }

        return this.updatePersonGateway.update(person);
    }
}

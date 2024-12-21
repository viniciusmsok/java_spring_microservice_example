package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.gateway.person.CreatePersonGateway;
import br.com.vanguardasistemas.usecase.person.interfaces.*;
import br.com.vanguardasistemas.usecase.person.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase {

    @Autowired
    private CheckPersonNationalIdUseCase checkPersonNationalIdUseCase;

    @Autowired
    private CheckPersonEmailUseCase checkPersonEmailUseCase;

    @Autowired
    private CheckPersonExistsUseCase checkPersonExistsUseCase;

    @Autowired
    private CreatePersonGateway createPersonGateway;

    @Override
    public Person create(PersonCreate person) throws PersonException {
        PersonCheckNationalIdParams paramsValidate = new PersonCheckNationalIdParams(
                null,
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

        PersonCheckExistsParams params = new PersonCheckExistsParams(
                null,
                person.getNationalId(),
                person.getMainCountryCode()
        );
        if (this.checkPersonExistsUseCase.exists(params)) {
            throw new PersonException(PersonErrorCode.PERSON_ALREADY_REGISTERED);
        }

        return this.createPersonGateway.create(person);
    }
}

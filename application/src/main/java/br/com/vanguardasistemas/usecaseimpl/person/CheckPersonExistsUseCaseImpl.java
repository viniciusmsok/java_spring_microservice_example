package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.gateway.person.FindPersonGateway;
import br.com.vanguardasistemas.usecase.person.interfaces.CheckPersonExistsUseCase;
import br.com.vanguardasistemas.usecase.person.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CheckPersonExistsUseCaseImpl implements CheckPersonExistsUseCase {
    @Autowired
    private FindPersonGateway findPersonGateway;

    @Override
    public Boolean exists(PersonCheckExistsParams params) throws PersonException {
        PersonFindParams findPersonParams = new PersonFindParams(
                null,
                null,
                null,
                null,
                params.getCountryCode(),
                params.getNationalId()
        );

        List<Person> person = this.findPersonGateway.find(findPersonParams);
        return (!person.isEmpty());
    }
}

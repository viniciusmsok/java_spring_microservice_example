package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.gateway.person.FindPersonGateway;
import br.com.vanguardasistemas.usecase.person.implementations.PersonFindParams;
import br.com.vanguardasistemas.usecase.person.interfaces.FindPersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FindPersonUseCaseImpl implements FindPersonUseCase {

    @Autowired
    private FindPersonGateway findPersonGateway;

    @Override
    public List<Person> find(PersonFindParams query) {
        return this.findPersonGateway.find(query);
    }
}

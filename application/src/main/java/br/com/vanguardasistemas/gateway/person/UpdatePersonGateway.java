package br.com.vanguardasistemas.gateway.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonUpdate;

public interface UpdatePersonGateway {
    Person update(PersonUpdate person);
}

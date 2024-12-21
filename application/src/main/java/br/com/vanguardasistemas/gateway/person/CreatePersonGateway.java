package br.com.vanguardasistemas.gateway.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonCreate;

public interface CreatePersonGateway {
    Person create(PersonCreate person);
}

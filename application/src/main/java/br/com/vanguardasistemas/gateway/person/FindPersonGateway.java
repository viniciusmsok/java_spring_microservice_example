package br.com.vanguardasistemas.gateway.person;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonFindParams;

import java.util.List;

public interface FindPersonGateway {
    List<Person> find(PersonFindParams query);
}

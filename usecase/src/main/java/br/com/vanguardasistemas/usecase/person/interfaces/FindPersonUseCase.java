package br.com.vanguardasistemas.usecase.person.interfaces;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonFindParams;

import java.util.List;

public interface FindPersonUseCase {
    List<Person> find(PersonFindParams query);
}

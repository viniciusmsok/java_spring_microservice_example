package br.com.vanguardasistemas.usecase.person.interfaces;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonException;
import br.com.vanguardasistemas.usecase.person.implementations.PersonCreate;

public interface CreatePersonUseCase {
    Person create(PersonCreate person) throws PersonException;
}

package br.com.vanguardasistemas.usecase.person.interfaces;

import br.com.vanguardasistemas.core.person.Person;
import br.com.vanguardasistemas.usecase.person.implementations.PersonException;
import br.com.vanguardasistemas.usecase.person.implementations.PersonUpdate;

public interface UpdatePersonUseCase {
    Person update(PersonUpdate person) throws PersonException;
}

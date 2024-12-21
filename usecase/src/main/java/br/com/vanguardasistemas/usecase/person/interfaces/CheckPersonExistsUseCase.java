package br.com.vanguardasistemas.usecase.person.interfaces;

import br.com.vanguardasistemas.usecase.person.implementations.PersonException;
import br.com.vanguardasistemas.usecase.person.implementations.PersonCheckExistsParams;

public interface CheckPersonExistsUseCase {
    Boolean exists(PersonCheckExistsParams params) throws PersonException;
}

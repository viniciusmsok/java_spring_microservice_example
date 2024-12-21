package br.com.vanguardasistemas.usecase.person.interfaces;

import br.com.vanguardasistemas.usecase.person.implementations.PersonCheckNationalIdParams;

public interface CheckPersonNationalIdUseCase {
    Boolean validate(PersonCheckNationalIdParams personCheckNationalIdParams);
}

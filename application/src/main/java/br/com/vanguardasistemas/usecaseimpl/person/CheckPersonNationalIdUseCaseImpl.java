package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.usecase.person.implementations.PersonCheckNationalIdParams;
import br.com.vanguardasistemas.usecase.person.interfaces.CheckPersonNationalIdUseCase;

public class CheckPersonNationalIdUseCaseImpl implements CheckPersonNationalIdUseCase {
    @Override
    public Boolean validate(PersonCheckNationalIdParams personCheckNationalIdParams) {
        /* TODO: validate if BR */
        return true;
    }
}

package br.com.vanguardasistemas.usecaseimpl.person;

import br.com.vanguardasistemas.usecase.person.interfaces.CheckPersonEmailUseCase;

public class CheckPersonEmailUseCaseImpl implements CheckPersonEmailUseCase {

    @Override
    public Boolean check(String emailDescription) {
        /* TODO: validate e-mail */
        return true;
    }
}

package br.com.vanguardasistemas.usecase.person.implementations;

import br.com.vanguardasistemas.core.interfaces.CoreException;
import lombok.Getter;

@Getter
public class PersonException extends Exception implements CoreException {
    private final String code;

    public PersonException(PersonErrorCode personErrorCode) {
        super(personErrorCode.getMessage());
        this.code = personErrorCode.getCode();
    }
}

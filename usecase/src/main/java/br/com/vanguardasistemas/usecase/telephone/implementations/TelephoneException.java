package br.com.vanguardasistemas.usecase.telephone.implementations;

import br.com.vanguardasistemas.core.interfaces.CoreException;
import lombok.Getter;

@Getter
public class TelephoneException extends Exception implements CoreException {
    private final String code;

    public TelephoneException(TelephoneErrorCode telephoneErrorCode) {
        super(telephoneErrorCode.getMessage());
        this.code = telephoneErrorCode.getCode();
    }
}
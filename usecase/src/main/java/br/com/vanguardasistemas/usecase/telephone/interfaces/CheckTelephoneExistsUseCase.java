package br.com.vanguardasistemas.usecase.telephone.interfaces;

public interface CheckTelephoneExistsUseCase {
    Boolean check(Integer personId, String telephoneNumber);
}

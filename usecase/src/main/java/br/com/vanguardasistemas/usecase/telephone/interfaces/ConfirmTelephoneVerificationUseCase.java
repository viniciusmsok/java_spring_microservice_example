package br.com.vanguardasistemas.usecase.telephone.interfaces;

public interface ConfirmTelephoneVerificationUseCase {
    void confirm(Integer telephoneId, String telephoneNumber);
}

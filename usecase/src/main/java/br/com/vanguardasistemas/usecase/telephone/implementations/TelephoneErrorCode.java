package br.com.vanguardasistemas.usecase.telephone.implementations;

import lombok.*;

@Getter
@AllArgsConstructor
public enum TelephoneErrorCode {
    INVALID_TELEPHONE_ID("Invalid telephone ID", "INVALID_TELEPHONE_ID"),
    INVALID_TELEPHONE_NUMBER("Invalid telephone number", "INVALID_TELEPHONE_NUMBER"),
    INVALID_EXTENSION_CODE("Invalid extension code", "INVALID_EXTENSION_CODE");

    @NonNull
    private final String message;

    @NonNull
    private final String code;
}

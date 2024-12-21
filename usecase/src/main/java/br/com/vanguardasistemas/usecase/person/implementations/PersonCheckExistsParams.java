package br.com.vanguardasistemas.usecase.person.implementations;

import br.com.vanguardasistemas.core.person.PersonType;
import lombok.*;

@Getter
@AllArgsConstructor
public class PersonCheckExistsParams {
    private Long personId;

    @NonNull
    private String nationalId;

    @NonNull
    private String countryCode;
}
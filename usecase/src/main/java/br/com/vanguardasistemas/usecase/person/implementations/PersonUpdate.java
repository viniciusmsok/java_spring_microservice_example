package br.com.vanguardasistemas.usecase.person.implementations;

import br.com.vanguardasistemas.core.person.PersonType;
import lombok.*;

@Getter
@Data
public class PersonUpdate {
    @NonNull
    private Long personId;

    @NonNull
    private PersonType personType;

    @NonNull
    private String mainName;

    @NonNull
    private String socialName;

    @NonNull
    private String mainCountryCode;

    @NonNull
    private String nationalId;

    @NonNull
    private String emailDescription;
}

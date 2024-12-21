package br.com.vanguardasistemas.core.telephone;

import lombok.*;
import java.time.LocalDateTime;
import br.com.vanguardasistemas.core.person.Person;

@Data
public class Telephone {
    private Long telephoneId;
    private Person person;
    private TelephoneType telephoneType;
    private String countryDialingCode;
    private String phoneNumber;
    private String phoneNumberWithMask;
    private String extensionCode;
    private Boolean verifiedBoolean;
    private LocalDateTime creationTimestamp;
    private LocalDateTime lastUpdateTimestamp;
}

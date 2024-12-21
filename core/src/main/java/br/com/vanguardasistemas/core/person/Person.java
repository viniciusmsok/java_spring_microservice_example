package br.com.vanguardasistemas.core.person;

import lombok.*;
import java.time.LocalDateTime;

@Data
public class Person {
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

    private LocalDateTime creationTimestamp;
    private LocalDateTime lastUpdatedTimestamp;
}
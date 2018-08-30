package de.mschneid.ms.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Name {

    private String firstName;
    private String lastName;
}

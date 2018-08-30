package de.mschneid.ms.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonV2 {
    private Name name;
}

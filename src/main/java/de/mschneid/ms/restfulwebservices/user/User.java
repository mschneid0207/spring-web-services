package de.mschneid.ms.restfulwebservices.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;
    private Date birthDate;


}

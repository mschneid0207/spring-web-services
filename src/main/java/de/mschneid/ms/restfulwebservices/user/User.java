package de.mschneid.ms.restfulwebservices.user;

import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;
    private Date birthDate;


}

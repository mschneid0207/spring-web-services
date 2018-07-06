package de.mschneid.ms.restfulwebservices.user;

import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    @Size(min=2, message="name should have at least 2 characters")
    private String name;
    @Past
    private Date birthDate;


}

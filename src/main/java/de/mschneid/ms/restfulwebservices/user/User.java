package de.mschneid.ms.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(description = "All details about a user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    @Size(min=2, message="name should have at least 2 characters")
    @ApiModelProperty(notes = "name should have at least 2 characters")
    private String name;
    @Past
    @ApiModelProperty(notes = "Birth date should not be in the past")
    private Date birthDate;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;



}

package de.mschneid.ms.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor

@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;
    private String field2;
    //@JsonIgnore
    private String field3;

}

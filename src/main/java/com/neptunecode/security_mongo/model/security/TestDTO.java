package com.neptunecode.security_mongo.model.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Document("tests")
public class TestDTO {
    @Id
    private String id;

    @NotBlank
    private String description;
}

package com.neptunecode.security_mongo.model.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
public class SignupRequest {
    @NotBlank
    @Size(min=6, max=20)
    private String username;
    @NotBlank
    @Size(max=50)
    private String email;
    @NotBlank
    @Size(min=6,max = 40)
    private String password;

    private Set<String> roles;
}

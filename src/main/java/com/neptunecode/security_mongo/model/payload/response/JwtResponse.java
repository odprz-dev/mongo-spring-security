package com.neptunecode.security_mongo.model.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String accessToken, String id, String username, String email, List<String> roles){
        this.id = id;
        this.token = accessToken;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}

package model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {
    public String name;
    public String email;
    public String role;

    public UserRequest() {}

    public UserRequest(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
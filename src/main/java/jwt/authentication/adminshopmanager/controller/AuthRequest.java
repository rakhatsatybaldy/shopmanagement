package jwt.authentication.adminshopmanager.controller;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
    private String roleName;
}

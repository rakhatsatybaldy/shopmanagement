package jwt.authentication.adminshopmanager.controller;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
    private String roleName;
}

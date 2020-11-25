package jwt.authentication.adminshopmanager.controller;

import jwt.authentication.adminshopmanager.config.jwt.JwtProvider;
import jwt.authentication.adminshopmanager.entity.Users;
import jwt.authentication.adminshopmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProvider jwtProvider;



    @PostMapping(value = "/auth")
    public AuthResponse auth(@RequestBody AuthRequest request){
        Users userEntity = userService.findByLoginAndPassword(request.getEmail() , request.getPassword());
        String token = jwtProvider.generateToken(userEntity.getEmail());
        return new AuthResponse(token);

    }
}

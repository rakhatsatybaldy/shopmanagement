package jwt.authentication.adminshopmanager.controller;

import jwt.authentication.adminshopmanager.config.jwt.JwtProvider;
import jwt.authentication.adminshopmanager.entity.UserEntity;
import jwt.authentication.adminshopmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProvider jwtProvider;



    @PostMapping(value = "/auth")
    public AuthResponse auth(@RequestBody AuthRequest request){
        UserEntity userEntity = userService.findByLoginAndPassword(request.getLogin() , request.getPassword());
        String token = jwtProvider.generateToken(userEntity.getLogin());
        return new AuthResponse(token);

    }
}

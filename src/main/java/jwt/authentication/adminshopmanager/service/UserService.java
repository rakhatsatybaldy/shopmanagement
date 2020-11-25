package jwt.authentication.adminshopmanager.service;

import jwt.authentication.adminshopmanager.entity.Users;
import jwt.authentication.adminshopmanager.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users findByLogin(String login){
        return usersRepository.findByEmail(login);
    }

    public Users findByLoginAndPassword(String login , String password){
        Users userEntity = findByLogin(login);
        if (userEntity!=null){
            if (passwordEncoder.matches(password , userEntity.getPassword())){
                return userEntity;
            }
        }
        return null;
    }
}

package jwt.authentication.adminshopmanager.service;

import jwt.authentication.adminshopmanager.entity.RoleEntity;
import jwt.authentication.adminshopmanager.entity.UserEntity;
import jwt.authentication.adminshopmanager.repository.RoleEntityRepository;
import jwt.authentication.adminshopmanager.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserEntity findByLogin(String login){
        return userEntityRepository.findByLogin(login);
    }

    public UserEntity findByLoginAndPassword(String login , String password){
        UserEntity userEntity = findByLogin(login);
        if (userEntity!=null){
            if (passwordEncoder.matches(password , userEntity.getPassword())){
                return userEntity;
            }
        }
        return null;
    }
}

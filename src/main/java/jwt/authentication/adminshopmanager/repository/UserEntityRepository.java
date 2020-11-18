package jwt.authentication.adminshopmanager.repository;

import jwt.authentication.adminshopmanager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserEntityRepository extends JpaRepository<UserEntity , Integer> {
    UserEntity findByLogin(String login);
}

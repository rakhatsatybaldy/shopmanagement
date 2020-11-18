package jwt.authentication.adminshopmanager.repository;

import jwt.authentication.adminshopmanager.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleEntityRepository extends JpaRepository<RoleEntity , Integer> {
    RoleEntity findByName(String name);
}

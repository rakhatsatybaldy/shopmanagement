package jwt.authentication.adminshopmanager.repository;

import jwt.authentication.adminshopmanager.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CitiesRepository extends JpaRepository<Cities, Long> {
}

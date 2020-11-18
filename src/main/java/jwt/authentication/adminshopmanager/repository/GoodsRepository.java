package jwt.authentication.adminshopmanager.repository;


import jwt.authentication.adminshopmanager.entity.Categories;
import jwt.authentication.adminshopmanager.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    @Query("select g from Goods g where lower(g.name) like lower(concat('%', :name,'%'))")
    List<Goods> findAllByNameLike(@Param("name")String name);
    List<Goods> findAllByCategories(Categories categories);
}



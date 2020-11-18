package jwt.authentication.adminshopmanager.controller;


import jwt.authentication.adminshopmanager.entity.Categories;
import jwt.authentication.adminshopmanager.entity.Goods;
import jwt.authentication.adminshopmanager.entity.Users;
import jwt.authentication.adminshopmanager.exception.ProductNotFoundException;
import jwt.authentication.adminshopmanager.repository.CategoriesRepository;
import jwt.authentication.adminshopmanager.repository.GoodsRepository;
import jwt.authentication.adminshopmanager.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/")
public class ShopController {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;


    @GetMapping(value = "/getAllGoods")
    public ResponseEntity<List<Goods>> getAllGoods(){
        List<Goods> goods = goodsRepository.findAll();
        return new ResponseEntity<>(goods  , HttpStatus.OK);
    }

    @PutMapping(value = "/updateGood/{id}")
    public Goods updateGood(@RequestBody Goods updatingGood , @PathVariable Long id){
        return goodsRepository.findById(id)
                .map(product -> {
                    product.setName(updatingGood.getName());
                    product.setPrice(updatingGood.getPrice());
                    product.setDescription(updatingGood.getDescription());
                    product.setUrlOfPicture(updatingGood.getUrlOfPicture());
                    product.setCategories(updatingGood.getCategories());
                    product.setAmount(updatingGood.getAmount());
                    return goodsRepository.save(product);
                })
                .orElseGet(() -> {
                    updatingGood.setId(id);
                    return goodsRepository.save(updatingGood);
                });
    }

    @DeleteMapping(value = "/deleteGood/{id}")
    public void deleteGood(@PathVariable Long id){
        goodsRepository.deleteById(id);
    }

    @PutMapping(value = "/updateUser/{id}")
    public Users updateUser(@RequestBody Users updatingUser , @PathVariable Long id){
        return usersRepository.findById(id)
                .map(user -> {
                    user.setBalance(updatingUser.getBalance());
                    return usersRepository.save(user);
                }).orElseGet(() -> {
                    updatingUser.setId(id);
                    return usersRepository.save(updatingUser);
                });
    }

    @GetMapping(value = "/getOneGood/{id}")
    public Goods getOneGood(@PathVariable Long id){
        return goodsRepository.findById(id).orElseThrow(()->new ProductNotFoundException(id));
    }

    @PostMapping(value = "/addGood")
    public Goods addGood(@RequestBody Goods good){
        return goodsRepository.save(good);
    }

    @PostMapping(value = "/addCategory")
    public Categories addCategory(@RequestBody Categories category){
        return categoriesRepository.save(category);
    }

    @GetMapping(value = "/getAllUsers")
    public List<Users> getAllUsers(){
        List<Users> allUsers = usersRepository.findAll();
        return allUsers;
    }
}

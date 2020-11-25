package jwt.authentication.adminshopmanager.controller;


import jwt.authentication.adminshopmanager.entity.Categories;
import jwt.authentication.adminshopmanager.entity.Goods;
import jwt.authentication.adminshopmanager.entity.Users;
import jwt.authentication.adminshopmanager.exceptions.GoodRequestException;
import jwt.authentication.adminshopmanager.exceptions.UserRequestException;
import jwt.authentication.adminshopmanager.repository.CategoriesRepository;
import jwt.authentication.adminshopmanager.repository.GoodsRepository;
import jwt.authentication.adminshopmanager.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        Optional<Goods> good = goodsRepository.findById(id);
            return good
                    .map(product -> {
                        product.setName(updatingGood.getName());
                        product.setPrice(updatingGood.getPrice());
                        product.setDescription(updatingGood.getDescription());
                        product.setUrlOfPicture(updatingGood.getUrlOfPicture());
                        product.setCategories(updatingGood.getCategories());
                        product.setAmount(updatingGood.getAmount());
                        return goodsRepository.save(product);
                    }).orElseThrow(() ->
                        new GoodRequestException("This good does not exist!")
                    );

    }

    @DeleteMapping(value = "/deleteGood/{id}")
    public void deleteGood(@PathVariable Long id){
        try {
            goodsRepository.deleteById(id);
        }catch (Exception e){
            throw new GoodRequestException("This good does not exist!");
        }
    }

    @PutMapping(value = "/updateUserBalance/{id}")
    public Users updateUser(@RequestBody Users updatingUser , @PathVariable Long id){
        Optional<Users> user = usersRepository.findById(id);
        return user.map(u -> {
            u.setBalance(updatingUser.getBalance());
            return usersRepository.save(u);
        }).orElseThrow(() -> new UserRequestException("This user does not exist!"));
    }

    @PutMapping(value = "/blockUser/{id}")
    public Users blockUser(@RequestBody Users blockingUser , @PathVariable Long id){
        Optional<Users> user = usersRepository.findById(id);
        return user.map(u -> {
            u.setBlocked(blockingUser.isBlocked());
            return usersRepository.save(u);
        }).orElseThrow(()-> new UserRequestException("This user does not exist!"));

    }

    @GetMapping(value = "/getOneGood/{id}")
    public Goods getOneGood(@PathVariable("id") Long id){
        Optional<Goods> good = goodsRepository.findById(id);
        return good.orElseThrow(()->new GoodRequestException("Good does not exist!"));
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

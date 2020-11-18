package jwt.authentication.adminshopmanager.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("This good with id: "  + id + " doesn't exist!");
    }
}

package v.holovetskyi.shop.product.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v.holovetskyi.shop.product.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    List<Product> getProducts(){
        return List.of(
                new Product("Product 1", "Category 1", "Description", new BigDecimal("8.99"), "PLN"),
                new Product("Product 2", "Category 2", "Description", new BigDecimal("11.99"), "PLN"),
                new Product("Product 3", "Category 3", "Description", new BigDecimal("4.99"), "PLN"),
                new Product("Product 4", "Category 4", "Description", new BigDecimal("5.99"), "PLN")
        );
    }
}

package v.holovetskyi.shop.product.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v.holovetskyi.shop.product.model.Product;
import v.holovetskyi.shop.product.service.ProductService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    List<Product> getProducts(){
        return productService.getProducts();
    }
}

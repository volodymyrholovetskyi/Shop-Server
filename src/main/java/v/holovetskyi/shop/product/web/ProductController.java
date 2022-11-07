package v.holovetskyi.shop.product.web;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v.holovetskyi.shop.product.model.Product;
import v.holovetskyi.shop.product.service.ProductService;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping()
    Page<Product> getProducts(Pageable pageable) {
        System.out.println(pageable.getPageNumber() + " " + pageable.getPageSize());
        return productService.getProducts(pageable);
    }
}

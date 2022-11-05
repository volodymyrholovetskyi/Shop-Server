package v.holovetskyi.shop.product.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import v.holovetskyi.shop.product.model.Product;
import v.holovetskyi.shop.product.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}

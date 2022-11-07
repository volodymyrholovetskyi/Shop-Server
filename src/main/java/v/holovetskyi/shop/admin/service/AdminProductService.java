package v.holovetskyi.shop.admin.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import v.holovetskyi.shop.admin.model.AdminProduct;
import v.holovetskyi.shop.admin.repository.AdminProductRepository;

@Service
@AllArgsConstructor
public class AdminProductService {

    private final AdminProductRepository productRepository;

    public Page<AdminProduct> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}

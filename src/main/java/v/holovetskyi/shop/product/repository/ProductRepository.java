package v.holovetskyi.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import v.holovetskyi.shop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

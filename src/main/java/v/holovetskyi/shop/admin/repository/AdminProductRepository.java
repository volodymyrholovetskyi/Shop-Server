package v.holovetskyi.shop.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import v.holovetskyi.shop.admin.model.AdminProduct;
import v.holovetskyi.shop.product.model.Product;

public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}

package v.holovetskyi.shop.admin.web;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import v.holovetskyi.shop.admin.model.AdminProduct;
import v.holovetskyi.shop.admin.service.AdminProductService;
import v.holovetskyi.shop.admin.web.dto.AdminProductDTO;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/admin/products")
public class AdminProductController {

    public static final Long EMPTY_ID = null;
    private final AdminProductService productService;

    @GetMapping()
    public Page<AdminProduct> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @GetMapping("/{id}")
    public AdminProduct getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PostMapping()
    public AdminProduct createProduct(@RequestBody @Valid AdminProductDTO productDTO) {
        return productService.createProduct(mapAdminProduct(productDTO, EMPTY_ID));
    }

    @PutMapping("/{id}")
    public AdminProduct updateProduct(@RequestBody @Valid AdminProductDTO productDTO, @PathVariable Long id) {
        return productService.updateProduct(mapAdminProduct(productDTO, id));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }


    private AdminProduct mapAdminProduct(AdminProductDTO productDTO, Long id) {
        return AdminProduct.builder()
                .id(id)
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .category(productDTO.getCategory())
                .price(productDTO.getPrice())
                .currency(productDTO.getCurrency())
                .build();
    }
}


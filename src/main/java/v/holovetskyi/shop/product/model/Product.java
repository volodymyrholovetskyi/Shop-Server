package v.holovetskyi.shop.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import v.holovetskyi.shop.admin.model.AdminProductCurrency;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String description;
    private String fullDescription;
    private BigDecimal price;
    private String image;
    private String slug;

}

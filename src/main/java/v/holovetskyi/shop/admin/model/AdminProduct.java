package v.holovetskyi.shop.admin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import v.holovetskyi.shop.product.model.AdminProductCurrency;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private AdminProductCurrency currency;

}

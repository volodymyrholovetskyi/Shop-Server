package v.holovetskyi.shop.admin.web.dto;

import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import v.holovetskyi.shop.product.model.AdminProductCurrency;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
public class AdminProductDTO {

    @NotBlank
    @Length(min = 4)
    private String name;

    @NotBlank
    @Length(min = 4)
    private String category;

    @NotBlank
    @Length(min = 4)
    private String description;

    @NotNull
    @Min(0)
    private BigDecimal price;

    private AdminProductCurrency currency;
}

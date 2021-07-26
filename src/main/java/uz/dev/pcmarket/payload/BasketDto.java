package uz.dev.pcmarket.payload;

import lombok.Data;
import uz.dev.pcmarket.entity.Product;

import javax.persistence.OneToMany;
import java.util.List;

@Data
public class BasketDto {


    private Double price;

    private Double amount;

    private Integer productId;

}

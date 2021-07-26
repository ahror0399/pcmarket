package uz.dev.pcmarket.projections;


import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.Basket;
import uz.dev.pcmarket.entity.Product;

@Projection(types = Basket.class)
public interface BasketProjection {

    Integer getId();

    Double getPrice();

    Double getAmount();

    Double getTotalPrice();

    Product getProduct();

}
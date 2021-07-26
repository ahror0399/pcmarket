package uz.dev.pcmarket.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.*;

import java.util.List;

@Projection(types = Property.class)
public interface PropertyProjection {

    Integer getId();

    String getAmount();

    Characteristic getCharacteristic();

    Measurement getMeasurement();

    Product getProduct();


}

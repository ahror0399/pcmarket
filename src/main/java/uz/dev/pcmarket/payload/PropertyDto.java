package uz.dev.pcmarket.payload;

import lombok.Data;
import uz.dev.pcmarket.entity.Characteristic;
import uz.dev.pcmarket.entity.Measurement;
import uz.dev.pcmarket.entity.Product;

import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;

@Data
public class PropertyDto {


    private String  amount;

    private Integer characteristicId;

    private Integer measurementId;

    private Integer productId;


}

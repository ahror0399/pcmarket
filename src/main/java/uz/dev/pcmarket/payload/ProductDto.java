package uz.dev.pcmarket.payload;

import lombok.Data;

import java.util.List;

@Data
public class ProductDto {

    private String  name;

    private Double price;

    private List<Integer> characteristicsId;

    private List<Integer> attachmentsId;

    private Integer categoryId;

    private boolean isConfiguration;

    private String warranty;


}

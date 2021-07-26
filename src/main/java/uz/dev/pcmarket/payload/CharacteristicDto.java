package uz.dev.pcmarket.payload;

import lombok.Data;

@Data
public class CharacteristicDto {

    private String name;

    private String value;

    private Integer categoryId;

}

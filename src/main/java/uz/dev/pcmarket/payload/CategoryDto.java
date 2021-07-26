package uz.dev.pcmarket.payload;

import lombok.Data;
import uz.dev.pcmarket.entity.Category;

import javax.persistence.criteria.CriteriaBuilder;

@Data
public class CategoryDto {

    private String  name;

    private Integer parentCategoryId;
}

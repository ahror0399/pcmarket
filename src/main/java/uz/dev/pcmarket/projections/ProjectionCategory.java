package uz.dev.pcmarket.projections;


import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.Category;

@Projection(types = Category.class)
public interface ProjectionCategory {


    Integer getId();

    String getName();

    Category getCategory();


}

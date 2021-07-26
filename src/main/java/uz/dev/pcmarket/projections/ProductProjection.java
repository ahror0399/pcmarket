package uz.dev.pcmarket.projections;

import org.apache.catalina.LifecycleState;
import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.Attachment;
import uz.dev.pcmarket.entity.Category;
import uz.dev.pcmarket.entity.Characteristic;

import java.util.List;

@Projection(types = ProductProjection.class)
public interface ProductProjection {

    Integer getId();

    String getName();
    String getPrice();

    List<Attachment> getAttachments();

    Category getCategory();

    boolean isConfiguration();

    String  getWarranty();




}

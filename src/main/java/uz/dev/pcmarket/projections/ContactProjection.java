package uz.dev.pcmarket.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.Attachment;
import uz.dev.pcmarket.entity.Category;
import uz.dev.pcmarket.entity.Contact;

@Projection(types = Contact.class)
public interface ContactProjection {

    Integer getId();

    String getName();

    String getProfession();

    Attachment getAttachment();
}

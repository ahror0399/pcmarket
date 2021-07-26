package uz.dev.pcmarket.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.dev.pcmarket.entity.Attachment;
import uz.dev.pcmarket.entity.Comment;

@Projection(types = Comment.class)
public interface CommentProjection {

    Integer getId();

    String getName();

    String getDescription();

    Attachment getAttachment();


}

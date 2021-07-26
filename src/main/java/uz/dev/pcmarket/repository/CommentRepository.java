package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Comment;
import uz.dev.pcmarket.projections.CommentProjection;

@RepositoryRestResource(path = "comment",collectionResourceRel = "list",excerptProjection = CommentProjection.class)
public interface CommentRepository extends JpaRepository<Comment,Integer> {


}

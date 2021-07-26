package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Category;
import uz.dev.pcmarket.projections.ProjectionCategory;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = ProjectionCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {



}

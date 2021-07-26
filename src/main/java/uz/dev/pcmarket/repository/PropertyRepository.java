package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Property;
import uz.dev.pcmarket.projections.PropertyProjection;

@RepositoryRestResource(path = "property",collectionResourceRel = "list",excerptProjection = PropertyProjection.class)
public interface PropertyRepository extends JpaRepository<Property,Integer> {


}

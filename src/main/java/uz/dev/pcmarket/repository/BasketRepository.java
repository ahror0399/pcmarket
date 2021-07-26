package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Basket;
import uz.dev.pcmarket.projections.BasketProjection;

@RepositoryRestResource(path = "basket",collectionResourceRel = "list",excerptProjection = BasketProjection.class)
public interface BasketRepository extends JpaRepository<Basket,Integer> {


}

package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.dev.pcmarket.entity.Product;
import uz.dev.pcmarket.projections.ProductProjection;

import java.util.List;


@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ProductProjection.class)
public interface ProductRepository  extends JpaRepository<Product,Integer> {

    @RestResource(path = "price")
    List<Product> findAllByPriceBetween(@Param("price") Double price, Double price2);


    @RestResource(path = "filter")
    @Query(value = "   select * from product p where p.id in( select ch.product_id " +
            "from characteristic ch " +
            "where ch.id in(select pp.character_id from property pp where pp.id in(:list)))\n ",nativeQuery = true)
    List<Product> findAllByProduct(@Param("list") List<Integer> list);



    
//    @RestResource(path = "filter")
//    @Query(value = "    select * from product p\n" +
//            "    join characteristic ch on ch.product_id=p.id\n" +
//            "    join property pp on pp.characteristic_id=ch.id where pp.id in(list)",nativeQuery = true)
//    List<Product> findAllByProduct(@Param("list") List<Integer> list);



}

package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Characteristic;
import uz.dev.pcmarket.projections.CharacteristicProjection;

import java.util.List;

    @RepositoryRestResource(path = "characteristic",collectionResourceRel = "list",excerptProjection = CharacteristicProjection.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic,Integer> {

//    List<Characteristic> findAllById(Iterable<Integer> iterable);
}

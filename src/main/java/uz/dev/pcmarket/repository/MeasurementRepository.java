package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Measurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list")
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {



}

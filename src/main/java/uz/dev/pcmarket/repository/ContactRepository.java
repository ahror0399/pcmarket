package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Contact;
import uz.dev.pcmarket.projections.BasketProjection;
import uz.dev.pcmarket.projections.ContactProjection;


@RepositoryRestResource(path = "contact",collectionResourceRel = "list",excerptProjection = ContactProjection.class)
public interface ContactRepository extends JpaRepository<Contact,Integer> {



}

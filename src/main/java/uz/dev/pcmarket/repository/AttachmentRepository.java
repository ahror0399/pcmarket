package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Attachment;

import java.util.List;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {


    List<Attachment> findAllById(Iterable<Integer> iterable);
}

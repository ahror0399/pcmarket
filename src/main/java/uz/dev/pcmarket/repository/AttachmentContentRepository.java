package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.AttachmentContent;

import java.util.Optional;


public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    Optional<AttachmentContent> findByAttachmentId(Integer attachment_id);

    void deleteByAttachment_Id(Integer attachment_id);
}

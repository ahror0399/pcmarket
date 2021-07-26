package uz.dev.pcmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.dev.pcmarket.entity.Attachment;
import uz.dev.pcmarket.entity.AttachmentContent;
import uz.dev.pcmarket.repository.AttachmentContentRepository;
import uz.dev.pcmarket.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class AttachmentService {


    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;


    public boolean upload(MultipartHttpServletRequest request) {

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        if (file != null){

            Attachment attachment =new Attachment();
            attachment.setContentType(file.getContentType());
            attachment.setName(file.getOriginalFilename());
            attachment.setSize(file.getSize());

            AttachmentContent attachmentContent = new AttachmentContent();
            try {
                attachmentContent.setBytes(file.getBytes());
                attachmentContent.setAttachment(attachment);
                attachmentRepository.save(attachment);
                attachmentContentRepository.save(attachmentContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }


    public boolean getFile(Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachmentId(attachment.getId());
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment; filename=\""+attachment.getName()+"\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(),
                        response.getOutputStream());
                return true;
            }

        }
        return false;

    }


    public boolean delete(Integer id) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            attachmentContentRepository.deleteByAttachment_Id(id);
            attachmentRepository.deleteById(id);
            return true;
        }
            return false;
    }
}

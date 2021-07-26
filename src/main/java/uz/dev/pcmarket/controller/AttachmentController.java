package uz.dev.pcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.dev.pcmarket.service.AttachmentService;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public HttpEntity<?> upload(MultipartHttpServletRequest request) {
        boolean upload = attachmentService.upload(request);
        if (upload)
            return ResponseEntity.accepted().build();

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/download/{id}")
    public  HttpEntity<?> getFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        boolean download = attachmentService.getFile(id,response);
        if (download)
            return ResponseEntity.accepted().build();

        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/delete/{id}")
    public HttpEntity<?> delete(@PathVariable Integer id){
        boolean delete = attachmentService.delete(id);
            if (delete)
                return ResponseEntity.noContent().build();

            return ResponseEntity.notFound().build();
        }
    }

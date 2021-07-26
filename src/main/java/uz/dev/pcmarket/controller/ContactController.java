//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.entity.Contact;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.payload.ContactDto;
//import uz.dev.pcmarket.service.ContactService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/contact")
//
//public class ContactController {
//
//    @Autowired
//    ContactService contactService;
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody ContactDto contactDto){
//        Contact contact = contactService.add(contactDto);
//        return ResponseEntity.status(contact!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(contact);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Contact> contacts = contactService.getAll();
//        return ResponseEntity.ok(contacts);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Contact  contact = contactService.delete(id);
//        return ResponseEntity.status(contact!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(contact);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Contact contact = contactService.getById(id);
//        return ResponseEntity.status(contact!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(contact);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody ContactDto contactDto){
//
//        Contact contact = contactService.edit(id,contactDto);
//        return ResponseEntity.status(contact!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(contact);
//    }
//
//
//
//}

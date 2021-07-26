//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Attachment;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.entity.Contact;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.payload.ContactDto;
//import uz.dev.pcmarket.repository.AttachmentRepository;
//import uz.dev.pcmarket.repository.ContactRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ContactService {
//
//    @Autowired
//    ContactRepository contactRepository;
//    @Autowired
//    AttachmentRepository attachmentRepository;
//
//
//    public Contact add(ContactDto contactDto) {
//        Contact  contact=new Contact();
//        contact.setName(contactDto.getName());
//        contact.setProfession(contactDto.getProfession());
//
//        if (contactDto.getAttachmentId() != null){
//            Optional<Attachment> optionalAttachment = attachmentRepository.findById(contactDto.getAttachmentId());
//            if (optionalAttachment.isPresent())
//                contact.setAttachment(optionalAttachment.get());
//            else return null;
//        }
//        contactRepository.save(contact);
//        return contact;
//    }
//
//
//    public List<Contact> getAll() {
//        return contactRepository.findAll();
//    }
//
//    public Contact delete(Integer id) {
//
//        Optional<Contact> optionalContact = contactRepository.findById(id);
//
//        if (optionalContact.isPresent()) {
//            Contact contact = optionalContact.get();
//            contactRepository.deleteById(id);
//            return contact;
//        }
//        else return  null;
//    }
//
//    public Contact getById(Integer id) {
//
//        Optional<Contact> optionalContact = contactRepository.findById(id);
//        if (optionalContact.isEmpty())
//            return  null;
//
//        return optionalContact.get();
//    }
//
//
//    public Contact edit(Integer id, ContactDto contactDto) {
//
//        Optional<Contact> optionalContact = contactRepository.findById(id);
//        if (optionalContact.isEmpty())
//            return null;
//
//        Contact contact = optionalContact.get();
//        contact.setName(contactDto.getName());
//
//        if (contactDto.getAttachmentId() != null){
//            Optional<Attachment> optionalAttachment = attachmentRepository.findById(contactDto.getAttachmentId());
//            if (optionalAttachment.isPresent())
//                contact.setAttachment(optionalAttachment.get());
//            else  return null;
//
//        }
//        return   contactRepository.save(contact);
//    }
//
//}

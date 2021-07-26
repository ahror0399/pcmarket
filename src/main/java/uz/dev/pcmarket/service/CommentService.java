//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Attachment;
//import uz.dev.pcmarket.entity.Category;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.payload.CategoryDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.repository.AttachmentRepository;
//import uz.dev.pcmarket.repository.CommentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CommentService {
//
//    @Autowired
//    CommentRepository commentRepository;
//    @Autowired
//    AttachmentRepository attachmentRepository;
//
//
//
//    public Comment add(CommentDto commentDto) {
//        Comment  comment=new Comment();
//        comment.setName(commentDto.getName());
//        comment.setDescription(commentDto.getDescription());
//
//        if (commentDto.getAttachmentId() != null){
//            Optional<Attachment> optionalAttachment = attachmentRepository.findById(commentDto.getAttachmentId());
//            if (optionalAttachment.isEmpty())
//                return null;
//            comment.setAttachment(optionalAttachment.get());
//        }
//        commentRepository.save(comment);
//        return comment;
//    }
//
//
//    public List<Comment> getAll() {
//        return commentRepository.findAll();
//    }
//
//    public Comment delete(Integer id) {
//
//        Optional<Comment> optionalComment = commentRepository.findById(id);
//
//        if (optionalComment.isPresent()) {
//            Comment comment = optionalComment.get();
//            commentRepository.deleteById(id);
//            return comment;
//        }
//        else return  null;
//    }
//
//    public Comment getById(Integer id) {
//
//        Optional<Comment> optionalComment = commentRepository.findById(id);
//        if (optionalComment.isEmpty())
//            return  null;
//
//        return optionalComment.get();
//    }
//
//
//    public Comment edit(Integer id, CommentDto commentDto) {
//
//        Optional<Comment> optionalComment = commentRepository.findById(id);
//        if (optionalComment.isEmpty())
//            return null;
//
//        Comment comment = optionalComment.get();
//        comment.setName(commentDto.getName());
//
//        if (commentDto.getAttachmentId() != null){
//            Optional<Attachment> optionalAttachment = attachmentRepository.findById(commentDto.getAttachmentId());
//            if (optionalAttachment.isEmpty())
//                return null;
//
//            comment.setAttachment(optionalAttachment.get());
//        }
//        return   commentRepository.save(comment);
//    }
//
//
//
//
//}

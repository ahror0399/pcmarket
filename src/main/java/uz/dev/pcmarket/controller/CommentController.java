//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Category;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.payload.CategoryDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.service.CommentService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/comment")
//public class CommentController {
//
//    @Autowired
//    CommentService commentService;
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody CommentDto commentDto){
//        Comment comment = commentService.add(commentDto);
//        return ResponseEntity.status(comment!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(comment);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Comment> comments = commentService.getAll();
//        return ResponseEntity.ok(comments);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Comment  comment = commentService.delete(id);
//        return ResponseEntity.status(comment!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(comment);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Comment comment = commentService.getById(id);
//        return ResponseEntity.status(comment!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(comment);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody CommentDto commentDto){
//
//        Comment comment = commentService.edit(id,commentDto);
//        return ResponseEntity.status(comment!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(comment);
//    }
//
//
//
//}

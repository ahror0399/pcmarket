//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.entity.Product;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.payload.ProductDto;
//import uz.dev.pcmarket.service.ProductService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/product")
//public class ProductController {
//
//    @Autowired
//    ProductService productService;
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody ProductDto productDto){
//        Product product = productService.add(productDto);
//        return ResponseEntity.status(product!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(product);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Product> products = productService.getAll();
//        return ResponseEntity.ok(products);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Product  product = productService.delete(id);
//        return ResponseEntity.status(product!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(product);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Product product = productService.getById(id);
//        return ResponseEntity.status(product!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(product);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody ProductDto productDto){
//
//        Product product = productService.edit(id,productDto);
//        return ResponseEntity.status(product!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(product);
//    }
//
//
//}

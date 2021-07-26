//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Basket;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.payload.BasketDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.service.BasketService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/basket")
//public class BasketController {
//
//    @Autowired
//    BasketService basketService;
//
//
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody BasketDto basketDto){
//        Basket basket = basketService.add(basketDto);
//        return ResponseEntity.status(basket!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(basket);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Basket> baskets = basketService.getAll();
//        return ResponseEntity.ok(baskets);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Basket  basket = basketService.delete(id);
//        return ResponseEntity.status(basket!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(basket);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Basket basket = basketService.getById(id);
//        return ResponseEntity.status(basket!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(basket);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody BasketDto basketDto){
//
//        Basket basket = basketService.edit(id,basketDto);
//        return ResponseEntity.status(basket!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(basket);
//    }
//
//
//}

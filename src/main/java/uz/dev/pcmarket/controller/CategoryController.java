//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Category;
//import uz.dev.pcmarket.payload.CategoryDto;
//import uz.dev.pcmarket.service.CategoryService;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import java.util.List;
//
//@RestController
//@RequestMapping("/category")
//public class CategoryController {
//
//    @Autowired
//    CategoryService categoryService;
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody CategoryDto categoryDto){
//        Category category = categoryService.add(categoryDto);
//         return ResponseEntity.status(category!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(category);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Category> categories = categoryService.getAll();
//         return ResponseEntity.ok(categories);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Category category = categoryService.delete(id);
//       return ResponseEntity.status(category!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(category);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Category category = categoryService.getById(id);
//       return ResponseEntity.status(category!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(category);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody CategoryDto categoryDto){
//
//        Category category = categoryService.edit(id,categoryDto);
//        return ResponseEntity.status(category!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(category);
//    }
//
//
//
//}

//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Product;
//import uz.dev.pcmarket.entity.Property;
//import uz.dev.pcmarket.payload.ProductDto;
//import uz.dev.pcmarket.payload.PropertyDto;
//import uz.dev.pcmarket.service.PropertyService;
//
//import java.util.List;
//import java.util.PropertyPermission;
//
//@RestController
//@RequestMapping("/property")
//public class PropertyController {
//
//    @Autowired
//    PropertyService propertyService;
//
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody PropertyDto propertyDto){
//        Property property = propertyService.add(propertyDto);
//        return ResponseEntity.status(property!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(property);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Property> properties = propertyService.getAll();
//        return ResponseEntity.ok(properties);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Property  property= propertyService.delete(id);
//        return ResponseEntity.status(property!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(property);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Property property = propertyService.getById(id);
//        return ResponseEntity.status(property!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(property);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody PropertyDto propertyDto){
//
//        Property property = propertyService.edit(id,propertyDto);
//        return ResponseEntity.status(property!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(property);
//    }
//
//
//}

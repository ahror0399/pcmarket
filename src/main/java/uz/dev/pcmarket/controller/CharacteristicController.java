//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Characteristic;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.payload.CharacteristicDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.service.CharacteristicService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/characteristic")
//public class CharacteristicController {
//
//    @Autowired
//    CharacteristicService characteristicService;
//
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody CharacteristicDto characteristicDto){
//        Characteristic characteristic = characteristicService.add(characteristicDto);
//        return ResponseEntity.status(characteristic!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(characteristic);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Characteristic> characteristics = characteristicService.getAll();
//        return ResponseEntity.ok(characteristics);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Characteristic  characteristic = characteristicService.delete(id);
//        return ResponseEntity.status(characteristic!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(characteristic);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Characteristic characteristic = characteristicService.getById(id);
//        return ResponseEntity.status(characteristic!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(characteristic);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody CharacteristicDto characteristicDto){
//
//        Characteristic characteristic = characteristicService.edit(id,characteristicDto);
//        return ResponseEntity.status(characteristic!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(characteristic);
//    }
//
//
//}

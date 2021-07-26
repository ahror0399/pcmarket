//package uz.dev.pcmarket.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import uz.dev.pcmarket.entity.Contact;
//import uz.dev.pcmarket.entity.Measurement;
//import uz.dev.pcmarket.payload.ContactDto;
//import uz.dev.pcmarket.service.MeasurementService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/measurement")
//
//public class MeasurementController {
//
//    @Autowired
//    MeasurementService measurementService;
//
//
//
//    @PostMapping("/add")
//    public HttpEntity<?> add(@RequestBody Measurement measurement){
//        Measurement newMeasurement = measurementService.add(measurement);
//        return ResponseEntity.status(newMeasurement!=null? HttpStatus.CREATED : HttpStatus.CONFLICT).body(newMeasurement);
//    }
//
//    @GetMapping("/get")
//    public HttpEntity<?> getAll(){
//        List<Measurement> measurements = measurementService.getAll();
//        return ResponseEntity.ok(measurements);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> delete(@PathVariable Integer id){
//        Measurement  measurement = measurementService.delete(id);
//        return ResponseEntity.status(measurement!=null? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).body(measurement);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getById(@PathVariable Integer id){
//        Measurement measurement = measurementService.getById(id);
//        return ResponseEntity.status(measurement!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(measurement);
//    }
//
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody Measurement measurement){
//
//        Measurement editedMeasurement = measurementService.edit(id, measurement);
//        return ResponseEntity.status(editedMeasurement!=null? HttpStatus.OK : HttpStatus.NOT_FOUND).body(editedMeasurement);
//    }
//
//
//}

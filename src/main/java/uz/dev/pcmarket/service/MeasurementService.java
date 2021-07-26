//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Attachment;
//import uz.dev.pcmarket.entity.Contact;
//import uz.dev.pcmarket.entity.Measurement;
//import uz.dev.pcmarket.payload.ContactDto;
//import uz.dev.pcmarket.repository.MeasurementRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MeasurementService {
//
//    @Autowired
//    MeasurementRepository measurementRepository;
//
//    public Measurement add(Measurement measurement) {
//        measurementRepository.save(measurement);
//        return measurement;
//    }
//
//
//    public List<Measurement> getAll() {
//        return measurementRepository.findAll();
//    }
//
//    public Measurement delete(Integer id) {
//
//        Optional<Measurement> optionalMeasurement = measurementRepository.findById(id);
//
//        if (optionalMeasurement.isPresent()) {
//            Measurement measurement = optionalMeasurement.get();
//            measurementRepository.deleteById(id);
//            return measurement;
//        }
//        else return  null;
//    }
//
//    public Measurement getById(Integer id) {
//
//        Optional<Measurement> optionalMeasurement = measurementRepository.findById(id);
//        if (optionalMeasurement.isEmpty())
//            return  null;
//
//        return optionalMeasurement.get();
//    }
//
//
//    public Measurement edit(Integer id, Measurement measurement) {
//
//        Optional<Measurement> optionalMeasurement = measurementRepository.findById(id);
//        if (optionalMeasurement.isEmpty())
//            return null;
//
//        measurementRepository.save(measurement);
//        return measurement;
//    }
//
//
//}

//package uz.dev.pcmarket.service;
//
//import com.fasterxml.jackson.databind.annotation.JsonAppend;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.*;
//import uz.dev.pcmarket.payload.ProductDto;
//import uz.dev.pcmarket.payload.PropertyDto;
//import uz.dev.pcmarket.repository.CharacteristicRepository;
//import uz.dev.pcmarket.repository.MeasurementRepository;
//import uz.dev.pcmarket.repository.ProductRepository;
//import uz.dev.pcmarket.repository.PropertyRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PropertyService {
//
//    @Autowired
//    PropertyRepository propertyRepository;
//    @Autowired
//    CharacteristicRepository characteristicRepository;
//    @Autowired
//    MeasurementRepository measurementRepository;
//    @Autowired
//    ProductRepository productRepository;
//
//
//    public Property add(PropertyDto propertyDto) {
//
//        Optional<Measurement> optionalMeasurement = measurementRepository.findById(propertyDto.getMeasurementId());
//        if (optionalMeasurement.isEmpty())
//            return null;
//
//        Optional<Product> optionalProduct = productRepository.findById(propertyDto.getProductId());
//        if (optionalProduct.isEmpty())
//            return null;
//
//        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(propertyDto.getCharacteristicId());
//        if (optionalCharacteristic.isEmpty())
//            return null;
//
//        Property  property=new Property();
//        property.setAmount(propertyDto.getAmount());
//        property.setCharacteristic(optionalCharacteristic.get());
//        property.setProduct(optionalProduct.get());
//        property.setMeasurement(optionalMeasurement.get());
//
//        propertyRepository.save(property);
//        return property;
//    }
//
//
//    public List<Property> getAll() {
//        return propertyRepository.findAll();
//    }
//
//    public Property delete(Integer id) {
//
//        Optional<Property> optionalProperty = propertyRepository.findById(id);
//
//        if (optionalProperty.isPresent()) {
//            Property property = optionalProperty.get();
//            propertyRepository.deleteById(id);
//            return property;
//        }
//        else return  null;
//    }
//
//    public Property getById(Integer id) {
//
//        Optional<Property> optionalProperty = propertyRepository.findById(id);
//        if (optionalProperty.isEmpty())
//            return  null;
//
//        return optionalProperty.get();
//    }
//
//
//    public Property edit(Integer id, PropertyDto propertyDto) {
//
//        Optional<Property> optionalProperty = propertyRepository.findById(id);
//        if (optionalProperty.isEmpty())
//            return null;
//
//        Optional<Measurement> optionalMeasurement = measurementRepository.findById(propertyDto.getMeasurementId());
//        if (optionalMeasurement.isEmpty())
//            return null;
//
//        Optional<Product> optionalProduct = productRepository.findById(propertyDto.getProductId());
//        if (optionalProduct.isEmpty())
//            return null;
//
//        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(propertyDto.getCharacteristicId());
//        if (optionalCharacteristic.isEmpty())
//            return null;
//
//        Property  property=new Property();
//        property.setAmount(propertyDto.getAmount());
//        property.setCharacteristic(optionalCharacteristic.get());
//        property.setProduct(optionalProduct.get());
//        property.setMeasurement(optionalMeasurement.get());
//
//        propertyRepository.save(property);
//        return property;
//    }
//
//
//
//}

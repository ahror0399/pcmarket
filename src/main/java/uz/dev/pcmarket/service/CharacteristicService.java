//package uz.dev.pcmarket.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Attachment;
//import uz.dev.pcmarket.entity.Category;
//import uz.dev.pcmarket.entity.Characteristic;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.payload.CharacteristicDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.repository.CategoryRepository;
//import uz.dev.pcmarket.repository.CharacteristicRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CharacteristicService {
//
//    @Autowired
//    CharacteristicRepository characteristicRepository;
//    @Autowired
//    CategoryRepository categoryRepository;
//
//
//    public Characteristic add(CharacteristicDto characteristicDto) {
//        Characteristic  characteristic=new Characteristic();
//        characteristic.setName(characteristicDto.getName());
//
//        if (characteristicDto.getCategoryId() != null){
//            Optional<Category> optionalCategory = categoryRepository.findById(characteristicDto.getCategoryId());
//            if (optionalCategory.isEmpty())
//                return null;
//            characteristic.setCategory(optionalCategory.get());
//        }
//        characteristicRepository.save(characteristic);
//        return characteristic;
//    }
//
//
//    public List<Characteristic> getAll() {
//        return characteristicRepository.findAll();
//    }
//
//    public Characteristic delete(Integer id) {
//
//        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(id);
//
//        if (optionalCharacteristic.isPresent()) {
//            Characteristic characteristic = optionalCharacteristic.get();
//            characteristicRepository.deleteById(id);
//            return characteristic;
//        }
//        else return  null;
//    }
//
//    public Characteristic getById(Integer id) {
//
//        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(id);
//        if (optionalCharacteristic.isEmpty())
//            return  null;
//
//        return optionalCharacteristic.get();
//    }
//
//
//    public Characteristic edit(Integer id, CharacteristicDto characteristicDto) {
//
//        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(id);
//        if (optionalCharacteristic.isEmpty())
//            return null;
//
//        Characteristic characteristic = optionalCharacteristic.get();
//        characteristic.setName(characteristicDto.getName());
//
//        if (characteristicDto.getCategoryId() != null){
//            Optional<Category> optionalCategory = categoryRepository.findById(characteristicDto.getCategoryId());
//            if (optionalCategory.isEmpty())
//                return null;
//
//            characteristic.setCategory(optionalCategory.get());
//        }
//        return   characteristicRepository.save(characteristic);
//    }
//
//
//
//}

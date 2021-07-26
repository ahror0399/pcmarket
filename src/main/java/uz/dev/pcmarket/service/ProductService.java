//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.*;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.payload.ProductDto;
//import uz.dev.pcmarket.repository.AttachmentRepository;
//import uz.dev.pcmarket.repository.CategoryRepository;
//import uz.dev.pcmarket.repository.CharacteristicRepository;
//import uz.dev.pcmarket.repository.ProductRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    ProductRepository productRepository;
//    @Autowired
//    AttachmentRepository attachmentRepository;
//    @Autowired
//    CategoryRepository categoryRepository;
//    @Autowired
//    CharacteristicRepository characteristicRepository;
//
//    public Product add(ProductDto productDto) {
//
//            List<Attachment> attachmentRepositoryAllById = attachmentRepository.findAllById(productDto.getAttachmentsId());
//            if (attachmentRepositoryAllById.isEmpty())
//                return null;
//
//            Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
//            if (optionalCategory.isEmpty())
//                return null;
//
//            List<Characteristic> characteristicRepositoryAllById = characteristicRepository.findAllById(productDto.getCharacteristicsId());
//            if (characteristicRepositoryAllById.isEmpty())
//                return null;
//
//        Product  product=new Product();
//        product.setName(productDto.getName());
//        product.setPrice(productDto.getPrice());
//        product.setWarranty(productDto.getWarranty());
//        product.setConfiguration(productDto.isConfiguration());
//         product.setAttachments(attachmentRepositoryAllById);
//        product.setCategory(optionalCategory.get());
//        product.setAttachments(attachmentRepositoryAllById);
//
//        productRepository.save(product);
//        return product;
//    }
//
//
//    public List<Product> getAll() {
//        return productRepository.findAll();
//    }
//
//    public Product delete(Integer id) {
//
//        Optional<Product> optionalProduct = productRepository.findById(id);
//
//        if (optionalProduct.isPresent()) {
//            Product product = optionalProduct.get();
//            productRepository.deleteById(id);
//            return product;
//        }
//        else return  null;
//    }
//
//    public Product getById(Integer id) {
//
//        Optional<Product> optionalComment = productRepository.findById(id);
//        if (optionalComment.isEmpty())
//            return  null;
//
//        return optionalComment.get();
//    }
//
//
//    public Product edit(Integer id, ProductDto productDto) {
//
//        Optional<Product> optionalProduct = productRepository.findById(id);
//        if (optionalProduct.isEmpty())
//            return null;
//
//        Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
//        if (optionalCategory.isEmpty())
//            return null;
//
//        List<Characteristic> characteristicRepositoryAllById = characteristicRepository.findAllById(productDto.getCharacteristicsId());
//        if (characteristicRepositoryAllById.isEmpty())
//            return null;
//
//        List<Attachment> attachmentRepositoryAllById = attachmentRepository.findAllById(productDto.getAttachmentsId());
//        if (attachmentRepositoryAllById.isEmpty())
//            return null;
//
//
//        Product product = optionalProduct.get();
//        product.setName(productDto.getName());
//        product.setPrice(productDto.getPrice());
//        product.setWarranty(productDto.getWarranty());
//        product.setConfiguration(productDto.isConfiguration());
//        product.setAttachments(attachmentRepositoryAllById);
//        product.setCategory(optionalCategory.get());
//        product.setAttachments(attachmentRepositoryAllById);
//        product.setCharacteristics(characteristicRepositoryAllById);
//
//        productRepository.save(product);
//        return product;
//    }
//}

//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Category;
//import uz.dev.pcmarket.payload.CategoryDto;
//import uz.dev.pcmarket.repository.CategoryRepository;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CategoryService {
//
//    @Autowired
//    CategoryRepository categoryRepository;
//
//
//    public Category add(CategoryDto categoryDto) {
//        Category category=new Category();
//        category.setName(categoryDto.getName());
//
//        if (categoryDto.getParentCategoryId() != null){
//            Optional<Category> optionalCategory = categoryRepository.findById(categoryDto.getParentCategoryId());
//            if (optionalCategory.isEmpty())
//                return null;
//            category.setCategory(optionalCategory.get());
//        }
//        categoryRepository.save(category);
//        return category;
//    }
//
//
//    public List<Category> getAll() {
//        return categoryRepository.findAll();
//    }
//
//    public Category delete(Integer id) {
//
//        Optional<Category> optionalCategory = categoryRepository.findById(id);
//
//        if (optionalCategory.isPresent()) {
//            Category category = optionalCategory.get();
//            categoryRepository.deleteById(id);
//            return category;
//        }
//        else return  null;
//    }
//
//    public Category getById(Integer id) {
//
//        Optional<Category> optionalCategory = categoryRepository.findById(id);
//        if (optionalCategory.isEmpty())
//            return  null;
//
//        return optionalCategory.get();
//    }
//
//
//    public Category edit(Integer id, CategoryDto categoryDto) {
//
//        Optional<Category> optionalCategory = categoryRepository.findById(id);
//        if (optionalCategory.isEmpty())
//            return null;
//
//        Category category = optionalCategory.get();
//        category.setName(categoryDto.getName());
//
//        if (categoryDto.getParentCategoryId() != null){
//            Optional<Category> optionalParentCategory = categoryRepository.findById(categoryDto.getParentCategoryId());
//            if (optionalParentCategory.isEmpty())
//                return null;
//
//            category.setCategory(optionalParentCategory.get());
//            }
//      return   categoryRepository.save(category);
//        }
//}

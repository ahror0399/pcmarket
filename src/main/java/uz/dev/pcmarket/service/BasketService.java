//package uz.dev.pcmarket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import uz.dev.pcmarket.entity.Attachment;
//import uz.dev.pcmarket.entity.Basket;
//import uz.dev.pcmarket.entity.Comment;
//import uz.dev.pcmarket.entity.Product;
//import uz.dev.pcmarket.payload.BasketDto;
//import uz.dev.pcmarket.payload.CommentDto;
//import uz.dev.pcmarket.repository.BasketRepository;
//import uz.dev.pcmarket.repository.ProductRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class BasketService {
//
//    @Autowired
//    BasketRepository basketRepository;
//    @Autowired
//    ProductRepository productRepository;
//
//
//    public Basket add(BasketDto basketDto) {
//        Basket  basket=new Basket();
//        basket.setAmount(basketDto.getAmount());
//        basket.setPrice(basketDto.getPrice());
//        basket.setTotalPrice(basket.getPrice() * basket.getAmount());
//
//        if (basketDto.getProductId() != null){
//            Optional<Product> optionalProduct = productRepository.findById(basketDto.getProductId());
//            if (optionalProduct.isEmpty())
//                return null;
//            basket.setProduct(optionalProduct.get());
//        }
//        basketRepository.save(basket);
//        return basket;
//    }
//
//
//    public List<Basket> getAll() {
//        return basketRepository.findAll();
//    }
//
//    public Basket delete(Integer id) {
//
//        Optional<Basket> optionalBasket = basketRepository.findById(id);
//
//        if (optionalBasket.isPresent()) {
//            Basket basket = optionalBasket.get();
//            basketRepository.deleteById(id);
//            return basket;
//        }
//        else return  null;
//    }
//
//    public Basket getById(Integer id) {
//
//        Optional<Basket> optionalBasket = basketRepository.findById(id);
//        if (optionalBasket.isEmpty())
//            return  null;
//
//        return optionalBasket.get();
//    }
//
//
//    public Basket edit(Integer id, BasketDto basketDto) {
//
//        Optional<Basket> optionalBasket = basketRepository.findById(id);
//        if (optionalBasket.isEmpty())
//            return null;
//
//        Basket basket = optionalBasket.get();
//        basket.setAmount(basketDto.getAmount());
//        return   basketRepository.save(basket);
//    }
//
//
//
//
//}

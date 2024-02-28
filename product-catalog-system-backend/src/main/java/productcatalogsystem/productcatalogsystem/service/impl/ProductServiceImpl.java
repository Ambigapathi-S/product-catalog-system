package productcatalogsystem.productcatalogsystem.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import productcatalogsystem.productcatalogsystem.entity.Product;
import productcatalogsystem.productcatalogsystem.repository.ProductRepository;
import productcatalogsystem.productcatalogsystem.service.ProductService;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}

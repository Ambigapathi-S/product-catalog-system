package productcatalogsystem.productcatalogsystem.service;

import productcatalogsystem.productcatalogsystem.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getProductList();

}

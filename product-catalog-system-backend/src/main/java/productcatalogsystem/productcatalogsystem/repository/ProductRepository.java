package productcatalogsystem.productcatalogsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import productcatalogsystem.productcatalogsystem.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

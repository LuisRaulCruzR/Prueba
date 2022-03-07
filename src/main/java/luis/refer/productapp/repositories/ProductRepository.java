package luis.refer.productapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import luis.refer.productapp.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

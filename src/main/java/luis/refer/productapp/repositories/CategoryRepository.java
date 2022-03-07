package luis.refer.productapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import luis.refer.productapp.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

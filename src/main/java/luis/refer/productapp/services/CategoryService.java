package luis.refer.productapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luis.refer.productapp.models.Category;
import luis.refer.productapp.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	//Save new categorie
	public void save(Category category)
	{
		categoryRepository.save(category);
	}
	
	public Category findById(int id) {		
		return categoryRepository.findById(id);
	}

}

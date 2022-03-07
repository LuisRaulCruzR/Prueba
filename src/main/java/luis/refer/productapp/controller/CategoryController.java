package luis.refer.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import luis.refer.productapp.models.Category;
import luis.refer.productapp.services.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public String getCategories(Model model){
		
		List<Category> categoryList = categoryService.getCategories();
		
		model.addAttribute("categories", categoryList);
		return	"Category";
	}
	
	@PostMapping("/categories/addNew")
	public String addNew(Category category) {
		categoryService.save(category);
		return "redirect:/categories";		
	}
}

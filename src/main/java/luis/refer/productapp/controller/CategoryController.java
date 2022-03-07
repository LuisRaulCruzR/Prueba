package luis.refer.productapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/categories/findById")
	@ResponseBody
	public Optional<Category> findById(int id) {
	 return	categoryService.findById(id);
	}
	
	@RequestMapping(value="/categories/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Category category) {
		categoryService.save(category);
		return "redirect:/categories";		
	}
	
	@RequestMapping(value="/categories/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		categoryService.delete(id);
		return "redirect:/categories";		
	}
}

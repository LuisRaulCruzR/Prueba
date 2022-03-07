package luis.refer.productapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Category extends CommonObject{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String categoria;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return super.getDescripcion();
	}

	@Override
	public void setDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		super.setDescripcion(descripcion);
	}

	@Override
	public String getDetailes() {
		// TODO Auto-generated method stub
		return super.getDetailes();
	}

	@Override
	public void setDetailes(String detailes) {
		// TODO Auto-generated method stub
		super.setDetailes(detailes);
	}
	
	
	
}

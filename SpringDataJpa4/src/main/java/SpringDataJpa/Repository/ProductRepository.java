package SpringDataJpa.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringDataJpa.entity.Product;




	@Repository
	public interface ProductRepository extends CrudRepository<Product, Serializable>{

	
}

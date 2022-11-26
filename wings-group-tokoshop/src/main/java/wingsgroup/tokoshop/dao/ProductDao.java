package wingsgroup.tokoshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import wingsgroup.tokoshop.model.Product;
import wingsgroup.tokoshop.pk.ProductPK;

public interface ProductDao extends JpaRepository<Product, ProductPK>{
	
}

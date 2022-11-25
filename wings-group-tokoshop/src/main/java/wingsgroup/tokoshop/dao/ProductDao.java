package wingsgroup.tokoshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import wingsgroup.tokoshop.model.Login;
import wingsgroup.tokoshop.model.Product;
import wingsgroup.tokoshop.pk.LoginPK;
import wingsgroup.tokoshop.pk.ProductPK;

public interface ProductDao extends JpaRepository<Product, ProductPK>{
	
}

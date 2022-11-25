package wingsgroup.tokoshop.service;

import java.util.List;

import wingsgroup.tokoshop.dto.LoginDto;
import wingsgroup.tokoshop.dto.ProductDto;

public interface ProductSvc {
	
//	public void save(ProductDto dto);
//	public void delete(String productCode);
	public List<ProductDto> findAll();
	public ProductDto findOne(String productCode);

}

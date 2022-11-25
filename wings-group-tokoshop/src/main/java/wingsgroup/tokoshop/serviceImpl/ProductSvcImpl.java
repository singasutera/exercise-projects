package wingsgroup.tokoshop.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wingsgroup.tokoshop.dao.LoginDao;
import wingsgroup.tokoshop.dao.ProductDao;
import wingsgroup.tokoshop.dto.LoginDto;
import wingsgroup.tokoshop.dto.ProductDto;
import wingsgroup.tokoshop.model.Login;
import wingsgroup.tokoshop.model.Product;
import wingsgroup.tokoshop.pk.LoginPK;
import wingsgroup.tokoshop.pk.ProductPK;
import wingsgroup.tokoshop.service.LoginSvc;
import wingsgroup.tokoshop.service.ProductSvc;

@Transactional
@Service
public class ProductSvcImpl implements ProductSvc {
	
	@Autowired
	ProductDao dao;

//	public void save(ProductDto dto) {
//		Product product = new Product();
//		product.setCurrency(dto.getCurrency());
//		product.setDimension(dto.get);
//		dao.save(product);
//	}

//	public void delete(String username) {
//		LoginPK pk = new LoginPK();
//		pk.setUsername(username);
//		dao.delete(pk);
//	}

	public List<ProductDto> findAll() {
		List<ProductDto> dtoList = new ArrayList<ProductDto>();
		List<Product> entityList = dao.findAll();
		for(Product e : entityList){
			ProductDto dto = new ProductDto();
			dto.setCurrency(e.getCurrency());
			dto.setDimension(e.getDimension());
			dto.setDiscount(e.getDiscount());
			dto.setPrice(e.getPrice());
			dto.setProductCode(e.getProductCode());
			dto.setProductName(e.getProductName());
			dto.setUnit(e.getUnit());
			
			dtoList.add(dto);
		}
		return dtoList;
	}

	public ProductDto findOne(String productCode) {
		ProductPK pk = new ProductPK();
		pk.setProductCode(productCode);
		Product product = dao.findOne(pk);
		if(product!=null){
			ProductDto dto = new ProductDto();
			dto.setCurrency(product.getCurrency());
			dto.setDimension(product.getDimension());
			dto.setDiscount(product.getDiscount());
			dto.setPrice(product.getPrice());
			dto.setProductCode(product.getProductCode());
			dto.setProductName(product.getProductName());
			dto.setUnit(product.getUnit());
			
			return dto;
		}
		return null;
	}
}

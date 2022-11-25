package wingsgroup.tokoshop.model;

import java.io.Serializable;
import javax.persistence.*;

import wingsgroup.tokoshop.pk.ProductPK;

import java.math.BigDecimal;

@IdClass(ProductPK.class)
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ProductCode")
	private String productCode;

	@Column(name="Currency")
	private String currency;

	@Column(name="Dimension")
	private String dimension;

	@Column(name="Discount")
	private BigDecimal discount;

	@Column(name="Price")
	private BigDecimal price;

	@Column(name="ProductName")
	private String productName;

	@Column(name="Unit")
	private String unit;

	public Product() {
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
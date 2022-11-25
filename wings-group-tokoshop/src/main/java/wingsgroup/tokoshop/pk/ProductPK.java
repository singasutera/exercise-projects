package wingsgroup.tokoshop.pk;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

public class ProductPK implements Serializable {
	private String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}
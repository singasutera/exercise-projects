package wingsgroup.tokoshop.pk;

import java.io.Serializable;
import javax.persistence.*;

public class LoginPK implements Serializable {

	private String username;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
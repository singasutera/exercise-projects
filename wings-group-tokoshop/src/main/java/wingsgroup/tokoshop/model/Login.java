package wingsgroup.tokoshop.model;

import java.io.Serializable;
import javax.persistence.*;

import wingsgroup.tokoshop.pk.LoginPK;

@IdClass(LoginPK.class)
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Username")
	private String username;

	@Column(name="Password")
	private String password;

	public Login() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
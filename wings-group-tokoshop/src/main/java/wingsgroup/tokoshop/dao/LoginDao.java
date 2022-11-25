package wingsgroup.tokoshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import wingsgroup.tokoshop.model.Login;
import wingsgroup.tokoshop.pk.LoginPK;

public interface LoginDao extends JpaRepository<Login, LoginPK>{
	
	@Query("FROM Login WHERE (Username =?1 AND Password =?2)")
	public Login findByUsernameAndPassword(String username, String password);

}

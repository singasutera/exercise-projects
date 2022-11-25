package wingsgroup.tokoshop.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wingsgroup.tokoshop.dao.LoginDao;
import wingsgroup.tokoshop.dto.LoginDto;
import wingsgroup.tokoshop.model.Login;
import wingsgroup.tokoshop.pk.LoginPK;
import wingsgroup.tokoshop.service.LoginSvc;

@Transactional
@Service
public class LoginSvcImpl implements LoginSvc{
	
	@Autowired
	LoginDao dao;

	public void save(LoginDto dto) {
		Login login = new Login();
		login.setUsername(dto.getUsername());
		login.setPassword(dto.getPassword());
		dao.save(login);
	}

	public void delete(String username) {
		LoginPK pk = new LoginPK();
		pk.setUsername(username);
		dao.delete(pk);
	}

	public List<LoginDto> findAll() {
		List<LoginDto> dtoList = new ArrayList<LoginDto>();
		List<Login> entityList = dao.findAll();
		for(Login eachEntity : entityList){
			LoginDto dto = new LoginDto();
			dto.setUsername(eachEntity.getUsername());
			dto.setPassword(eachEntity.getPassword());
			dtoList.add(dto);
		}
		return dtoList;
	}

	public LoginDto findOne(String username) {
		LoginPK pk = new LoginPK();
		pk.setUsername(username);
		Login login = dao.findOne(pk);
		if(login!=null){
			LoginDto dto = new LoginDto();
			dto.setUsername(login.getUsername());
			dto.setPassword(login.getPassword());
			return dto;
		}
		return null;
	}

	public LoginDto findByUsernameAndPassword(String username, String password) {
		Login login = dao.findByUsernameAndPassword(username, password);
//		
//		LoginPK pk = new LoginPK();
//		pk.setUsername(username);
//		Login login = dao.findOne(pk);
		
		LoginDto dto = new LoginDto();
		dto.setUsername(login.getUsername());
		dto.setPassword(login.getPassword());
		return dto;
	}

	

}

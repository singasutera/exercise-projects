package wingsgroup.tokoshop.service;

import java.util.List;

import wingsgroup.tokoshop.dto.LoginDto;

public interface LoginSvc {
	
	public void save(LoginDto dto);
	public void delete(String username);
	public List<LoginDto> findAll();
	public LoginDto findOne(String username);
	public LoginDto findByUsernameAndPassword(String username, String password);

}

package wingsgroup.tokoshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import wingsgroup.tokoshop.dto.LoginDto;
import wingsgroup.tokoshop.service.LoginSvc;

@Controller
@RequestMapping("user")
public class LoginController {

	@Autowired
	LoginSvc loginSvc;

	@RequestMapping("login")
	public String login(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		LoginDto dto = new LoginDto();
		model.addAttribute("userattr", dto);
		session.removeAttribute("loginOK");
		return "login";
	}

//	@RequestMapping("checkLogin")
//	public String checkLogin(
//			@Valid @ModelAttribute("userattr") LoginDto dtoLogin, BindingResult result,
//			Model model,
//			HttpServletRequest request) {
//		
//		HttpSession session = request.getSession();
//		
//		try {
//			if (result.hasErrors()) {
//				return "login";
//			} else {
//				LoginDto findUser = loginSvc.findByUsernameAndPassword(dtoLogin.getUsername(), dtoLogin.getPassword());
//				System.err.println(findUser.getUsername());
//				session.setAttribute("loginOK", findUser);
//				session.setMaxInactiveInterval(30 * 60);
//				return "home";
//			}
//		} catch (NullPointerException e) {
//			String message = "Username atau Password Salah.";
//			model.addAttribute("message", message);
//			return "hello";
//		}
//	}

	@RequestMapping("checkLogin")
	public String checkLogin(@Valid @ModelAttribute("userattr") LoginDto dtoLogin, BindingResult result, Model model,
			HttpServletRequest request) {

		HttpSession session = request.getSession();

		if (result.hasErrors()) {
			return "login";
		} else {
			try {
				LoginDto findUser = loginSvc.findByUsernameAndPassword(dtoLogin.getUsername(), dtoLogin.getPassword());
				session.setAttribute("loginOK", findUser);
				session.setMaxInactiveInterval(30 * 60);
				return "redirect:/index/landing";
			} catch (NullPointerException e) {
				String message = "Username atau Password Salah.";
				model.addAttribute("message", message);
				return "login";
			} catch (Exception e) {
				model.addAttribute("message", "Something went wrong :(");
				return "hello";
			}
		}
	}

}

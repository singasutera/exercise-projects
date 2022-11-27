package wingsgroup.tokoshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import wingsgroup.tokoshop.dto.LoginDto;
import wingsgroup.tokoshop.dto.ProductDto;
import wingsgroup.tokoshop.service.ProductSvc;

@Controller
@RequestMapping("index")
public class HomeController {

	@Autowired
	ProductSvc productSvc;

	@RequestMapping("landing")
	public String landing(Model model,
			@RequestParam(value = "search", defaultValue = "", required = false) String search,
			@RequestParam(value = "page", defaultValue = "1", required = false) int page, HttpServletRequest request) {

		HttpSession session = request.getSession();
		
		List<ProductDto> listProduct = productSvc.findAll();
		model.addAttribute("listProduct", listProduct);

		if (session.getAttribute("loginOK") == null) {
			System.err.println("Session loginOK null");
			model.addAttribute("message", "Halo!");
			return "home";
		}
		
		LoginDto loginDto = (LoginDto) session.getAttribute("loginOK");
		System.err.println(loginDto.getUsername());
		model.addAttribute("username", loginDto.getUsername());
		
		return "home";
	}

	@RequestMapping("logout")
	public String logout(Model model,
			@RequestParam(value = "search", defaultValue = "", required = false) String search,
			@RequestParam(value = "page", defaultValue = "1", required = false) int page, HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.removeAttribute("loginOK");
		
		List<ProductDto> listProduct = productSvc.findAll();
		model.addAttribute("listProduct", listProduct);

		if (session.getAttribute("loginOK") != null) {
			LoginDto loginDto = (LoginDto) session.getAttribute("loginOK");
			System.err.println(loginDto.getUsername());
			model.addAttribute("username", loginDto.getUsername());
			return "home";
		}
		
		return "redirect:/index/landing";
	}
	
	@RequestMapping("detail/{kodeProduct}")
	public String detail(@PathVariable("kodeProduct") String kodeProduct, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("loginOK") != null){
			LoginDto loginDto = (LoginDto) session.getAttribute("loginOK");
			model.addAttribute("username", loginDto.getUsername());
		}
		
		ProductDto productDto = productSvc.findOne(kodeProduct);
		model.addAttribute("p", productDto);
		return "product-detail";
	}
}

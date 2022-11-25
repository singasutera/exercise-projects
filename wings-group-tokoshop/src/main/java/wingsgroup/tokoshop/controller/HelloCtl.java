package wingsgroup.tokoshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloCtl {

	@RequestMapping("hi")
	public String hello(Model model){
		String message = "Hello World";
		List<String> namaBc = new ArrayList<String>();
		namaBc.add("Anug");
		namaBc.add("Bagaskara");
		namaBc.add("Noska");
		namaBc.add("Eric");
		
		model.addAttribute("messageattr", message); //attribute, Model
		model.addAttribute("list", namaBc);
		
		return "hello"; //nama file jsp/ui view nantinya
		
	}
	
}

package de.nano.modules.company.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("company")
public class CompanyController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return "hello";
	}
}

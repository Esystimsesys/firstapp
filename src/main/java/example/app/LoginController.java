package example.app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		LoginForm form = new LoginForm();
		model.addAttribute(form);
		return "login/form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String success(@Valid LoginForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "login/form";
		}
		
		return "login/success";
	}
}

package example.app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("echo")
public class EchoController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String viewOutput(@Valid EchoForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "echo/input";
		}
		return "echo/output";
	}

}

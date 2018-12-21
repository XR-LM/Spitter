package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spitter.dao.SpitterRepository;
import spitter.pojo.Spitter;

/**
 * 用户信息控制器
 * @author XR
 *
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	private SpitterRepository spitterRepository;
	
	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		this.spitterRepository=spitterRepository;
	}
	
	/**
	 * 跳转到注册页面
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String ShowRegistrationForm() {
		return "registerForm";
	}
	
	/**
	 * 注册
	 * @param spitter
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String Register(Spitter spitter) {
		spitterRepository.SaveUser(spitter);
		return "redirect:/spitter/"+spitter.getUsername();
	}
	
	/**
	 * 注册成功
	 * @param username
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{username}",method=RequestMethod.GET)
	public String RegisterSuccess(
			@PathVariable("username") String username,Model model) {
		Spitter spitter = spitterRepository.findByUsername(username);
		model.addAttribute(spitter);
		return "profile";
	}
}

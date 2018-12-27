package spitter.web;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String ShowRegistrationForm(Spitter spitter,Model model) {
		model.addAttribute(spitter);
		return "registerForm";
	}
	
	/**
	 * 注册
	 * @param spitter
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String Register(@Valid Spitter spitter,BindingResult bindingResult,RedirectAttributes  model) {
		if(bindingResult.hasErrors()) {
            return "registerForm";
		}
		spitterRepository.SaveUser(spitter);
		//使用spring提供的RedirectAtrributes接口方法实现重定向过程中的数据传递
		model.addAttribute("username", spitter.getUsername());
		//spring会自动将数据绑定到会话中，发送下一次请求时自动销毁会话中的内容
		model.addFlashAttribute(spitter);
		return "redirect:/spitter/{username}";
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
		
		//如果模型中不包括spitter
		if(!model.containsAttribute("spitter")) {
			Spitter spitter = spitterRepository.findByUsername(username);
			model.addAttribute(spitter);
		}
		
		return "profile";
	}
}

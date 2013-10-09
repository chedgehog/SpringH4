package cc.smh.action;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cc.smh.bean.User;
import cc.smh.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;


	@RequestMapping(value="/login")
	public String login(HttpServletRequest request) throws Exception{
		System.out.println("test sys 0");
		User user = new User("username","passwordtestaction");
		userService.editSave(user);
		List list = userService.queryAll(" from User");
		for (int i = 0; i < list.size(); i++) {
			User u = (User)list.get(i);
			System.out.println(u.getUsername());
		}
		return "loginInit";
	}

}

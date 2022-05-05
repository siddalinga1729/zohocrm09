package com.zohocrm9.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm9.utility.EmailService;

@Controller
public class EmailController {
@Autowired
private EmailService emailService;
	
	@RequestMapping("compose")
	public String composeEmail(@RequestParam("emailid")String emailid,ModelMap model) {
		model.addAttribute("emailid", emailid);
		return "compose_Email";
	}
	@RequestMapping("sendemail")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("text")String text) {
		emailService.sendSimpleMessage(to, subject, text);
		return "compose_Email";
	}
}

package com.zohocrm9.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm9.Services.LeadServices;
import com.zohocrm9.entities.Lead;

@Controller
public class LeadController {
@Autowired
private LeadServices leadServices;
	
	@RequestMapping("/view")
	public String viewLeadPage() {
		return "create_Lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute()Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "view_Lead";
	}
	@RequestMapping("listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.getAllLeads();
		model.addAttribute("leads", leads);
		return "listAll_Lead";
	}
	@RequestMapping("getById")
	public String getById(@RequestParam("id") int id,ModelMap model) {
		Lead lead=leadServices.getbyid(id);
		model.addAttribute("lead", lead);
		return "view_Lead";
	}
}

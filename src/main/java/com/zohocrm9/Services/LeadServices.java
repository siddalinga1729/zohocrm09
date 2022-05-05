package com.zohocrm9.Services;

import java.util.List;

import com.zohocrm9.entities.Lead;

public interface LeadServices {
public void saveLead(Lead lead);//abstraction is done

public List<Lead> getAllLeads();

public Lead getbyid(int id);
}

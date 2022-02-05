package com.rab3tech.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.rab3tech.rest.vo.CompanyVO;
import com.rab3tech.rest.vo.EmployeVO;
import com.wearsafe.Content;
import com.wearsafe.Root;
import com.wearsafe.SubscriptionItem;

@RestController
@RequestMapping("/api2")
public class CompanyController {
	
	private static 	List<CompanyVO> companyVOs=new ArrayList<CompanyVO>();
	
	@PostMapping("/wearsafe")
	public void webhook(@RequestBody String customer) throws JsonMappingException, JsonProcessingException {
		
		int subscriptionCount=0;
		boolean businessConsoleAddOn=false;
		boolean businessMonitoringAddOn=false;
		String subsubsciptionId="";
		int personId=0;
		Root root=new JsonMapper().readValue(customer,Root.class);
		Content content=root.content;
		if(content.getSubscription()!=null) {
			subsubsciptionId=content.getSubscription().getId();
			ArrayList<SubscriptionItem> subscriptionItems=content.getSubscription().getSubscription_items();
			for(SubscriptionItem subscriptionItem:subscriptionItems ) {
				if("plan".equalsIgnoreCase(subscriptionItem.getItem_type())) {
					subscriptionCount=subscriptionItem.getQuantity();
				}else if("addon".equalsIgnoreCase(subscriptionItem.getItem_type()) && "Business-Professional-Monitoring-USD-Monthly".equalsIgnoreCase(subscriptionItem.getItem_price_id())) {
					businessMonitoringAddOn=true;
				} else if("addon".equalsIgnoreCase(subscriptionItem.getItem_type()) && "Business-Console-USD-Monthly".equalsIgnoreCase(subscriptionItem.getItem_price_id())) {
					businessConsoleAddOn=true;
				}
			}
		}
		if(content.getCustomer()!=null) {
			personId=content.getCustomer().getCf_person_id();
		}
		
		System.out.println("subscriptionCount = "+subscriptionCount);
		System.out.println("businessMonitoringAddOn = "+businessMonitoringAddOn);
		System.out.println("businessConsoleAddOn = "+businessConsoleAddOn);
		System.out.println("personId = "+personId);
		System.out.println("subsubsciptionId = "+subsubsciptionId);
		
		System.out.println("*****************************");
		System.out.println(customer);
		System.out.println("*****************************");
	}
	
	@GetMapping("/hello")
	public String helloWebhook(@RequestParam String name) {
		return "Happy Wearsafe!";
	}
	
	@GetMapping("/wearsafe")
	public void getWebhook(@RequestBody String customer) {
		System.out.println("*****************************");
		System.out.println(customer);
		System.out.println(customer);
		System.out.println(customer);
		System.out.println(customer);
		System.out.println(customer);
		System.out.println("*****************************");
	}
	
	
	@GetMapping("/companies/{cid}/employees")
	public List<EmployeVO> findCompanyEmployees(@PathVariable int cid){
		List<EmployeVO> employeVOs=new ArrayList<EmployeVO>();
		EmployeVO employeVO1=new EmployeVO();
		employeVO1.setEmail("nagen@gmail.com");
		employeVO1.setName("Nagendra Kumar");
		employeVO1.setSalary(1222);
		
		EmployeVO employeVO2=new EmployeVO();
		employeVO2.setEmail("prabhat@gmail.com");
		employeVO2.setName("Prabhat Kumar");
		employeVO2.setSalary(112);
				
		EmployeVO employeVO3=new EmployeVO();
		employeVO3.setEmail("aman@gmail.com");
		employeVO3.setName("Aman Kumar");
		employeVO3.setSalary(4555);
		employeVOs.add(employeVO3);
		employeVOs.add(employeVO2);
		employeVOs.add(employeVO1);
		
         return employeVOs;
	}
	
	@GetMapping("/companies/{cid}/employees/{eid}")
	public EmployeVO findCompanyEmployee(@PathVariable int cid,@PathVariable int eid){
         return new EmployeVO();
	}
	
	@PostMapping("/companies/{cid}/employees")
	public List<EmployeVO> creatCompanyEmployees(@RequestBody EmployeVO employeVO,@PathVariable int cid){
		List<EmployeVO> employeVOs=new ArrayList<EmployeVO>();
         return employeVOs;
	}
	
	@DeleteMapping("/companies/{cid}/employees/{eid}")
	public AppResponse deleteCompanyEmployee(@PathVariable int cid,@PathVariable int eid){
		AppResponse appResponse=new AppResponse();
		appResponse.setCode(13);
		appResponse.setMessage("Company is deleted sucessfully.");
		return appResponse;
	}
	
	
	@DeleteMapping("/companies/{cid}")
	public AppResponse deleteCompanyByCid(@PathVariable int cid){
		companyVOs=companyVOs.stream().filter(s->s.getCid()!=cid).collect(Collectors.toList());
		AppResponse appResponse=new AppResponse();
		appResponse.setCode(13);
		appResponse.setMessage("Company is deleted sucessfully.");
		return appResponse;
	}
	
	@DeleteMapping("/companies")
	public AppResponse deleteCompanies(){
		AppResponse appResponse=new AppResponse();
		appResponse.setCode(13);
		appResponse.setMessage("Companies are deleted sucessfully.");
		return appResponse;
	}
	
	@GetMapping("/companies")
	public List<CompanyVO> findCompanies(){
	
		CompanyVO companyVO=new CompanyVO();
		companyVO.setCid(100);
		companyVO.setLocation("India");
		companyVO.setName("Ctrlmap");
		
		CompanyVO companyVO1=new CompanyVO();
		companyVO1.setCid(200);
		companyVO1.setLocation("Noida");
		companyVO1.setName("TechnoHunk");
		
		CompanyVO companyVO2=new CompanyVO();
		companyVO2.setCid(300);
		companyVO2.setLocation("Jaipur");
		companyVO2.setName("GPS Tech");
		companyVOs.add(companyVO);
		companyVOs.add(companyVO1);
		companyVOs.add(companyVO2);
         return companyVOs;
	}
	
	@PostMapping("/companies")
	public CompanyVO createCompany(@RequestBody CompanyVO companyVO){
          System.out.println(companyVO);
          companyVOs.add(companyVO);
          return companyVO;
	}

	@PutMapping("/companies")
	public CompanyVO updateCompany(@RequestBody CompanyVO companyVO){
          System.out.println(companyVO);
          return companyVO;
	}

}


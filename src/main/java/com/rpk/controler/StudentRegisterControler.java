package com.rpk.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rpk.TickBk.TickectsBooking;
import com.rpk.TickRepo.TicketReposit;
import com.rpk.sRepo.RepoStudent;
import com.rpk.studtls.StudentRegistratin;

@Controller
public class StudentRegisterControler {
	
	@Autowired
	public  RepoStudent repo;
	
	@Autowired
	public TicketReposit tRepo;
	
	@GetMapping("/")
	public String getForm(Model m1) {
		m1.addAttribute("msg1","Welcome To Student Registrion");
		return "forms";
	}
	
	@PostMapping("/student")
	public String insertStdls(StudentRegistratin sdt, Model m1) {
		System.out.println(sdt);
	//	StudentRegistratin entity = new StudentRegistratin();
	//	BeanUtils.copyProperties(sdt, entity);
		repo.save(sdt);
		m1.addAttribute("msg","Successfully Registered");
		return "index";
	}
	
	@GetMapping("/Ticket")
	public String getTicketBookForm(Model m1) {
		m1.addAttribute("getTc","Welcome to TicketBooking");
		
		List<String> boarding = new ArrayList<>();
		boarding.add("Bengaluru");		
		boarding.add("Hyderabad");	
		boarding.add("Chennai");	
		boarding.add("Vijayawada");	
		boarding.add("Vishakapatnam");	
		boarding.add("Nellore");	
		boarding.add("Gunturu");	
		boarding.add("Electronic city");	
		boarding.add("AmmerPeat");	
		
		List<String> drop = new ArrayList<>();
		boarding.add("Bengaluru");		
		boarding.add("Hyderabad");	
		boarding.add("Chennai");	
		boarding.add("Vijayawada");	
		boarding.add("Vishakapatnam");	
		boarding.add("Nellore");	
		boarding.add("Gunturu");	
		boarding.add("Electronic city");	
		boarding.add("AmmerPeat");	
		
		List<Double> cost = new ArrayList<>();
		
		cost.add(500.0);
		cost.add(770.0);
		cost.add(1050.0);
		cost.add(1500.0);
		cost.add(1300.0);
		cost.add(600.0);
		cost.add(830.0);
		cost.add(2000.0);
		cost.add(1800.0);
		cost.add(1200.0);
		cost.add(2500.0);
		
		m1.addAttribute("Boarding", boarding);
		m1.addAttribute("droping", drop);
		m1.addAttribute("costDtls", cost);
		
		return "tickets";
	}
	
	@PostMapping("/TicketBooking")
	public String ticketBooking(TickectsBooking t1, Model m2) {
		System.out.println(t1);
		tRepo.save(t1);
		m2.addAttribute("tbk","Your Ticket Successfuly Booked ");
		
		return "index";
	}
}

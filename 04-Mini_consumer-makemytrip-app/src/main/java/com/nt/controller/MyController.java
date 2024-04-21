package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.TicketForm.TicketData;
import com.nt.response.Ticket;
import com.nt.service.MyService;

import reactor.core.publisher.Mono;

@Controller
public class MyController {
	@Autowired
	MyService service;
	
	@GetMapping("/")
	public String saveTicket() {
		System.out.println("I am started.......");
		return "home";
	}
	
	@GetMapping("/savemyticket")
	public String saveTicket1(@ModelAttribute("data") TicketData data) {
		System.out.println("savemyTicket method started .......");
		//service.saveTicket1(data);
		return "register";
	}
	@PostMapping("/saveticket")
	public Mono<String> saveTicket(@ModelAttribute("data") TicketData data) {
		System.out.println("save Ticket method started .......");
		System.out.println(data.getPasanger_name());
		
		System.out.println("save Ticket method Ended .......");

		return service.saveTicket1(data);
	}
	@GetMapping("/getticket")
	public Mono<ResponseEntity<Ticket>> getTicket(@RequestParam int id) {
		System.out.println("I am get ticket started.......");
        return service.getTicket(id)
                .map(ticket -> ResponseEntity.ok().body(ticket))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
	

}

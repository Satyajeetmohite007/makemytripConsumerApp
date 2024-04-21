package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.nt.TicketForm.TicketData;
import com.nt.response.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MyServiceImpl implements MyService {
	 private final WebClient webClient;

	  @Autowired
	  public MyServiceImpl(WebClient.Builder webClientBuilder) {
	    this.webClient = webClientBuilder.baseUrl("http://localhost:4041").build();
	  }

		 public Mono<String> saveTicket1(TicketData data) {
			    System.out.println(data.getPassanger_Dst());
			    return webClient.post()
			            .uri("/save")
			            .contentType(MediaType.APPLICATION_JSON)
			            .body(BodyInserters.fromValue(data))
			            .retrieve()
			            .bodyToMono(String.class);
			}

		@Override
		public Mono<Ticket> getTicket(int id) {
			// TODO Auto-generated method stub
			Mono<Ticket> ticket1= webClient.get()
            .uri("/getTicket?id={id}", id)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Ticket.class);
			
			ticket1.subscribe(ticket -> {
	            System.out.println("Ticket No: "+ticket.getTicket_no());
	            System.out.println("Passenger Name: "+ticket.getPasanger_name() );
	            System.out.println("Age: "+ticket.getAge());
	            System.out.println("Source Location: "+ticket.getPassanger_Cl());
	            System.out.println("Destination Location: "+ticket.getPassanger_Dst());
			});
			return ticket1;
		}

  }
	


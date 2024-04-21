package com.nt.service;



import com.nt.TicketForm.TicketData;
import com.nt.response.Ticket;

import reactor.core.publisher.Mono;

public interface MyService {
	public Mono<String> saveTicket1(TicketData data);
	public Mono<Ticket> getTicket(int no);
}

package com.substring.helpdesk.services;

import com.substring.helpdesk.entity.Ticket;
import com.substring.helpdesk.repositories.TicketRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class TicketService {


    private final TicketRepository ticketRepository;

    //create ticket

    @Transactional
    public Ticket createTicket(Ticket ticket) {
        ticket.setId(null);
        return ticketRepository.save(ticket);
    }




    public Ticket updateTicket (Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // get ticket logic
    public Ticket getTicket(Long ticketId) {
        return ticketRepository.findById(ticketId).orElse(null);
    }


    //get ticket by email
    public Optional<Ticket> getTicketByEmail(String email){
        return ticketRepository.findByEmail(email);
    }

}
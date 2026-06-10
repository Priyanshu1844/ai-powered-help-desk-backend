package com.substring.helpdesk.tools;

import com.substring.helpdesk.entity.Ticket;
import com.substring.helpdesk.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketDatabaseTool {
    private final TicketService ticketService;

    @Tool(description="This tool is used to create new ticket in database")
    public Ticket createTicketTool(@ToolParam(description = "Ticket fields required to create a new ticket") Ticket ticket){
        try{
            System.out.println("going to create ticket");
            System.out.println(ticket);
            return ticketService.createTicket(ticket);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
    @Tool(description = "this tool helps to get ticket by username")
    public Ticket getTicketByEmail(@ToolParam(description = "it is the email whose ticket is required") String email){
        return ticketService.getTicketByEmail(email);

    }
    @Tool(description = "this tool helps to update ticket")
    public Ticket updateTicket(@ToolParam(description  ="new ticket details with old id") Ticket ticket){
        return ticketService.updateTicket(ticket);
    }
    @Tool(description = "This tool helps to get current system time")
    public String getCurrentTime(){
        return String.valueOf(System.currentTimeMillis());
    }

}



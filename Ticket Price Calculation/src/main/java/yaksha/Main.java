package main.java.yaksha;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
			int i;
			Ticket t=new Ticket();
       Scanner br=new Scanner(System.in);  
        System.out.println("Enter no of bookings:");
        int nob= br.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTickets=br.nextInt();
        Ticket.setAvailableTickets(availableTickets);
        for(i=1;i<=nob;i++)
        {
        	System.out.println("Enter the ticketid:");
        	int ticketid= br.nextInt();
        	t.setTicketid(ticketid);
System.out.println("Enter the price:");
          int price= br.nextInt();
          t.setPrice(price);
          System.out.println("Enter the no of tickets:");
         int nooftickets= br.nextInt();
         int totalamount;
          
         System.out.println("Available tickets: "+t.getAvailableTickets());
        	totalamount=t.calculateTicketCost(nooftickets);
        	if(totalamount!=-1)
        	{
        	  System.out.println("Total amount:"+totalamount);
        	  System.out.println("Available ticket after booking:"+t.getAvailableTickets());
        	  }
         
          
        
		 
		}
		
	}

}


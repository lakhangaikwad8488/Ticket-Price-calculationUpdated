package main.java.yaksha;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	static int count=1;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		{
		Ticket.availableTickets = availableTickets;
		}
		else
		{
			count=0;
		}
	}
	//method
	public int calculateTicketCost(int nooftickets)
	{
		int avt=getAvailableTickets();
		avt=avt-nooftickets;
		int price=getPrice();
		setAvailableTickets(avt);
		if(count==1)
		{
			price=price*nooftickets;
			setPrice(price);
		return price;
		}
		else
			return -1;
		
	}
}

package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.TestUtils;
import main.java.yaksha.Ticket;

class MainTest {

	@Test
	void testCalculateTicketCost() throws IOException {
		
		Ticket t=new Ticket();
		Ticket.setAvailableTickets(20);
		t.setTicketid(10);
		  t.setPrice(100);
		TestUtils.yakshaAssert(TestUtils.currentTest(),t.calculateTicketCost(5)==500==true?"true":"false",TestUtils.businessTestFile);

		  //assertEquals(500,t.calculateTicketCost(5));
 	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}

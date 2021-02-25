package com.example.contractmanagement.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;



public class MessageResponseTest {

	MessageResponse messageResponse = new MessageResponse();

	MessageResponse message1 = new MessageResponse(new Date(), "message", "status");
	
	@Test
	public void testTimeStamp() {
		messageResponse.setTimeStamp(new Date());
		assertEquals(messageResponse.getTimeStamp(), new Date());
	}
	
	@Test
	public void testMessage() {
		messageResponse.setMessage("Yes");
		assertEquals(messageResponse.getMessage(), "Yes");
	}
	
	@Test
	public void testStatus() {
		messageResponse.setStatus("OK");
		assertEquals(messageResponse.getStatus(), "OK");
	}
	
	@Test
	void testAllArgs() {
		
	}
	
	
	
//	@Test
//	public void testMessage2() {
//		messageResponse.setMessage("message");
//		messageResponse.setStatus("status");
//		messageResponse.setTimeStamp(new Date());
//		messageResponse.getTimeStamp();
//		assertEquals(messageResponse.getMessage(), "message");
//		assertEquals(messageResponse.getStatus(), "status");
//	}

	
}

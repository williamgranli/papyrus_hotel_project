

package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Implementation.DecisionSupportComponent_OccupancyDSSInfo;

public class DecisionSupportTests {
		
		//BookingInfo
		static Implementation.DecisionSupportComponent_BookingDSSInfo bookingInfo;
		
		//Occupancy
		static Implementation.DecisionSupportComponent_OccupancyDSSInfo occupancy;
		
		//Additional Service
		static Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo addtionalService;
			
		//handler
		static Implementation.DecisionSupportComponent_DSSController controller;
		
		static Implementation.ImplementationFactory factory;
		static Implementation.BookingComponent_BookingHandler booking;
		static Implementation.OccupancyComponent_OccupancyHandler occupan;
		
		static Implementation.RoomComponent_RoomHandler roomHandler;
		static Implementation.BookingComponent_PaymentDetails paymentDetails1;
		static Implementation.BookingComponent_PaymentDetails paymentDetails2;
		static Implementation.BookingComponent_PaymentDetails paymentDetails3;
		static Implementation.BookingComponent_PaymentDetails paymentDetails4;
		static String reference1;
		static String reference2;
		static String reference3;
		static String reference4;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		booking = factory.createBookingComponent_BookingHandler();
		bookingInfo = factory.createDecisionSupportComponent_BookingDSSInfo();
		occupancy = factory.createDecisionSupportComponent_OccupancyDSSInfo();
		addtionalService = factory.createDecisionSupportComponent_AdditionalServiceDSSInfo();
		controller = factory.createDecisionSupportComponent_DSSController();
		occupan = factory.createOccupancyComponent_OccupancyHandler();
		roomHandler = factory.createRoomComponent_RoomHandler();
		paymentDetails1 = factory.createBookingComponent_PaymentDetails();
		paymentDetails2 = factory.createBookingComponent_PaymentDetails();
		paymentDetails3 = factory.createBookingComponent_PaymentDetails();
		paymentDetails4 = factory.createBookingComponent_PaymentDetails();
		booking.setIRoomInformation(roomHandler);
		occupan.setIRoomInformation(roomHandler);
		occupan.setIBooking(booking);
		controller.setIBookingDecision(booking);
		controller.setIOccupancyDecision(occupan);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		booking = factory.createBookingComponent_BookingHandler();
		bookingInfo = factory.createDecisionSupportComponent_BookingDSSInfo();
		occupancy = factory.createDecisionSupportComponent_OccupancyDSSInfo();
		addtionalService = factory.createDecisionSupportComponent_AdditionalServiceDSSInfo();
		controller = factory.createDecisionSupportComponent_DSSController();
		occupan = factory.createOccupancyComponent_OccupancyHandler();
		paymentDetails1 = factory.createBookingComponent_PaymentDetails();
		paymentDetails2 = factory.createBookingComponent_PaymentDetails();
		paymentDetails3 = factory.createBookingComponent_PaymentDetails();
		paymentDetails4 = factory.createBookingComponent_PaymentDetails();
		roomHandler = factory.createRoomComponent_RoomHandler();
		booking.setIRoomInformation(roomHandler);
		occupan.setIRoomInformation(roomHandler);
		occupan.setIBooking(booking);
		controller.setIBookingDecision(booking);
		controller.setIOccupancyDecision(occupan);
		CreateBookings();
		CreateOccupancies();
	}

	@After
	public void tearDown() throws Exception {
		bookingInfo = null;
		occupancy = null;
		addtionalService = null;
		controller = null;
		booking = null;
		occupan = null;
	}
	
	
	//bookingSSN
	@Test
	public void CheckNullInputTypeFrequency(){
		controller.getBookingDSSInfo().clear();
		org.junit.Assert.assertTrue(controller.getAllRoomTypeFrequency().isEmpty());
	}
	
	//create Bookings in bookingHandler
	public void CreateBookings(){
		controller.getBookingDSSInfo().clear();
		booking.getBookings().clear();
		
		//add rooms
		roomHandler.createBedRoom(1, true, 100, "SingleRoom", "", 1);
		roomHandler.createBedRoom(2, true, 200, "DoubleRoom", "", 2);
		roomHandler.createBedRoom(3, true, 100, "SingleRoom", "", 1);
		roomHandler.createBedRoom(4, true, 100, "SingleRoom", "", 1);

		//booking1
    	reference1 = booking.makeBooking("SingleRoom",new Date(114,11,17), new Date(114,12,21), "880923", "lady", "beard", "MyHouse", "123456789", "123", 9, 2015);
    	booking.addGuestToBooking(reference1, "a", "a", "a");
    	paymentDetails1.setAddress("MyHouse");
    	paymentDetails1.setFirstName("lady");
    	paymentDetails1.setLastName("beard");
    	booking.findBooking(reference1).addRoomToBooking("SingleRoom", 100);
    	booking.findBooking(reference1).setPaymentDetails(paymentDetails1);
    	booking.findBooking(reference1).addAdditionalServiceToBooking("breakfast", 100);
    	//booking2
    	reference2 = booking.makeBooking("DoubleRoom",new Date(114,11,17), new Date(114,12,21), "880923", "conchita", "wurst", "MyHouse", "123456789", "123", 9, 2015);
    	booking.addGuestToBooking(reference2, "b", "b", "b");
    	paymentDetails2.setAddress("Austria");
    	paymentDetails2.setFirstName("conchita");
    	paymentDetails2.setLastName("wurst");
    	booking.findBooking(reference2).addRoomToBooking("DoubleRoom", 200);
    	booking.findBooking(reference2).setPaymentDetails(paymentDetails2);
    	//booking3
    	reference3 = booking.makeBooking("SingleRoom",new Date(114,11,17), new Date(114,12,21), "999999", "ss", "hentai", "Beijing", "123456789", "123", 9, 2015);
    	booking.addGuestToBooking(reference3, "c", "c", "c");
    	paymentDetails3.setAddress("Beijing");
    	paymentDetails3.setFirstName("oto");
    	paymentDetails3.setLastName("hentai");
    	booking.findBooking(reference3).addRoomToBooking("SingleRoom", 100);
    	booking.findBooking(reference3).setPaymentDetails(paymentDetails3);
    	booking.findBooking(reference3).addAdditionalServiceToBooking("breakfast", 100);
    	booking.findBooking(reference3).addAdditionalServiceToBooking("massage", 200);
    	//booking4
    	reference4 = booking.makeBooking("SingleRoom",new Date(114,11,17), new Date(114,12,21), "1234323", "lady", "beard", "hokaido", "123456789", "123", 9, 2015);
    	booking.addGuestToBooking(reference4, "d", "d", "d");
    	paymentDetails4.setAddress("hokaido");
    	paymentDetails4.setFirstName("lady");
    	paymentDetails4.setLastName("beard");
    	booking.findBooking(reference4).addRoomToBooking("SingleRoom", 100);
    	booking.findBooking(reference4).setPaymentDetails(paymentDetails4);
    	
    	controller.getDSSData();
	}

	@Test
	public void CheckGetDssBookingInfo(){
    	org.junit.Assert.assertTrue(controller.getBookingDSSInfo().size()==4);
	}
	
	@Test
	public void CheckGetRoomTypeFrequency(){
		org.junit.Assert.assertTrue(controller.getRoomTypeFrequency("SingleRoom").equals("SingleRoom:3"));
		org.junit.Assert.assertTrue(controller.getRoomTypeFrequency("DoubleRoom").equals("DoubleRoom:1"));
		org.junit.Assert.assertTrue(controller.getRoomTypeFrequency("TripleRoom").equals("TripleRoom:0"));
	}
	
	//occupancy
	public void CreateOccupancies(){
		controller.getOccupancyDSSInfo().clear();
		occupan.getOccupancy().clear();
		occupan.checkInGuest(reference1, "a", "a", "SingleRoom", null, null);
		occupan.checkInGuest(reference2, "b", "b", "DoubleRoom", null, null);
		occupan.checkInGuest(reference3, "c", "c", "SingleRoom", null, null);
		occupan.checkInGuest(reference4, "d", "d", "SingleRoom", null, null);
		
		controller.getDSSOccupancyInfo();
	}

	
	@Test
	public void CheckOccupancyDssInfo(){
		System.out.println(controller.getOccupancyDSSInfo().size());
		org.junit.Assert.assertTrue(controller.getOccupancyDSSInfo().size()==4);
	}
	
}

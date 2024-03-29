package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AdditionalServicesTests {

	static Implementation.ImplementationFactory factory;
	static Implementation.AdditionalServiceComponent_AdditionalServiceHandler as;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Implementation.impl.ImplementationFactoryImpl.init();
		as = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		as = factory.createAdditionalServiceComponent_AdditionalServiceHandler();
	}

	@After
	public void tearDown() throws Exception {
		as = null;
	}

	@Test
	public void emptyList() throws Exception {
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 0);
	}
	
	@Test
	public void createService() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createService()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createAndEditService() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createAndEditService()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		//System.out.println(as.findService("SERVICE").toString());
		as.editAdditionalService("SERVICE", "NEW NAME", true, 500, "New name and new price");
		//System.out.println(as.findService("NEW NAME").toString());
		
		org.junit.Assert.assertTrue("NEW NAME".equals(as.findService("NEW NAME").getName()));
	}
	
	@Test
	public void createTwoServicesRemoveOne() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createTwoServicesRemoveOne()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE2", true, 500, "Test description");
		as.removeAdditionalService("SERVICE1");
		
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createFiveRemoveOne() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createFiveRemoveOne()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE2", true, 500, "Test description");
		as.createAdditionalService("SERVICE3", true, 500, "Test description");
		as.createAdditionalService("SERVICE4", true, 500, "Test description");
		as.createAdditionalService("SERVICE5", true, 500, "Test description");
		as.removeAdditionalService("SERVICE3");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 4);
	}
	
	@Test
	public void preventDuplicateServices() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("preventDuplicateServices()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE1", true, 200, "Another test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void addDeleteAddDeleteAdd() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("addDeleteAddDeleteAdd()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.removeAdditionalService("SERVICE");
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.removeAdditionalService("SERVICE");
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		org.junit.Assert.assertTrue(as.getAdditionalService().size() == 1);
	}
	
	@Test
	public void createServiceAddEventEditEvent() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createServiceAddEventEditEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		
		as.editEvent("SERVICE", date, location, 10, 6);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, location).getCurrentAttendants() == 6);
	}
	
	@Test
	public void addTooManyAttendantsToEvent() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("addTooManyAttendantsToEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		
		as.editEvent("SERVICE", date, location, 10, 11);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, location).getCurrentAttendants() == 5);
	}
	
	@Test
	public void createServiceAddTwoEvent() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createServiceAddEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		String location2 = "Over anothere there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		as.createEvent("SERVICE", date, location2, 10, 5);
		
		// Print in terminal
		//System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 2);
	}
	
	@Test
	public void createServiceAddTwoEventsRemoveOneEvent() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createServiceAddTwoEventsRemoveOneEvent()\n");
		
		Date date = new Date();
		String location = "Over there";
		String location2 = "Over anothere there";
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, location, 10, 5);
		as.createEvent("SERVICE", date, location2, 10, 5);
		as.removeEvent("SERVICE", date, location2);
		
		// Print in terminal
		//System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 1);
	}
	
	@Test
	public void createEventWithoutExistingService() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createEventWithoutExistingService()\n");
		
		Date date = new Date();
		String location = "Over there";
		
		as.createEvent("SERVICE", date, location, 10, 5);
		
		// Print in terminal
		//System.out.println(as.findService("SERVICE").toString());
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 1);
	}
	
	@Test
	public void removeAllEventsForDate() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("removeAllEventsForDate()\n");
		
		Date date = new Date();
		
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		as.createEvent("SERVICE", date, "Location 2", 10, 5);
		as.createEvent("SERVICE", date, "Location 3", 10, 5);
		as.createEvent("SERVICE", date, "Location 4", 10, 5);
		
		// Print in terminal
		//System.out.println(as.findService("SERVICE").toString());
		
		as.removeEvents("SERVICE", date);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").getAdditionalServiceEvent().size() == 0);
	}
	
	@Test
	public void returnMultipleEvents() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("returnMultipleEvents()\n");
		
		Date date = new Date();
		
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		as.createEvent("SERVICE", date, "Location 2", 10, 5);
		as.createEvent("SERVICE", date, "Location 3", 10, 5);
		as.createEvent("SERVICE", date, "Location 4", 10, 5);
		
		// Print in terminal
		//System.out.println(as.findService("SERVICE").toString());
		
		as.findService("SERVICE").findEvents(date);
		
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvents(date).size() == 4);
	}
	
	@Test
	public void getServiceNamesForBooking() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("getServiceNames()\n");
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createAdditionalService("SERVICE2", true, 500, "Test description");
		as.createAdditionalService("SERVICE3", true, 500, "Test description");
		as.createAdditionalService("SERVICE4", true, 500, "Test description");
		as.createAdditionalService("SERVICE5", true, 500, "Test description");
		
		//System.out.println(as.getServices());
		
		org.junit.Assert.assertTrue(as.getServices().size() == 5);
	}
	
	@Test
	public void getEventInfoForBooking() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("getEventInfoForBooking()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		as.createEvent("SERVICE", date, "Location 2", 10, 5);
		as.createEvent("SERVICE", date, "Location 3", 10, 5);
		as.createEvent("SERVICE", date, "Location 4", 10, 5);
		
		//System.out.println(as.getEvents("SERVICE"));
		
		org.junit.Assert.assertTrue(as.getEvents("SERVICE").size() == 4);
	}
	
	@Test
	public void addGueststoEventFromBooking() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("addGueststoEventFromBooking()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		
		org.junit.Assert.assertTrue(as.addGuestToEvent("SERVICE", date, "Location 1", 5) == true);
	}
	
	@Test
	public void addTooManyGueststoEventFromBooking() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("addTooManyGueststoEventFromBooking()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		

		org.junit.Assert.assertTrue(as.addGuestToEvent("SERVICE", date, "Location 1", 6) == false);
	}
	
	@Test
	public void removeGueststoEventFromBooking() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("removeGueststoEventFromBooking()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE1", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		

		org.junit.Assert.assertTrue(as.addGuestToEvent("SERVICE", date, "Location 1", 2) == true);
	}
	
	@Test
	public void createOneGetPrice() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneGetPrice()\n");
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		org.junit.Assert.assertTrue(as.getServicePrice("SERVICE") == 500);
	}
	
	@Test
	public void createOneGetMaxAttendants() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneGetPrice()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, "Location 1").getMaxAttendant() == 10);
	}
	
	@Test
	public void createOneGetCurrentAttendants() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("createOneGetCurrentAttendants()\n");
		
		Date date = new Date();
		
		as.createAdditionalService("SERVICE", true, 500, "Test description");
		as.createEvent("SERVICE", date, "Location 1", 10, 5);
		org.junit.Assert.assertTrue(as.findService("SERVICE").findEvent(date, "Location 1").getCurrentAttendants() == 5);
	}
	
	@Ignore // Just to help John out...!
	public void dateTest() {
		//System.out.print("\n### FUNC: ");
		//System.out.println("dateTest()\n");
		
		
		Date date = new Date();
		long dateLong = (date.getTime() / 1000) * 1000;
		date = new Date(dateLong);
		
		String dateString = date.toString();
		
		Date otherDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy");
		try {
			otherDate = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("      Date: " + date.getTime() + "\nOther date: " + otherDate.getTime());
		org.junit.Assert.assertTrue(date.equals(otherDate));
	}
}

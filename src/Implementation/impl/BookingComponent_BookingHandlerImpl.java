/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_IEventManagement;
import Implementation.BookingComponent_AdditionalService;
import Implementation.BookingComponent_Booking;
import Implementation.BookingComponent_BookingHandler;
import Implementation.BookingComponent_IBookingAdministration;
import Implementation.BookingComponent_IBookingDecision;
import Implementation.BookingComponent_PaymentDetails;
import Implementation.BookingComponent_RoomType;
import Implementation.ImplementationPackage;
import Implementation.PaymentComponent_IPayment;
import Implementation.RoomComponent_IRoomInformation;
import Implementation.StaffComponent_IAuthentication;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIRoomInformation <em>IRoom Information</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIAdditionalServiceInformation <em>IAdditional Service Information</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingHandlerImpl#getIPayment <em>IPayment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingComponent_BookingHandler {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingComponent_Booking> bookings;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication authentication;

	/**
	 * The cached value of the '{@link #getIRoomInformation() <em>IRoom Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRoomInformation()
	 * @generated
	 * @ordered
	 */
	protected RoomComponent_IRoomInformation iRoomInformation;

	/**
	 * The cached value of the '{@link #getIAdditionalServiceInformation() <em>IAdditional Service Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAdditionalServiceInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalServiceComponent_IEventManagement iAdditionalServiceInformation;

	/**
	 * The cached value of the '{@link #getIPayment() <em>IPayment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPayment()
	 * @generated
	 * @ordered
	 */
	protected PaymentComponent_IPayment iPayment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	protected BookingComponent_BookingHandlerImpl() {
		super();
		bookings = getBookings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<BookingComponent_Booking>(BookingComponent_Booking.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getAuthentication() {
		if (authentication != null && authentication.eIsProxy()) {
			InternalEObject oldAuthentication = (InternalEObject)authentication;
			authentication = (StaffComponent_IAuthentication)eResolveProxy(oldAuthentication);
			if (authentication != oldAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION, oldAuthentication, authentication));
			}
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(StaffComponent_IAuthentication newAuthentication) {
		StaffComponent_IAuthentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION, oldAuthentication, authentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomInformation getIRoomInformation() {
		if (iRoomInformation != null && iRoomInformation.eIsProxy()) {
			InternalEObject oldIRoomInformation = (InternalEObject)iRoomInformation;
			iRoomInformation = (RoomComponent_IRoomInformation)eResolveProxy(oldIRoomInformation);
			if (iRoomInformation != oldIRoomInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
			}
		}
		return iRoomInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomComponent_IRoomInformation basicGetIRoomInformation() {
		return iRoomInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIRoomInformation(RoomComponent_IRoomInformation newIRoomInformation) {
		RoomComponent_IRoomInformation oldIRoomInformation = iRoomInformation;
		iRoomInformation = newIRoomInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION, oldIRoomInformation, iRoomInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IEventManagement getIAdditionalServiceInformation() {
		if (iAdditionalServiceInformation != null && iAdditionalServiceInformation.eIsProxy()) {
			InternalEObject oldIAdditionalServiceInformation = (InternalEObject)iAdditionalServiceInformation;
			iAdditionalServiceInformation = (AdditionalServiceComponent_IEventManagement)eResolveProxy(oldIAdditionalServiceInformation);
			if (iAdditionalServiceInformation != oldIAdditionalServiceInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
			}
		}
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_IEventManagement basicGetIAdditionalServiceInformation() {
		return iAdditionalServiceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAdditionalServiceInformation(AdditionalServiceComponent_IEventManagement newIAdditionalServiceInformation) {
		AdditionalServiceComponent_IEventManagement oldIAdditionalServiceInformation = iAdditionalServiceInformation;
		iAdditionalServiceInformation = newIAdditionalServiceInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION, oldIAdditionalServiceInformation, iAdditionalServiceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_IPayment getIPayment() {
		if (iPayment != null && iPayment.eIsProxy()) {
			InternalEObject oldIPayment = (InternalEObject)iPayment;
			iPayment = (PaymentComponent_IPayment)eResolveProxy(oldIPayment);
			if (iPayment != oldIPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT, oldIPayment, iPayment));
			}
		}
		return iPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentComponent_IPayment basicGetIPayment() {
		return iPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPayment(PaymentComponent_IPayment newIPayment) {
		PaymentComponent_IPayment oldIPayment = iPayment;
		iPayment = newIPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT, oldIPayment, iPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestsInBooking(String bookingReference) {
		String foundGuests = "";
		
		
		for(BookingComponent_Booking booking : bookings){
			if (bookingReference.equals(booking.getBookingReference())) {
				foundGuests = booking.getGuestsInBooking();

			}
		}

		return foundGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomTypesInBooking(String bookingReference) {
	String foundRoomTypes = null;
		
		
		for(BookingComponent_Booking booking : bookings){
			if (bookingReference.equals(booking.getBookingReference())) {
				foundRoomTypes = booking.getRoomTypesInBooking();

			}
		}
		
		System.out.println(foundRoomTypes);
		return foundRoomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> searchForBooking(String bookingReference) {
		Date todaysDate = new Date();

		EList<String> bookingInfo = new BasicEList<String>();

		for(BookingComponent_Booking booking : bookings){

			// Booking is found for the reference number
			if(booking.getBookingReference().equals(bookingReference)){

				// Check that booking date is not in the future
				if((booking.getArrivalDate()).compareTo(todaysDate) <= 0){

					// Check if booking check out that has not passed
					if(booking.getDepartureDate().compareTo(todaysDate) <= 0){
						System.out.println("Booking departure date is already passed\n"
							+ "Departure date was on: " + (booking.getDepartureDate()).toString());
						return null;
					}

				}

				// Booking date is in the future
				else{
					System.out.println("Booking arrival date will be on: " + (booking.getArrivalDate()).toString());
					return null;
				}

				bookingInfo.add(booking.getRoomTypesInBooking());
				bookingInfo.add(booking.getGuestsInBooking());

				return bookingInfo;
			}
		}

		// return null if bookingReference doesn't match any booking
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPaidFor(String bookingReference) {
		for (BookingComponent_Booking booking : bookings) {
			if (booking.getBookingReference().equals(bookingReference)) {
				return booking.isPaid();
			}
		}
		//should not happen
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(String bookingReference) {
		boolean successful = false;
		
		for (BookingComponent_Booking booking : bookings) {
			if (booking.getBookingReference().equals(bookingReference)) {
				String paymentString = booking.getPaymentDetails().toString();
				String [] paymentArray = paymentString.split(",");
				System.out.println(paymentString);
				
				Pattern p = Pattern.compile("(\\d+)");
				Matcher m1 = p.matcher(paymentArray[5]);
				long bookingCost = 100;
				Matcher m2 = p.matcher(paymentArray[6]);
				m1.find();
				m2.find();
				
				iPayment.addCC(paymentArray[3], 
						paymentArray[4], 
						Integer.parseInt(m1.group(1)),
						Integer.parseInt(m2.group(1)),
						paymentArray[0], 
						paymentArray[1]);

				
				
				iPayment.makeDeposit(paymentArray[3], 
						paymentArray[4], 
						Integer.parseInt(m1.group(1)),
						Integer.parseInt(m2.group(1)),
						paymentArray[0], 
						paymentArray[1], 
						bookingCost);
				
				successful = iPayment.makePayment(
						paymentArray[3], 
						paymentArray[4], 
						Integer.parseInt(m1.group(1)),
						Integer.parseInt(m2.group(1)),
						paymentArray[0], 
						paymentArray[1], 
						bookingCost);
				
				iPayment.removeCC(paymentArray[3], 
						paymentArray[4], 
						Integer.parseInt(m1.group(1)),
						Integer.parseInt(m2.group(1)),
						paymentArray[0], 
						paymentArray[1]);
				
				
				if (successful == true) {
					booking.setIsPaid(true);
				}
			}
		}
		
		return successful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map searchAvailableRoomTypes(Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getDSSInfo() {
		EList<String> DSSInfo = new BasicEList<String>();
		for (BookingComponent_Booking booking: bookings){
			String currentBookings=booking.getRoomTypesInBooking()+","+booking.getArrivalDate()+","+booking.getDepartureDate()+","
					+booking.getPaymentDetails().getFirstName()+","
					+booking.getPaymentDetails().getLastName()+","+booking.getPaymentDetails().getAddress()
					+","+booking.getGuests().size();
			
			String additionalServices=null;
			for (BookingComponent_AdditionalService additionalService: booking.getAdditionalServices()){
				if(additionalServices == null){
					additionalServices = additionalService.getName()+":"+additionalService.getPrice();
				}
				else{
					additionalServices += ","+additionalService.getName()+":"+additionalService.getPrice();
				}
			}
			DSSInfo.add(currentBookings+";"+additionalServices);
		}
		return DSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String makeBooking(String roomType, Date arrivalDate, Date departureDate, String customerSSN) {
		String refNumber = "INVALID_BOOKING";
		
		if(bookingAvailable(arrivalDate, departureDate, roomType)) {
			
			BookingComponent_Booking newBooking = new BookingComponent_BookingImpl(arrivalDate, departureDate);
			//newBooking.addPaymentDetails(customerFirstName, customerLastName, customerAddress, ccNumber, ccv, expiryMonth, expiryYear);
			newBooking.addRoomToBooking(roomType, iRoomInformation.getPriceOfRoomType(roomType));
			bookings.add(newBooking);
			refNumber = newBooking.getBookingReference();
		}
		
		return refNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(String bookingReference, String roomType, int price) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		
		if(bookingToChange.getBookingReference().equals("NULL")) {
			System.out.println("Invalid Reference Number");
			return false;
		}
		else if(!bookingAvailable(bookingToChange.getArrivalDate(), bookingToChange.getDepartureDate(), roomType)) {
			System.out.println("No valid bookings can be made on this date, for this roomType");
			return false;
		}
		else {
			bookingToChange.addRoomToBooking(roomType, price);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		BookingComponent_Booking targetBooking = findBooking(bookingReference);
		
		if(targetBooking.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
			return false;
		}
		else
		{
			targetBooking.updateBooking(arrivalDate, departureDate);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelBooking(String bookingReference) {
		BookingComponent_Booking bookingToRemove = findBooking(bookingReference);
		if(bookingToRemove.equals("NULL") && bookingToRemove.isActive())
		{
			System.out.println("Invalid Reference Number");
			return false;
		}
		else if(!bookingToRemove.isActive()) {
			System.out.println("Booking is already cancelled");
			return false;
		}
		else
		{
			
			for(BookingComponent_AdditionalService as : bookingToRemove.getAdditionalServices()) {
				String name = as.getName();
				Date dateTime = as.getDateTime();
				String location = as.getLocation();
				int guests = as.getGuestCount();
				iAdditionalServiceInformation.removeGuestsFromEvent(name, dateTime, location, guests);
				as.setGuestCount(0);
			}
			bookingToRemove.setIsActive(false);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addAdditionalService(String bookingReference, String additionalServiceName, int price) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		if(bookingToChange.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
			return false;
		}
		else
		{
	    	EList<String> events = getIAdditionalServiceInformation().getEvents(additionalServiceName);
	    	
	    	String event = events.get(0);
	    	
	    	List<String> eventInformation = Arrays.asList(event.split("#"));
	    	String location = eventInformation.get(1).trim().replace(';', ' ').trim();
	    	
	    	Date newDate = new Date();
	    	
	    	try {
	            DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy");
	            newDate = df.parse(eventInformation.get(0).trim()); 
	        	
			} catch (ParseException e) {
				System.out.println("Error parsing Date");
				e.printStackTrace();
			}
	    	
	    	boolean success = getIAdditionalServiceInformation().addGuestToEvent(additionalServiceName, newDate, location, price);
			if(success) {
		    	bookingToChange.addAdditionalServiceToBooking(additionalServiceName, getIAdditionalServiceInformation().getServicePrice(additionalServiceName), location, newDate);
		    	return true;
			} 
			else {
				System.out.println("Failed added service to booking " + bookingToChange.getBookingReference());
				return false;
			}

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoom(String bookingReference, String roomType) {
		BookingComponent_Booking bookingToRemove = findBooking(bookingReference);
		if(bookingToRemove.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
			return false;
		}
		else
		{
			bookingToRemove.removeRoomFromBooking(roomType);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeAdditionalService(String bookingReference, String additionalServiceName) {
		BookingComponent_Booking bookingToRemoveFrom = findBooking(bookingReference);
		if(bookingToRemoveFrom.equals("NULL"))
		{
			System.out.println("Invalid Reference Number");
			return false;
		}
		else
		{
			EList<String> events = getIAdditionalServiceInformation().getEvents(additionalServiceName);
	    	
	    	String event = events.get(0);
	    	
	    	List<String> eventInformation = Arrays.asList(event.split("#"));
	    	String location = eventInformation.get(1).trim().replace(';', ' ').trim();
	    	
	    	Date newDate = new Date();
	    	
	    	try {
	            DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy");
	            newDate = df.parse(eventInformation.get(0).trim()); 
	        	
			} catch (ParseException e) {
				System.out.println("Error parsing Date");
				e.printStackTrace();
			}
	    	
	    	boolean success = getIAdditionalServiceInformation().removeGuestsFromEvent(additionalServiceName, newDate, location, bookingToRemoveFrom.getGuests().size());
	    	if(success) {
	    		bookingToRemoveFrom.removeAdditionalServiceFromBooking(additionalServiceName);
	    		return true;
	    	}
	    	else {
	    		System.out.println("Unable to remove booking for " + bookingToRemoveFrom.getBookingReference());
	    		return false;
	    	}
			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addGuestToBooking(String bookingReference, String firstName, String lastName, String address, String phoneNumber) {
		BookingComponent_Booking bookingToChange = findBooking(bookingReference);
		if(bookingToChange.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Booking Reference");
			return false;
		}
		
		bookingToChange.addGuestToBooking(firstName, lastName, address, phoneNumber);
		
		if(!confirmBooking(bookingReference)) {
			System.out.println("Unable to add more guests to this booking, please add more rooms first.");
			bookingToChange.removeGuestFromBooking(firstName, lastName, address);
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeGuest(String bookingReference, String firstName, String lastName, String address) {
		BookingComponent_Booking targetBooking = findBooking(bookingReference);
		if(targetBooking.getBookingReference().equals("NULL")) {
			System.out.println("Invalid Booking Reference");
			return false;
		} else {
			targetBooking.removeGuestFromBooking(firstName, lastName, address);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean confirmBooking(String bookingReference) {
		BookingComponent_Booking bookingToValidate = findBooking(bookingReference);
		
		int maxGuestCount = 0;
		
		if(bookingToValidate.getBookingReference().equals("NULL"))
		{
			System.out.println("Invalid Booking Reference");
			return false;
		}
		
		for(BookingComponent_RoomType roomTypes : bookingToValidate.getRooms()) {
			String type = roomTypes.getRoomType();
			maxGuestCount += iRoomInformation.getBedCountOfRoomType(type);
		}
		
		if(bookingToValidate.getGuests().size() > maxGuestCount) {
			return false;
		}
		
		//Check the customer has input valid payment details here, if not, the booking is invalid.
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addPaymentDetails(String bookingReference, String customerFirstName, String customerLastName, String customerAddress, String ccNumber, String ccv, int expiryMonth, int expiryYear) {
		
		boolean ccAdded = iPayment.addCC(ccNumber, ccv, expiryMonth, expiryYear, customerFirstName, customerLastName);
		boolean success = iPayment.validateCC(ccNumber, ccv, expiryMonth, expiryYear, customerFirstName, customerLastName);
		
		
		if(ccAdded && success) {
			BookingComponent_Booking bookingToChange = findBooking(bookingReference);
			BookingComponent_PaymentDetails newPaymentDetails = new BookingComponent_PaymentDetailsImpl(customerFirstName, customerLastName, customerAddress, ccNumber, ccv, expiryMonth, expiryYear);
			bookingToChange.setPaymentDetails(newPaymentDetails);
			iPayment.removeCC(ccNumber, ccv, expiryMonth, expiryYear, customerFirstName, customerLastName);
		}
		
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingComponent_Booking findBooking(String referenceNumber) {
		BookingComponent_Booking targetBooking = new BookingComponent_BookingImpl();
		
		for(BookingComponent_Booking x : bookings)
		{
			if(x.getBookingReference().equals(referenceNumber))
			{
				targetBooking = x;
			}
		}
		return targetBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean bookingAvailable(Date startDate, Date endDate, String roomType) {
		int roomCount = iRoomInformation.getCountOfRoomType(roomType);
		int bookingsDuringDate = findBookingsByDate(startDate, endDate);
		return roomCount - bookingsDuringDate > 0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int findBookingsByDateAndType(Date startDate, Date endDate, String roomType) {
		
		int count = 0;
		
		for(BookingComponent_Booking booking : bookings) {
			
			//Add all bookings which are greater than, or equal to start date and add all dates which
			//Are less than or equal to end date
			if((booking.getArrivalDate().after(startDate) || booking.getArrivalDate().equals(startDate)) 
					&& (booking.getDepartureDate().before(endDate) || booking.getDepartureDate().equals(endDate))) {
				
				String types = booking.getRoomTypesInBooking();
				List<String> roomList = Arrays.asList(types.split(","));
				
				for(String foundTypes : roomList) {
					if(foundTypes.equals(roomType)){
						++count;
					}
				}
			}
		}
		
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int findBookingsByDate(Date startDate, Date endDate) {
		
		int count = 0;
		
		for(BookingComponent_Booking booking : bookings) {
			
			//Add all bookings which are greater than, or equal to start date and add all dates which
			//Are less than or equal to end date
			if((booking.getArrivalDate().after(startDate) || booking.getArrivalDate().equals(startDate)) 
					&& (booking.getDepartureDate().before(endDate) || booking.getDepartureDate().equals(endDate))) {
				++count;
			}
		}
		
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				return getBookings();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				if (resolve) return getIRoomInformation();
				return basicGetIRoomInformation();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				if (resolve) return getIAdditionalServiceInformation();
				return basicGetIAdditionalServiceInformation();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				if (resolve) return getIPayment();
				return basicGetIPayment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends BookingComponent_Booking>)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IEventManagement)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				setAuthentication((StaffComponent_IAuthentication)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				setIRoomInformation((RoomComponent_IRoomInformation)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				setIAdditionalServiceInformation((AdditionalServiceComponent_IEventManagement)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				setIPayment((PaymentComponent_IPayment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__AUTHENTICATION:
				return authentication != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IROOM_INFORMATION:
				return iRoomInformation != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IADDITIONAL_SERVICE_INFORMATION:
				return iAdditionalServiceInformation != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER__IPAYMENT:
				return iPayment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BookingComponent_IBookingDecision.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_DECISION___GET_DSS_INFO: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_DSS_INFO;
				default: return -1;
			}
		}
		if (baseClass == BookingComponent_IBookingAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___MAKE_BOOKING__STRING_DATE_DATE_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_BOOKING__STRING_DATE_DATE_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ROOM__STRING_STRING_INT: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ROOM__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___EDIT_BOOKING__STRING_DATE_DATE: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___EDIT_BOOKING__STRING_DATE_DATE;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CANCEL_BOOKING__STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CANCEL_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ROOM__STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ROOM__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___REMOVE_GUEST__STRING_STRING_STRING_STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_GUEST__STRING_STRING_STRING_STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___CONFIRM_BOOKING__STRING: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CONFIRM_BOOKING__STRING;
				case ImplementationPackage.BOOKING_COMPONENT_IBOOKING_ADMINISTRATION___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT: return ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_GUESTS_IN_BOOKING__STRING:
				return getGuestsInBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_ROOM_TYPES_IN_BOOKING__STRING:
				return getRoomTypesInBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___SEARCH_FOR_BOOKING__STRING:
				return searchForBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___IS_PAID_FOR__STRING:
				return isPaidFor((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_PAYMENT__STRING:
				return makePayment((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE:
				return searchAvailableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE_AND_TYPE__DATE_DATE_STRING:
				return findBookingsByDateAndType((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___GET_DSS_INFO:
				return getDSSInfo();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___MAKE_BOOKING__STRING_DATE_DATE_STRING:
				return makeBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ROOM__STRING_STRING_INT:
				return addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___EDIT_BOOKING__STRING_DATE_DATE:
				return editBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CANCEL_BOOKING__STRING:
				return cancelBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_ADDITIONAL_SERVICE__STRING_STRING_INT:
				return addAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ROOM__STRING_STRING:
				return removeRoom((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING_STRING:
				return removeAdditionalService((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_GUEST_TO_BOOKING__STRING_STRING_STRING_STRING_STRING:
				return addGuestToBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___REMOVE_GUEST__STRING_STRING_STRING_STRING:
				return removeGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___CONFIRM_BOOKING__STRING:
				return confirmBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___ADD_PAYMENT_DETAILS__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT:
				return addPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Integer)arguments.get(7));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKING__STRING:
				return findBooking((String)arguments.get(0));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___BOOKING_AVAILABLE__DATE_DATE_STRING:
				return bookingAvailable((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_HANDLER___FIND_BOOKINGS_BY_DATE__DATE_DATE:
				return findBookingsByDate((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingComponent_BookingHandlerImpl

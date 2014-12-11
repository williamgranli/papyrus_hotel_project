/**
 */
package Implementation.impl;

import Implementation.BookingComponent_AdditionalService;
import Implementation.BookingComponent_Booking;
import Implementation.BookingComponent_Guest;
import Implementation.BookingComponent_PaymentDetails;
import Implementation.BookingComponent_RoomType;
import Implementation.ImplementationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getCurrentCost <em>Current Cost</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getAdditionalServices <em>Additional Services</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingImpl extends MinimalEObjectImpl.Container implements BookingComponent_Booking {
	/**
	 * The default value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date arrivalDate = ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPARTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected Date departureDate = DEPARTURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentCost() <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCost()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentCost() <em>Current Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCost()
	 * @generated
	 * @ordered
	 */
	protected int currentCost = CURRENT_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalServices() <em>Additional Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingComponent_AdditionalService> additionalServices;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingComponent_Guest> guests;

	/**
	 * The cached value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected BookingComponent_PaymentDetails paymentDetails;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingComponent_RoomType> rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingComponent_BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDate(Date newArrivalDate) {
		Date oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureDate(Date newDepartureDate) {
		Date oldDepartureDate = departureDate;
		departureDate = newDepartureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE, oldDepartureDate, departureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentCost() {
		return currentCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCost(int newCurrentCost) {
		int oldCurrentCost = currentCost;
		currentCost = newCurrentCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST, oldCurrentCost, currentCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_AdditionalService> getAdditionalServices() {
		if (additionalServices == null) {
			additionalServices = new EObjectResolvingEList<BookingComponent_AdditionalService>(BookingComponent_AdditionalService.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES);
		}
		return additionalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_Guest> getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<BookingComponent_Guest>(BookingComponent_Guest.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_PaymentDetails getPaymentDetails() {
		if (paymentDetails != null && paymentDetails.eIsProxy()) {
			InternalEObject oldPaymentDetails = (InternalEObject)paymentDetails;
			paymentDetails = (BookingComponent_PaymentDetails)eResolveProxy(oldPaymentDetails);
			if (paymentDetails != oldPaymentDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS, oldPaymentDetails, paymentDetails));
			}
		}
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_PaymentDetails basicGetPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(BookingComponent_PaymentDetails newPaymentDetails) {
		BookingComponent_PaymentDetails oldPaymentDetails = paymentDetails;
		paymentDetails = newPaymentDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS, oldPaymentDetails, paymentDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingComponent_RoomType> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<BookingComponent_RoomType>(BookingComponent_RoomType.class, this, ImplementationPackage.BOOKING_COMPONENT_BOOKING__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Booking Booking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Booking Booking(Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAdditionalServiceToBooking(BookingComponent_AdditionalService newService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingComponent_Booking Booking(String roomType, Date arrivalDate, Date departureDate, String customerSSN, String customerFirstName, String customerLastName, String customerAddress, String customerEmail, String ccNumber, String ccv, String expiryMonth, String expiryYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomToBooking(BookingComponent_RoomType newRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomFromBooking(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateBooking(String bookingReference, Date arrivalDate, Date departureDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAdditionalServiceFromBooking(BookingComponent_AdditionalService additionalService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int currentCost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePaymentDetails(BookingComponent_PaymentDetails newPaymentDetails) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				return getArrivalDate();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				return getDepartureDate();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				return getReferenceNumber();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				return getCurrentCost();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES:
				return getAdditionalServices();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__GUESTS:
				return getGuests();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS:
				if (resolve) return getPaymentDetails();
				return basicGetPaymentDetails();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ROOMS:
				return getRooms();
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				setArrivalDate((Date)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				setDepartureDate((Date)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				setCurrentCost((Integer)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES:
				getAdditionalServices().clear();
				getAdditionalServices().addAll((Collection<? extends BookingComponent_AdditionalService>)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends BookingComponent_Guest>)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS:
				setPaymentDetails((BookingComponent_PaymentDetails)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends BookingComponent_RoomType>)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				setArrivalDate(ARRIVAL_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				setDepartureDate(DEPARTURE_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				setCurrentCost(CURRENT_COST_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES:
				getAdditionalServices().clear();
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__GUESTS:
				getGuests().clear();
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS:
				setPaymentDetails((BookingComponent_PaymentDetails)null);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ROOMS:
				getRooms().clear();
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE:
				return ARRIVAL_DATE_EDEFAULT == null ? arrivalDate != null : !ARRIVAL_DATE_EDEFAULT.equals(arrivalDate);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE:
				return DEPARTURE_DATE_EDEFAULT == null ? departureDate != null : !DEPARTURE_DATE_EDEFAULT.equals(departureDate);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__CURRENT_COST:
				return currentCost != CURRENT_COST_EDEFAULT;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ADDITIONAL_SERVICES:
				return additionalServices != null && !additionalServices.isEmpty();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__GUESTS:
				return guests != null && !guests.isEmpty();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__PAYMENT_DETAILS:
				return paymentDetails != null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING__ROOMS:
				return rooms != null && !rooms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING:
				return Booking();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE:
				return Booking((Date)arguments.get(0), (Date)arguments.get(1));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE:
				addAdditionalServiceToBooking((BookingComponent_AdditionalService)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				return Booking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10), (String)arguments.get(11));
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE:
				addRoomToBooking((BookingComponent_RoomType)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING:
				removeRoomFromBooking((String)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE:
				updateBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE:
				removeAdditionalServiceFromBooking((BookingComponent_AdditionalService)arguments.get(0));
				return null;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___CURRENT_COST:
				return currentCost();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS:
				updatePaymentDetails((BookingComponent_PaymentDetails)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (arrivalDate: ");
		result.append(arrivalDate);
		result.append(", departureDate: ");
		result.append(departureDate);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(", currentCost: ");
		result.append(currentCost);
		result.append(')');
		return result.toString();
	}

} //BookingComponent_BookingImpl
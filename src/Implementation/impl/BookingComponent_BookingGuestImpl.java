/**
 */
package Implementation.impl;

import Implementation.BookingComponent_BookingGuest;
import Implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Component Booking Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.BookingComponent_BookingGuestImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingGuestImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingGuestImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Implementation.impl.BookingComponent_BookingGuestImpl#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingComponent_BookingGuestImpl extends MinimalEObjectImpl.Container implements BookingComponent_BookingGuest {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingComponent_BookingGuestImpl() {
		super();
	}
	
	protected BookingComponent_BookingGuestImpl(String firstName, String lastName, String address, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_COMPONENT_BOOKING_GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME:
				return getFirstName();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME:
				return getLastName();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS:
				return getAddress();
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__PHONE_NUMBER:
				return getPhoneNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS:
				setAddress((String)newValue);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
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
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ImplementationPackage.BOOKING_COMPONENT_BOOKING_GUEST__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append("");
		result.append(firstName + ",");
		result.append(lastName + ",");
		result.append(address);
		result.append("");
		return result.toString();
	}

} //BookingComponent_BookingGuestImpl

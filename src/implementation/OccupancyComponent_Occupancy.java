/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupancy Component Occupancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}</li>
 *   <li>{@link implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}</li>
 *   <li>{@link implementation.OccupancyComponent_Occupancy#getGuest <em>Guest</em>}</li>
 *   <li>{@link implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy()
 * @model
 * @generated
 */
public interface OccupancyComponent_Occupancy extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Check In Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Date Time</em>' attribute.
	 * @see #setCheckInDateTime(int)
	 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy_CheckInDateTime()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCheckInDateTime();

	/**
	 * Sets the value of the '{@link implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date Time</em>' attribute.
	 * @see #getCheckInDateTime()
	 * @generated
	 */
	void setCheckInDateTime(int value);

	/**
	 * Returns the value of the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #setCheckOutDateTime(int)
	 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy_CheckOutDateTime()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCheckOutDateTime();

	/**
	 * Sets the value of the '{@link implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date Time</em>' attribute.
	 * @see #getCheckOutDateTime()
	 * @generated
	 */
	void setCheckOutDateTime(int value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference list.
	 * The list contents are of type {@link implementation.OccupancyComponent_Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference list.
	 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy_Guest()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest'"
	 * @generated
	 */
	EList<OccupancyComponent_Guest> getGuest();

	/**
	 * Returns the value of the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Reference</em>' attribute.
	 * @see #setBookingReference(String)
	 * @see implementation.ImplementationPackage#getOccupancyComponent_Occupancy_BookingReference()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingReference();

	/**
	 * Sets the value of the '{@link implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Reference</em>' attribute.
	 * @see #getBookingReference()
	 * @generated
	 */
	void setBookingReference(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false" checkInDateTimeDataType="org.eclipse.uml2.types.Integer" checkInDateTimeRequired="true" checkInDateTimeOrdered="false" guestRequired="true" guestOrdered="false"
	 *        guestAnnotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guest'" bookingReferenceDataType="org.eclipse.uml2.types.String" bookingReferenceRequired="true" bookingReferenceOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Occupancy'"
	 * @generated
	 */
	void occupancy(int roomNumber, int checkInDateTime, OccupancyComponent_Guest guest, String bookingReference);

} // OccupancyComponent_Occupancy
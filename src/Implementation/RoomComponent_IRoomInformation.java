/**
 */
package Implementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Component IRoom Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Implementation.ImplementationPackage#getRoomComponent_IRoomInformation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomComponent_IRoomInformation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	String getRoomInfo(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomTypeNameDataType="org.eclipse.uml2.types.String" roomTypeNameRequired="true" roomTypeNameOrdered="false"
	 * @generated
	 */
	EList<String> searchRoom(String roomTypeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getAllRoomNumbers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int countNumberOfTotalRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getCountOfRoomType(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getPriceOfRoomType(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getBedCountOfRoomType(String roomType);

} // RoomComponent_IRoomInformation

/**
 */
package Implementation.impl;

import Implementation.AdditionalServiceComponent_AdditionalService;
import Implementation.AdditionalServiceComponent_AdditionalServiceHandler;
import Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration;
import Implementation.AdditionalServiceComponent_IAdditionalServiceDecision;
import Implementation.ImplementationPackage;
import Implementation.StaffComponent_IAuthentication;

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
 * An implementation of the model object '<em><b>Additional Service Component Additional Service Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl#getAdditionalService <em>Additional Service</em>}</li>
 *   <li>{@link Implementation.impl.AdditionalServiceComponent_AdditionalServiceHandlerImpl#getIAuthentication <em>IAuthentication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalServiceComponent_AdditionalServiceHandlerImpl extends MinimalEObjectImpl.Container implements AdditionalServiceComponent_AdditionalServiceHandler {
	/**
	 * The cached value of the '{@link #getAdditionalService() <em>Additional Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalService()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalServiceComponent_AdditionalService> additionalService;

	/**
	 * The cached value of the '{@link #getIAuthentication() <em>IAuthentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAuthentication()
	 * @generated
	 * @ordered
	 */
	protected StaffComponent_IAuthentication iAuthentication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalServiceComponent_AdditionalServiceHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalServiceComponent_AdditionalService> getAdditionalService() {
		if (additionalService == null) {
			additionalService = new EObjectResolvingEList<AdditionalServiceComponent_AdditionalService>(AdditionalServiceComponent_AdditionalService.class, this, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE);
		}
		return additionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication getIAuthentication() {
		if (iAuthentication != null && iAuthentication.eIsProxy()) {
			InternalEObject oldIAuthentication = (InternalEObject)iAuthentication;
			iAuthentication = (StaffComponent_IAuthentication)eResolveProxy(oldIAuthentication);
			if (iAuthentication != oldIAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
			}
		}
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffComponent_IAuthentication basicGetIAuthentication() {
		return iAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAuthentication(StaffComponent_IAuthentication newIAuthentication) {
		StaffComponent_IAuthentication oldIAuthentication = iAuthentication;
		iAuthentication = newIAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION, oldIAuthentication, iAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAdditionalServiceInfo(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllAdditionalServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAdditionalService(String name, boolean usable, int price, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editAdditionalService(String oldName, String name, boolean usable, int price, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAdditionalService(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editEvent(String name, Date dateTime, String location, int maxAttendants, int currentAttendants) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEvent(String name, Date date, String location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalServiceComponent_AdditionalService findService(String name) {
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				return getAdditionalService();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				if (resolve) return getIAuthentication();
				return basicGetIAuthentication();
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				getAdditionalService().clear();
				getAdditionalService().addAll((Collection<? extends AdditionalServiceComponent_AdditionalService>)newValue);
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)newValue);
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				getAdditionalService().clear();
				return;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				setIAuthentication((StaffComponent_IAuthentication)null);
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__ADDITIONAL_SERVICE:
				return additionalService != null && !additionalService.isEmpty();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER__IAUTHENTICATION:
				return iAuthentication != null;
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
		if (baseClass == AdditionalServiceComponent_IAdditionalServiceDecision.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AdditionalServiceComponent_IAdditionalServiceAdministration.class) {
			switch (baseOperationID) {
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_EVENT__STRING_DATE_STRING_INT_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_EVENT__STRING_DATE_STRING_INT_INT;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_EVENT__STRING_DATE_STRING_INT_INT: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_EVENT__STRING_DATE_STRING_INT_INT;
				case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_EVENT__STRING_DATE_STRING: return ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENT__STRING_DATE_STRING;
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
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_ADDITIONAL_SERVICE_INFO__STRING:
				return getAdditionalServiceInfo((String)arguments.get(0));
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___GET_ALL_ADDITIONAL_SERVICES:
				return getAllAdditionalServices();
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_ADDITIONAL_SERVICE__STRING_BOOLEAN_INT_STRING:
				createAdditionalService((String)arguments.get(0), (Boolean)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_ADDITIONAL_SERVICE__STRING_STRING_BOOLEAN_INT_STRING:
				editAdditionalService((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_ADDITIONAL_SERVICE__STRING:
				removeAdditionalService((String)arguments.get(0));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___CREATE_EVENT__STRING_DATE_STRING_INT_INT:
				createEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___EDIT_EVENT__STRING_DATE_STRING_INT_INT:
				editEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___REMOVE_EVENT__STRING_DATE_STRING:
				removeEvent((String)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationPackage.ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_HANDLER___FIND_SERVICE__STRING:
				return findService((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdditionalServiceComponent_AdditionalServiceHandlerImpl

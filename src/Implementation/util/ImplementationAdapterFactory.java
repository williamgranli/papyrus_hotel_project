/**
 */
package Implementation.util;

import Implementation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Implementation.ImplementationPackage
 * @generated
 */
public class ImplementationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplementationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationSwitch<Adapter> modelSwitch =
		new ImplementationSwitch<Adapter>() {
			@Override
			public Adapter caseDecisionSupportComponent(DecisionSupportComponent object) {
				return createDecisionSupportComponentAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_IDecisionSupport(DecisionSupportComponent_IDecisionSupport object) {
				return createDecisionSupportComponent_IDecisionSupportAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_BookingDSSInfo(DecisionSupportComponent_BookingDSSInfo object) {
				return createDecisionSupportComponent_BookingDSSInfoAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_AdditionalServiceDSSInfo(DecisionSupportComponent_AdditionalServiceDSSInfo object) {
				return createDecisionSupportComponent_AdditionalServiceDSSInfoAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_DSSController(DecisionSupportComponent_DSSController object) {
				return createDecisionSupportComponent_DSSControllerAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_IOccupancyDecision(OccupancyComponent_IOccupancyDecision object) {
				return createOccupancyComponent_IOccupancyDecisionAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBookingDecision(BookingComponent_IBookingDecision object) {
				return createBookingComponent_IBookingDecisionAdapter();
			}
			@Override
			public Adapter caseDecisionSupportComponent_OccupancyDSSInfo(DecisionSupportComponent_OccupancyDSSInfo object) {
				return createDecisionSupportComponent_OccupancyDSSInfoAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent(OccupancyComponent object) {
				return createOccupancyComponentAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Occupancy(OccupancyComponent_Occupancy object) {
				return createOccupancyComponent_OccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_Guest(OccupancyComponent_Guest object) {
				return createOccupancyComponent_GuestAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_IOccupancy(OccupancyComponent_IOccupancy object) {
				return createOccupancyComponent_IOccupancyAdapter();
			}
			@Override
			public Adapter caseOccupancyComponent_OccupancyHandler(OccupancyComponent_OccupancyHandler object) {
				return createOccupancyComponent_OccupancyHandlerAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomInformation(RoomComponent_IRoomInformation object) {
				return createRoomComponent_IRoomInformationAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBookingInformation(BookingComponent_IBookingInformation object) {
				return createBookingComponent_IBookingInformationAdapter();
			}
			@Override
			public Adapter casePaymentComponent(PaymentComponent object) {
				return createPaymentComponentAdapter();
			}
			@Override
			public Adapter casePaymentComponent_IPayment(PaymentComponent_IPayment object) {
				return createPaymentComponent_IPaymentAdapter();
			}
			@Override
			public Adapter casePaymentComponent_PaymentHandler(PaymentComponent_PaymentHandler object) {
				return createPaymentComponent_PaymentHandlerAdapter();
			}
			@Override
			public Adapter casePaymentComponent_Payment(PaymentComponent_Payment object) {
				return createPaymentComponent_PaymentAdapter();
			}
			@Override
			public Adapter caseBank_CustomerProvides(Bank_CustomerProvides object) {
				return createBank_CustomerProvidesAdapter();
			}
			@Override
			public Adapter caseBank_AdministratorProvides(Bank_AdministratorProvides object) {
				return createBank_AdministratorProvidesAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent(AdditionalServiceComponent object) {
				return createAdditionalServiceComponentAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IAdditionalServiceAdministration(AdditionalServiceComponent_IAdditionalServiceAdministration object) {
				return createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_IEventManagement(AdditionalServiceComponent_IEventManagement object) {
				return createAdditionalServiceComponent_IEventManagementAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalService(AdditionalServiceComponent_AdditionalService object) {
				return createAdditionalServiceComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalServiceEvent(AdditionalServiceComponent_AdditionalServiceEvent object) {
				return createAdditionalServiceComponent_AdditionalServiceEventAdapter();
			}
			@Override
			public Adapter caseAdditionalServiceComponent_AdditionalServiceHandler(AdditionalServiceComponent_AdditionalServiceHandler object) {
				return createAdditionalServiceComponent_AdditionalServiceHandlerAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAuthentication(StaffComponent_IAuthentication object) {
				return createStaffComponent_IAuthenticationAdapter();
			}
			@Override
			public Adapter caseBookingComponent(BookingComponent object) {
				return createBookingComponentAdapter();
			}
			@Override
			public Adapter caseBookingComponent_PaymentDetails(BookingComponent_PaymentDetails object) {
				return createBookingComponent_PaymentDetailsAdapter();
			}
			@Override
			public Adapter caseBookingComponent_Booking(BookingComponent_Booking object) {
				return createBookingComponent_BookingAdapter();
			}
			@Override
			public Adapter caseBookingComponent_AdditionalService(BookingComponent_AdditionalService object) {
				return createBookingComponent_AdditionalServiceAdapter();
			}
			@Override
			public Adapter caseBookingComponent_BookingGuest(BookingComponent_BookingGuest object) {
				return createBookingComponent_BookingGuestAdapter();
			}
			@Override
			public Adapter caseBookingComponent_RoomType(BookingComponent_RoomType object) {
				return createBookingComponent_RoomTypeAdapter();
			}
			@Override
			public Adapter caseBookingComponent_BookingHandler(BookingComponent_BookingHandler object) {
				return createBookingComponent_BookingHandlerAdapter();
			}
			@Override
			public Adapter caseBookingComponent_IBookingAdministration(BookingComponent_IBookingAdministration object) {
				return createBookingComponent_IBookingAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffComponent(StaffComponent object) {
				return createStaffComponentAdapter();
			}
			@Override
			public Adapter caseStaffComponent_IAccountAdministration(StaffComponent_IAccountAdministration object) {
				return createStaffComponent_IAccountAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffComponent_AccountManager(StaffComponent_AccountManager object) {
				return createStaffComponent_AccountManagerAdapter();
			}
			@Override
			public Adapter caseStaffComponent_Employee(StaffComponent_Employee object) {
				return createStaffComponent_EmployeeAdapter();
			}
			@Override
			public Adapter caseRoomComponent(RoomComponent object) {
				return createRoomComponentAdapter();
			}
			@Override
			public Adapter caseRoomComponent_IRoomAdministration(RoomComponent_IRoomAdministration object) {
				return createRoomComponent_IRoomAdministrationAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Room(RoomComponent_Room object) {
				return createRoomComponent_RoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_Bedroom(RoomComponent_Bedroom object) {
				return createRoomComponent_BedroomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_ConferenceRoom(RoomComponent_ConferenceRoom object) {
				return createRoomComponent_ConferenceRoomAdapter();
			}
			@Override
			public Adapter caseRoomComponent_RoomHandler(RoomComponent_RoomHandler object) {
				return createRoomComponent_RoomHandlerAdapter();
			}
			@Override
			public Adapter caseBank(Bank object) {
				return createBankAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent <em>Decision Support Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent
	 * @generated
	 */
	public Adapter createDecisionSupportComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent_IDecisionSupport
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_IDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent_BookingDSSInfo <em>Decision Support Component Booking DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent_BookingDSSInfo
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_BookingDSSInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent_DSSController <em>Decision Support Component DSS Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent_DSSController
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_DSSControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent_IOccupancyDecision
	 * @generated
	 */
	public Adapter createOccupancyComponent_IOccupancyDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_IBookingDecision
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent_OccupancyDSSInfo <em>Decision Support Component Occupancy DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent_OccupancyDSSInfo
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_OccupancyDSSInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo <em>Decision Support Component Additional Service DSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.DecisionSupportComponent_AdditionalServiceDSSInfo
	 * @generated
	 */
	public Adapter createDecisionSupportComponent_AdditionalServiceDSSInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent <em>Occupancy Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent
	 * @generated
	 */
	public Adapter createOccupancyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent_Occupancy <em>Occupancy Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent_Occupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent_Guest <em>Occupancy Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent_Guest
	 * @generated
	 */
	public Adapter createOccupancyComponent_GuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent_IOccupancy
	 * @generated
	 */
	public Adapter createOccupancyComponent_IOccupancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.OccupancyComponent_OccupancyHandler <em>Occupancy Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	public Adapter createOccupancyComponent_OccupancyHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_IRoomInformation
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_IBookingInformation <em>Booking Component IBooking Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_IBookingInformation
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.PaymentComponent <em>Payment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.PaymentComponent
	 * @generated
	 */
	public Adapter createPaymentComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.PaymentComponent_Payment <em>Payment Component Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.PaymentComponent_Payment
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.Bank_CustomerProvides <em>Bank Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.Bank_CustomerProvides
	 * @generated
	 */
	public Adapter createBank_CustomerProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.Bank_AdministratorProvides <em>Bank Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.Bank_AdministratorProvides
	 * @generated
	 */
	public Adapter createBank_AdministratorProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.PaymentComponent_IPayment
	 * @generated
	 */
	public Adapter createPaymentComponent_IPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.PaymentComponent_PaymentHandler <em>Payment Component Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.PaymentComponent_PaymentHandler
	 * @generated
	 */
	public Adapter createPaymentComponent_PaymentHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent <em>Additional Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent_AdditionalService <em>Additional Service Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.StaffComponent_IAuthentication
	 * @generated
	 */
	public Adapter createStaffComponent_IAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent_AdditionalServiceHandler <em>Additional Service Component Additional Service Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceHandler
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IAdditionalServiceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent_IEventManagement <em>Additional Service Component IEvent Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent_IEventManagement
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_IEventManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.AdditionalServiceComponent_AdditionalServiceEvent <em>Additional Service Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	public Adapter createAdditionalServiceComponent_AdditionalServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent <em>Booking Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent
	 * @generated
	 */
	public Adapter createBookingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_PaymentDetails <em>Booking Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_PaymentDetails
	 * @generated
	 */
	public Adapter createBookingComponent_PaymentDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_Booking <em>Booking Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_Booking
	 * @generated
	 */
	public Adapter createBookingComponent_BookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_AdditionalService <em>Booking Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_AdditionalService
	 * @generated
	 */
	public Adapter createBookingComponent_AdditionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_BookingGuest <em>Booking Component Booking Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_BookingGuest
	 * @generated
	 */
	public Adapter createBookingComponent_BookingGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_RoomType <em>Booking Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_RoomType
	 * @generated
	 */
	public Adapter createBookingComponent_RoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_BookingHandler <em>Booking Component Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_BookingHandler
	 * @generated
	 */
	public Adapter createBookingComponent_BookingHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.BookingComponent_IBookingAdministration <em>Booking Component IBooking Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.BookingComponent_IBookingAdministration
	 * @generated
	 */
	public Adapter createBookingComponent_IBookingAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.StaffComponent <em>Staff Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.StaffComponent
	 * @generated
	 */
	public Adapter createStaffComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.StaffComponent_AccountManager <em>Staff Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.StaffComponent_AccountManager
	 * @generated
	 */
	public Adapter createStaffComponent_AccountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.StaffComponent_IAccountAdministration
	 * @generated
	 */
	public Adapter createStaffComponent_IAccountAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.StaffComponent_Employee <em>Staff Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.StaffComponent_Employee
	 * @generated
	 */
	public Adapter createStaffComponent_EmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent <em>Room Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent
	 * @generated
	 */
	public Adapter createRoomComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_Room <em>Room Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_Room
	 * @generated
	 */
	public Adapter createRoomComponent_RoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_Bedroom <em>Room Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_Bedroom
	 * @generated
	 */
	public Adapter createRoomComponent_BedroomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_ConferenceRoom <em>Room Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_ConferenceRoom
	 * @generated
	 */
	public Adapter createRoomComponent_ConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_IRoomAdministration
	 * @generated
	 */
	public Adapter createRoomComponent_IRoomAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.RoomComponent_RoomHandler <em>Room Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.RoomComponent_RoomHandler
	 * @generated
	 */
	public Adapter createRoomComponent_RoomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Implementation.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Implementation.Bank
	 * @generated
	 */
	public Adapter createBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImplementationAdapterFactory

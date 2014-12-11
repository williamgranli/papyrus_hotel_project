/**
 */
package implementation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see implementation.ImplementationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Implementation'"
 * @generated
 */
public interface ImplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///implementation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "implementation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationPackage eINSTANCE = implementation.impl.ImplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link implementation.impl.DecisionSupportComponentImpl <em>Decision Support Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.DecisionSupportComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Decision Support Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decision Support Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.DecisionSupportComponent_IDecisionSupport
	 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_IDecisionSupport()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT = 1;

	/**
	 * The number of structural features of the '<em>Decision Support Component IDecision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decision Support Component IDecision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.DecisionSupportComponent_DssProcessorImpl <em>Decision Support Component Dss Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.DecisionSupportComponent_DssProcessorImpl
	 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssProcessor()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR = 2;

	/**
	 * The number of structural features of the '<em>Decision Support Component Dss Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decision Support Component Dss Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.DecisionSupportComponent_DssPresenterImpl <em>Decision Support Component Dss Presenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.DecisionSupportComponent_DssPresenterImpl
	 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssPresenter()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PRESENTER = 3;

	/**
	 * The number of structural features of the '<em>Decision Support Component Dss Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PRESENTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decision Support Component Dss Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_PRESENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.OccupancyComponent_IOccupancy
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY = 5;

	/**
	 * The number of structural features of the '<em>Occupancy Component IOccupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS = 2;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT = 3;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL = 4;

	/**
	 * The number of operations of the '<em>Occupancy Component IOccupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link implementation.impl.DecisionSupportComponent_DssControllerImpl <em>Decision Support Component Dss Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.DecisionSupportComponent_DssControllerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssController()
	 * @generated
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Dss Processor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR = OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dss Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER = OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Support Component Dss Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER_FEATURE_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_IN_GUEST__STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___CHECK_OUT_GUEST__STRING_STRING_STRING = OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_FREE_ROOMS = OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS;

	/**
	 * The operation id for the '<em>List Guests In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___LIST_GUESTS_IN_ROOM__INT = OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT;

	/**
	 * The operation id for the '<em>Number Of Guests In Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER___NUMBER_OF_GUESTS_IN_HOTEL = OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL;

	/**
	 * The number of operations of the '<em>Decision Support Component Dss Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER_OPERATION_COUNT = OCCUPANCY_COMPONENT_IOCCUPANCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.OccupancyComponentImpl <em>Occupancy Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.OccupancyComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT = 6;

	/**
	 * The number of structural features of the '<em>Occupancy Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.OccupancyComponent_OccupancyImpl <em>Occupancy Component Occupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.OccupancyComponent_OccupancyImpl
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Occupancy()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY = 7;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Check In Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Check Out Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__GUEST = 3;

	/**
	 * The feature id for the '<em><b>Booking Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Occupancy Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link implementation.impl.OccupancyComponent_GuestImpl <em>Occupancy Component Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.OccupancyComponent_GuestImpl
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Guest()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_GUEST = 8;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST__LAST_NAME = 1;

	/**
	 * The number of structural features of the '<em>Occupancy Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST___GUEST__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_GUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.OccupancyComponent_IOccupancyDecision
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancyDecision()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION = 9;

	/**
	 * The number of structural features of the '<em>Occupancy Component IOccupancy Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component IOccupancy Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.OccupancyComponent_OccupancyHandlerImpl <em>Occupancy Component Occupancy Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.OccupancyComponent_OccupancyHandlerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_OccupancyHandler()
	 * @generated
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = 10;

	/**
	 * The number of structural features of the '<em>Occupancy Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Occupancy Component Occupancy Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.PaymentComponentImpl <em>Payment Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.PaymentComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent()
	 * @generated
	 */
	int PAYMENT_COMPONENT = 11;

	/**
	 * The number of structural features of the '<em>Payment Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Payment Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.PaymentComponent_PaymentManagerImpl <em>Payment Component Payment Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.PaymentComponent_PaymentManagerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentManager()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Payment Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Payment Component Payment Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Payment Component Payment Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.PaymentComponent_PaymentCalculatorImpl <em>Payment Component Payment Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.PaymentComponent_PaymentCalculatorImpl
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR = 13;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Payment Component Payment Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Check Late Cancellation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Payment Component Payment Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_CALCULATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.PaymentComponent_PaymentHistoryDbImpl <em>Payment Component Payment History Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.PaymentComponent_PaymentHistoryDbImpl
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentHistoryDb()
	 * @generated
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB = 14;

	/**
	 * The feature id for the '<em><b>Payment History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY = 0;

	/**
	 * The number of structural features of the '<em>Payment Component Payment History Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Payment History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Search For Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Payment Component Payment History Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_PAYMENT_HISTORY_DB_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.PaymentComponent_IPayment
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_IPayment()
	 * @generated
	 */
	int PAYMENT_COMPONENT_IPAYMENT = 15;

	/**
	 * The number of structural features of the '<em>Payment Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Pay For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Reserve Funds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Unreserve Funds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Payment Component IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_COMPONENT_IPAYMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.AdditionalServiceComponentImpl <em>Additional Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.AdditionalServiceComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT = 16;

	/**
	 * The number of structural features of the '<em>Additional Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Additional Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceDecision <em>Additional Service Component IAdditional Service Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceDecision
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceDecision()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION = 18;

	/**
	 * The number of structural features of the '<em>Additional Service Component IAdditional Service Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Additional Service Component IAdditional Service Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Additional Service Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Additional Service Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Additional Service Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Additional Service Component Additional Service Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = 19;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Max Attendant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = 4;

	/**
	 * The number of structural features of the '<em>Additional Service Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Additional Service Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING = 0;

	/**
	 * The number of operations of the '<em>Additional Service Component Additional Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = 20;

	/**
	 * The number of structural features of the '<em>Additional Service Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT = 0;

	/**
	 * The operation id for the '<em>Edit Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT = 1;

	/**
	 * The operation id for the '<em>Remove Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = 2;

	/**
	 * The number of operations of the '<em>Additional Service Component IAdditional Service Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation <em>Additional Service Component IAdditional Service Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceInformation()
	 * @generated
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION = 21;

	/**
	 * The number of structural features of the '<em>Additional Service Component IAdditional Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Additional Service Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING = 0;

	/**
	 * The operation id for the '<em>Get All Additional Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES = 1;

	/**
	 * The number of operations of the '<em>Additional Service Component IAdditional Service Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponentImpl <em>Booking Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent()
	 * @generated
	 */
	int BOOKING_COMPONENT = 22;

	/**
	 * The number of structural features of the '<em>Booking Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Booking Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_PaymentDetailsImpl <em>Booking Component Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_PaymentDetailsImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_PaymentDetails()
	 * @generated
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS = 23;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__CCV = 4;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH = 5;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR = 6;

	/**
	 * The number of structural features of the '<em>Booking Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Booking Component Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_PAYMENT_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_BookingImpl <em>Booking Component Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_BookingImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_Booking()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING = 24;

	/**
	 * The feature id for the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE = 0;

	/**
	 * The feature id for the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Current Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING__CURRENT_COST = 3;

	/**
	 * The number of structural features of the '<em>Booking Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Booking Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT = 0;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Add Additional Service To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = 2;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE = 4;

	/**
	 * The operation id for the '<em>Remove Room From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING = 5;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE = 6;

	/**
	 * The operation id for the '<em>Remove Additional Service From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = 7;

	/**
	 * The operation id for the '<em>Current Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___CURRENT_COST = 8;

	/**
	 * The operation id for the '<em>Update Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS = 9;

	/**
	 * The number of operations of the '<em>Booking Component Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_AdditionalServiceImpl <em>Booking Component Additional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_AdditionalServiceImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_AdditionalService()
	 * @generated
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = 2;

	/**
	 * The number of structural features of the '<em>Booking Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking Component Additional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ADDITIONAL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_RoomTypeImpl <em>Booking Component Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_RoomTypeImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_RoomType()
	 * @generated
	 */
	int BOOKING_COMPONENT_ROOM_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE__ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE__COST = 1;

	/**
	 * The number of structural features of the '<em>Booking Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Component Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.BookingComponent_IBookingDecision
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingDecision()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION = 28;

	/**
	 * The number of structural features of the '<em>Booking Component IBooking Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Booking Component IBooking Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_BookingManagerImpl <em>Booking Component Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_BookingManagerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingManager()
	 * @generated
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER = 27;

	/**
	 * The number of structural features of the '<em>Booking Component Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER_FEATURE_COUNT = BOOKING_COMPONENT_IBOOKING_DECISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Booking Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Booking Component Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_BOOKING_MANAGER_OPERATION_COUNT = BOOKING_COMPONENT_IBOOKING_DECISION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link implementation.BookingComponent_IBooking <em>Booking Component IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.BookingComponent_IBooking
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_IBooking()
	 * @generated
	 */
	int BOOKING_COMPONENT_IBOOKING = 29;

	/**
	 * The number of structural features of the '<em>Booking Component IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___SEARCH_ROOMS__STRING_INT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___ADD_ROOM__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Request Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REQUEST_QUOTE__STRING_INT_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___EDIT_BOOKING__STRING_STRING_DATE_DATE_STRING = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___CANCEL_BOOKING__STRING = 5;

	/**
	 * The operation id for the '<em>Add Additional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___ADD_ADDITIONAL_SERVICE__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REMOVE_ROOM__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Remove Addional Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___REMOVE_ADDIONAL_SERVICE__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Get Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GET_BOOKING_INFO__STRING = 9;

	/**
	 * The operation id for the '<em>Generate Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GENERATE_RECEIPT__STRING = 10;

	/**
	 * The operation id for the '<em>Validate Reference Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___VALIDATE_REFERENCE_NUMBER__STRING = 11;

	/**
	 * The operation id for the '<em>Generate Quote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___GENERATE_QUOTE__DATE_DATE_STRING = 12;

	/**
	 * The operation id for the '<em>Search For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING___SEARCH_FOR_BOOKING__STRING = 13;

	/**
	 * The number of operations of the '<em>Booking Component IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_IBOOKING_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingComponent_GuestImpl <em>Booking Component Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingComponent_GuestImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_Guest()
	 * @generated
	 */
	int BOOKING_COMPONENT_GUEST = 30;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Booking Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking Component Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_COMPONENT_GUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.StaffComponentImpl <em>Staff Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.StaffComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent()
	 * @generated
	 */
	int STAFF_COMPONENT = 31;

	/**
	 * The number of structural features of the '<em>Staff Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Staff Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.StaffComponent_IAuthentication
	 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_IAuthentication()
	 * @generated
	 */
	int STAFF_COMPONENT_IAUTHENTICATION = 33;

	/**
	 * The number of structural features of the '<em>Staff Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = 1;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = 2;

	/**
	 * The number of operations of the '<em>Staff Component IAuthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.StaffComponent_AccountManagerImpl <em>Staff Component Account Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.StaffComponent_AccountManagerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_AccountManager()
	 * @generated
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER = 32;

	/**
	 * The number of structural features of the '<em>Staff Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_FEATURE_COUNT = STAFF_COMPONENT_IAUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_IN__STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___LOG_OUT__STRING = STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___IS_LOGGED_IN__STRING = STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___EDIT_ACCOUNT_DETAILS__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___REMOVE_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Staff Component Account Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_ACCOUNT_MANAGER_OPERATION_COUNT = STAFF_COMPONENT_IAUTHENTICATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.StaffComponent_IAccountAdministration
	 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_IAccountAdministration()
	 * @generated
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = 34;

	/**
	 * The number of structural features of the '<em>Staff Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Account Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING = 1;

	/**
	 * The operation id for the '<em>Remove Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = 2;

	/**
	 * The number of operations of the '<em>Staff Component IAccount Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_IACCOUNT_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.StaffComponent_EmployeeImpl <em>Staff Component Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.StaffComponent_EmployeeImpl
	 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_Employee()
	 * @generated
	 */
	int STAFF_COMPONENT_EMPLOYEE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__SSN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE__PASSWORD = 5;

	/**
	 * The number of structural features of the '<em>Staff Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___EMPLOYEE = 1;

	/**
	 * The operation id for the '<em>Get Employee Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING = 2;

	/**
	 * The number of operations of the '<em>Staff Component Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_COMPONENT_EMPLOYEE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomComponentImpl <em>Room Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomComponentImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent()
	 * @generated
	 */
	int ROOM_COMPONENT = 36;

	/**
	 * The number of structural features of the '<em>Room Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Room Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomComponent_RoomImpl <em>Room Component Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomComponent_RoomImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_Room()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM = 37;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__USABLE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Room Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Component Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomComponent_BedroomImpl <em>Room Component Bedroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomComponent_BedroomImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_Bedroom()
	 * @generated
	 */
	int ROOM_COMPONENT_BEDROOM = 38;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__ROOM_NUMBER = ROOM_COMPONENT_ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__USABLE = ROOM_COMPONENT_ROOM__USABLE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__PRICE = ROOM_COMPONENT_ROOM__PRICE;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__ROOM_TYPE_NAME = ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__DESCRIPTION = ROOM_COMPONENT_ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM__BED_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Component Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM_FEATURE_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Bedroom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM___CREATE_BEDROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room Component Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_BEDROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomComponent_ConferenceRoomImpl <em>Room Component Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomComponent_ConferenceRoomImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM = 39;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__ROOM_NUMBER = ROOM_COMPONENT_ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__USABLE = ROOM_COMPONENT_ROOM__USABLE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__PRICE = ROOM_COMPONENT_ROOM__PRICE;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__ROOM_TYPE_NAME = ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__DESCRIPTION = ROOM_COMPONENT_ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conference Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room Component Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM_FEATURE_COUNT = ROOM_COMPONENT_ROOM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room Component Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_CONFERENCE_ROOM_OPERATION_COUNT = ROOM_COMPONENT_ROOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.RoomComponent_IRoomAdministration
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomAdministration()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION = 40;

	/**
	 * The number of structural features of the '<em>Room Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = 2;

	/**
	 * The number of operations of the '<em>Room Component IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.RoomComponent_IRoomInformation
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomInformation()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION = 41;

	/**
	 * The number of structural features of the '<em>Room Component IRoom Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT = 0;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING = 1;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES = 2;

	/**
	 * The operation id for the '<em>Get All Room Numbers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS = 3;

	/**
	 * The operation id for the '<em>Count Number Of Total Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS = 4;

	/**
	 * The number of operations of the '<em>Room Component IRoom Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_INFORMATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link implementation.RoomComponent_IRoomDecision <em>Room Component IRoom Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.RoomComponent_IRoomDecision
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomDecision()
	 * @generated
	 */
	int ROOM_COMPONENT_IROOM_DECISION = 43;

	/**
	 * The number of structural features of the '<em>Room Component IRoom Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_DECISION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Room Component IRoom Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_IROOM_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomComponent_RoomHandlerImpl <em>Room Component Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomComponent_RoomHandlerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_RoomHandler()
	 * @generated
	 */
	int ROOM_COMPONENT_ROOM_HANDLER = 42;

	/**
	 * The number of structural features of the '<em>Room Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_FEATURE_COUNT = ROOM_COMPONENT_IROOM_DECISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Room Component Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_COMPONENT_ROOM_HANDLER_OPERATION_COUNT = ROOM_COMPONENT_IROOM_DECISION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link implementation.DecisionSupportComponent <em>Decision Support Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component</em>'.
	 * @see implementation.DecisionSupportComponent
	 * @generated
	 */
	EClass getDecisionSupportComponent();

	/**
	 * Returns the meta object for class '{@link implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component IDecision Support</em>'.
	 * @see implementation.DecisionSupportComponent_IDecisionSupport
	 * @generated
	 */
	EClass getDecisionSupportComponent_IDecisionSupport();

	/**
	 * Returns the meta object for class '{@link implementation.DecisionSupportComponent_DssProcessor <em>Decision Support Component Dss Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Dss Processor</em>'.
	 * @see implementation.DecisionSupportComponent_DssProcessor
	 * @generated
	 */
	EClass getDecisionSupportComponent_DssProcessor();

	/**
	 * Returns the meta object for class '{@link implementation.DecisionSupportComponent_DssPresenter <em>Decision Support Component Dss Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Dss Presenter</em>'.
	 * @see implementation.DecisionSupportComponent_DssPresenter
	 * @generated
	 */
	EClass getDecisionSupportComponent_DssPresenter();

	/**
	 * Returns the meta object for class '{@link implementation.DecisionSupportComponent_DssController <em>Decision Support Component Dss Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support Component Dss Controller</em>'.
	 * @see implementation.DecisionSupportComponent_DssController
	 * @generated
	 */
	EClass getDecisionSupportComponent_DssController();

	/**
	 * Returns the meta object for the reference list '{@link implementation.DecisionSupportComponent_DssController#getDssProcessor <em>Dss Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dss Processor</em>'.
	 * @see implementation.DecisionSupportComponent_DssController#getDssProcessor()
	 * @see #getDecisionSupportComponent_DssController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DssController_DssProcessor();

	/**
	 * Returns the meta object for the reference '{@link implementation.DecisionSupportComponent_DssController#getDssPresenter <em>Dss Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dss Presenter</em>'.
	 * @see implementation.DecisionSupportComponent_DssController#getDssPresenter()
	 * @see #getDecisionSupportComponent_DssController()
	 * @generated
	 */
	EReference getDecisionSupportComponent_DssController_DssPresenter();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component IOccupancy</em>'.
	 * @see implementation.OccupancyComponent_IOccupancy
	 * @generated
	 */
	EClass getOccupancyComponent_IOccupancy();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String) <em>Check In Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Guest</em>' operation.
	 * @see implementation.OccupancyComponent_IOccupancy#checkInGuest(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_IOccupancy#checkOutGuest(java.lang.String, java.lang.String, java.lang.String) <em>Check Out Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Guest</em>' operation.
	 * @see implementation.OccupancyComponent_IOccupancy#checkOutGuest(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_IOccupancy#listFreeRooms() <em>List Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Free Rooms</em>' operation.
	 * @see implementation.OccupancyComponent_IOccupancy#listFreeRooms()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__ListFreeRooms();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_IOccupancy#listGuestsInRoom(int) <em>List Guests In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Guests In Room</em>' operation.
	 * @see implementation.OccupancyComponent_IOccupancy#listGuestsInRoom(int)
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__ListGuestsInRoom__int();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_IOccupancy#numberOfGuestsInHotel() <em>Number Of Guests In Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Guests In Hotel</em>' operation.
	 * @see implementation.OccupancyComponent_IOccupancy#numberOfGuestsInHotel()
	 * @generated
	 */
	EOperation getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent <em>Occupancy Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component</em>'.
	 * @see implementation.OccupancyComponent
	 * @generated
	 */
	EClass getOccupancyComponent();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent_Occupancy <em>Occupancy Component Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Occupancy</em>'.
	 * @see implementation.OccupancyComponent_Occupancy
	 * @generated
	 */
	EClass getOccupancyComponent_Occupancy();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Occupancy#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see implementation.OccupancyComponent_Occupancy#getRoomNumber()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Occupancy#getCheckInDateTime <em>Check In Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date Time</em>'.
	 * @see implementation.OccupancyComponent_Occupancy#getCheckInDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckInDateTime();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Occupancy#getCheckOutDateTime <em>Check Out Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date Time</em>'.
	 * @see implementation.OccupancyComponent_Occupancy#getCheckOutDateTime()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_CheckOutDateTime();

	/**
	 * Returns the meta object for the reference list '{@link implementation.OccupancyComponent_Occupancy#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see implementation.OccupancyComponent_Occupancy#getGuest()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EReference getOccupancyComponent_Occupancy_Guest();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Occupancy#getBookingReference <em>Booking Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Reference</em>'.
	 * @see implementation.OccupancyComponent_Occupancy#getBookingReference()
	 * @see #getOccupancyComponent_Occupancy()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Occupancy_BookingReference();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_Occupancy#occupancy(int, int, implementation.OccupancyComponent_Guest, java.lang.String) <em>Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occupancy</em>' operation.
	 * @see implementation.OccupancyComponent_Occupancy#occupancy(int, int, implementation.OccupancyComponent_Guest, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent_Guest <em>Occupancy Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Guest</em>'.
	 * @see implementation.OccupancyComponent_Guest
	 * @generated
	 */
	EClass getOccupancyComponent_Guest();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Guest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see implementation.OccupancyComponent_Guest#getFirstName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.OccupancyComponent_Guest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see implementation.OccupancyComponent_Guest#getLastName()
	 * @see #getOccupancyComponent_Guest()
	 * @generated
	 */
	EAttribute getOccupancyComponent_Guest_LastName();

	/**
	 * Returns the meta object for the '{@link implementation.OccupancyComponent_Guest#guest(java.lang.String, java.lang.String) <em>Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guest</em>' operation.
	 * @see implementation.OccupancyComponent_Guest#guest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getOccupancyComponent_Guest__Guest__String_String();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component IOccupancy Decision</em>'.
	 * @see implementation.OccupancyComponent_IOccupancyDecision
	 * @generated
	 */
	EClass getOccupancyComponent_IOccupancyDecision();

	/**
	 * Returns the meta object for class '{@link implementation.OccupancyComponent_OccupancyHandler <em>Occupancy Component Occupancy Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupancy Component Occupancy Handler</em>'.
	 * @see implementation.OccupancyComponent_OccupancyHandler
	 * @generated
	 */
	EClass getOccupancyComponent_OccupancyHandler();

	/**
	 * Returns the meta object for class '{@link implementation.PaymentComponent <em>Payment Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component</em>'.
	 * @see implementation.PaymentComponent
	 * @generated
	 */
	EClass getPaymentComponent();

	/**
	 * Returns the meta object for class '{@link implementation.PaymentComponent_PaymentManager <em>Payment Component Payment Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component Payment Manager</em>'.
	 * @see implementation.PaymentComponent_PaymentManager
	 * @generated
	 */
	EClass getPaymentComponent_PaymentManager();

	/**
	 * Returns the meta object for the attribute '{@link implementation.PaymentComponent_PaymentManager#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Details</em>'.
	 * @see implementation.PaymentComponent_PaymentManager#getPaymentDetails()
	 * @see #getPaymentComponent_PaymentManager()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentManager_PaymentDetails();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentManager#makePayment(java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see implementation.PaymentComponent_PaymentManager#makePayment(java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentManager#isCreditCardValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see implementation.PaymentComponent_PaymentManager#isCreditCardValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String();

	/**
	 * Returns the meta object for class '{@link implementation.PaymentComponent_PaymentCalculator <em>Payment Component Payment Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component Payment Calculator</em>'.
	 * @see implementation.PaymentComponent_PaymentCalculator
	 * @generated
	 */
	EClass getPaymentComponent_PaymentCalculator();

	/**
	 * Returns the meta object for the attribute '{@link implementation.PaymentComponent_PaymentCalculator#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see implementation.PaymentComponent_PaymentCalculator#getCost()
	 * @see #getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentCalculator_Cost();

	/**
	 * Returns the meta object for the attribute list '{@link implementation.PaymentComponent_PaymentCalculator#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Details</em>'.
	 * @see implementation.PaymentComponent_PaymentCalculator#getDetails()
	 * @see #getPaymentComponent_PaymentCalculator()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentCalculator_Details();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentCalculator#calculate(int, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, boolean) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see implementation.PaymentComponent_PaymentCalculator#calculate(int, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentCalculator#checkLateCancellation(java.lang.String, java.lang.String) <em>Check Late Cancellation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Late Cancellation</em>' operation.
	 * @see implementation.PaymentComponent_PaymentCalculator#checkLateCancellation(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String();

	/**
	 * Returns the meta object for class '{@link implementation.PaymentComponent_PaymentHistoryDb <em>Payment Component Payment History Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component Payment History Db</em>'.
	 * @see implementation.PaymentComponent_PaymentHistoryDb
	 * @generated
	 */
	EClass getPaymentComponent_PaymentHistoryDb();

	/**
	 * Returns the meta object for the attribute '{@link implementation.PaymentComponent_PaymentHistoryDb#getPaymentHistory <em>Payment History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment History</em>'.
	 * @see implementation.PaymentComponent_PaymentHistoryDb#getPaymentHistory()
	 * @see #getPaymentComponent_PaymentHistoryDb()
	 * @generated
	 */
	EAttribute getPaymentComponent_PaymentHistoryDb_PaymentHistory();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentHistoryDb#createPaymentHistory(int, java.lang.String, java.lang.String) <em>Create Payment History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Payment History</em>' operation.
	 * @see implementation.PaymentComponent_PaymentHistoryDb#createPaymentHistory(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentHistoryDb__CreatePaymentHistory__int_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_PaymentHistoryDb#searchForPayment(java.lang.String) <em>Search For Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Payment</em>' operation.
	 * @see implementation.PaymentComponent_PaymentHistoryDb#searchForPayment(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_PaymentHistoryDb__SearchForPayment__String();

	/**
	 * Returns the meta object for class '{@link implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Component IPayment</em>'.
	 * @see implementation.PaymentComponent_IPayment
	 * @generated
	 */
	EClass getPaymentComponent_IPayment();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_IPayment#payForBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Pay For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay For Booking</em>' operation.
	 * @see implementation.PaymentComponent_IPayment#payForBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_IPayment#reserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Reserve Funds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserve Funds</em>' operation.
	 * @see implementation.PaymentComponent_IPayment#reserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.PaymentComponent_IPayment#unreserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Unreserve Funds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unreserve Funds</em>' operation.
	 * @see implementation.PaymentComponent_IPayment#unreserveFunds(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent <em>Additional Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component</em>'.
	 * @see implementation.AdditionalServiceComponent
	 * @generated
	 */
	EClass getAdditionalServiceComponent();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent_AdditionalService <em>Additional Service Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component Additional Service</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService#getName()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalService#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService#isUsable()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Usable();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService#getPrice()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Price();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalService#getMaxAttendant <em>Max Attendant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attendant</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService#getMaxAttendant()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_MaxAttendant();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalService#getDescription()
	 * @see #getAdditionalServiceComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalService_Description();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceDecision <em>Additional Service Component IAdditional Service Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component IAdditional Service Decision</em>'.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceDecision
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceDecision();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent <em>Additional Service Component Additional Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component Additional Service Event</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent
	 * @generated
	 */
	EClass getAdditionalServiceComponent_AdditionalServiceEvent();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getDateTime()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getName()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getLocation()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Location();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getPrice()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_Price();

	/**
	 * Returns the meta object for the attribute '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant <em>Max Attendant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attendant</em>'.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getMaxAttendant()
	 * @see #getAdditionalServiceComponent_AdditionalServiceEvent()
	 * @generated
	 */
	EAttribute getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_AdditionalServiceEvent#getAdditionalServiceInfo(java.lang.String) <em>Get Additional Service Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Additional Service Info</em>' operation.
	 * @see implementation.AdditionalServiceComponent_AdditionalServiceEvent#getAdditionalServiceInfo(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component IAdditional Service Administration</em>'.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceAdministration();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, int, int) <em>Create Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Additional Service</em>' operation.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#createAdditionalService(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, int, int) <em>Edit Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Additional Service</em>' operation.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#editAdditionalService(java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String) <em>Remove Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service</em>' operation.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration#removeAdditionalService(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

	/**
	 * Returns the meta object for class '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation <em>Additional Service Component IAdditional Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Service Component IAdditional Service Information</em>'.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation
	 * @generated
	 */
	EClass getAdditionalServiceComponent_IAdditionalServiceInformation();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation#getAdditionalServiceInfo(java.lang.String) <em>Get Additional Service Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Additional Service Info</em>' operation.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation#getAdditionalServiceInfo(java.lang.String)
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String();

	/**
	 * Returns the meta object for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation#getAllAdditionalServices() <em>Get All Additional Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Additional Services</em>' operation.
	 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation#getAllAdditionalServices()
	 * @generated
	 */
	EOperation getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent <em>Booking Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component</em>'.
	 * @see implementation.BookingComponent
	 * @generated
	 */
	EClass getBookingComponent();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_PaymentDetails <em>Booking Component Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Payment Details</em>'.
	 * @see implementation.BookingComponent_PaymentDetails
	 * @generated
	 */
	EClass getBookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getFirstName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getLastName()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_LastName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getAddress()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Address();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getCcNumber()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getCcv()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getExpiryMonth()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_PaymentDetails#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see implementation.BookingComponent_PaymentDetails#getExpiryYear()
	 * @see #getBookingComponent_PaymentDetails()
	 * @generated
	 */
	EAttribute getBookingComponent_PaymentDetails_ExpiryYear();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_Booking <em>Booking Component Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Booking</em>'.
	 * @see implementation.BookingComponent_Booking
	 * @generated
	 */
	EClass getBookingComponent_Booking();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Booking#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see implementation.BookingComponent_Booking#getArrivalDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_ArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Booking#getDepartureDate <em>Departure Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Date</em>'.
	 * @see implementation.BookingComponent_Booking#getDepartureDate()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_DepartureDate();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Booking#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see implementation.BookingComponent_Booking#getReferenceNumber()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_ReferenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Booking#getCurrentCost <em>Current Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Cost</em>'.
	 * @see implementation.BookingComponent_Booking#getCurrentCost()
	 * @see #getBookingComponent_Booking()
	 * @generated
	 */
	EAttribute getBookingComponent_Booking_CurrentCost();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#bookingObject() <em>Booking Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Object</em>' operation.
	 * @see implementation.BookingComponent_Booking#bookingObject()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__BookingObject();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#booking(java.util.Date, java.util.Date) <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#booking(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__Booking__Date_Date();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#addAdditionalServiceToBooking(implementation.BookingComponent_AdditionalService) <em>Add Additional Service To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service To Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#addAdditionalServiceToBooking(implementation.BookingComponent_AdditionalService)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#addRoomToBooking(implementation.BookingComponent_RoomType) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#addRoomToBooking(implementation.BookingComponent_RoomType)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#removeRoomFromBooking(java.lang.String) <em>Remove Room From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room From Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#removeRoomFromBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveRoomFromBooking__String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#updateBooking(java.lang.String, java.util.Date, java.util.Date) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#updateBooking(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdateBooking__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#removeAdditionalServiceFromBooking(implementation.BookingComponent_AdditionalService) <em>Remove Additional Service From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Additional Service From Booking</em>' operation.
	 * @see implementation.BookingComponent_Booking#removeAdditionalServiceFromBooking(implementation.BookingComponent_AdditionalService)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#currentCost() <em>Current Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Cost</em>' operation.
	 * @see implementation.BookingComponent_Booking#currentCost()
	 * @generated
	 */
	EOperation getBookingComponent_Booking__CurrentCost();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_Booking#updatePaymentDetails(implementation.BookingComponent_PaymentDetails) <em>Update Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Payment Details</em>' operation.
	 * @see implementation.BookingComponent_Booking#updatePaymentDetails(implementation.BookingComponent_PaymentDetails)
	 * @generated
	 */
	EOperation getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_AdditionalService <em>Booking Component Additional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Additional Service</em>'.
	 * @see implementation.BookingComponent_AdditionalService
	 * @generated
	 */
	EClass getBookingComponent_AdditionalService();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_AdditionalService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.BookingComponent_AdditionalService#getName()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_AdditionalService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see implementation.BookingComponent_AdditionalService#getDescription()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Description();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_AdditionalService#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see implementation.BookingComponent_AdditionalService#getCost()
	 * @see #getBookingComponent_AdditionalService()
	 * @generated
	 */
	EAttribute getBookingComponent_AdditionalService_Cost();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_RoomType <em>Booking Component Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Room Type</em>'.
	 * @see implementation.BookingComponent_RoomType
	 * @generated
	 */
	EClass getBookingComponent_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_RoomType#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see implementation.BookingComponent_RoomType#getRoomType()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_RoomType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see implementation.BookingComponent_RoomType#getCost()
	 * @see #getBookingComponent_RoomType()
	 * @generated
	 */
	EAttribute getBookingComponent_RoomType_Cost();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_BookingManager <em>Booking Component Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Booking Manager</em>'.
	 * @see implementation.BookingComponent_BookingManager
	 * @generated
	 */
	EClass getBookingComponent_BookingManager();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_BookingManager#bookingManager() <em>Booking Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Manager</em>' operation.
	 * @see implementation.BookingComponent_BookingManager#bookingManager()
	 * @generated
	 */
	EOperation getBookingComponent_BookingManager__BookingManager();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component IBooking Decision</em>'.
	 * @see implementation.BookingComponent_IBookingDecision
	 * @generated
	 */
	EClass getBookingComponent_IBookingDecision();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_IBooking <em>Booking Component IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component IBooking</em>'.
	 * @see implementation.BookingComponent_IBooking
	 * @generated
	 */
	EClass getBookingComponent_IBooking();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#searchRooms(java.lang.String, int, java.util.Date, java.util.Date) <em>Search Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Rooms</em>' operation.
	 * @see implementation.BookingComponent_IBooking#searchRooms(java.lang.String, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__SearchRooms__String_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#makeBooking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see implementation.BookingComponent_IBooking#makeBooking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#addRoom(java.lang.String, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see implementation.BookingComponent_IBooking#addRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__AddRoom__String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#requestQuote(java.lang.String, int, java.util.Date, java.util.Date) <em>Request Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Quote</em>' operation.
	 * @see implementation.BookingComponent_IBooking#requestQuote(java.lang.String, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RequestQuote__String_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#editBooking(java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see implementation.BookingComponent_IBooking#editBooking(java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see implementation.BookingComponent_IBooking#cancelBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__CancelBooking__String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#addAdditionalService(java.lang.String, java.lang.String) <em>Add Additional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Additional Service</em>' operation.
	 * @see implementation.BookingComponent_IBooking#addAdditionalService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__AddAdditionalService__String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#removeRoom(java.lang.String, java.lang.String) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see implementation.BookingComponent_IBooking#removeRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RemoveRoom__String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#removeAddionalService(java.lang.String, java.lang.String) <em>Remove Addional Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Addional Service</em>' operation.
	 * @see implementation.BookingComponent_IBooking#removeAddionalService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__RemoveAddionalService__String_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#getBookingInfo(java.lang.String) <em>Get Booking Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Info</em>' operation.
	 * @see implementation.BookingComponent_IBooking#getBookingInfo(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GetBookingInfo__String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#generateReceipt(java.lang.String) <em>Generate Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Receipt</em>' operation.
	 * @see implementation.BookingComponent_IBooking#generateReceipt(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GenerateReceipt__String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#validateReferenceNumber(java.lang.String) <em>Validate Reference Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Reference Number</em>' operation.
	 * @see implementation.BookingComponent_IBooking#validateReferenceNumber(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__ValidateReferenceNumber__String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#generateQuote(java.util.Date, java.util.Date, java.lang.String) <em>Generate Quote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Quote</em>' operation.
	 * @see implementation.BookingComponent_IBooking#generateQuote(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__GenerateQuote__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link implementation.BookingComponent_IBooking#searchForBooking(java.lang.String) <em>Search For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Booking</em>' operation.
	 * @see implementation.BookingComponent_IBooking#searchForBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingComponent_IBooking__SearchForBooking__String();

	/**
	 * Returns the meta object for class '{@link implementation.BookingComponent_Guest <em>Booking Component Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Component Guest</em>'.
	 * @see implementation.BookingComponent_Guest
	 * @generated
	 */
	EClass getBookingComponent_Guest();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Guest#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see implementation.BookingComponent_Guest#getFirstName()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Guest#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see implementation.BookingComponent_Guest#getLastName()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_LastName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.BookingComponent_Guest#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see implementation.BookingComponent_Guest#getAddress()
	 * @see #getBookingComponent_Guest()
	 * @generated
	 */
	EAttribute getBookingComponent_Guest_Address();

	/**
	 * Returns the meta object for class '{@link implementation.StaffComponent <em>Staff Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component</em>'.
	 * @see implementation.StaffComponent
	 * @generated
	 */
	EClass getStaffComponent();

	/**
	 * Returns the meta object for class '{@link implementation.StaffComponent_AccountManager <em>Staff Component Account Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component Account Manager</em>'.
	 * @see implementation.StaffComponent_AccountManager
	 * @generated
	 */
	EClass getStaffComponent_AccountManager();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_AccountManager#findAccount(java.lang.String) <em>Find Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Account</em>' operation.
	 * @see implementation.StaffComponent_AccountManager#findAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_AccountManager__FindAccount__String();

	/**
	 * Returns the meta object for class '{@link implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component IAuthentication</em>'.
	 * @see implementation.StaffComponent_IAuthentication
	 * @generated
	 */
	EClass getStaffComponent_IAuthentication();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String) <em>Log In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In</em>' operation.
	 * @see implementation.StaffComponent_IAuthentication#logIn(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogIn__String_String();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAuthentication#logOut(java.lang.String) <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see implementation.StaffComponent_IAuthentication#logOut(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__LogOut__String();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAuthentication#isLoggedIn(java.lang.String) <em>Is Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Logged In</em>' operation.
	 * @see implementation.StaffComponent_IAuthentication#isLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAuthentication__IsLoggedIn__String();

	/**
	 * Returns the meta object for class '{@link implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component IAccount Administration</em>'.
	 * @see implementation.StaffComponent_IAccountAdministration
	 * @generated
	 */
	EClass getStaffComponent_IAccountAdministration();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Account</em>' operation.
	 * @see implementation.StaffComponent_IAccountAdministration#createAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String) <em>Edit Account Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Account Details</em>' operation.
	 * @see implementation.StaffComponent_IAccountAdministration#editAccountDetails(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__EditAccountDetails__String();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_IAccountAdministration#removeAccount(java.lang.String) <em>Remove Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Account</em>' operation.
	 * @see implementation.StaffComponent_IAccountAdministration#removeAccount(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_IAccountAdministration__RemoveAccount__String();

	/**
	 * Returns the meta object for class '{@link implementation.StaffComponent_Employee <em>Staff Component Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Component Employee</em>'.
	 * @see implementation.StaffComponent_Employee
	 * @generated
	 */
	EClass getStaffComponent_Employee();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see implementation.StaffComponent_Employee#getId()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Id();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see implementation.StaffComponent_Employee#getSsn()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Ssn();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.StaffComponent_Employee#getName()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see implementation.StaffComponent_Employee#getEmail()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Email();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see implementation.StaffComponent_Employee#getPhone()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Phone();

	/**
	 * Returns the meta object for the attribute '{@link implementation.StaffComponent_Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see implementation.StaffComponent_Employee#getPassword()
	 * @see #getStaffComponent_Employee()
	 * @generated
	 */
	EAttribute getStaffComponent_Employee_Password();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_Employee#employee(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employee</em>' operation.
	 * @see implementation.StaffComponent_Employee#employee(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_Employee__Employee__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_Employee#employee() <em>Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employee</em>' operation.
	 * @see implementation.StaffComponent_Employee#employee()
	 * @generated
	 */
	EOperation getStaffComponent_Employee__Employee();

	/**
	 * Returns the meta object for the '{@link implementation.StaffComponent_Employee#getEmployeeInfo(java.lang.String) <em>Get Employee Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Employee Info</em>' operation.
	 * @see implementation.StaffComponent_Employee#getEmployeeInfo(java.lang.String)
	 * @generated
	 */
	EOperation getStaffComponent_Employee__GetEmployeeInfo__String();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent <em>Room Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component</em>'.
	 * @see implementation.RoomComponent
	 * @generated
	 */
	EClass getRoomComponent();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_Room <em>Room Component Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Room</em>'.
	 * @see implementation.RoomComponent_Room
	 * @generated
	 */
	EClass getRoomComponent_Room();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see implementation.RoomComponent_Room#getRoomNumber()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Room#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see implementation.RoomComponent_Room#isUsable()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Usable();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Room#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see implementation.RoomComponent_Room#getPrice()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Price();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Room#getRoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Name</em>'.
	 * @see implementation.RoomComponent_Room#getRoomTypeName()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_RoomTypeName();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see implementation.RoomComponent_Room#getDescription()
	 * @see #getRoomComponent_Room()
	 * @generated
	 */
	EAttribute getRoomComponent_Room_Description();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_Bedroom <em>Room Component Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Bedroom</em>'.
	 * @see implementation.RoomComponent_Bedroom
	 * @generated
	 */
	EClass getRoomComponent_Bedroom();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_Bedroom#getBedCount <em>Bed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bed Count</em>'.
	 * @see implementation.RoomComponent_Bedroom#getBedCount()
	 * @see #getRoomComponent_Bedroom()
	 * @generated
	 */
	EAttribute getRoomComponent_Bedroom_BedCount();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Create Bedroom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bedroom</em>' operation.
	 * @see implementation.RoomComponent_Bedroom#createBedroom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see implementation.RoomComponent_Bedroom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_ConferenceRoom <em>Room Component Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Conference Room</em>'.
	 * @see implementation.RoomComponent_ConferenceRoom
	 * @generated
	 */
	EClass getRoomComponent_ConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_ConferenceRoom#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see implementation.RoomComponent_ConferenceRoom#getNumberOfSeats()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_ConferenceRoom#isProjector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projector</em>'.
	 * @see implementation.RoomComponent_ConferenceRoom#isProjector()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_Projector();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomComponent_ConferenceRoom#isConferencePhone <em>Conference Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Phone</em>'.
	 * @see implementation.RoomComponent_ConferenceRoom#isConferencePhone()
	 * @see #getRoomComponent_ConferenceRoom()
	 * @generated
	 */
	EAttribute getRoomComponent_ConferenceRoom_ConferencePhone();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Create Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Conference Room</em>' operation.
	 * @see implementation.RoomComponent_ConferenceRoom#createConferenceRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see implementation.RoomComponent_ConferenceRoom#editRoom(int, boolean, int, java.lang.String, java.lang.String, int, boolean, boolean)
	 * @generated
	 */
	EOperation getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component IRoom Administration</em>'.
	 * @see implementation.RoomComponent_IRoomAdministration
	 * @generated
	 */
	EClass getRoomComponent_IRoomAdministration();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomAdministration#createRoom(int, boolean, int, java.lang.String, java.lang.String) <em>Create Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room</em>' operation.
	 * @see implementation.RoomComponent_IRoomAdministration#createRoom(int, boolean, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomAdministration#editRoom(int, boolean, int, java.lang.String, java.lang.String) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see implementation.RoomComponent_IRoomAdministration#editRoom(int, boolean, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomAdministration#remove(int) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see implementation.RoomComponent_IRoomAdministration#remove(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomAdministration__Remove__int();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component IRoom Information</em>'.
	 * @see implementation.RoomComponent_IRoomInformation
	 * @generated
	 */
	EClass getRoomComponent_IRoomInformation();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomInformation#getRoomInfo(int) <em>Get Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Info</em>' operation.
	 * @see implementation.RoomComponent_IRoomInformation#getRoomInfo(int)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomInfo__int();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomInformation#searchRoom(java.lang.String) <em>Search Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room</em>' operation.
	 * @see implementation.RoomComponent_IRoomInformation#searchRoom(java.lang.String)
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__SearchRoom__String();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomInformation#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see implementation.RoomComponent_IRoomInformation#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomInformation#getAllRoomNumbers() <em>Get All Room Numbers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Numbers</em>' operation.
	 * @see implementation.RoomComponent_IRoomInformation#getAllRoomNumbers()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__GetAllRoomNumbers();

	/**
	 * Returns the meta object for the '{@link implementation.RoomComponent_IRoomInformation#countNumberOfTotalRooms() <em>Count Number Of Total Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Number Of Total Rooms</em>' operation.
	 * @see implementation.RoomComponent_IRoomInformation#countNumberOfTotalRooms()
	 * @generated
	 */
	EOperation getRoomComponent_IRoomInformation__CountNumberOfTotalRooms();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_RoomHandler <em>Room Component Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component Room Handler</em>'.
	 * @see implementation.RoomComponent_RoomHandler
	 * @generated
	 */
	EClass getRoomComponent_RoomHandler();

	/**
	 * Returns the meta object for class '{@link implementation.RoomComponent_IRoomDecision <em>Room Component IRoom Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Component IRoom Decision</em>'.
	 * @see implementation.RoomComponent_IRoomDecision
	 * @generated
	 */
	EClass getRoomComponent_IRoomDecision();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationFactory getImplementationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link implementation.impl.DecisionSupportComponentImpl <em>Decision Support Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.DecisionSupportComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT = eINSTANCE.getDecisionSupportComponent();

		/**
		 * The meta object literal for the '{@link implementation.DecisionSupportComponent_IDecisionSupport <em>Decision Support Component IDecision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.DecisionSupportComponent_IDecisionSupport
		 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_IDecisionSupport()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_IDECISION_SUPPORT = eINSTANCE.getDecisionSupportComponent_IDecisionSupport();

		/**
		 * The meta object literal for the '{@link implementation.impl.DecisionSupportComponent_DssProcessorImpl <em>Decision Support Component Dss Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.DecisionSupportComponent_DssProcessorImpl
		 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssProcessor()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_DSS_PROCESSOR = eINSTANCE.getDecisionSupportComponent_DssProcessor();

		/**
		 * The meta object literal for the '{@link implementation.impl.DecisionSupportComponent_DssPresenterImpl <em>Decision Support Component Dss Presenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.DecisionSupportComponent_DssPresenterImpl
		 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssPresenter()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_DSS_PRESENTER = eINSTANCE.getDecisionSupportComponent_DssPresenter();

		/**
		 * The meta object literal for the '{@link implementation.impl.DecisionSupportComponent_DssControllerImpl <em>Decision Support Component Dss Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.DecisionSupportComponent_DssControllerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getDecisionSupportComponent_DssController()
		 * @generated
		 */
		EClass DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER = eINSTANCE.getDecisionSupportComponent_DssController();

		/**
		 * The meta object literal for the '<em><b>Dss Processor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PROCESSOR = eINSTANCE.getDecisionSupportComponent_DssController_DssProcessor();

		/**
		 * The meta object literal for the '<em><b>Dss Presenter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT_COMPONENT_DSS_CONTROLLER__DSS_PRESENTER = eINSTANCE.getDecisionSupportComponent_DssController_DssPresenter();

		/**
		 * The meta object literal for the '{@link implementation.OccupancyComponent_IOccupancy <em>Occupancy Component IOccupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.OccupancyComponent_IOccupancy
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancy()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_IOCCUPANCY = eINSTANCE.getOccupancyComponent_IOccupancy();

		/**
		 * The meta object literal for the '<em><b>Check In Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_IN_GUEST__STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckInGuest__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Out Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___CHECK_OUT_GUEST__STRING_STRING_STRING = eINSTANCE.getOccupancyComponent_IOccupancy__CheckOutGuest__String_String_String();

		/**
		 * The meta object literal for the '<em><b>List Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_FREE_ROOMS = eINSTANCE.getOccupancyComponent_IOccupancy__ListFreeRooms();

		/**
		 * The meta object literal for the '<em><b>List Guests In Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___LIST_GUESTS_IN_ROOM__INT = eINSTANCE.getOccupancyComponent_IOccupancy__ListGuestsInRoom__int();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests In Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_IOCCUPANCY___NUMBER_OF_GUESTS_IN_HOTEL = eINSTANCE.getOccupancyComponent_IOccupancy__NumberOfGuestsInHotel();

		/**
		 * The meta object literal for the '{@link implementation.impl.OccupancyComponentImpl <em>Occupancy Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.OccupancyComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT = eINSTANCE.getOccupancyComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.OccupancyComponent_OccupancyImpl <em>Occupancy Component Occupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.OccupancyComponent_OccupancyImpl
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Occupancy()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_OCCUPANCY = eINSTANCE.getOccupancyComponent_Occupancy();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__ROOM_NUMBER = eINSTANCE.getOccupancyComponent_Occupancy_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Check In Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_IN_DATE_TIME = eINSTANCE.getOccupancyComponent_Occupancy_CheckInDateTime();

		/**
		 * The meta object literal for the '<em><b>Check Out Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__CHECK_OUT_DATE_TIME = eINSTANCE.getOccupancyComponent_Occupancy_CheckOutDateTime();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCUPANCY_COMPONENT_OCCUPANCY__GUEST = eINSTANCE.getOccupancyComponent_Occupancy_Guest();

		/**
		 * The meta object literal for the '<em><b>Booking Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_OCCUPANCY__BOOKING_REFERENCE = eINSTANCE.getOccupancyComponent_Occupancy_BookingReference();

		/**
		 * The meta object literal for the '<em><b>Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_OCCUPANCY___OCCUPANCY__INT_INT_OCCUPANCYCOMPONENT_GUEST_STRING = eINSTANCE.getOccupancyComponent_Occupancy__Occupancy__int_int_OccupancyComponent_Guest_String();

		/**
		 * The meta object literal for the '{@link implementation.impl.OccupancyComponent_GuestImpl <em>Occupancy Component Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.OccupancyComponent_GuestImpl
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_Guest()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_GUEST = eINSTANCE.getOccupancyComponent_Guest();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_GUEST__FIRST_NAME = eINSTANCE.getOccupancyComponent_Guest_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCUPANCY_COMPONENT_GUEST__LAST_NAME = eINSTANCE.getOccupancyComponent_Guest_LastName();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCCUPANCY_COMPONENT_GUEST___GUEST__STRING_STRING = eINSTANCE.getOccupancyComponent_Guest__Guest__String_String();

		/**
		 * The meta object literal for the '{@link implementation.OccupancyComponent_IOccupancyDecision <em>Occupancy Component IOccupancy Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.OccupancyComponent_IOccupancyDecision
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_IOccupancyDecision()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_IOCCUPANCY_DECISION = eINSTANCE.getOccupancyComponent_IOccupancyDecision();

		/**
		 * The meta object literal for the '{@link implementation.impl.OccupancyComponent_OccupancyHandlerImpl <em>Occupancy Component Occupancy Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.OccupancyComponent_OccupancyHandlerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getOccupancyComponent_OccupancyHandler()
		 * @generated
		 */
		EClass OCCUPANCY_COMPONENT_OCCUPANCY_HANDLER = eINSTANCE.getOccupancyComponent_OccupancyHandler();

		/**
		 * The meta object literal for the '{@link implementation.impl.PaymentComponentImpl <em>Payment Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.PaymentComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT = eINSTANCE.getPaymentComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.PaymentComponent_PaymentManagerImpl <em>Payment Component Payment Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.PaymentComponent_PaymentManagerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentManager()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_MANAGER = eINSTANCE.getPaymentComponent_PaymentManager();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_MANAGER__PAYMENT_DETAILS = eINSTANCE.getPaymentComponent_PaymentManager_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_MANAGER___MAKE_PAYMENT__STRING_INT_INT_INT_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentManager__MakePayment__String_int_int_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_MANAGER___IS_CREDIT_CARD_VALID__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentManager__IsCreditCardValid__String_String_String_String_String_String();

		/**
		 * The meta object literal for the '{@link implementation.impl.PaymentComponent_PaymentCalculatorImpl <em>Payment Component Payment Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.PaymentComponent_PaymentCalculatorImpl
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentCalculator()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_CALCULATOR = eINSTANCE.getPaymentComponent_PaymentCalculator();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST = eINSTANCE.getPaymentComponent_PaymentCalculator_Cost();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS = eINSTANCE.getPaymentComponent_PaymentCalculator_Details();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN = eINSTANCE.getPaymentComponent_PaymentCalculator__Calculate__int_EList_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Check Late Cancellation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING = eINSTANCE.getPaymentComponent_PaymentCalculator__CheckLateCancellation__String_String();

		/**
		 * The meta object literal for the '{@link implementation.impl.PaymentComponent_PaymentHistoryDbImpl <em>Payment Component Payment History Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.PaymentComponent_PaymentHistoryDbImpl
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_PaymentHistoryDb()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_PAYMENT_HISTORY_DB = eINSTANCE.getPaymentComponent_PaymentHistoryDb();

		/**
		 * The meta object literal for the '<em><b>Payment History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_COMPONENT_PAYMENT_HISTORY_DB__PAYMENT_HISTORY = eINSTANCE.getPaymentComponent_PaymentHistoryDb_PaymentHistory();

		/**
		 * The meta object literal for the '<em><b>Create Payment History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___CREATE_PAYMENT_HISTORY__INT_STRING_STRING = eINSTANCE.getPaymentComponent_PaymentHistoryDb__CreatePaymentHistory__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Search For Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_PAYMENT_HISTORY_DB___SEARCH_FOR_PAYMENT__STRING = eINSTANCE.getPaymentComponent_PaymentHistoryDb__SearchForPayment__String();

		/**
		 * The meta object literal for the '{@link implementation.PaymentComponent_IPayment <em>Payment Component IPayment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.PaymentComponent_IPayment
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentComponent_IPayment()
		 * @generated
		 */
		EClass PAYMENT_COMPONENT_IPAYMENT = eINSTANCE.getPaymentComponent_IPayment();

		/**
		 * The meta object literal for the '<em><b>Pay For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___PAY_FOR_BOOKING__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__PayForBooking__int_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Reserve Funds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___RESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__ReserveFunds__int_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Unreserve Funds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_COMPONENT_IPAYMENT___UNRESERVE_FUNDS__INT_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getPaymentComponent_IPayment__UnreserveFunds__int_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '{@link implementation.impl.AdditionalServiceComponentImpl <em>Additional Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.AdditionalServiceComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT = eINSTANCE.getAdditionalServiceComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl <em>Additional Service Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.AdditionalServiceComponent_AdditionalServiceImpl
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalService()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__NAME = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Name();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__USABLE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Usable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__PRICE = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Price();

		/**
		 * The meta object literal for the '<em><b>Max Attendant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__MAX_ATTENDANT = eINSTANCE.getAdditionalServiceComponent_AdditionalService_MaxAttendant();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = eINSTANCE.getAdditionalServiceComponent_AdditionalService_Description();

		/**
		 * The meta object literal for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceDecision <em>Additional Service Component IAdditional Service Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.AdditionalServiceComponent_IAdditionalServiceDecision
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceDecision()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_DECISION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceDecision();

		/**
		 * The meta object literal for the '{@link implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl <em>Additional Service Component Additional Service Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.AdditionalServiceComponent_AdditionalServiceEventImpl
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_AdditionalServiceEvent()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__DATE_TIME = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_DateTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__NAME = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__LOCATION = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Location();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__PRICE = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_Price();

		/**
		 * The meta object literal for the '<em><b>Max Attendant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT__MAX_ATTENDANT = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent_MaxAttendant();

		/**
		 * The meta object literal for the '<em><b>Get Additional Service Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_ADDITIONAL_SERVICE_EVENT___GET_ADDITIONAL_SERVICE_INFO__STRING = eINSTANCE.getAdditionalServiceComponent_AdditionalServiceEvent__GetAdditionalServiceInfo__String();

		/**
		 * The meta object literal for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceAdministration <em>Additional Service Component IAdditional Service Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.AdditionalServiceComponent_IAdditionalServiceAdministration
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceAdministration()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___CREATE_ADDITIONAL_SERVICE__STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__CreateAdditionalService__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___EDIT_ADDITIONAL_SERVICE__STRING_STRING_INT_INT = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__EditAdditionalService__String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_ADMINISTRATION___REMOVE_ADDITIONAL_SERVICE__STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceAdministration__RemoveAdditionalService__String();

		/**
		 * The meta object literal for the '{@link implementation.AdditionalServiceComponent_IAdditionalServiceInformation <em>Additional Service Component IAdditional Service Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.AdditionalServiceComponent_IAdditionalServiceInformation
		 * @see implementation.impl.ImplementationPackageImpl#getAdditionalServiceComponent_IAdditionalServiceInformation()
		 * @generated
		 */
		EClass ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation();

		/**
		 * The meta object literal for the '<em><b>Get Additional Service Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ADDITIONAL_SERVICE_INFO__STRING = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation__GetAdditionalServiceInfo__String();

		/**
		 * The meta object literal for the '<em><b>Get All Additional Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDITIONAL_SERVICE_COMPONENT_IADDITIONAL_SERVICE_INFORMATION___GET_ALL_ADDITIONAL_SERVICES = eINSTANCE.getAdditionalServiceComponent_IAdditionalServiceInformation__GetAllAdditionalServices();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponentImpl <em>Booking Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent()
		 * @generated
		 */
		EClass BOOKING_COMPONENT = eINSTANCE.getBookingComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_PaymentDetailsImpl <em>Booking Component Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_PaymentDetailsImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_PaymentDetails()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_PAYMENT_DETAILS = eINSTANCE.getBookingComponent_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__FIRST_NAME = eINSTANCE.getBookingComponent_PaymentDetails_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__LAST_NAME = eINSTANCE.getBookingComponent_PaymentDetails_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__ADDRESS = eINSTANCE.getBookingComponent_PaymentDetails_Address();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__CC_NUMBER = eINSTANCE.getBookingComponent_PaymentDetails_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__CCV = eINSTANCE.getBookingComponent_PaymentDetails_Ccv();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_MONTH = eINSTANCE.getBookingComponent_PaymentDetails_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_PAYMENT_DETAILS__EXPIRY_YEAR = eINSTANCE.getBookingComponent_PaymentDetails_ExpiryYear();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_BookingImpl <em>Booking Component Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_BookingImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_Booking()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING = eINSTANCE.getBookingComponent_Booking();

		/**
		 * The meta object literal for the '<em><b>Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__ARRIVAL_DATE = eINSTANCE.getBookingComponent_Booking_ArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Departure Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__DEPARTURE_DATE = eINSTANCE.getBookingComponent_Booking_DepartureDate();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__REFERENCE_NUMBER = eINSTANCE.getBookingComponent_Booking_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Current Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_BOOKING__CURRENT_COST = eINSTANCE.getBookingComponent_Booking_CurrentCost();

		/**
		 * The meta object literal for the '<em><b>Booking Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING_OBJECT = eINSTANCE.getBookingComponent_Booking__BookingObject();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING__DATE_DATE = eINSTANCE.getBookingComponent_Booking__Booking__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ADDITIONAL_SERVICE_TO_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = eINSTANCE.getBookingComponent_Booking__AddAdditionalServiceToBooking__BookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_Booking__Booking__String_Date_Date_String_String_String_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___ADD_ROOM_TO_BOOKING__BOOKINGCOMPONENT_ROOMTYPE = eINSTANCE.getBookingComponent_Booking__AddRoomToBooking__BookingComponent_RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_ROOM_FROM_BOOKING__STRING = eINSTANCE.getBookingComponent_Booking__RemoveRoomFromBooking__String();

		/**
		 * The meta object literal for the '<em><b>Update Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___UPDATE_BOOKING__STRING_DATE_DATE = eINSTANCE.getBookingComponent_Booking__UpdateBooking__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Remove Additional Service From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___REMOVE_ADDITIONAL_SERVICE_FROM_BOOKING__BOOKINGCOMPONENT_ADDITIONALSERVICE = eINSTANCE.getBookingComponent_Booking__RemoveAdditionalServiceFromBooking__BookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Current Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___CURRENT_COST = eINSTANCE.getBookingComponent_Booking__CurrentCost();

		/**
		 * The meta object literal for the '<em><b>Update Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING___UPDATE_PAYMENT_DETAILS__BOOKINGCOMPONENT_PAYMENTDETAILS = eINSTANCE.getBookingComponent_Booking__UpdatePaymentDetails__BookingComponent_PaymentDetails();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_AdditionalServiceImpl <em>Booking Component Additional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_AdditionalServiceImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_AdditionalService()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_ADDITIONAL_SERVICE = eINSTANCE.getBookingComponent_AdditionalService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__NAME = eINSTANCE.getBookingComponent_AdditionalService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__DESCRIPTION = eINSTANCE.getBookingComponent_AdditionalService_Description();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ADDITIONAL_SERVICE__COST = eINSTANCE.getBookingComponent_AdditionalService_Cost();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_RoomTypeImpl <em>Booking Component Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_RoomTypeImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_RoomType()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_ROOM_TYPE = eINSTANCE.getBookingComponent_RoomType();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ROOM_TYPE__ROOM_TYPE = eINSTANCE.getBookingComponent_RoomType_RoomType();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_ROOM_TYPE__COST = eINSTANCE.getBookingComponent_RoomType_Cost();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_BookingManagerImpl <em>Booking Component Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_BookingManagerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_BookingManager()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_BOOKING_MANAGER = eINSTANCE.getBookingComponent_BookingManager();

		/**
		 * The meta object literal for the '<em><b>Booking Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_BOOKING_MANAGER___BOOKING_MANAGER = eINSTANCE.getBookingComponent_BookingManager__BookingManager();

		/**
		 * The meta object literal for the '{@link implementation.BookingComponent_IBookingDecision <em>Booking Component IBooking Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.BookingComponent_IBookingDecision
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_IBookingDecision()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING_DECISION = eINSTANCE.getBookingComponent_IBookingDecision();

		/**
		 * The meta object literal for the '{@link implementation.BookingComponent_IBooking <em>Booking Component IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.BookingComponent_IBooking
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_IBooking()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_IBOOKING = eINSTANCE.getBookingComponent_IBooking();

		/**
		 * The meta object literal for the '<em><b>Search Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___SEARCH_ROOMS__STRING_INT_DATE_DATE = eINSTANCE.getBookingComponent_IBooking__SearchRooms__String_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Make Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___MAKE_BOOKING__STRING_DATE_DATE_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getBookingComponent_IBooking__MakeBooking__String_Date_Date_String_String_String_String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___ADD_ROOM__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__AddRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Request Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REQUEST_QUOTE__STRING_INT_DATE_DATE = eINSTANCE.getBookingComponent_IBooking__RequestQuote__String_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___EDIT_BOOKING__STRING_STRING_DATE_DATE_STRING = eINSTANCE.getBookingComponent_IBooking__EditBooking__String_String_Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___CANCEL_BOOKING__STRING = eINSTANCE.getBookingComponent_IBooking__CancelBooking__String();

		/**
		 * The meta object literal for the '<em><b>Add Additional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___ADD_ADDITIONAL_SERVICE__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__AddAdditionalService__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REMOVE_ROOM__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__RemoveRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Addional Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___REMOVE_ADDIONAL_SERVICE__STRING_STRING = eINSTANCE.getBookingComponent_IBooking__RemoveAddionalService__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Booking Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GET_BOOKING_INFO__STRING = eINSTANCE.getBookingComponent_IBooking__GetBookingInfo__String();

		/**
		 * The meta object literal for the '<em><b>Generate Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GENERATE_RECEIPT__STRING = eINSTANCE.getBookingComponent_IBooking__GenerateReceipt__String();

		/**
		 * The meta object literal for the '<em><b>Validate Reference Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___VALIDATE_REFERENCE_NUMBER__STRING = eINSTANCE.getBookingComponent_IBooking__ValidateReferenceNumber__String();

		/**
		 * The meta object literal for the '<em><b>Generate Quote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___GENERATE_QUOTE__DATE_DATE_STRING = eINSTANCE.getBookingComponent_IBooking__GenerateQuote__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Search For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_COMPONENT_IBOOKING___SEARCH_FOR_BOOKING__STRING = eINSTANCE.getBookingComponent_IBooking__SearchForBooking__String();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingComponent_GuestImpl <em>Booking Component Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingComponent_GuestImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingComponent_Guest()
		 * @generated
		 */
		EClass BOOKING_COMPONENT_GUEST = eINSTANCE.getBookingComponent_Guest();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__FIRST_NAME = eINSTANCE.getBookingComponent_Guest_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__LAST_NAME = eINSTANCE.getBookingComponent_Guest_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_COMPONENT_GUEST__ADDRESS = eINSTANCE.getBookingComponent_Guest_Address();

		/**
		 * The meta object literal for the '{@link implementation.impl.StaffComponentImpl <em>Staff Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.StaffComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent()
		 * @generated
		 */
		EClass STAFF_COMPONENT = eINSTANCE.getStaffComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.StaffComponent_AccountManagerImpl <em>Staff Component Account Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.StaffComponent_AccountManagerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_AccountManager()
		 * @generated
		 */
		EClass STAFF_COMPONENT_ACCOUNT_MANAGER = eINSTANCE.getStaffComponent_AccountManager();

		/**
		 * The meta object literal for the '<em><b>Find Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_ACCOUNT_MANAGER___FIND_ACCOUNT__STRING = eINSTANCE.getStaffComponent_AccountManager__FindAccount__String();

		/**
		 * The meta object literal for the '{@link implementation.StaffComponent_IAuthentication <em>Staff Component IAuthentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.StaffComponent_IAuthentication
		 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_IAuthentication()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IAUTHENTICATION = eINSTANCE.getStaffComponent_IAuthentication();

		/**
		 * The meta object literal for the '<em><b>Log In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_IN__STRING_STRING = eINSTANCE.getStaffComponent_IAuthentication__LogIn__String_String();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___LOG_OUT__STRING = eINSTANCE.getStaffComponent_IAuthentication__LogOut__String();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IAUTHENTICATION___IS_LOGGED_IN__STRING = eINSTANCE.getStaffComponent_IAuthentication__IsLoggedIn__String();

		/**
		 * The meta object literal for the '{@link implementation.StaffComponent_IAccountAdministration <em>Staff Component IAccount Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.StaffComponent_IAccountAdministration
		 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_IAccountAdministration()
		 * @generated
		 */
		EClass STAFF_COMPONENT_IACCOUNT_ADMINISTRATION = eINSTANCE.getStaffComponent_IAccountAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___CREATE_ACCOUNT__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_IAccountAdministration__CreateAccount__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Account Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___EDIT_ACCOUNT_DETAILS__STRING = eINSTANCE.getStaffComponent_IAccountAdministration__EditAccountDetails__String();

		/**
		 * The meta object literal for the '<em><b>Remove Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_IACCOUNT_ADMINISTRATION___REMOVE_ACCOUNT__STRING = eINSTANCE.getStaffComponent_IAccountAdministration__RemoveAccount__String();

		/**
		 * The meta object literal for the '{@link implementation.impl.StaffComponent_EmployeeImpl <em>Staff Component Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.StaffComponent_EmployeeImpl
		 * @see implementation.impl.ImplementationPackageImpl#getStaffComponent_Employee()
		 * @generated
		 */
		EClass STAFF_COMPONENT_EMPLOYEE = eINSTANCE.getStaffComponent_Employee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__ID = eINSTANCE.getStaffComponent_Employee_Id();

		/**
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__SSN = eINSTANCE.getStaffComponent_Employee_Ssn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__NAME = eINSTANCE.getStaffComponent_Employee_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__EMAIL = eINSTANCE.getStaffComponent_Employee_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PHONE = eINSTANCE.getStaffComponent_Employee_Phone();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_COMPONENT_EMPLOYEE__PASSWORD = eINSTANCE.getStaffComponent_Employee_Password();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___EMPLOYEE__STRING_STRING_STRING_STRING = eINSTANCE.getStaffComponent_Employee__Employee__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___EMPLOYEE = eINSTANCE.getStaffComponent_Employee__Employee();

		/**
		 * The meta object literal for the '<em><b>Get Employee Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_COMPONENT_EMPLOYEE___GET_EMPLOYEE_INFO__STRING = eINSTANCE.getStaffComponent_Employee__GetEmployeeInfo__String();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomComponentImpl <em>Room Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomComponentImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent()
		 * @generated
		 */
		EClass ROOM_COMPONENT = eINSTANCE.getRoomComponent();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomComponent_RoomImpl <em>Room Component Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomComponent_RoomImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_Room()
		 * @generated
		 */
		EClass ROOM_COMPONENT_ROOM = eINSTANCE.getRoomComponent_Room();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__ROOM_NUMBER = eINSTANCE.getRoomComponent_Room_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__USABLE = eINSTANCE.getRoomComponent_Room_Usable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__PRICE = eINSTANCE.getRoomComponent_Room_Price();

		/**
		 * The meta object literal for the '<em><b>Room Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__ROOM_TYPE_NAME = eINSTANCE.getRoomComponent_Room_RoomTypeName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_ROOM__DESCRIPTION = eINSTANCE.getRoomComponent_Room_Description();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomComponent_BedroomImpl <em>Room Component Bedroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomComponent_BedroomImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_Bedroom()
		 * @generated
		 */
		EClass ROOM_COMPONENT_BEDROOM = eINSTANCE.getRoomComponent_Bedroom();

		/**
		 * The meta object literal for the '<em><b>Bed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_BEDROOM__BED_COUNT = eINSTANCE.getRoomComponent_Bedroom_BedCount();

		/**
		 * The meta object literal for the '<em><b>Create Bedroom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_BEDROOM___CREATE_BEDROOM__INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_Bedroom__CreateBedroom__int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_BEDROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT = eINSTANCE.getRoomComponent_Bedroom__EditRoom__int_boolean_int_String_String_int();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomComponent_ConferenceRoomImpl <em>Room Component Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomComponent_ConferenceRoomImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_ConferenceRoom()
		 * @generated
		 */
		EClass ROOM_COMPONENT_CONFERENCE_ROOM = eINSTANCE.getRoomComponent_ConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__NUMBER_OF_SEATS = eINSTANCE.getRoomComponent_ConferenceRoom_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Projector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__PROJECTOR = eINSTANCE.getRoomComponent_ConferenceRoom_Projector();

		/**
		 * The meta object literal for the '<em><b>Conference Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_COMPONENT_CONFERENCE_ROOM__CONFERENCE_PHONE = eINSTANCE.getRoomComponent_ConferenceRoom_ConferencePhone();

		/**
		 * The meta object literal for the '<em><b>Create Conference Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_CONFERENCE_ROOM___CREATE_CONFERENCE_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_ConferenceRoom__CreateConferenceRoom__int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_CONFERENCE_ROOM___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING_INT_BOOLEAN_BOOLEAN = eINSTANCE.getRoomComponent_ConferenceRoom__EditRoom__int_boolean_int_String_String_int_boolean_boolean();

		/**
		 * The meta object literal for the '{@link implementation.RoomComponent_IRoomAdministration <em>Room Component IRoom Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.RoomComponent_IRoomAdministration
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomAdministration()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_ADMINISTRATION = eINSTANCE.getRoomComponent_IRoomAdministration();

		/**
		 * The meta object literal for the '<em><b>Create Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___CREATE_ROOM__INT_BOOLEAN_INT_STRING_STRING = eINSTANCE.getRoomComponent_IRoomAdministration__CreateRoom__int_boolean_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___EDIT_ROOM__INT_BOOLEAN_INT_STRING_STRING = eINSTANCE.getRoomComponent_IRoomAdministration__EditRoom__int_boolean_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_ADMINISTRATION___REMOVE__INT = eINSTANCE.getRoomComponent_IRoomAdministration__Remove__int();

		/**
		 * The meta object literal for the '{@link implementation.RoomComponent_IRoomInformation <em>Room Component IRoom Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.RoomComponent_IRoomInformation
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomInformation()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_INFORMATION = eINSTANCE.getRoomComponent_IRoomInformation();

		/**
		 * The meta object literal for the '<em><b>Get Room Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_INFO__INT = eINSTANCE.getRoomComponent_IRoomInformation__GetRoomInfo__int();

		/**
		 * The meta object literal for the '<em><b>Search Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___SEARCH_ROOM__STRING = eINSTANCE.getRoomComponent_IRoomInformation__SearchRoom__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ROOM_TYPES = eINSTANCE.getRoomComponent_IRoomInformation__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Get All Room Numbers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___GET_ALL_ROOM_NUMBERS = eINSTANCE.getRoomComponent_IRoomInformation__GetAllRoomNumbers();

		/**
		 * The meta object literal for the '<em><b>Count Number Of Total Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_COMPONENT_IROOM_INFORMATION___COUNT_NUMBER_OF_TOTAL_ROOMS = eINSTANCE.getRoomComponent_IRoomInformation__CountNumberOfTotalRooms();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomComponent_RoomHandlerImpl <em>Room Component Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomComponent_RoomHandlerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_RoomHandler()
		 * @generated
		 */
		EClass ROOM_COMPONENT_ROOM_HANDLER = eINSTANCE.getRoomComponent_RoomHandler();

		/**
		 * The meta object literal for the '{@link implementation.RoomComponent_IRoomDecision <em>Room Component IRoom Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.RoomComponent_IRoomDecision
		 * @see implementation.impl.ImplementationPackageImpl#getRoomComponent_IRoomDecision()
		 * @generated
		 */
		EClass ROOM_COMPONENT_IROOM_DECISION = eINSTANCE.getRoomComponent_IRoomDecision();

	}

} //ImplementationPackage
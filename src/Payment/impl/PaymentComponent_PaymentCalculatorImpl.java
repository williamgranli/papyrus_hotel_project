/**
 */
package Payment.impl;

import Payment.PaymentComponent_PaymentCalculator;
import Payment.PaymentPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Payment Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Payment.impl.PaymentComponent_PaymentCalculatorImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link Payment.impl.PaymentComponent_PaymentCalculatorImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentComponent_PaymentCalculatorImpl extends MinimalEObjectImpl.Container implements PaymentComponent_PaymentCalculator {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentComponent_PaymentCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_COMPONENT_PAYMENT_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDetails() {
		if (details == null) {
			details = new EDataTypeUniqueEList<String>(String.class, this, PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculate(int price, EList<String> additionalService, String checkInDate, String checkOutDate, boolean isLateCancellation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkLateCancellation(String cancelDate, String arrivalDate) {
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST:
				return getCost();
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS:
				return getDetails();
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST:
				setCost((Integer)newValue);
				return;
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS:
				getDetails().clear();
				getDetails().addAll((Collection<? extends String>)newValue);
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST:
				setCost(COST_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS:
				getDetails().clear();
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
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__COST:
				return cost != COST_EDEFAULT;
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR__DETAILS:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CALCULATE__INT_ELIST_STRING_STRING_BOOLEAN:
				calculate((Integer)arguments.get(0), (EList<String>)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Boolean)arguments.get(4));
				return null;
			case PaymentPackage.PAYMENT_COMPONENT_PAYMENT_CALCULATOR___CHECK_LATE_CANCELLATION__STRING_STRING:
				checkLateCancellation((String)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //PaymentComponent_PaymentCalculatorImpl
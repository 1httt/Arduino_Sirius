/**
 */
package flowcharts.impl;

import flowcharts.AbstractActivity;
import flowcharts.FlowchartsPackage;
import flowcharts.Fork;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flowcharts.impl.ForkImpl#getNextSteps <em>Next Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends AbstractActivityImpl implements Fork {
	/**
	 * The cached value of the '{@link #getNextSteps() <em>Next Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractActivity> nextSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowchartsPackage.Literals.FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractActivity> getNextSteps() {
		if (nextSteps == null) {
			nextSteps = new EObjectResolvingEList<AbstractActivity>(AbstractActivity.class, this,
					FlowchartsPackage.FORK__NEXT_STEPS);
		}
		return nextSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FlowchartsPackage.FORK__NEXT_STEPS:
			return getNextSteps();
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
		case FlowchartsPackage.FORK__NEXT_STEPS:
			getNextSteps().clear();
			getNextSteps().addAll((Collection<? extends AbstractActivity>) newValue);
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
		case FlowchartsPackage.FORK__NEXT_STEPS:
			getNextSteps().clear();
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
		case FlowchartsPackage.FORK__NEXT_STEPS:
			return nextSteps != null && !nextSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForkImpl

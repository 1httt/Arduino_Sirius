/**
 */
package stateMachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateMachine.FSM;
import stateMachine.State;
import stateMachine.StateMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.impl.FSMImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link stateMachine.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link stateMachine.impl.FSMImpl#getFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The cached value of the '{@link #getContain() <em>Contain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain()
	 * @generated
	 * @ordered
	 */
	protected EList<State> contain;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> finalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<State>(State.class, this, StateMachinePackage.FSM__CONTAIN);
		}
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (State) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.FSM__INITIAL_STATE,
							oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.FSM__INITIAL_STATE,
					oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList<State>(State.class, this, StateMachinePackage.FSM__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachinePackage.FSM__CONTAIN:
			return ((InternalEList<?>) getContain()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StateMachinePackage.FSM__CONTAIN:
			return getContain();
		case StateMachinePackage.FSM__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		case StateMachinePackage.FSM__FINAL_STATE:
			return getFinalState();
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
		case StateMachinePackage.FSM__CONTAIN:
			getContain().clear();
			getContain().addAll((Collection<? extends State>) newValue);
			return;
		case StateMachinePackage.FSM__INITIAL_STATE:
			setInitialState((State) newValue);
			return;
		case StateMachinePackage.FSM__FINAL_STATE:
			getFinalState().clear();
			getFinalState().addAll((Collection<? extends State>) newValue);
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
		case StateMachinePackage.FSM__CONTAIN:
			getContain().clear();
			return;
		case StateMachinePackage.FSM__INITIAL_STATE:
			setInitialState((State) null);
			return;
		case StateMachinePackage.FSM__FINAL_STATE:
			getFinalState().clear();
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
		case StateMachinePackage.FSM__CONTAIN:
			return contain != null && !contain.isEmpty();
		case StateMachinePackage.FSM__INITIAL_STATE:
			return initialState != null;
		case StateMachinePackage.FSM__FINAL_STATE:
			return finalState != null && !finalState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FSMImpl

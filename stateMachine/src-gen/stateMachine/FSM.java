/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.FSM#getContain <em>Contain</em>}</li>
 *   <li>{@link stateMachine.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link stateMachine.FSM#getFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Contain</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getFSM_Contain()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getContain();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see stateMachine.StateMachinePackage#getFSM_InitialState()
	 * @model
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link stateMachine.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link stateMachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see stateMachine.StateMachinePackage#getFSM_FinalState()
	 * @model
	 * @generated
	 */
	EList<State> getFinalState();

} // FSM

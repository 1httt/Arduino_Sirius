/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.State#getName <em>Name</em>}</li>
 *   <li>{@link stateMachine.State#getTransfer <em>Transfer</em>}</li>
 *   <li>{@link stateMachine.State#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachine.StateMachinePackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachine.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transfer</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getState_Transfer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransfer();

	/**
	 * Returns the value of the '<em><b>Income</b></em>' reference list.
	 * The list contents are of type {@link stateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' reference list.
	 * @see stateMachine.StateMachinePackage#getState_Income()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncome();

} // State

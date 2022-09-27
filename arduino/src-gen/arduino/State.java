/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.State#getAction <em>Action</em>}</li>
 *   <li>{@link arduino.State#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getState()
 * @model
 * @generated
 */
public interface State extends NameElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getState_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(Transition)
	 * @see arduino.ArduinoPackage#getState_Transition()
	 * @model containment="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link arduino.State#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // State

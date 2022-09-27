/**
 */
package arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Action#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see arduino.ArduinoPackage#getAction_Actuator()
	 * @model
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link arduino.Action#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // Action

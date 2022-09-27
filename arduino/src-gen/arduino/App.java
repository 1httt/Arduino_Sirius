/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.App#getStates <em>States</em>}</li>
 *   <li>{@link arduino.App#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduino.App#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getApp()
 * @model
 * @generated
 */
public interface App extends NameElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getApp_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Bricks</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Brick}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricks</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getApp_Bricks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getBricks();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see arduino.ArduinoPackage#getApp_Initial()
	 * @model
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link arduino.App#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

} // App

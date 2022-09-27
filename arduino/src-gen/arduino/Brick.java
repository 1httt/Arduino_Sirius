/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Brick#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends NameElement {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see arduino.ArduinoPackage#getBrick_Pin()
	 * @model
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduino.Brick#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

} // Brick

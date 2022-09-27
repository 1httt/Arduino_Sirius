/**
 */
package flowcharts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowcharts.Step#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see flowcharts.FlowchartsPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends AbstractActivity {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(AbstractActivity)
	 * @see flowcharts.FlowchartsPackage#getStep_Next()
	 * @model
	 * @generated
	 */
	AbstractActivity getNext();

	/**
	 * Sets the value of the '{@link flowcharts.Step#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AbstractActivity value);

} // Step

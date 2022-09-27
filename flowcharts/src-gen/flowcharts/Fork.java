/**
 */
package flowcharts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowcharts.Fork#getNextSteps <em>Next Steps</em>}</li>
 * </ul>
 *
 * @see flowcharts.FlowchartsPackage#getFork()
 * @model
 * @generated
 */
public interface Fork extends AbstractActivity {
	/**
	 * Returns the value of the '<em><b>Next Steps</b></em>' reference list.
	 * The list contents are of type {@link flowcharts.AbstractActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Steps</em>' reference list.
	 * @see flowcharts.FlowchartsPackage#getFork_NextSteps()
	 * @model
	 * @generated
	 */
	EList<AbstractActivity> getNextSteps();

} // Fork

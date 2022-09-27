/**
 */
package flowcharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowcharts.FlowChart#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see flowcharts.FlowchartsPackage#getFlowChart()
 * @model
 * @generated
 */
public interface FlowChart extends EObject {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link flowcharts.AbstractActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see flowcharts.FlowchartsPackage#getFlowChart_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActivity> getActivities();

} // FlowChart

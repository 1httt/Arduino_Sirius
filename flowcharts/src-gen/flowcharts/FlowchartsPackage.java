/**
 */
package flowcharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flowcharts.FlowchartsFactory
 * @model kind="package"
 * @generated
 */
public interface FlowchartsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flowcharts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/flowcharts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flowcharts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowchartsPackage eINSTANCE = flowcharts.impl.FlowchartsPackageImpl.init();

	/**
	 * The meta object id for the '{@link flowcharts.impl.FlowChartImpl <em>Flow Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowcharts.impl.FlowChartImpl
	 * @see flowcharts.impl.FlowchartsPackageImpl#getFlowChart()
	 * @generated
	 */
	int FLOW_CHART = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHART__ACTIVITIES = 0;

	/**
	 * The number of structural features of the '<em>Flow Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowcharts.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowcharts.impl.AbstractActivityImpl
	 * @see flowcharts.impl.FlowchartsPackageImpl#getAbstractActivity()
	 * @generated
	 */
	int ABSTRACT_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowcharts.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowcharts.impl.StepImpl
	 * @see flowcharts.impl.FlowchartsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ABSTRACT_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT = ABSTRACT_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ABSTRACT_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = ABSTRACT_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowcharts.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowcharts.impl.ForkImpl
	 * @see flowcharts.impl.FlowchartsPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = ABSTRACT_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Next Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NEXT_STEPS = ABSTRACT_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = ABSTRACT_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = ABSTRACT_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowcharts.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowcharts.impl.JoinImpl
	 * @see flowcharts.impl.FlowchartsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NEXT = STEP__NEXT;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link flowcharts.FlowChart <em>Flow Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Chart</em>'.
	 * @see flowcharts.FlowChart
	 * @generated
	 */
	EClass getFlowChart();

	/**
	 * Returns the meta object for the containment reference list '{@link flowcharts.FlowChart#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see flowcharts.FlowChart#getActivities()
	 * @see #getFlowChart()
	 * @generated
	 */
	EReference getFlowChart_Activities();

	/**
	 * Returns the meta object for class '{@link flowcharts.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see flowcharts.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link flowcharts.Step#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see flowcharts.Step#getNext()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Next();

	/**
	 * Returns the meta object for class '{@link flowcharts.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see flowcharts.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the reference list '{@link flowcharts.Fork#getNextSteps <em>Next Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Steps</em>'.
	 * @see flowcharts.Fork#getNextSteps()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_NextSteps();

	/**
	 * Returns the meta object for class '{@link flowcharts.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see flowcharts.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link flowcharts.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity</em>'.
	 * @see flowcharts.AbstractActivity
	 * @generated
	 */
	EClass getAbstractActivity();

	/**
	 * Returns the meta object for the attribute '{@link flowcharts.AbstractActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flowcharts.AbstractActivity#getName()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowchartsFactory getFlowchartsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flowcharts.impl.FlowChartImpl <em>Flow Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowcharts.impl.FlowChartImpl
		 * @see flowcharts.impl.FlowchartsPackageImpl#getFlowChart()
		 * @generated
		 */
		EClass FLOW_CHART = eINSTANCE.getFlowChart();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CHART__ACTIVITIES = eINSTANCE.getFlowChart_Activities();

		/**
		 * The meta object literal for the '{@link flowcharts.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowcharts.impl.StepImpl
		 * @see flowcharts.impl.FlowchartsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT = eINSTANCE.getStep_Next();

		/**
		 * The meta object literal for the '{@link flowcharts.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowcharts.impl.ForkImpl
		 * @see flowcharts.impl.FlowchartsPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '<em><b>Next Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__NEXT_STEPS = eINSTANCE.getFork_NextSteps();

		/**
		 * The meta object literal for the '{@link flowcharts.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowcharts.impl.JoinImpl
		 * @see flowcharts.impl.FlowchartsPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link flowcharts.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowcharts.impl.AbstractActivityImpl
		 * @see flowcharts.impl.FlowchartsPackageImpl#getAbstractActivity()
		 * @generated
		 */
		EClass ABSTRACT_ACTIVITY = eINSTANCE.getAbstractActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__NAME = eINSTANCE.getAbstractActivity_Name();

	}

} //FlowchartsPackage

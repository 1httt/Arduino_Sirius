/**
 */
package flowcharts.impl;

import flowcharts.AbstractActivity;
import flowcharts.FlowChart;
import flowcharts.FlowchartsFactory;
import flowcharts.FlowchartsPackage;
import flowcharts.Fork;
import flowcharts.Join;
import flowcharts.Step;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowchartsPackageImpl extends EPackageImpl implements FlowchartsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActivityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see flowcharts.FlowchartsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowchartsPackageImpl() {
		super(eNS_URI, FlowchartsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FlowchartsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowchartsPackage init() {
		if (isInited)
			return (FlowchartsPackage) EPackage.Registry.INSTANCE.getEPackage(FlowchartsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlowchartsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlowchartsPackageImpl theFlowchartsPackage = registeredFlowchartsPackage instanceof FlowchartsPackageImpl
				? (FlowchartsPackageImpl) registeredFlowchartsPackage
				: new FlowchartsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFlowchartsPackage.createPackageContents();

		// Initialize created meta-data
		theFlowchartsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowchartsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowchartsPackage.eNS_URI, theFlowchartsPackage);
		return theFlowchartsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowChart() {
		return flowChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowChart_Activities() {
		return (EReference) flowChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Next() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFork_NextSteps() {
		return (EReference) forkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActivity() {
		return abstractActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_Name() {
		return (EAttribute) abstractActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowchartsFactory getFlowchartsFactory() {
		return (FlowchartsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		flowChartEClass = createEClass(FLOW_CHART);
		createEReference(flowChartEClass, FLOW_CHART__ACTIVITIES);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__NEXT);

		forkEClass = createEClass(FORK);
		createEReference(forkEClass, FORK__NEXT_STEPS);

		joinEClass = createEClass(JOIN);

		abstractActivityEClass = createEClass(ABSTRACT_ACTIVITY);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stepEClass.getESuperTypes().add(this.getAbstractActivity());
		forkEClass.getESuperTypes().add(this.getAbstractActivity());
		joinEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowChartEClass, FlowChart.class, "FlowChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowChart_Activities(), this.getAbstractActivity(), null, "activities", null, 0, -1,
				FlowChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Next(), this.getAbstractActivity(), null, "next", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFork_NextSteps(), this.getAbstractActivity(), null, "nextSteps", null, 0, -1, Fork.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActivityEClass, AbstractActivity.class, "AbstractActivity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FlowchartsPackageImpl

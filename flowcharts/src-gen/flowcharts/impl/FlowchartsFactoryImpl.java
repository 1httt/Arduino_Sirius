/**
 */
package flowcharts.impl;

import flowcharts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowchartsFactoryImpl extends EFactoryImpl implements FlowchartsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlowchartsFactory init() {
		try {
			FlowchartsFactory theFlowchartsFactory = (FlowchartsFactory) EPackage.Registry.INSTANCE
					.getEFactory(FlowchartsPackage.eNS_URI);
			if (theFlowchartsFactory != null) {
				return theFlowchartsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlowchartsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowchartsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FlowchartsPackage.FLOW_CHART:
			return createFlowChart();
		case FlowchartsPackage.STEP:
			return createStep();
		case FlowchartsPackage.FORK:
			return createFork();
		case FlowchartsPackage.JOIN:
			return createJoin();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowChart createFlowChart() {
		FlowChartImpl flowChart = new FlowChartImpl();
		return flowChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowchartsPackage getFlowchartsPackage() {
		return (FlowchartsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlowchartsPackage getPackage() {
		return FlowchartsPackage.eINSTANCE;
	}

} //FlowchartsFactoryImpl

/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ca.mcgill.emf.examples.hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = ca.mcgill.emf.examples.hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ACTIVE = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ACTIVE = DEVICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__READINGS = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Period In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MEASUREMENT_PERIOD_IN_SECONDS = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TERMS = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_TYPE = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTIVE = DEVICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Actuator Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATOR_TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issued Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ISSUED_COMMANDS = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICES = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ReadingImpl <em>Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ReadingImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getReading()
	 * @generated
	 */
	int READING = 4;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__SENSOR = 2;

	/**
	 * The number of structural features of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.CommandImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Issued Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ISSUED_COMMANDS = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActivityLogImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActivityLog()
	 * @generated
	 */
	int ACTIVITY_LOG = 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__READINGS = 1;

	/**
	 * The feature id for the '<em><b>Issued Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__ISSUED_COMMANDS = 2;

	/**
	 * The feature id for the '<em><b>Triggered Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__TRIGGERED_RULES = 3;

	/**
	 * The number of structural features of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl <em>Issued Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getIssuedCommand()
	 * @generated
	 */
	int ISSUED_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Issued Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issued Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.HomeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHome()
	 * @generated
	 */
	int HOME = 9;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__RULES = 2;

	/**
	 * The feature id for the '<em><b>Activity Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ACTIVITY_LOG = 3;

	/**
	 * The feature id for the '<em><b>Device Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__DEVICE_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__DEVICES = 5;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.RuleImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRECONDITION = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 4;

	/**
	 * The feature id for the '<em><b>Triggered Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRIGGERED_RULES = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.PreconditionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 11;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ExpressionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.NotExpressionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.BinaryExpressionImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.TriggeredRuleImpl <em>Triggered Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.TriggeredRuleImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getTriggeredRule()
	 * @generated
	 */
	int TRIGGERED_RULE = 15;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_RULE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_RULE__RULE = 1;

	/**
	 * The number of structural features of the '<em>Triggered Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Triggered Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.TermImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 16;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__COMPARISON_OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__RHS_VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lhs Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__LHS_SENSOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.SensorTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__TYPE = DEVICE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE__SENSORS = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__TYPE = DEVICE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__ACTUATORS = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE__COMMANDS = DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.ComparisonOperator
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 20;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.examples.hal.BinaryLogicalOperator <em>Binary Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.examples.hal.BinaryLogicalOperator
	 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBinaryLogicalOperator()
	 * @generated
	 */
	int BINARY_LOGICAL_OPERATOR = 21;

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Device#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#getRoom()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Room();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Device#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see ca.mcgill.emf.examples.hal.Device#isActive()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Active();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Sensor#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getReadings()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Readings();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Sensor#getMeasurementPeriodInSeconds <em>Measurement Period In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Period In Seconds</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getMeasurementPeriodInSeconds()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_MeasurementPeriodInSeconds();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Sensor#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terms</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getTerms()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Terms();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.Sensor#getSensorType()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorType();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatorType()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_ActuatorType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Actuator#getIssuedCommands <em>Issued Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issued Commands</em>'.
	 * @see ca.mcgill.emf.examples.hal.Actuator#getIssuedCommands()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_IssuedCommands();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Room#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see ca.mcgill.emf.examples.hal.Room#getDevices()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Devices();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading</em>'.
	 * @see ca.mcgill.emf.examples.hal.Reading
	 * @generated
	 */
	EClass getReading();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Reading#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see ca.mcgill.emf.examples.hal.Reading#getMeasurement()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Measurement();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Reading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.examples.hal.Reading#getTimestamp()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Reading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Reading#getSensor()
	 * @see #getReading()
	 * @generated
	 */
	EReference getReading_Sensor();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see ca.mcgill.emf.examples.hal.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Command#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see ca.mcgill.emf.examples.hal.Command#getActions()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Actions();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Command#getIssuedCommands <em>Issued Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issued Commands</em>'.
	 * @see ca.mcgill.emf.examples.hal.Command#getIssuedCommands()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_IssuedCommands();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.ActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Log</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActivityLog
	 * @generated
	 */
	EClass getActivityLog();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.ActivityLog#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getTimestamp()
	 * @see #getActivityLog()
	 * @generated
	 */
	EAttribute getActivityLog_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.ActivityLog#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Readings</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getReadings()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Readings();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.ActivityLog#getIssuedCommands <em>Issued Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issued Commands</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getIssuedCommands()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_IssuedCommands();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.ActivityLog#getTriggeredRules <em>Triggered Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggered Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getTriggeredRules()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_TriggeredRules();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.IssuedCommand <em>Issued Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issued Command</em>'.
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand
	 * @generated
	 */
	EClass getIssuedCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand#getTimestamp()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EAttribute getIssuedCommand_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand#getCommand()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EReference getIssuedCommand_Command();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand#getActuator()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EReference getIssuedCommand_Actuator();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Action#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see ca.mcgill.emf.examples.hal.Action#getCommands()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Commands();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getAddress()
	 * @see #getHome()
	 * @generated
	 */
	EAttribute getHome_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getRooms()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getRules()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.Home#getActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Log</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getActivityLog()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_ActivityLog();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getDeviceTypes <em>Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Types</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getDeviceTypes()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_DeviceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Home#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see ca.mcgill.emf.examples.hal.Home#getDevices()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Devices();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rule#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#isActive()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Active();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Rule#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#getPassword()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Password();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.Rule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#getPrecondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.Rule#getTriggeredRules <em>Triggered Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered Rules</em>'.
	 * @see ca.mcgill.emf.examples.hal.Rule#getTriggeredRules()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_TriggeredRules();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.examples.hal.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.Precondition#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see ca.mcgill.emf.examples.hal.Precondition#getExpressions()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Expressions();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ca.mcgill.emf.examples.hal.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see ca.mcgill.emf.examples.hal.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.NotExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see ca.mcgill.emf.examples.hal.NotExpression#getRight()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Right();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see ca.mcgill.emf.examples.hal.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see ca.mcgill.emf.examples.hal.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see ca.mcgill.emf.examples.hal.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.TriggeredRule <em>Triggered Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered Rule</em>'.
	 * @see ca.mcgill.emf.examples.hal.TriggeredRule
	 * @generated
	 */
	EClass getTriggeredRule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.TriggeredRule#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.examples.hal.TriggeredRule#getTimestamp()
	 * @see #getTriggeredRule()
	 * @generated
	 */
	EAttribute getTriggeredRule_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.TriggeredRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see ca.mcgill.emf.examples.hal.TriggeredRule#getRule()
	 * @see #getTriggeredRule()
	 * @generated
	 */
	EReference getTriggeredRule_Rule();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see ca.mcgill.emf.examples.hal.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Term#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.Term#getComparisonOperator()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.Term#getRhsValue <em>Rhs Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs Value</em>'.
	 * @see ca.mcgill.emf.examples.hal.Term#getRhsValue()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_RhsValue();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.examples.hal.Term#getLhsSensor <em>Lhs Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs Sensor</em>'.
	 * @see ca.mcgill.emf.examples.hal.Term#getLhsSensor()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_LhsSensor();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorType
	 * @generated
	 */
	EClass getSensorType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.SensorType#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see ca.mcgill.emf.examples.hal.SensorType#getSensors()
	 * @see #getSensorType()
	 * @generated
	 */
	EReference getSensorType_Sensors();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType
	 * @generated
	 */
	EClass getActuatorType();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuators</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType#getActuators()
	 * @see #getActuatorType()
	 * @generated
	 */
	EReference getActuatorType_Actuators();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.examples.hal.ActuatorType#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see ca.mcgill.emf.examples.hal.ActuatorType#getCommands()
	 * @see #getActuatorType()
	 * @generated
	 */
	EReference getActuatorType_Commands();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.examples.hal.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.examples.hal.DeviceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.mcgill.emf.examples.hal.DeviceType#getType()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_Type();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.examples.hal.BinaryLogicalOperator <em>Binary Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Logical Operator</em>'.
	 * @see ca.mcgill.emf.examples.hal.BinaryLogicalOperator
	 * @generated
	 */
	EEnum getBinaryLogicalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

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
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.DeviceImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ROOM = eINSTANCE.getDevice_Room();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ACTIVE = eINSTANCE.getDevice_Active();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__READINGS = eINSTANCE.getSensor_Readings();

		/**
		 * The meta object literal for the '<em><b>Measurement Period In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MEASUREMENT_PERIOD_IN_SECONDS = eINSTANCE.getSensor_MeasurementPeriodInSeconds();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__TERMS = eINSTANCE.getSensor_Terms();

		/**
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSOR_TYPE = eINSTANCE.getSensor_SensorType();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Actuator Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATOR_TYPE = eINSTANCE.getActuator_ActuatorType();

		/**
		 * The meta object literal for the '<em><b>Issued Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ISSUED_COMMANDS = eINSTANCE.getActuator_IssuedCommands();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.RoomImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DEVICES = eINSTANCE.getRoom_Devices();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ReadingImpl <em>Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ReadingImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getReading()
		 * @generated
		 */
		EClass READING = eINSTANCE.getReading();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__MEASUREMENT = eINSTANCE.getReading_Measurement();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__TIMESTAMP = eINSTANCE.getReading_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING__SENSOR = eINSTANCE.getReading_Sensor();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.CommandImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ACTIONS = eINSTANCE.getCommand_Actions();

		/**
		 * The meta object literal for the '<em><b>Issued Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ISSUED_COMMANDS = eINSTANCE.getCommand_IssuedCommands();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActivityLogImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActivityLog()
		 * @generated
		 */
		EClass ACTIVITY_LOG = eINSTANCE.getActivityLog();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOG__TIMESTAMP = eINSTANCE.getActivityLog_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__READINGS = eINSTANCE.getActivityLog_Readings();

		/**
		 * The meta object literal for the '<em><b>Issued Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__ISSUED_COMMANDS = eINSTANCE.getActivityLog_IssuedCommands();

		/**
		 * The meta object literal for the '<em><b>Triggered Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__TRIGGERED_RULES = eINSTANCE.getActivityLog_TriggeredRules();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl <em>Issued Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getIssuedCommand()
		 * @generated
		 */
		EClass ISSUED_COMMAND = eINSTANCE.getIssuedCommand();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_COMMAND__TIMESTAMP = eINSTANCE.getIssuedCommand_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_COMMAND__COMMAND = eINSTANCE.getIssuedCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_COMMAND__ACTUATOR = eINSTANCE.getIssuedCommand_Actuator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__COMMANDS = eINSTANCE.getAction_Commands();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.HomeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME__ADDRESS = eINSTANCE.getHome_Address();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ROOMS = eINSTANCE.getHome_Rooms();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__RULES = eINSTANCE.getHome_Rules();

		/**
		 * The meta object literal for the '<em><b>Activity Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ACTIVITY_LOG = eINSTANCE.getHome_ActivityLog();

		/**
		 * The meta object literal for the '<em><b>Device Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__DEVICE_TYPES = eINSTANCE.getHome_DeviceTypes();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__DEVICES = eINSTANCE.getHome_Devices();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.RuleImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ACTIVE = eINSTANCE.getRule_Active();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PASSWORD = eINSTANCE.getRule_Password();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PRECONDITION = eINSTANCE.getRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '<em><b>Triggered Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRIGGERED_RULES = eINSTANCE.getRule_TriggeredRules();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.PreconditionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__EXPRESSIONS = eINSTANCE.getPrecondition_Expressions();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ExpressionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.NotExpressionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__RIGHT = eINSTANCE.getNotExpression_Right();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.BinaryExpressionImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.TriggeredRuleImpl <em>Triggered Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.TriggeredRuleImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getTriggeredRule()
		 * @generated
		 */
		EClass TRIGGERED_RULE = eINSTANCE.getTriggeredRule();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGERED_RULE__TIMESTAMP = eINSTANCE.getTriggeredRule_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGERED_RULE__RULE = eINSTANCE.getTriggeredRule_Rule();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.TermImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__COMPARISON_OPERATOR = eINSTANCE.getTerm_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Rhs Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__RHS_VALUE = eINSTANCE.getTerm_RhsValue();

		/**
		 * The meta object literal for the '<em><b>Lhs Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__LHS_SENSOR = eINSTANCE.getTerm_LhsSensor();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.SensorTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getSensorType()
		 * @generated
		 */
		EClass SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TYPE__SENSORS = eINSTANCE.getSensorType_Sensors();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.ActuatorTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getActuatorType()
		 * @generated
		 */
		EClass ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_TYPE__ACTUATORS = eINSTANCE.getActuatorType_Actuators();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_TYPE__COMMANDS = eINSTANCE.getActuatorType_Commands();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.impl.DeviceTypeImpl
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__TYPE = eINSTANCE.getDeviceType_Type();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.ComparisonOperator
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.examples.hal.BinaryLogicalOperator <em>Binary Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.examples.hal.BinaryLogicalOperator
		 * @see ca.mcgill.emf.examples.hal.impl.HalPackageImpl#getBinaryLogicalOperator()
		 * @generated
		 */
		EEnum BINARY_LOGICAL_OPERATOR = eINSTANCE.getBinaryLogicalOperator();

	}

} //HalPackage

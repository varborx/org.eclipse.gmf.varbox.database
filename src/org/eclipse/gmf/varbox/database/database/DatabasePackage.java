/**
 */
package org.eclipse.gmf.varbox.database.database;

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
 * @see org.eclipse.gmf.varbox.database.database.DatabaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "database";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.SchemeImpl <em>Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.SchemeImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.TableImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Notnull</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NOTNULL = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.ColumnImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.PrimaryKeyImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = COLUMN__NAME;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.NotNullImpl <em>Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.NotNullImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getNotNull()
	 * @generated
	 */
	int NOT_NULL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__NAME = COLUMN__NAME;

	/**
	 * The number of structural features of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.varbox.database.database.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.varbox.database.database.impl.ForeignKeyImpl
	 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Ref Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REF_TABLE = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheme</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Scheme
	 * @generated
	 */
	EClass getScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.varbox.database.database.Scheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Scheme#getName()
	 * @see #getScheme()
	 * @generated
	 */
	EAttribute getScheme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.varbox.database.database.Scheme#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Scheme#getTables()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Tables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.varbox.database.database.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.varbox.database.database.Table#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Table#getPrimary()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Primary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.varbox.database.database.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.varbox.database.database.Table#getNotnull <em>Notnull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notnull</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Table#getNotnull()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Notnull();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.NotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.NotNull
	 * @generated
	 */
	EClass getNotNull();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.varbox.database.database.ForeignKey#getRefTable <em>Ref Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Table</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.ForeignKey#getRefTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RefTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.varbox.database.database.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.varbox.database.database.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.varbox.database.database.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.SchemeImpl <em>Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.SchemeImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getScheme()
		 * @generated
		 */
		EClass SCHEME = eINSTANCE.getScheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEME__NAME = eINSTANCE.getScheme_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__TABLES = eINSTANCE.getScheme_Tables();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.TableImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY = eINSTANCE.getTable_Primary();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Notnull</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__NOTNULL = eINSTANCE.getTable_Notnull();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.PrimaryKeyImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.NotNullImpl <em>Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.NotNullImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getNotNull()
		 * @generated
		 */
		EClass NOT_NULL = eINSTANCE.getNotNull();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.ForeignKeyImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Ref Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REF_TABLE = eINSTANCE.getForeignKey_RefTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.varbox.database.database.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.varbox.database.database.impl.ColumnImpl
		 * @see org.eclipse.gmf.varbox.database.database.impl.DatabasePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

	}

} //DatabasePackage

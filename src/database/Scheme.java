/**
 */
package database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Scheme#getName <em>Name</em>}</li>
 *   <li>{@link database.Scheme#getTables <em>Tables</em>}</li>
 *   <li>{@link database.Scheme#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getScheme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueTableName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueTableName='tables->forAll(table1,table2 | table1 <> table2 implies table1.name <> table2.name)'"
 * @generated
 */
public interface Scheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see database.DatabasePackage#getScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link database.Scheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link database.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see database.DatabasePackage#getScheme_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link database.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see database.DatabasePackage#getScheme_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Scheme

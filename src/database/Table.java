/**
 */
package database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Table#getName <em>Name</em>}</li>
 *   <li>{@link database.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link database.Table#getPrimary <em>Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueColumnName uniquePrimaryKey'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueColumnName='columns->forAll(column1, column2 | column1 <> column2 implies column1.name <> column2.name)' uniquePrimaryKey='primary->size() = 1'"
 * @generated
 */
public interface Table extends EObject {
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
	 * @see database.DatabasePackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link database.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see database.DatabasePackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' reference.
	 * @see #setPrimary(PrimaryKey)
	 * @see database.DatabasePackage#getTable_Primary()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getPrimary();

	/**
	 * Sets the value of the '{@link database.Table#getPrimary <em>Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' reference.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(PrimaryKey value);

} // Table

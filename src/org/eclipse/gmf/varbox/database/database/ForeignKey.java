/**
 */
package org.eclipse.gmf.varbox.database.database;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.varbox.database.database.ForeignKey#getRefTable <em>Ref Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.varbox.database.database.DatabasePackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Column {
	/**
	 * Returns the value of the '<em><b>Ref Table</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.varbox.database.database.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Table</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Table</em>' reference list.
	 * @see org.eclipse.gmf.varbox.database.database.DatabasePackage#getForeignKey_RefTable()
	 * @model
	 * @generated
	 */
	EList<Table> getRefTable();

} // ForeignKey

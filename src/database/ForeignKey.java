/**
 */
package database;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.ForeignKey#getRefer <em>Refer</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Column {
	/**
	 * Returns the value of the '<em><b>Refer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refer</em>' reference.
	 * @see #setRefer(PrimaryKey)
	 * @see database.DatabasePackage#getForeignKey_Refer()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getRefer();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getRefer <em>Refer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refer</em>' reference.
	 * @see #getRefer()
	 * @generated
	 */
	void setRefer(PrimaryKey value);

} // ForeignKey

/**
 */
package database.impl;

import database.DatabasePackage;
import database.ForeignKey;
import database.Table;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.ForeignKeyImpl#getRefTable <em>Ref Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends ColumnImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getRefTable() <em>Ref Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> refTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getRefTable() {
		if (refTable == null) {
			refTable = new EObjectResolvingEList<Table>(Table.class, this, DatabasePackage.FOREIGN_KEY__REF_TABLE);
		}
		return refTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__REF_TABLE:
				return getRefTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__REF_TABLE:
				getRefTable().clear();
				getRefTable().addAll((Collection<? extends Table>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__REF_TABLE:
				getRefTable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__REF_TABLE:
				return refTable != null && !refTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl

/**
 */
package org.eclipse.gmf.varbox.database.database.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.varbox.database.database.Column;
import org.eclipse.gmf.varbox.database.database.DatabasePackage;
import org.eclipse.gmf.varbox.database.database.NotNull;
import org.eclipse.gmf.varbox.database.database.PrimaryKey;
import org.eclipse.gmf.varbox.database.database.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.gmf.varbox.database.database.impl.TableImpl#getNotnull <em>Notnull</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primary;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getNotnull() <em>Notnull</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotnull()
	 * @generated
	 * @ordered
	 */
	protected EList<NotNull> notnull;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimary() {
		if (primary != null && primary.eIsProxy()) {
			InternalEObject oldPrimary = (InternalEObject)primary;
			primary = (PrimaryKey)eResolveProxy(oldPrimary);
			if (primary != oldPrimary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.TABLE__PRIMARY, oldPrimary, primary));
			}
		}
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(PrimaryKey newPrimary) {
		PrimaryKey oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, DatabasePackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotNull> getNotnull() {
		if (notnull == null) {
			notnull = new EObjectResolvingEList<NotNull>(NotNull.class, this, DatabasePackage.TABLE__NOTNULL);
		}
		return notnull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.TABLE__NAME:
				return getName();
			case DatabasePackage.TABLE__PRIMARY:
				if (resolve) return getPrimary();
				return basicGetPrimary();
			case DatabasePackage.TABLE__COLUMNS:
				return getColumns();
			case DatabasePackage.TABLE__NOTNULL:
				return getNotnull();
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
			case DatabasePackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case DatabasePackage.TABLE__PRIMARY:
				setPrimary((PrimaryKey)newValue);
				return;
			case DatabasePackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabasePackage.TABLE__NOTNULL:
				getNotnull().clear();
				getNotnull().addAll((Collection<? extends NotNull>)newValue);
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
			case DatabasePackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabasePackage.TABLE__PRIMARY:
				setPrimary((PrimaryKey)null);
				return;
			case DatabasePackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case DatabasePackage.TABLE__NOTNULL:
				getNotnull().clear();
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
			case DatabasePackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabasePackage.TABLE__PRIMARY:
				return primary != null;
			case DatabasePackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DatabasePackage.TABLE__NOTNULL:
				return notnull != null && !notnull.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl

/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import no.mesan.ark.persistering.generated.tables.Address;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "address", schema = "public")
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record8<Integer, String, String, String, Integer, String, String, Timestamp> {

	private static final long serialVersionUID = 1552850302;

	/**
	 * Setter for <code>public.address.address_id</code>.
	 */
	public void setAddressId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.address.address_id</code>.
	 */
	@Id
	@Column(name = "address_id", unique = true, nullable = false, precision = 32)
	public Integer getAddressId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.address.address</code>.
	 */
	public void setAddress(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.address.address</code>.
	 */
	@Column(name = "address", nullable = false, length = 50)
	public String getAddress() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.address.address2</code>.
	 */
	public void setAddress2(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.address.address2</code>.
	 */
	@Column(name = "address2", length = 50)
	public String getAddress2() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.address.district</code>.
	 */
	public void setDistrict(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.address.district</code>.
	 */
	@Column(name = "district", nullable = false, length = 20)
	public String getDistrict() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.address.city_id</code>.
	 */
	public void setCityId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.address.city_id</code>.
	 */
	@Column(name = "city_id", nullable = false, precision = 32)
	public Integer getCityId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.address.postal_code</code>.
	 */
	public void setPostalCode(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.address.postal_code</code>.
	 */
	@Column(name = "postal_code", length = 10)
	public String getPostalCode() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.address.phone</code>.
	 */
	public void setPhone(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.address.phone</code>.
	 */
	@Column(name = "phone", nullable = false, length = 20)
	public String getPhone() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.address.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.address.last_update</code>.
	 */
	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, String, String, Integer, String, String, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, String, String, Integer, String, String, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Address.ADDRESS.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Address.ADDRESS.ADDRESS_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Address.ADDRESS.ADDRESS2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Address.ADDRESS.DISTRICT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Address.ADDRESS.CITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Address.ADDRESS.POSTAL_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Address.ADDRESS.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Address.ADDRESS.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getAddress2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDistrict();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getCityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getPostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value1(Integer value) {
		setAddressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value2(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value3(String value) {
		setAddress2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value4(String value) {
		setDistrict(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value5(Integer value) {
		setCityId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value6(String value) {
		setPostalCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value7(String value) {
		setPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value8(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(Address.ADDRESS);
	}

	/**
	 * Create a detached, initialised AddressRecord
	 */
	public AddressRecord(Integer addressId, String address, String address2, String district, Integer cityId, String postalCode, String phone, Timestamp lastUpdate) {
		super(Address.ADDRESS);

		setValue(0, addressId);
		setValue(1, address);
		setValue(2, address2);
		setValue(3, district);
		setValue(4, cityId);
		setValue(5, postalCode);
		setValue(6, phone);
		setValue(7, lastUpdate);
	}
}

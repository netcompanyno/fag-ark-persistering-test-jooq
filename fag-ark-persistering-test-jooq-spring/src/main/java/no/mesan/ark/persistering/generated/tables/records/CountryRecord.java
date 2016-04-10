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

import no.mesan.ark.persistering.generated.tables.Country;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
@Table(name = "country", schema = "public")
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record3<Integer, String, Timestamp> {

	private static final long serialVersionUID = 1669600473;

	/**
	 * Setter for <code>public.country.country_id</code>.
	 */
	public void setCountryId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.country.country_id</code>.
	 */
	@Id
	@Column(name = "country_id", unique = true, nullable = false, precision = 32)
	public Integer getCountryId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.country.country</code>.
	 */
	public void setCountry(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.country.country</code>.
	 */
	@Column(name = "country", nullable = false, length = 50)
	public String getCountry() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.country.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.country.last_update</code>.
	 */
	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Timestamp> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Timestamp> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Country.COUNTRY.COUNTRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Country.COUNTRY.COUNTRY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Country.COUNTRY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getCountryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value1(Integer value) {
		setCountryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value2(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value3(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord values(Integer value1, String value2, Timestamp value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CountryRecord
	 */
	public CountryRecord() {
		super(Country.COUNTRY);
	}

	/**
	 * Create a detached, initialised CountryRecord
	 */
	public CountryRecord(Integer countryId, String country, Timestamp lastUpdate) {
		super(Country.COUNTRY);

		setValue(0, countryId);
		setValue(1, country);
		setValue(2, lastUpdate);
	}
}

/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import no.mesan.ark.persistering.generated.tables.PaymentP2007_06;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
@Table(name = "payment_p2007_06", schema = "public")
public class PaymentP2007_06Record extends TableRecordImpl<PaymentP2007_06Record> implements Record6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> {

	private static final long serialVersionUID = 27480169;

	/**
	 * Setter for <code>public.payment_p2007_06.payment_id</code>.
	 */
	public void setPaymentId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.payment_id</code>.
	 */
	@Column(name = "payment_id", nullable = false, precision = 32)
	public Integer getPaymentId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.payment_p2007_06.customer_id</code>.
	 */
	public void setCustomerId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.customer_id</code>.
	 */
	@Column(name = "customer_id", nullable = false, precision = 32)
	public Integer getCustomerId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.payment_p2007_06.staff_id</code>.
	 */
	public void setStaffId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.staff_id</code>.
	 */
	@Column(name = "staff_id", nullable = false, precision = 32)
	public Integer getStaffId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.payment_p2007_06.rental_id</code>.
	 */
	public void setRentalId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.rental_id</code>.
	 */
	@Column(name = "rental_id", nullable = false, precision = 32)
	public Integer getRentalId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.payment_p2007_06.amount</code>.
	 */
	public void setAmount(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.amount</code>.
	 */
	@Column(name = "amount", nullable = false, precision = 5, scale = 2)
	public BigDecimal getAmount() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>public.payment_p2007_06.payment_date</code>.
	 */
	public void setPaymentDate(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.payment_p2007_06.payment_date</code>.
	 */
	@Column(name = "payment_date", nullable = false)
	public Timestamp getPaymentDate() {
		return (Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return PaymentP2007_06.PAYMENT_P2007_06.PAYMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return PaymentP2007_06.PAYMENT_P2007_06.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return PaymentP2007_06.PAYMENT_P2007_06.STAFF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return PaymentP2007_06.PAYMENT_P2007_06.RENTAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return PaymentP2007_06.PAYMENT_P2007_06.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return PaymentP2007_06.PAYMENT_P2007_06.PAYMENT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPaymentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStaffId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getRentalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getPaymentDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value1(Integer value) {
		setPaymentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value2(Integer value) {
		setCustomerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value3(Integer value) {
		setStaffId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value4(Integer value) {
		setRentalId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value5(BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record value6(Timestamp value) {
		setPaymentDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_06Record values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, Timestamp value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PaymentP2007_06Record
	 */
	public PaymentP2007_06Record() {
		super(PaymentP2007_06.PAYMENT_P2007_06);
	}

	/**
	 * Create a detached, initialised PaymentP2007_06Record
	 */
	public PaymentP2007_06Record(Integer paymentId, Integer customerId, Integer staffId, Integer rentalId, BigDecimal amount, Timestamp paymentDate) {
		super(PaymentP2007_06.PAYMENT_P2007_06);

		setValue(0, paymentId);
		setValue(1, customerId);
		setValue(2, staffId);
		setValue(3, rentalId);
		setValue(4, amount);
		setValue(5, paymentDate);
	}
}

/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


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
@Table(name = "payment_p2007_04", schema = "public")
public class PaymentP2007_04 implements Serializable {

	private static final long serialVersionUID = 735375149;

	private Integer    paymentId;
	private Integer    customerId;
	private Integer    staffId;
	private Integer    rentalId;
	private BigDecimal amount;
	private Timestamp  paymentDate;

	public PaymentP2007_04() {}

	public PaymentP2007_04(PaymentP2007_04 value) {
		this.paymentId = value.paymentId;
		this.customerId = value.customerId;
		this.staffId = value.staffId;
		this.rentalId = value.rentalId;
		this.amount = value.amount;
		this.paymentDate = value.paymentDate;
	}

	public PaymentP2007_04(
		Integer    paymentId,
		Integer    customerId,
		Integer    staffId,
		Integer    rentalId,
		BigDecimal amount,
		Timestamp  paymentDate
	) {
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.staffId = staffId;
		this.rentalId = rentalId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	@Column(name = "payment_id", nullable = false, precision = 32)
	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Column(name = "customer_id", nullable = false, precision = 32)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "staff_id", nullable = false, precision = 32)
	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	@Column(name = "rental_id", nullable = false, precision = 32)
	public Integer getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	@Column(name = "amount", nullable = false, precision = 5, scale = 2)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "payment_date", nullable = false)
	public Timestamp getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("PaymentP2007_04 (");

		sb.append(paymentId);
		sb.append(", ").append(customerId);
		sb.append(", ").append(staffId);
		sb.append(", ").append(rentalId);
		sb.append(", ").append(amount);
		sb.append(", ").append(paymentDate);

		sb.append(")");
		return sb.toString();
	}
}
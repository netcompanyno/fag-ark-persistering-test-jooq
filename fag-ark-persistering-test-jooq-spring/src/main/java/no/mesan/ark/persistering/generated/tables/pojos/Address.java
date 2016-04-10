/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "address", schema = "public")
public class Address implements Serializable {

	private static final long serialVersionUID = -1070185939;

	private Integer   addressId;
	private String    address;
	private String    address2;
	private String    district;
	private Integer   cityId;
	private String    postalCode;
	private String    phone;
	private Timestamp lastUpdate;

	public Address() {}

	public Address(Address value) {
		this.addressId = value.addressId;
		this.address = value.address;
		this.address2 = value.address2;
		this.district = value.district;
		this.cityId = value.cityId;
		this.postalCode = value.postalCode;
		this.phone = value.phone;
		this.lastUpdate = value.lastUpdate;
	}

	public Address(
		Integer   addressId,
		String    address,
		String    address2,
		String    district,
		Integer   cityId,
		String    postalCode,
		String    phone,
		Timestamp lastUpdate
	) {
		this.addressId = addressId;
		this.address = address;
		this.address2 = address2;
		this.district = district;
		this.cityId = cityId;
		this.postalCode = postalCode;
		this.phone = phone;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@Column(name = "address_id", unique = true, nullable = false, precision = 32)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "address", nullable = false, length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "address2", length = 50)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "district", nullable = false, length = 20)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "city_id", nullable = false, precision = 32)
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@Column(name = "postal_code", length = 10)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "phone", nullable = false, length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Address (");

		sb.append(addressId);
		sb.append(", ").append(address);
		sb.append(", ").append(address2);
		sb.append(", ").append(district);
		sb.append(", ").append(cityId);
		sb.append(", ").append(postalCode);
		sb.append(", ").append(phone);
		sb.append(", ").append(lastUpdate);

		sb.append(")");
		return sb.toString();
	}
}

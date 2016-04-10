/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;

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
@Table(name = "staff_list", schema = "public")
public class StaffList implements Serializable {

	private static final long serialVersionUID = 2111955735;

	private Integer id;
	private String  name;
	private String  address;
	private String  zipCode;
	private String  phone;
	private String  city;
	private String  country;
	private Integer sid;

	public StaffList() {}

	public StaffList(StaffList value) {
		this.id = value.id;
		this.name = value.name;
		this.address = value.address;
		this.zipCode = value.zipCode;
		this.phone = value.phone;
		this.city = value.city;
		this.country = value.country;
		this.sid = value.sid;
	}

	public StaffList(
		Integer id,
		String  name,
		String  address,
		String  zipCode,
		String  phone,
		String  city,
		String  country,
		Integer sid
	) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.phone = phone;
		this.city = city;
		this.country = country;
		this.sid = sid;
	}

	@Column(name = "id", precision = 32)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "zip code", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "city", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "country", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "sid", precision = 32)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("StaffList (");

		sb.append(id);
		sb.append(", ").append(name);
		sb.append(", ").append(address);
		sb.append(", ").append(zipCode);
		sb.append(", ").append(phone);
		sb.append(", ").append(city);
		sb.append(", ").append(country);
		sb.append(", ").append(sid);

		sb.append(")");
		return sb.toString();
	}
}

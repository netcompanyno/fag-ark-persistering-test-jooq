/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


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
@Table(name = "film_category", schema = "public", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"film_id", "category_id"})
})
public class FilmCategory implements Serializable {

	private static final long serialVersionUID = -161958593;

	private Integer   filmId;
	private Integer   categoryId;
	private Timestamp lastUpdate;

	public FilmCategory() {}

	public FilmCategory(FilmCategory value) {
		this.filmId = value.filmId;
		this.categoryId = value.categoryId;
		this.lastUpdate = value.lastUpdate;
	}

	public FilmCategory(
		Integer   filmId,
		Integer   categoryId,
		Timestamp lastUpdate
	) {
		this.filmId = filmId;
		this.categoryId = categoryId;
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "film_id", nullable = false, precision = 32)
	public Integer getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	@Column(name = "category_id", nullable = false, precision = 32)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
		StringBuilder sb = new StringBuilder("FilmCategory (");

		sb.append(filmId);
		sb.append(", ").append(categoryId);
		sb.append(", ").append(lastUpdate);

		sb.append(")");
		return sb.toString();
	}
}
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
@Table(name = "film_actor", schema = "public", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"actor_id", "film_id"})
})
public class FilmActor implements Serializable {

	private static final long serialVersionUID = -1425283273;

	private Integer   actorId;
	private Integer   filmId;
	private Timestamp lastUpdate;

	public FilmActor() {}

	public FilmActor(FilmActor value) {
		this.actorId = value.actorId;
		this.filmId = value.filmId;
		this.lastUpdate = value.lastUpdate;
	}

	public FilmActor(
		Integer   actorId,
		Integer   filmId,
		Timestamp lastUpdate
	) {
		this.actorId = actorId;
		this.filmId = filmId;
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "actor_id", nullable = false, precision = 32)
	public Integer getActorId() {
		return this.actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	@Column(name = "film_id", nullable = false, precision = 32)
	public Integer getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
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
		StringBuilder sb = new StringBuilder("FilmActor (");

		sb.append(actorId);
		sb.append(", ").append(filmId);
		sb.append(", ").append(lastUpdate);

		sb.append(")");
		return sb.toString();
	}
}

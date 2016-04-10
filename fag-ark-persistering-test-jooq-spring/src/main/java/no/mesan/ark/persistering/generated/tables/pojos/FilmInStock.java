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
@Table(name = "film_in_stock", schema = "public")
public class FilmInStock implements Serializable {

	private static final long serialVersionUID = 389762719;

	private Integer pFilmCount;

	public FilmInStock() {}

	public FilmInStock(FilmInStock value) {
		this.pFilmCount = value.pFilmCount;
	}

	public FilmInStock(
		Integer pFilmCount
	) {
		this.pFilmCount = pFilmCount;
	}

	@Column(name = "p_film_count")
	public Integer getPFilmCount() {
		return this.pFilmCount;
	}

	public void setPFilmCount(Integer pFilmCount) {
		this.pFilmCount = pFilmCount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("FilmInStock (");

		sb.append(pFilmCount);

		sb.append(")");
		return sb.toString();
	}
}

package moviedb.data;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieRepo extends JpaRepository<Movie, Long> {
	Set<Movie> findByGenre(String genre);

	Set<Movie> findByTitleOrderByTitleAsc(String title);

	Set<Movie> findByDescriptionContaining(String text);

	@Query("select m from Movie m join m.actors a where a.firstname = :firstname and a.lastname = :lastname")
	Set<Movie> findByActorFirstnameAndLastname(@Param("firstname") String firstname,
			@Param("lastname") String lastname);
}

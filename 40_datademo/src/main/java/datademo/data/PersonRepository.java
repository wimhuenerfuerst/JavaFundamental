package datademo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findByFirstname(String firstname);

	List<Person> findByFirstnameAndLastname(String firstname, String lastname);

	Optional<Person> findByLastname(String lastname);

	@Query("select p from Person p where p.firstname = :f or p.lastname = :l")
	List<Person> myQuery(@Param("f") String f, @Param("l") String l);

	@Query(value = "select count(*) from person", nativeQuery = true)
	int myNativeQuery();
}

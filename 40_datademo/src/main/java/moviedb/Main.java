package moviedb;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import moviedb.data.Actor;
import moviedb.data.Movie;
import moviedb.data.MovieRepo;

@Component
public class Main {

	@Autowired
	MovieRepo movieRepo;

	@Transactional
	public void test() {

		Movie movie = new Movie();
		movie.setTitle("Test Movie");
		movie.setDescription("babalkaskjladslksajdl Hallo asjkdhaskdjhsk");
		movie.setGenre("Action");

		Actor actor = new Actor();
		actor.setFirstname("Hans");
		actor.setLastname("Peter");

		movie.getActors().add(actor);

		movieRepo.save(movie);
	}
	
	@Transactional
	public void test2() {

		System.out.println(movieRepo.findByActorFirstnameAndLastname("Hans", "Peter"));
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("moviedb");
		context.getBean(Main.class).test();
		context.getBean(Main.class).test2();
	}
}

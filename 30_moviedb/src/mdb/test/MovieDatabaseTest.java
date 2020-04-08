package mdb.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import mdb.Genre;
import mdb.Movie;
import mdb.MovieDatabase;
import mdb.MovieReport;
import mdb.Rating;
import mdb.Review;
import mdb.Reviewer;

public class MovieDatabaseTest {

	Movie movie = new Movie("MA", Genre.ACTION);

	@Test
	public void testAddMovieMultiple() {
		MovieDatabase movieDatabase = new MovieDatabase();
		Movie movie2 = new Movie("MA2", Genre.COMEDY);

		Movie[] expecteds = { movie, movie2 };

		movieDatabase.addMovie(movie);
		movieDatabase.addMovie(movie2);

		Movie[] actuals = movieDatabase.getMovies();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testAddMovieDuplicate() {
		MovieDatabase movieDatabase = new MovieDatabase();
		Movie[] expecteds = { movie };

		movieDatabase.addMovie(movie);
		movieDatabase.addMovie(movie);

		Movie[] actuals = movieDatabase.getMovies();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testListMoviesByGenre() {
		MovieDatabase movieDatabase = new MovieDatabase();

		Movie action1 = new Movie("a1", Genre.ACTION);
		Movie action2 = new Movie("a2", Genre.ACTION);
		Movie horror1 = new Movie("h1", Genre.HORROR);
		Movie drama1 = new Movie("d1", Genre.DRAMA);

		Movie[] expecteds = { action1, action2 };

		movieDatabase.addMovie(action1);
		movieDatabase.addMovie(action2);
		movieDatabase.addMovie(horror1);
		movieDatabase.addMovie(drama1);

		Movie[] actuals = movieDatabase.listMoviesByGenre(Genre.ACTION);

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testListMoviesByGenreEmpty() {
		MovieDatabase movieDatabase = new MovieDatabase();

		Movie[] expecteds = {};

		Movie[] actuals = movieDatabase.listMoviesByGenre(Genre.ACTION);

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGeneratePopularMovieReport() {
		MovieDatabase movieDatabase = new MovieDatabase();

		Reviewer reviewer1 = new Reviewer("R1", "R1L");
		Reviewer reviewer2 = new Reviewer("R2", "R2L");

		Review review1 = new Review(reviewer1, Rating.BAD, "bad", 10);
		Review review2 = new Review(reviewer2, Rating.GOOD, "good", 100);

		movie.addReview(review1);
		movie.addReview(review2);

		movieDatabase.addMovie(movie);

		String movieTitle = movie.getTitle();
		Genre movieGenre = movie.getGenre();
		String reviewerFullName = reviewer2.getFirstname() + " " + reviewer2.getLastname();
		String reviewText = review2.getText();
		Rating reviewRating = review2.getRating();

		MovieReport movieReport = new MovieReport(movieTitle, movieGenre, reviewerFullName, reviewText, reviewRating);

		MovieReport[] expecteds = { movieReport };

		MovieReport[] actuals = movieDatabase.generatePopularMovieReport();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGeneratePopularMovieReportNoReview() {
		MovieDatabase movieDatabase = new MovieDatabase();

		movieDatabase.addMovie(movie);

		MovieReport[] expecteds = {};

		MovieReport[] actuals = movieDatabase.generatePopularMovieReport();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGeneratePopularMovieReportNoMovie() {
		MovieDatabase movieDatabase = new MovieDatabase();

		MovieReport[] expecteds = {};

		MovieReport[] actuals = movieDatabase.generatePopularMovieReport();

		assertArrayEquals(expecteds, actuals);
	}
}

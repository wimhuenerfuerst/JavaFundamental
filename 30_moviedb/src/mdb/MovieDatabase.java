package mdb;

import java.util.Arrays;

/**
 * Movie Database for storing movies and reviews
 * 
 * @author sascha lippert
 *
 */
public class MovieDatabase {
	Movie[] movies = {};

	public Movie[] getMovies() {
		return movies;
	}

	/**
	 * Adds moview to database
	 * 
	 * @param movie to be added
	 */
	public void addMovie(Movie movie) {
		for (Movie other : movies) {
			if (movie.equals(other)) {
				return;
			}
		}

		movies = Arrays.copyOf(movies, movies.length + 1);
		movies[movies.length - 1] = movie;
	}

	/**
	 * Retrieves list of movies by genre
	 * 
	 * @param genre of movies
	 * @return list of movies by genre or empty list of no movies found
	 */
	public Movie[] listMoviesByGenre(Genre genre) {
		Movie[] list = {};

		for (Movie movie : movies) {
			if (genre.equals(movie.genre)) {
				list = Arrays.copyOf(list, list.length + 1);
				list[list.length - 1] = movie;
			}
		}

		return list;
	}

	private Review getPopularReview(Movie movie) {
		Review[] reviews = movie.getReviews();
		Review review = reviews[0];
		int clicks = review.getClicks();

		for (int i = 1; i < reviews.length; i++) {
			if (reviews[i].getClicks() > clicks) {
				review = reviews[i];
			}
		}

		return review;
	}

	private MovieReport createReport(Movie movie) {
		Review review = getPopularReview(movie);
		Reviewer reviewer = review.getReviewer();

		String movieTitle = movie.getTitle();
		Genre movieGenre = movie.getGenre();
		String reviewerFullName = reviewer.getFirstname() + " " + reviewer.getLastname();
		String reviewText = review.getText();
		Rating reviewRating = review.getRating();

		return new MovieReport(movieTitle, movieGenre, reviewerFullName, reviewText, reviewRating);
	}

	/**
	 * Creates movie reports based each movies on most popular review. Movies with
	 * no reviews are not added to the report
	 * 
	 * @return MovieReports or empty list if no movies found
	 */
	public MovieReport[] generatePopularMovieReport() {

		MovieReport[] movieReports = {};

		for (Movie movie : movies) {
			if (movie.getReviews().length > 0) {
				MovieReport movieReport = createReport(movie);
				movieReports = Arrays.copyOf(movieReports, movieReports.length + 1);
				movieReports[movieReports.length - 1] = movieReport;
			}
		}

		return movieReports;
	}
}

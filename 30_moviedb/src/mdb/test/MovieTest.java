package mdb.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import mdb.Genre;
import mdb.Movie;
import mdb.Rating;
import mdb.Review;
import mdb.Reviewer;

public class MovieTest {

	Reviewer reviewer = new Reviewer("RR", "RL");
	Review review = new Review(reviewer, Rating.BAD, "bad", 1);

	@Test
	public void testAddReview() {
		Movie movie = new Movie("MA", Genre.ACTION);		

		Review[] expecteds = { review };

		movie.addReview(review);

		Review[] actuals = movie.getReviews();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testAddReviewDuplicate() {
		Movie movie = new Movie("MA", Genre.ACTION);

		Review[] expecteds = { review };

		movie.addReview(review);
		movie.addReview(review);

		Review[] actuals = movie.getReviews();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testAddReviewEmpty() {
		Movie movie = new Movie("MA", Genre.ACTION);

		Review[] expecteds = {};

		Review[] actuals = movie.getReviews();

		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testAddReviewMultiple() {
		Movie movie = new Movie("MA", Genre.ACTION);
		
		Review review2 = new Review(reviewer, Rating.GOOD, "super", 10);

		Review[] expecteds = { review , review2};		

		movie.addReview(review);
		movie.addReview(review2);

		Review[] actuals = movie.getReviews();

		assertArrayEquals(expecteds, actuals);
	}

}

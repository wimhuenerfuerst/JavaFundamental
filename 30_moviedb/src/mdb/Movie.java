package mdb;

import java.util.Arrays;

public class Movie {
	String title;
	Genre genre;
	Review[] reviews = {};

	public Movie(String title, Genre genre) {
		super();
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

	public Review[] getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		for (Review other : reviews) {
			if (review.equals(other)) {
				return;
			}
		}

		reviews = Arrays.copyOf(reviews, reviews.length + 1);
		reviews[reviews.length - 1] = review;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + "]";
	}
}

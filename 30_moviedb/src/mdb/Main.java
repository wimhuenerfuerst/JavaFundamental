package mdb;

public class Main {

	public static void main(String[] args) {
		MovieDatabase movieDatabase = new MovieDatabase();
		
		Movie movie = new Movie("Supermovie", Genre.ACTION);
		
		Reviewer reviewer = new Reviewer("Hans", "Maulwurf");
		Review review = new Review(reviewer, Rating.VERY_GOOD, "Top movie", 1000);		
		movie.addReview(review);
		
		movieDatabase.addMovie(movie);
		
		System.out.println(movie);
		System.out.println(reviewer);
		System.out.println(review);
	}

}

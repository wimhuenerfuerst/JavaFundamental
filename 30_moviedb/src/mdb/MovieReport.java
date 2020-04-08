package mdb;

public class MovieReport {
	String movieTitle;
	Genre movieGenre;
	String reviewerFullName;
	String reviewText;
	Rating reviewRating;

	public MovieReport(String movieTitle, Genre movieGenre, String reviewerFullName, String reviewText,
			Rating reviewRating) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
		this.reviewerFullName = reviewerFullName;
		this.reviewText = reviewText;
		this.reviewRating = reviewRating;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public Genre getMovieGenre() {
		return movieGenre;
	}

	public String getReviewerFullName() {
		return reviewerFullName;
	}

	public String getReviewText() {
		return reviewText;
	}

	public Rating getReviewRating() {
		return reviewRating;
	}

	@Override
	public String toString() {
		return "MovieReport [movieTitle=" + movieTitle + ", movieGenre=" + movieGenre + ", reviewerFullName="
				+ reviewerFullName + ", reviewText=" + reviewText + ", reviewRating=" + reviewRating + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieReport other = (MovieReport) obj;
		if (movieGenre != other.movieGenre)
			return false;
		if (movieTitle == null) {
			if (other.movieTitle != null)
				return false;
		} else if (!movieTitle.equals(other.movieTitle))
			return false;
		if (reviewRating != other.reviewRating)
			return false;
		if (reviewText == null) {
			if (other.reviewText != null)
				return false;
		} else if (!reviewText.equals(other.reviewText))
			return false;
		if (reviewerFullName == null) {
			if (other.reviewerFullName != null)
				return false;
		} else if (!reviewerFullName.equals(other.reviewerFullName))
			return false;
		return true;
	}

}

package mdb;

import java.util.UUID;

public class Review {
	String uuid;
	Reviewer reviewer;
	Rating rating;
	String text;
	int clicks;

	public Review(Reviewer reviewer, Rating rating, String text, int clicks) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.reviewer = reviewer;
		this.rating = rating;
		this.text = text;
		this.clicks = clicks;
	}

	public String getUuid() {
		return uuid;
	}

	public Reviewer getReviewer() {
		return reviewer;
	}

	public Rating getRating() {
		return rating;
	}

	public String getText() {
		return text;
	}

	public int getClicks() {
		return clicks;
	}

	@Override
	public String toString() {
		return "Review [uuid=" + uuid + ", reviewer=" + reviewer + ", rating=" + rating + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}

package book;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.setId(id);
		this.setDescription(description);
		this.setRating(rating);
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// print
	public String toString() {
		return String.format("Reviews: id - %d, description - %s, rating - %d", id, description, rating);
	}
}

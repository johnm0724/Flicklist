package interfaces;

public interface Rating {
	
	
	
	// Variables
	static int starRating = 0;   // average rating
	static int currentUserRating = 0;  // specific rating from user
	
	
	
	
	
	
	// Getters
	public default long getStarRating() {
		return starRating;
	}
	
	public default long getCurrentUserRating() {
		return currentUserRating;
	}
	
	// Setters
	static void setCurrentUserRating() {
		
	}
	
	static void setStarReviews() {
		
	}
	
	
	
	
}

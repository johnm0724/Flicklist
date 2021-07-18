package interfaces;


public interface Likes {
	
	
	// Variables
	static long likes = 0;    // number of likes per object
	static boolean currentUserLikes= false;    // does current user like the movie
	
	
	// Getters
	public default long getLikes() {
		return likes;
	}
	
	public default boolean getCurrentUserLikes() {
		return currentUserLikes;
	}
	
	// Setters
	static void setLikes(long numOfLikes) {
		
	}
	
	static void setCurrentUserLikes() {
		
	}
	
}
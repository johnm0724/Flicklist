package tester;

import java.util.ArrayList;

public class Movies {
	private String title;
	private float rating;
	private ArrayList<String> cast;
	private int movieLikes;
	private String genre;
	private ArrayList<Reviews> reviews;
	
	// possible additions
	private int year;
	private String synopsis;
	
	public Movies(String title, float rating, ArrayList<String> cast, int movieLikes, String genre, ArrayList<Reviews> reviews, int year, String synopsis) {
		this.title = title;
		this.rating = rating;
		this.cast = cast;
		this.movieLikes = movieLikes;
		this.genre = genre;
		this.reviews = reviews;
		
		this.year = year;
		this.synopsis = synopsis;
	}
	
	public String getTitle() {
		return title;
	}
	
	public float getRating() {
		return rating;
	}
	
	public int getMovieLikes() {
		return movieLikes;
	}
	
	public String genre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void printReviews() {
		System.out.print("\nReviews:\n\t");
		for(int i = 0; i < reviews.size(); i++) {
			Reviews current = reviews.get(i);
			System.out.println("Name: " + current.name + "\n");
			System.out.println("Rated this: " + current.rating + "\n");
			System.out.println("Review: \n");
			String[] words = current.heartFeltWordsOnWhyItSucked.split(" ");
			for(int j = 0; j < 10; j++) {
				System.out.print(words[j] + " ");
				if(j % 10 == 0)
					System.out.println();
			}
		}
	}
	
	public void printDetails() {
		System.out.println(title + "\n");
		System.out.println("Genre: " + genre + ", Release Year: " + year);
		System.out.println("Rating: " + rating + ", Likes: " + movieLikes + "\n");
		String[] syn = synopsis.split(" ");
		for(int i = 0; i < syn.length; i++) {
			System.out.print(syn[i] + " ");
			if(i % 10 == 0)
				System.out.println();
		}
		System.out.print("\nCast:\n\t");
		for(int i = 0; i < cast.size(); i++) {
			System.out.print(cast.get(i) + "\t");
			if(i % 3 == 0)
				System.out.println("\t");
		}
	}
}

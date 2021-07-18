package flickListMovie;

public class Reviews {
	
	public String name;
	public float rating;
	public String heartFeltWordsOnWhyItSucked;
	
	public Reviews(String name, float rating, String words) {
		this.name = name;
		this.rating = rating;
		this.heartFeltWordsOnWhyItSucked = words;
	}
}

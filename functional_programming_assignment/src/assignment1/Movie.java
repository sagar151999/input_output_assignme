package assignment1;

public class Movie 
{
	protected String movie_name;
	protected int relese_year;
	protected String industry;
	
	
	public Movie(String movie_name, int relese_year, String industry) {
		
		this.movie_name = movie_name;
		this.relese_year = relese_year;
		this.industry = industry;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getRelese_year() {
		return relese_year;
	}
	public void setRelese_year(int relese_year) {
		this.relese_year = relese_year;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	@Override
	public String toString() {
		return "Movie [movie_name=" + movie_name + ", relese_year=" + relese_year + ", industry=" + industry + "]";
	}
	

}

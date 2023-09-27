package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Sorting : sort and print in increasing order of release date of movie using sort function directly on movies object
public class question3_print_relese_year_in_increasing_order {

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Spotlight",2015,"Hollywood"),
				new Movie("Avengers: Infinity War",2018,"Hollywood"),
				new Movie("Inception",2010,"Hollywood"),
				new Movie("Forest Gump",1994,"Hollywood"),
				new Movie("3 Idiots",2009,"Bollywood"),
				new Movie("Beauty and the beast",2017,"Hollywood"),
				new Movie("Slumdog Millionaire",2008,"Bollywood")

				);
		Collections.sort(movies,(movie1,movie2)->Integer.compare(movie1.getRelese_year(),movie2.getRelese_year()));
		for (Movie movie : movies) 
		{
			System.out.println(movie);
		}
	}

}

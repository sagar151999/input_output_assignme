package assignment1;

import java.util.Arrays;
import java.util.List;

public class question4_print_movie_name_reduce_terminal {

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
		
		String movieNames = movies.stream()
				.map(Movie::getMovie_name)
				.reduce("",(accumulator, moviesNames)->accumulator+moviesNames+",",(result1,result2)->result1+result2);
				
		if(!movieNames.isEmpty())
		{
			movieNames=movieNames.substring(0,movieNames.length()-2);
		}
		System.out.println("movieNames: "+movieNames);
	}

}

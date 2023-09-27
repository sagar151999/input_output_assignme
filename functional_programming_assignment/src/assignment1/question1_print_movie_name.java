package assignment1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Mapping : print only the names of all the movies
public class question1_print_movie_name {

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
		
		List<String> moviename=movies.stream()
				.map(Movie::getMovie_name)
				.collect(Collectors.toList());
				System.out.println("the movies name are : ");
		moviename.forEach(System.out::println);
		
}
}

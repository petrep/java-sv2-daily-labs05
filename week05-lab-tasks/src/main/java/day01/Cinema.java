package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
	List<Movie> movies = new ArrayList<>();

	public void addMovie(Movie movie){
		movies.add(movie);
	}

	public List<String> findMovieByTime(LocalDateTime playTime){
		List<String> availableMovies = new ArrayList<>();
		for (Movie currentMovie : movies) {
			List<LocalDateTime> currentMoviePlayTimes = currentMovie.getPlayTimesList();
			for (LocalDateTime currMoviePlayTime : currentMoviePlayTimes) {
//				System.out.println(currMoviePlayTime);
				if (currMoviePlayTime.equals(playTime)) availableMovies.add(currentMovie.getTitle());
			}
		}

		return availableMovies;
	}
}

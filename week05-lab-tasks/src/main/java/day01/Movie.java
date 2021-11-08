package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
	private String title;
	private List<LocalDateTime> playTimesList;

	public Movie(String title, List<LocalDateTime> playTimesList) {
		this.title = title;
		this.playTimesList = playTimesList;
	}

	public String getTitle() {
		return title;
	}

	public List<LocalDateTime> getPlayTimesList() {
		return playTimesList;
	}
}

package model;

	public class Song {
		private String title;
		private String artist;
		private String album;
		private int popularity;
		private boolean isExplicit;
		private String genre;
		private double length;
		private double energy;
		private double loudness;
		private double valence;

		public Song(String title, String artist, String album, int popularity, boolean isExplicit,
				String genre, double length, double energy, double loudness, double valence) {
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.popularity = popularity;
			this.isExplicit = isExplicit;
			this.genre = genre;
			this.length = length;
			this.energy = energy;
			this.loudness = loudness;
			this.valence = valence;
		}

		// Getters and Setters for all properties

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getAlbum() {
			return album;
		}

		public void setAlbum(String album) {
			this.album = album;
		}

		public int getPopularity() {
			return popularity;
		}

		public void setPopularity(int popularity) {
			this.popularity = popularity;
		}

		public boolean isExplicit() {
			return isExplicit;
		}

		public void setExplicit(boolean explicit) {
			isExplicit = explicit;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getEnergy() {
			return energy;
		}

		public void setEnergy(double energy) {
			this.energy = energy;
		}

		public double getLoudness() {
			return loudness;
		}

		public void setLoudness(double loudness) {
			this.loudness = loudness;
		}

		public double getValence() {
			return valence;
		}

		public void setValence(double valence) {
			this.valence = valence;
		}

		// toString() method to represent the Song object as a string

		@Override
		public String toString() {
			return "Song{" +
					"title='" + title + '\'' +
					", artist='" + artist + '\'' +
					", album='" + album + '\'' +
					", popularity=" + popularity +
					", isExplicit=" + isExplicit +
					", genre='" + genre + '\'' +
					", length=" + length +
					", energy=" + energy +
					", loudness=" + loudness +
					", valence=" + valence +
					'}';
		}
	}

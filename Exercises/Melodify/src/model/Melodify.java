package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Melodify {
	private Song[] allSongs;

	public void readCSV(String filePath) {
		allSongs = new Song[200];

		try (BufferedReader br = new BufferedReader(new FileReader(filePath)))  {
			// Skip the header line
			br.readLine();

			// Read the song data and populate the array
			for (int index = 0; index < 200; index++) {
				String line = br.readLine();
				String[] data = line.split(",");

				// Assuming the CSV file format is: title, artist, album, popularity, explicit, genre, length, energy, loudness, valence

				String title = data[0];
				String artist = data[1];
				String album = data[2];
				int popularity = Integer.parseInt(data[3]);
				boolean isExplicit = Boolean.parseBoolean(data[4]);
				String genre = data[5];
				double length = Double.parseDouble(data[6]);
				double energy = Double.parseDouble(data[7]);
				double loudness = Double.parseDouble(data[8]);
				double valence = Double.parseDouble(data[9]);

				Song song = new Song(title, artist, album, popularity, isExplicit, genre, length, energy, loudness, valence);
				allSongs[index] = song;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Getters and Setters for allSongs

	public Song[] getAllSongs() {
		return allSongs;
	}

	public void setAllSongs(Song[] allSongs) {
		this.allSongs = allSongs;
	}


	// Main function
	public static void main(String[] args) {
		Melodify melodify = new Melodify();
		melodify.readCSV("melodify.csv");
 
		Song[] songs = melodify.getAllSongs();
		for (Song song : songs) {
			System.out.println(song);
		}
	}

	public Song[] findSong(String songTitle) {
		Song[] foundSongs;
		for(int i = 0 ; i < allSongs.length ; i++) {
			String allSongsTitle = allSongs.get(i);
			    if(songTitle == allSongsTitle) {
			    	foundSongs.add(song);
			    }
		}
	}

	  public void sortPopularity() {
	        boolean swapped;
	        for (int i = 0; i < allSongs.length - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < allSongs.length - i - 1; j++) {
	                if (allSongs[j].getPopularity() < allSongs[j + 1].getPopularity()) {
	                    // Swap the elements
	                    Song temp = allSongs[j];
	                    allSongs[j] = allSongs[j + 1];
	                    allSongs[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no two elements were swapped by inner loop, then break
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	  
	  public void sortValence() {
	        for (int i = 0; i < allSongs.length - 1; i++) {
	            // Find the minimum element in unsorted array
	            int minIndex = i;
	            for (int j = i + 1; j < allSongs.length; j++) {
	                if (allSongs[j].getValence() < allSongs[minIndex].getValence()) {
	                    minIndex = j;
	                }
	            }
	            // Swap the found minimum element with the first element
	            Song temp = allSongs[minIndex];
	            allSongs[minIndex] = allSongs[i];
	            allSongs[i] = temp;
	        }
	    }

}


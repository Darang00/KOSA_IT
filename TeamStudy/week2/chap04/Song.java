package week2.chap04;


public class Song {
	//Field
	String title;
	String artist;
	int year;
	String country;
	
	//Constructor
	Song(){	// default constructor
		
	}
	
	Song(String title, String artist, int year, String country){ // Initializing constructor
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	
	//Method
	void show() {
		System.out.println(year + "년 " + country + "국적의 "+ artist + "가 부른 " + title);
	}
	

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		
		song.show();
	

	}

}

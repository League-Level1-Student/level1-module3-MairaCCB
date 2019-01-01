
public class Netflix {
	public static void main(String[] args) {
		Movie m1 = new Movie("The Green Book", 5);
		Movie m2 = new Movie("A Simple Favor", 3);
		Movie m3 = new Movie("Elf", 3);
		Movie m4 = new Movie("Avengers: Infinity War", 5);
		Movie m5 = new Movie("The BlacKkKlansman", 4);
	
		m1.getTicketPrice();
		
		NetflixQueue NQ = new NetflixQueue();
		
		NQ.addMovie(m1);
		NQ.addMovie(m2);
		NQ.addMovie(m3);
		NQ.addMovie(m4);
		NQ.addMovie(m5);
		
		NQ.sortMoviesByRating();
		
		NQ.printMovies();
		
		System.out.println("The best movie is " + NQ.getBestMovie());
		
		System.out.println("The second best movie is " + NQ.getMovie(1));
		
	}
	
}

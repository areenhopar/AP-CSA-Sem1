package pkg;

public class Movie{
    // GLOBAL VARIABLES
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    // CONSTRUCTORS
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    // GETTERS AND SETTERS
    public String getMovieName() {
        return this.movieName;
    }
    
    public int getRevenue() {
        return this.revenue;
    }
    
    // METHODS
    public void movieToString() {
        System.out.println("Movie: " + this.movieName);
        System.out.println("Rating: " + this.rating);
        System.out.println("Number of Ratings: " + this.numRatings);
        System.out.println("Revenue: " + this.revenue);
        System.out.println();
    }
    
    public void addRating(double rating) {
        //Since average is sum / num, we reverse that by doing average * num then add it and turn it into an average again
        this.rating = (this.rating * numRatings + rating) / (numRatings + 1);
        numRatings++;
    }
    
    public boolean compareRatings(Movie movie) {
        if (this.rating > movie.rating) 
            return true;
            
        return false;
    }
    
    public Movie pirateMovie() {
        return new Movie(movieName, rating, numRatings, revenue);
    }
    
    public String revenueToString() {
        int n = revenue;
        
        String a = "" + n % 1000;
        n = n / 1000;
        String b = "" + n % 1000;
        n = n / 1000;
        String c = "" + n % 1000;
        
        return c + "," + b + "," + a;
    }
}
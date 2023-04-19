public class movieTicket {
    private String movieName;
    private double moviePrice;
    private double moviePriceOff;
    private String dayOfWeek; // "Sun","Mon","Tue","Wed","Thu","Fri","Sat"

    public movieTicket(String movieName, double moviePrice, String dayOfWeek){
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.moviePriceOff = 0d;
        this.dayOfWeek = dayOfWeek;

        if(dayOfWeek == "Wed"){
            this.moviePriceOff = moviePrice/2;
            moviePrice -= moviePriceOff; 
        }
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public double getMoviePriceOff() {
        return moviePriceOff;
    }

    @Override
    public String toString() {
        return "Movie Ticket | [ Movie Name = " + movieName + ", movie Price = " + moviePrice + ", movie Price Off = " + moviePriceOff
                + ", day Of Week=" + dayOfWeek + "]";
    }

}

package Homework_day05;

public class Movie {
    public static void main(String[] args) {
        String name = "Avengers: Endgame", genre = "Action, Adventure, Sci-Fi";
        double duration = 2.50;
        String release_date = "April 25, 2019", rating = "PG-13";
        boolean sequals = true, onDVD = true;
        double rotten_rating = 94.0; // out of 100
        System.out.println("------ Welcome to the Cinema ----- \nTonight we are streaming" +
                name + " which was released on " + release_date + "." + " \nThis " + genre + " movie got a " +
                rotten_rating + " rating on Rotten Tomatoes. \nThe rating is " + rating + " and it runs for " + duration +
                " hours. \nThis is a sequel " + sequals + " and is on dvd " + onDVD);

    }
}

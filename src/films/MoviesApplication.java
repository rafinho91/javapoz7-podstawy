package films;

import java.util.*;

public class MoviesApplication {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Bruce", "Lee", 1963);
        Actor actor2 = new Actor("Jack", "Nickolson", 1957);
        Actor actor3 = new Actor("Brad", "Pitt", 1974);
        Movie movie1 = new Movie("Matrix", "Sci-fi", 2010, new Director("Bracia", "Wachowscy", 1970));
        Movie movie2 = new Movie("Harry Potter", "Magic", 2010, new Director("JK", "Rowling", 1979));
        Movie movie3 = new Movie("Harry Potter 2", "Magic", 2010, new Director("JK", "Rowling", 1979));
        Movie movie4 = new Movie("Harry Potter 3", "Magic", 2010, new Director("JK", "Rowling", 1979));

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        Map<Movie, List<Actor>> roles = new HashMap<>();
        roles.put(movie1, Arrays.asList(actor1, actor2, actor3));
        roles.put(movie2, Arrays.asList(actor1));
        roles.put(movie3, Arrays.asList(actor2, actor3));
        roles.put(movie4, Arrays.asList(actor1));

        MoviesService moviesService = new MoviesService(actors,movies,roles);
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("======= MOVIES APP ========");
            System.out.println();
            System.out.println("1. Actors");
            System.out.println("2. Movies");
            System.out.println("3. Actor's movies list");

            System.out.println("0. EXIT");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    showActors(scanner,moviesService);
                    break;
                case 2:
                    showMovies(scanner,moviesService);
                    break;
                case 3:
                    int actorId = scanner.nextInt();
                    actorMoviesView(scanner, moviesService, actorId);
                    break;
            }

        } while(answer != 0);
    }

    private static void actorMoviesView(Scanner scanner, MoviesService moviesService, int actorId) {
        Actor actor = moviesService.findActors(actorId);
        List<Movie> actorMovies = moviesService.findMovies(actor);
        viewMovies(actorMovies);
    }

    private static void showMovies(Scanner scanner, MoviesService moviesService) {
        List<Movie> movies = moviesService.findMovies();
        viewMovies(movies);
        scanner.nextLine();
    }

    private static void viewMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void showActors(Scanner scanner, MoviesService moviesService) {
        System.out.println("ACTORS: ");
        List<Actor> actors = moviesService.findActors();
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        scanner.nextLine();
    }
}

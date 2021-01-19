public class Main {
    public static void main(String[] args) {
        Movie[] movies = getMovies();
        Theatre[] theatres = getTheatres();

        for (Movie movie : movies) {
            validateEvent(movie);
        }

        for (Theatre theatre : theatres) {
            validateEvent(theatre);
        }

        System.out.println("Все события корректны");
    }

    static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Пираты карибского моря", 2007, 16),
                new Movie("Пираты карибского моря 2", 2009, 16),
                new Movie(null, 2007, 0)
        };
    }

    static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Коренина", 0, 16),
                new Theatre("Мастер и Маргарита", 1989, 0),
                new Theatre("Гамлет", 1789, 16)
        };
    }

    static void validateEvent(Event event) throws RuntimeException {
        String description = event.toString();
        if (description.contains("null") || description.contains("0"))
            throw new RuntimeException("The event contains empty values");
    }
}
public class MovieDriver
{
  public static void main(String[] args)
  {
    Movie Frozen = new Movie();
    Frozen.setName("Frozen");
    Frozen.setRating("PG");
    Frozen.addRating(1);
    Frozen.addRating(2);
    Frozen.addRating(3);
    Frozen.addRating(5);
    Frozen.addRating(5);
    Frozen.addRating(5);
    Frozen.getName();
    Frozen.getRating();
    Frozen.getAverage();
    System.out.println("Movie name: " + Frozen.getName());
    System.out.println("Movie rating: " + Frozen.getRating());
    System.out.println("Average rating: " + Frozen.getAverage());
    System.out.println();

    Movie Matrix = new Movie();
    Matrix.setName("Matrix");
    Matrix.setRating("R");
    Matrix.addRating(2);
    Matrix.addRating(3);
    Matrix.addRating(4);
    Matrix.addRating(5);
    Matrix.addRating(5);
    Matrix.addRating(5);
    Matrix.addRating(5);
    Matrix.addRating(5);
    Matrix.getName();
    Matrix.getRating();
    Matrix.getAverage();
    System.out.println("Movie name: " + Matrix.getName());
    System.out.println("Movie rating: " + Matrix.getRating());
    System.out.println("Average rating: " + Matrix.getAverage());
  }
}

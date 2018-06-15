public class MovieDemo
{
  public static void main(String[] args)
  {
    Movie Frozen = new Movie();

    Frozen.setName("Frozen");
    Frozen.setRating("PG");
    Frozen.addRating(1);
    Frozen.addRating(2);
    Frozen.addRating(3);
    Frozen.addRating(4);
    Frozen.addRating(5);
    Frozen.getName();
    Frozen.getRating();
    Frozen.getAverage();
    System.out.println("Movie Name: " + Frozen.getName());
    System.out.println("Movie Rating: " + Frozen.getRating());
    System.out.println("Average Rating: " + Frozen.getAverage());
    System.out.println();

    Movie Matrix = new Movie();

    Matrix.setName("Matrix");
    Matrix.setRating("R");
    Matrix.addRating(1);
    Matrix.addRating(2);
    Matrix.addRating(3);
    Matrix.addRating(4);
    Matrix.addRating(5);
    Matrix.getName();
    Matrix.getRating();
    Matrix.getAverage();
    System.out.println("Movie Name: " + Matrix.getName());
    System.out.println("Movie Rating: " + Matrix.getRating());
    System.out.println("Average Rating: " + Matrix.getAverage());
    System.out.println();
  }
}

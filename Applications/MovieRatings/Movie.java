public class Movie
{
  private String name;
  private String rating;
  private int terrible = 0;
  private int bad = 0;
  private int ok = 0;
  private int good = 0;
  private int great = 0;
  private double average = 0;
  private double count = 0;

  public Movie() {
    name = "No name.";
    rating = "No ratings.";
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setRating(String newRating) {
    rating = newRating;
  }

  public String getName() {
    return name;
  }

  public String getRating() {
    return rating;
  }

  public void addRating(int newScore) {
    switch(newScore)
  {
    case 1:
      terrible++;
      count++;
      break;
    case 2:
      bad++;
      count++;
      break;
    case 3:
      ok++;
      count++;
      break;
    case 4:
      good++;
      count++;
      break;
    case 5:
      great++;
      count++;
      break;
    default:
      System.out.println("Please rate with a positive integer from 1 to 5...");
      break;
    }
  }

  public double getAverage() {
    double average = ((terrible + 1) + (bad + 2) + (ok + 3) + (good + 4) + (great + 5)) / count;
    return average;
  }
}

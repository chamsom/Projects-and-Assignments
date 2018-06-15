public class Movie
{
  private String name;
  private String rating;
  private int numRate[];
  private double average=0;

  public Movie()
  {
    name = "No name";
    rating = "No ratings";
    numRate = new int[5];
    numRate[0] = 0;
    numRate[1] = 0;
    numRate[2] = 0;
    numRate[3] = 0;
    numRate[4] = 0;
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

  public void addRating(int num) {
    if (num > 0 && num <= 5)
        numRate[num - 1]++;
    else
      System.out.println("Please only enter ratings from 1-5");
  }

  public double getAverage() {
    return (double)(numRate[0] * 1 + numRate[1] * 2 + numRate[2] * 3 + numRate[3] * 4 + numRate[4] * 5) / (numRate[0] + numRate[1] + numRate[2] + numRate[3] + numRate[4]);
  }
}

public class TimeDriver {

  public static void main(String[] args) {

  Time time1 = new Time();
  time1.setTime(12, 55);
  time1.setTime(26, 55);
  time1.setTime(12, 95);
  time1.setTime(66, 90);
  time1.setTime(3, 24);
  time1.setTime(4, 20, true);
  time1.setTime(23, 20, false);
  time1.getTime24(0, 5);
  time1.getTime24(15, 30);
  time1.getTime12(7, 25);
  time1.getTime12(0, 8);
  time1.getTime12(15, 45);

  }
}

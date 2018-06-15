public class Time {

  private static int hour;
  private static int minute;
  private static boolean isAm;

  public Time() {
    hour = 0;
    minute = 0;
  }

  public Time(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  public Time(int hour, int minute, boolean isAm) {
    this.hour = hour;
    this.minute = minute;
    this.isAm = isAm;
  }

  public boolean isValid(int hour, int minute) {
    if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)) {
      return true;
    }
    else {
      return false;
    }
  }

  public void setTime(int hour, int minute) {
    if (isValid(hour, minute)) {
      this.hour = hour;
      this.minute = minute;
      System.out.println("Hour: " + this.hour + " Minute: " + this.minute);
    }
    else {
      System.out.println("Invalid entry!");
    }
  }

  public void setTime(int hour, int minute, boolean isAm) {
    if (hour <= 12) {
      isAm = true;
    }
    else {
      isAm = false;
    }

    if ((hour >= 0 && hour <= 12) && (minute <= 59) && (isAm)) {
      this.hour = hour;
      this.minute = minute;
      System.out.println("Hour: " + this.hour + " Minute: " + this.minute);
    }
    else {
      System.out.println("Invalid entry!");
    }
  }

  public String getTime24(int hour,int minute) {

     String time="";

     if (hour>=0 && hour<10 && minute>=0 && minute<10) {
       time = "0" + hour + "0" + minute;
       System.out.println(time);
     }

     else if (hour>=10 && minute>=0 && minute<10) {
       time = hour + "0" + minute;
       System.out.println(time);
     }

     else if (hour>=0 && hour<10 && minute>=10) {
       time = "0" + hour + minute;
       System.out.println(time);
     }

     else {
       time = Integer.toString(hour) + Integer.toString(minute);
       System.out.println(time);
     }
     return time;
   }

     public String getTime12(int hour,int minute) {
     String time="";
     if (hour>12 && minute>=10) {
       time=Integer.toString(hour-12) + ":" + minute + " PM";
       System.out.println(time);
     }

     else if (hour>12 && minute<10) {
       time=Integer.toString(hour-12) + ":" + "0" + minute + " AM";
       System.out.println(time);
     }

     else if (hour<=12 && hour>0 && minute>=10) {
        time=Integer.toString(hour) + ":" + minute + " AM";
        System.out.println(time);
     }

     else if (hour<=12 && hour>0 && minute<10) {
       time=Integer.toString(hour) + ":" + "0" + minute + " AM";
       System.out.println(time);
     }

     else if (hour==0 && minute>=10) {
        time=Integer.toString(hour+12) + ":" + minute + " AM";
        System.out.println(time);
     }

     else if (hour==0 && minute<10) {
       time=Integer.toString(hour+12) + ":" + "0" + minute + " AM";
       System.out.println(time);
     }
     return time;
     }
}

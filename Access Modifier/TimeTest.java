package Study;

class Time {
   private int hour; //private 접근제어자를 사용하여 같은 클래스에서만 사용가능
   private int minute;
   private int second;

   public void setHour(int hour){
       // 위에서 private를 사용한것을 아래 TimeTest에서 간접접근이 가능하도록 public 메서드 작성
       if(hour < 0 || hour >23 )return;
       this.hour=hour;
   }

   public int getHour() {return hour;}
}

public class TimeTest {
    public static void main(String[] args){
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());
    }
}

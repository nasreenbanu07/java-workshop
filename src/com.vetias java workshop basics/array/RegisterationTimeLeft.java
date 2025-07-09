import java.time.LocalTime;

public class RegisterationTimeLeft {

    public static void main(String[] args) {
        
        LocalTime currentTime = LocalTime.now();
        LocalTime registerationTimeLeft = LocalTime.of(18,15,59);
        int hoursleft=registerationTimeLeft.getHour()-currentTime.getHour();
        int minleft=registerationTimeLeft.getMinute()-currentTime.getMinute();
        int secleft=registerationTimeLeft.getSecond()-currentTime.getSecond();

        System.out.println("You have " + hoursleft + " hours " + minleft + " min " + secleft + " secondsleft");
    }
    }





    


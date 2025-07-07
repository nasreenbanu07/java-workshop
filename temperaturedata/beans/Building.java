import java.lang.reflect.AccessFlag.Location;
import java.time.LocalDateTime;
public class Building {
    private double area;
    private int floors;
    private LocalDateTime openDateTime;
    private LocalDateTime closeDateTime;
    private Sentences description; 
    public void area(double area) {
          area = area;
       }

       public double getarea() {
         return area;
       }
    public void floor(double floor) {
          floor = floor;
       }

       public double getfloor() {
         return floors;
       }
   
}

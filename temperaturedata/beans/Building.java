import java.time.LocalDateTime;
public class Building {
    private double area;
    private int floors;
    private LocalDateTime openDateTime;
    private LocalDateTime closeDateTime;
    private String description; 
    public void area(double area) {
          area = area;
       }

       public double getarea() {
         return area;
       }
}

public class Academic extends Building{
     private boolean isAuditoriumAvailable;
     private boolean islibrary;
     
     public void setIsAuditoriumAvailable(boolean aisAuditoriumAvailable) {
        isAuditoriumAvailable = aisAuditoriumAvailable;
     }
     public void printdetails() {
        super.printdetails();
        System.out.println("library Available:" + islibrary);
        System.out.println("Auditorium Available:" + isAuditoriumAvailable);
     }





}

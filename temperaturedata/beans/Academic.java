public class Academic extends Building{
     private boolean isAuditoriumAvailable() {
     private boolean islibrary available;
     }
     public boolean setAuditoriumAvailable(boolean isAuditoriumAvailable) {
        this.isAuditoriumAvailable = isAuditoriumAvailable;
     }
     public void printdetails() {
        super.printdetails();
        System.out.println("library Available:" + isLibraryAvailable);
        System.out.println("Auditorium Available:" + isAuditoriumAvailable);
     }





}

public class location{
       private String name;
       private double latitude;
       private double longtitude;
       private String description;
       private String address;
       private String country;
       private String city;
       private String postalcode;
       public void setName(String aName) {
          name = aName;
       }

       public String getname() {
         return name;
       }
       public void latitude(double latitude) {
          latitude = latitude;
       }

       public double getlatitude() {
         return latitude;
       }
       public void longtitude(double latitude) {
          longtitude = longtitude;
       }

       public double getlongtitude() {
          return longtitude;
       }
       public void description(String description) {
          description = description;
       }

       public String getdescription() {
         return description;
       }
      public void address(String address) {
          address = address;
       }

       public String getaddress() {
         return description;
       }
      public void  country(String country) {
          country = country;
       }

       public String country() {
         return country;
       }
      public void  city(String city) {
          city = city;
       }

       public String city() {
         return city;
       } 
      public void  postalcode(String postalcode) {
          postalcode = postalcode;
       }

       public String postalcode() {
         return postalcode;
       } 
       public String toString() {
          return "Location { name: " + name +
          ",latitude : " + latitude +
          ",longtitude : " + longtitude +
          ",description : " + description +
          ",address : " + address +
          ",country : " + country +
          ",city : " + city +
          ",postalcode : " + postalcode+"}";
          



       }
}

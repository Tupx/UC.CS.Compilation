
package studentinfo;

public class mainAll{
  
    public static void main(String[] args) {
         StudentInfo student = new StudentInfo("CITCS", "BSCS", "Something", 2, "2018 - 2019");
         student.setIdNumber("18-2977-319");
         student.setFirstname("Christopher");
         student.setLastName("Bermudez");
         student.printInformation();
      
         StudentInfo student = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation", 2, "2018 - 2019");
         student.setIdNumber("18-1921-981");
         student.setFirstname("Jay Wesley");
         student.setLastName("Decipeda");
         student.printInformation(); 
      
         StudentInfo student = new StudentInfo("CITCS", "BSIT", "Network Security", 2, "2018 - 2019");
         student.setIdNumber("18-7195-425");
         student.setFirstname("Castano Tome");
         student.setLastName("Teofilo");
         student.printInformation(); 
      
      
    }
    
    
}

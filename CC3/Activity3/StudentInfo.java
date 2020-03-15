
package studentinfo;

public class StudentInfo {
    
    private String idNumber, firstName, lastName, major, college, academicProgram;
    public int term;
    public String year;
    
    void printInformation() {
        
        String sign;

        if (term == 1) {
            sign = "st";
        } else if (term == 2) {
            sign = "nd";
        } else if (term == 3){
            sign = "rd";
        } else {
            sign = "th";
        }
        
        System.out.println("University of the Cordilleras \n"
                + college + "\n"
                + term + sign + " SY: " + year + "\n"
                + "Student Info \n"
                + "ID NUMBER: " + idNumber + "\n"
                + "NAME: " + lastName + ", " + firstName + "\n"
                + "ACADEMIC PROGRAM: " + academicProgram + " - " + major );
    }

    StudentInfo(String college, String acadmicProgram, String major, int term, String year) {
        this.college = college;
        this.academicProgram = acadmicProgram;
        this.major = major;
        this.term = term;
        this.year = year;
    }

    void setIdNumber(String IdNum){
        idNumber = IdNum;
    }
    
    void setFirstname(String name){
        firstName = name;
    }
    
    void setLastName(String name){
        lastName = name;
    } 
}

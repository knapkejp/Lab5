import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    ArrayList<Double> gpas = new ArrayList<Double>();
    

    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");

    student2.setName("Jake Knapke");
    student2.setGPA(4.3);
    student2.setMajor("Accounting, IS, Marketing");

    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    double sum = 0;
  
    student1.print();
    student2.print();
    
    for (int i=0; i<gpas.size(); i++) {
        sum = student1.getGPA();
        sum = sum + student2.getGPA();
        
    }
  
    System.out.println("The average GPA is " + sum / gpas.size());
  }
}
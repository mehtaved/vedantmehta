/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author abs20
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
          Student[] List = new Student[3];
          Student s1 =new Student();
          s1.setName("Joe");
          s1.setAge(77);
          
           Student s2 =new Student();
          s2.setName("Jack");
          s2.setAge(7);
          
          Student s3 =new Student();
          s3.setName("Ryan");
          s3.setAge(87);
          List[0]= s1;
          List[1]= s2;
          List[2]= s3;
          for(int i =0; i <List.length;i++)
          {
              System.out.println(List[i].getName()+ "" + List[i].getAge());
          }
    }
    
}

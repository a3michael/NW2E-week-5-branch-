import java.util.*;
public class Act5_MyLinkedlist_Villanueva_NW2C {
    

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    // declaration of Linkedlist
    LinkedList firstname = new LinkedList();
    LinkedList middlename = new LinkedList();
    LinkedList lastname = new LinkedList();
    LinkedList areaCode = new LinkedList();
    LinkedList telNum = new LinkedList();
    LinkedList gender = new LinkedList();
    LinkedList agePer = new LinkedList();
    
    System.out.print("How many members information will be entered? ");
    int Mcount = scan.nextInt(); 
    scan.nextLine();
    
    // Loop, this will ask the user on how many times he/she want to repeat the program.
    for(int i = 0; i < Mcount;i++){
        int count = i;
        count++; 
        
      System.out.println();
    
      // This will get the information needed to be processed.
      System.out.println("Kindly give the information of member " + count);
      System.out.print("Enter firstname: ");
      String fname = scan.nextLine();
      System.out.print("Enter middle name: ");
      String Mname = scan.nextLine();
      System.out.print("Enter last name: ");
      String Lname = scan.nextLine();
      System.out.print("Enter area code: ");
      int Acode = scan.nextInt();
      scan.nextLine();
      System.out.print("Enter telephone number: ");
      String Tnum = scan.nextLine();
      System.out.print("Enter gender: ");
      String gen = scan.nextLine();
      System.out.print("Enter age: ");
      int age = scan.nextInt();
      scan.nextLine();
       
        firstname.add(fname);
        middlename.add(Mname);
        lastname.add(Lname);
        areaCode.add(Acode);
        telNum.add(Tnum);
        gender.add(gen);
        agePer.add(age);
    }
     
    
    for(int i = 0; i < Mcount;i++){

  //Printing tthe information gathered from the user.....
    System.out.println("Welcome to the club " + firstname.get(i) +" " + middlename.get(i) + " "+ lastname.get(i)+ "!");
    System.out.println("Your area code and telephone number is " + "(" + telNum.get(i)+ ") " + areaCode.get(i)+"." );
    System.out.println("you are a " + gender.get(i) + " member and your age is " + agePer.get(i));
    System.out.println();
   
    }
}
}


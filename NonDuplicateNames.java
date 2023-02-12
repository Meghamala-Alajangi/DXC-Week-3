package Javafsd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NonDuplicateNames {
    public static void main(String[] args) {
        Set < String > students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names of students who attended course (enter 'q' to quit) : ");
        while (true)
        {
            System.out.print("Name : ");
            String name = sc.nextLine();
            
            if (name.equals("None"))
            {
                break;
            }
            students.add(name);
        }

        Set < String > sortedStudents = new TreeSet<>(students);

        System.out.println("\nStudents who attended course : ");
        
        for (String name : sortedStudents) 
        {
            System.out.println(name);
        }
        System.out.println("\nTotal number of students : " + sortedStudents.size());
    }
}

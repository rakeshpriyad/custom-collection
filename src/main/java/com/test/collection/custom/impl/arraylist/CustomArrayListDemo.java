package com.test.collection.custom.impl.arraylist;
public class CustomArrayListDemo {
     
      public static void main(String...a) {
           CustomArrayList<Employee> list = new CustomArrayList<Employee>();
     list.add(new Employee("1", "Rakesh"));
     list.add(new Employee("2", "Aayush"));
     list.add(new Employee("3", "Rajesh"));
     list.add(new Employee("4", "Mukesh"));
     list.add(new Employee("1", "Sweta"));
     list.add(new Employee("2", "Vijay"));
     list.add(null);
     
     list.display();
     System.out.println("\nelement at index "+1+" = "+list.get(1));
     System.out.println("element removed from index "+1+" = "+list.remove(1));
     
     System.out.println("\nlet's display list again after removal at index 1");
     
     list.display();
     
     //list.remove(11);  //will throw IndexOutOfBoundsException, because there is no element to remove on index 11.
     //list.get(11);   //will throw IndexOutOfBoundsException, because there is no element to get on index 11.
     
      }
     
}
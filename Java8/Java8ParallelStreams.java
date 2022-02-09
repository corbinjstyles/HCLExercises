package java8;

import java.util.ArrayList;
import java.util.List;
public class Java8ParallelStreams {
 public static void main(String[] args) {
  List < Employee > empList = new ArrayList < Employee > ();
  for (int i = 0; i < 100; i++) {
   empList.add(new Employee("A", 20000));
   empList.add(new Employee("B", 3000));
   empList.add(new Employee("C", 15002));
   empList.add(new Employee("D", 7856));
   empList.add(new Employee("E", 200));
   empList.add(new Employee("F", 50000));
  }
  long t1 = System.currentTimeMillis();
  System.out.println("Sequential Stream count: " + empList.stream().filter(e -> e.getSalary() > 15000).count());
  long t2 = System.currentTimeMillis();
  System.out.println("Sequential Stream Time taken:" + (t2 - t1));
  t1 = System.currentTimeMillis();
  System.out.println("Parallel Stream count: " + empList.parallelStream().filter(e -> e.getSalary() > 15000).count());
  t2 = System.currentTimeMillis();
  System.out.println("Parallel Stream Time taken:" + (t2 - t1));
 }
}

class Employee {

    private int salary;
    private String name;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
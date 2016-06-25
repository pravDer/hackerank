import java.util.*;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    private static StudentComparator instance = new StudentComparator();

    public Student(String fname, double cgpa, int id)
    {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public static StudentComparator getComparator()
    {

     return instance;

    }


    static class StudentComparator implements Comparator<Student>
    {

        enum CompareValue
        {
            LESS(-1), GREATER(1), EQUAL(0);

            int value;
            CompareValue(int value)
            {
               this.value = value;
            }
            public int getValue()
            {
                return this.value;
            }
        }
        @Override
        public int compare(Student student1, Student student2)
        {
            int returnVal = 0;
            int val = Double.compare(student1.getCgpa(), student2.getCgpa());
            if(val == CompareValue.EQUAL.getValue())
            {
                returnVal =  (student1.getFname().compareTo(student2.getFname()) == CompareValue.EQUAL.getValue() )
                        ? student1.getToken() > student2.getToken() ? CompareValue.GREATER.getValue() : CompareValue.LESS.getValue()
                        : student1.getFname().compareTo(student2.getFname());
            }
            else
            {
                returnVal =  -1 * val;
            }
            return returnVal;
        }
    }
}



public class PriorityQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        List<Student> students = new ArrayList<Student>(totalEvents);
        while(totalEvents>0)
        {
            String event = in.next();
            if("ENTER".equals(event))
            {
              students.add(new Student(in.next(), in.nextDouble(), in.nextInt()));
              Collections.sort(students, Student.getComparator());
            }
            else
            {
                if(!students.isEmpty())
                {
                    students.remove(0);
                }
            }
            totalEvents--;
        }
        for(Student s : students)
        {
            System.out.println(s.getFname());
        }
        if(students.isEmpty())
        {
            System.out.println("EMPTY");
        }
    }
}

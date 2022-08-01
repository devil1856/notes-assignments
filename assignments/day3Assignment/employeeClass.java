package assignments.day3Assignment;

class employeeClass {
    String empId;
    String empName;
    int empSalary;

    //Constructor of the class
    //The constructor is mandate in a Java class incase if we fail to declare a constructor JVM will declare one for us implicitly
    employeeClass(String id,String name,int sal){
        this.empId=id;
        this.empName=name;
        this.empSalary=sal;
    }
    void printDetails(){
        System.out.println("Employee Id: "+this.empId);
        System.out.println("Employee name: "+this.empName);
        System.out.println("Employee salary: "+this.empSalary);
        System.out.println("--------------------------------");
    }
}
//this - it is a keyword which holds the address of the current running object address.
//this() - we can use this to call the constructor of the object as well.

class Check{
    public static void main(String[] args){
        employeeClass e1=new employeeClass("1856","Nagendra Murari",8941346);
        employeeClass e2=new employeeClass("98154","Manohar Dudyala",545365435);
        e1.printDetails();
        e2.printDetails();
    }
}
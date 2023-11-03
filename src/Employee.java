public class Employee {
    String name;
    double salary;
    int workHours,hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(salary > 1000)
            return salary * 0.03;
        else
            return 0.0;
    }
    public double bonus(){
        if(workHours>40)
            return workHours*30.0;
        else
            return 0;
    }
    public double increase(){
        int year = 2023 - this.hireYear;
        if(year < 10)
            return salary * 0.05;
        else if( year >10 && year < 20)
            return salary *0.10;
        else
            return salary * 0.20;
    }
}

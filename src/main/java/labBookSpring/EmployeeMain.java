package labBookSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        Employee employee= context.getBean(Employee.class);
        System.out.println("Id: "+employee.getEmployeeId()+"\nName: "+employee.getEmployeeName()+" \nSalary: "
				+employee.getSalary()+" \nAge: "+employee.getAge()+"\nSbuId: "+employee.getBusinessUnit().getSbuId()+
				"\nSbuHead: "+employee.getBusinessUnit().getSbuHead()+"\nSbuName: "+employee.getBusinessUnit().getSbuName());
        
        context.close();

    }

}
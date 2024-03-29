class A  
{  
 String msg;  
 protected A(String msg)  
 {  
    this.msg=msg;  
 }  
void display()
{  
    System.out.println(msg);  
}  
       
}  
public class PrivateExample2 {  
public static void main(String[] args) {  
    A a=new A("Try to create the instance of private constructor outside the class");     
    a.display();  
 }  
}
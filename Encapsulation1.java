class Encapsulation {
    
private int password;
private int id;
private String name;
public int getPassword() {
    return password;
}
public void setPassword(int password) {
    this.password = password;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
       encap.setId(1);
       encap.setPassword(123);
       encap.setName("ram");
       System.out.println(encap.getId());
       System.out.println(encap.getPassword());
       System.out.println(encap.getName());
    }
}

}

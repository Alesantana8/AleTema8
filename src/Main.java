public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.setName("Alejandra santana");
        person.setAge(28);
        person.setPhone("3215363636");
        System.out.println(person.getName() +","+ person.getAge() + "años" + ", Telefono "+person.getPhone());
    }
}

class Persona{
    private String name;
    private int age;
    private String phone;

    public void setName(String yourName){
        this.name=yourName;
    }
    public String getName(){
        return name;
    }
    public void setPhone(String yourPhone){
        this.phone=yourPhone;
    }
    public String getPhone(){
        return phone;
    }
    public void setAge(int yourAge){
        this.age=yourAge;
    }
    public int getAge(){
        return age;
    }
}
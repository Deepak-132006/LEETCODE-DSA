package Interview_Prep;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 18 && age > 0){
            this.age = age;
        } else {
            System.out.println("Invalid Age !!");
        }
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAge(21);
        e.setName("Deepak");
       System.out.println(e.getAge() + e.getName());       
    }
}

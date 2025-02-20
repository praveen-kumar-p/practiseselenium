package org.example.Practice;

public class Human_encap {

    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Human_encap(String name, int age, String email){
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }

    public static void main(String[] args) {

        Human_encap human1 = new Human_encap();
        human1.setName("Pradeep");
        human1.setAge(28);
        human1.setEmail("praveen@ymtsindia.org");
        System.out.println("My name: " + human1.getName());
        System.out.println("My age: " + human1.getAge());
        System.out.println("My gamil id: " + human1.getEmail());
    }
}

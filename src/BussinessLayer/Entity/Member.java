package BussinessLayer.Entity;

public class Member extends User {
    public Member(int id, String name, int age, String email, String password, String role, boolean gender, String phone_number, String address) {
        super(id, name, age, email, password, role, gender, phone_number, address);
    }
}

package Model.DTO;

public class InstructorDTO {
    private int id;
    private String name;
    private int phone;
    private String birth_date;
    private String address;
    private String email;

    public InstructorDTO() {
        // TODO Auto-generated constructor stub
    }

    public InstructorDTO(int id, String name, int phone, String birth_date, String address, String email) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birth_date = birth_date;
        this.address = address;
        this.email = email;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Instructor [id=" + id + ", name=" + name + ", phone=" + phone + ", birth_date=" + birth_date
                + ", address=" + address + ", email=" + email + "]";
    }
}

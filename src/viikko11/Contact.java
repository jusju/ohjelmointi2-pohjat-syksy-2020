package viikko11;

public class Contact {
	
    private String name;
    private String email;
    private String phone;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        // Haluttu muoto: "Maija Meik�l�inen (email: foo@bar.fi, phone: 5555)"
        return this.name + " (email: " + this.email + ", phone: " + this.phone + ")";
    }
}
public class Contact {
    private String name;
    private Integer phoneNumber;
    private String mail;

    public Contact(String name, Integer phoneNumber, String mail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", mail=" + mail + "]";
    }
}

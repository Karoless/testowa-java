public class Client {
    private String name;
    private String address;
    private String phone_number;

    Client(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.address + ' ' + this.phone_number;
    }
}

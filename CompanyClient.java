public class CompanyClient extends Client{
    private String nip;

    CompanyClient(String name, String address, String phone_number, String nip) {
        super(name, address, phone_number);
        this.nip=nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + this.nip;
    }
}

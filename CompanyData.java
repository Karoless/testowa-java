public class CompanyData {
    private String name;
    private String addres;
    private String nip;
    private String bank_account;

    CompanyData(String name, String addres, String nip, String bank_account){
        this.name = name;
        this.addres = addres;
        this.nip = nip;
        this.bank_account = bank_account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.addres + ' ' + this.nip + ' ' + this.bank_account;
    }
}

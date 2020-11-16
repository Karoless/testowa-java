public class ControlLoop {

    private int lastItemNumber = 0;
    private Item [] items = new Item[100];
    private int lastClientNumber = 0;
    private Client [] clients = new Client[100];
    private DataCreator dataCreator;
    private CompanyData companyData;

    ControlLoop(){
        dataCreator = new DataCreator();
        companyData = new CompanyData("Nazwa_firmy", "adres", "nip", "konto_bankowe");
    }

    public void controlData(){
        dataCreator.printMenu();
        int input = dataCreator.dataReader.getInt();
        while (input != 0){
            switch (input){
                case 1:
                    changeCompanyData(companyData);
                    break;
                case 2:
                    System.out.println(companyData);
                    break;
                case 3:
                    items[lastItemNumber] = dataCreator.createItem();
                    lastItemNumber++;
                    break;
                case 4:
                    printItems();
                    break;
                case 5:
                default:
                    System.out.println("Błędna opcja, wybierz jeszcze raz");
            }
            dataCreator.printMenu();
            input = dataCreator.dataReader.getInt();
        }
        dataCreator.dataReader.closeInput();
    }

    private void printItems(){
        for(int i =0; i<lastItemNumber; i++)
            System.out.println(items[i]);
    }

    private void changeCompanyData(CompanyData companyData){
        System.out.println("Podaj nazwe firmy");
        companyData.setName(dataCreator.dataReader.getString());
        System.out.println("Podaj adres firmy");
        companyData.setAddres(dataCreator.dataReader.getString());
        System.out.println("Podaj nip firmy");
        companyData.setNip(dataCreator.dataReader.getString());
        System.out.println("Podaj nr konta bankowego");
        companyData.setBank_account(dataCreator.dataReader.getString());
    }
}

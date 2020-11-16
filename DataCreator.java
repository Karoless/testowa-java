public class DataCreator {

    DataReader dataReader;

    DataCreator(){
        dataReader = new DataReader();
    }

    public Item createItem(){
        System.out.println("Podaj nazwe towaru");
        String name = dataReader.getString();
        System.out.println("Podaj cene towaru");
        double price = dataReader.getDouble();
        return new Item(name, price);
    }

    public void printMenu(){
        System.out.println("0. Wyjście");
        System.out.println("1. Zmień dane sprzedającego");
        System.out.println("2. Wyświetl dane sprzedającego");
        System.out.println("3. Dodaj towar");
        System.out.println("4. Wyświetl towary");
    }


}

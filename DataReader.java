import java.util.Scanner;

public class DataReader {

    private Scanner input;
    DataReader(){
        input = new Scanner(System.in);
    }

    public int getInt(){
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    public double getDouble(){
        double value = input.nextDouble();
        input.nextLine();
        return value;
    }

    public String getString(){
        String text = input.nextLine();
        return text;
    }

    public void closeInput(){
        input.close();
    }

}

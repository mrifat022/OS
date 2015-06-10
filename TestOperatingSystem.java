/**
 * Created by DELL on 10/06/2015.
 */
public class TestOperatingSystem {
    public static void main(String[] args) {

        Software aspire = new Software("Word","GOM","Photoshop","Solitare");
        Software inspiron = new Software("Excel","VLC","Photoscape","Minisweper");
        Software diamond = new Software("Powerpoint", "KMP", "Corel Draw", "Chess Titans");

        OperatingSystem windows = new OperatingSystem("Acer","Black","China",4378.0,aspire);
        OperatingSystem linux = new OperatingSystem("Dell","Red","USA",14.0,inspiron);

        System.out.println("Laptop : " +windows.toString());
        System.out.println("Laptop : " +linux.toString());

        windows.setMerk("Asus");
        windows.setColor("Blue");
        windows.setBuatan("Taiwan");
        windows.setVersi(25.0);
        windows.setJenis(diamond);
        System.out.println("Laptop : " +windows.toString());
    }
}

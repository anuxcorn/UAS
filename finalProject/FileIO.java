import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;;

class FileIO {
    Admin boss = new Admin();

    public FileIO() {
    }

    public void writeBooking(String tglBooking, String tglCheckIn) {
        try {
            FileWriter fWriter = new FileWriter("input.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("Tanggal Booking : " + tglBooking);
            bWriter.newLine();
            bWriter.write("Tanggal Check In : " + tglCheckIn);
            bWriter.newLine();
            bWriter.close();
        }catch(IOException exc) {
            System.out.println("Error : ");
            exc.printStackTrace();
        }
    } 

    public void readBooking() throws FileNotFoundException {
        try {
            FileReader fReader = new FileReader("input.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            Scanner scan = new Scanner(bReader);
            while(scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        }catch(IOException exc) {
            System.out.println("Error : ");
            exc.printStackTrace();
        }
    }

    public void ToTanggalObject() {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);
            while(scanner.hasNext()) {
                String data[] = scanner.next().split("\n");
                int a = 0;
                boss.tambahkanBooking(scanner.nextLine(), scanner.nextLine());
                System.out.println(boss.getBooking().size());
            }
        }catch(IOException io) {
            System.out.println("Error : ");
            io.printStackTrace();
        }
    }
}
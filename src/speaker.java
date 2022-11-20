import java.util.Scanner;
public class speaker {
    static Scanner keyboard = new Scanner(System.in);
    double volume;

    void nyala(){

       System.out.println("Volume anda = "+volume);
    }

    void mati(){

        System.out.println("Speaker mati");
    }
    void tambahVolume(){
        volume++;
        System.out.println("Volume = "+volume);
    }
    void kurangVolume(){
        volume--;
        System.out.println("Volume = "+volume);
    }

    public static void main(String[] args){

        speaker tombol = new speaker();


//        tombol.nyala();
//        tombol.mati();
//        tombol.tambahVolume();
//        tombol.kurangVolume();

        System.out.println("nyalakan speaker?(yes/no)");
        String on = keyboard.nextLine();
        String pilihan;
        if(on .equals("yes")) {

            do {
                tombol.nyala();
                System.out.println("tambah volume = +");
                System.out.println("kurangi volume = -");
                System.out.println("Matikan speaker = off");
                pilihan = keyboard.nextLine();

                switch (pilihan) {
                    case "+":
                        tombol.tambahVolume();
                        break;
                    case "-":
                        tombol.kurangVolume();
                        break;
                    case "off":
                        tombol.mati();
                        return;
                }

            } while(true);

        }else if(on .equals("no")) {
            tombol.mati();
        }

    }
}

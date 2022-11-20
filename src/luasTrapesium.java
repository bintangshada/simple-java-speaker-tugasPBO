import java.util.Scanner;
public class luasTrapesium {
    //deklarasi
    double rusuk1, rusuk2, tinggi;

    void isi(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("masukkan panjang rusuk atas =  ");
        rusuk1=keyboard.nextDouble();
        System.out.print("Masukkan panjang rusuk bawah : ");
        rusuk2=keyboard.nextDouble();
        System.out.println("masukkan tinggi = ");
        tinggi=keyboard.nextDouble();
    }

    void hitung(){
        double luastrapesium = 0.5*(rusuk1=rusuk2)*tinggi;
        System.out.println("jadi luas trapesium adalah = "+luastrapesium);
    }

    public static void main(String[] args) {

        //pembuatan objek baru
        luasTrapesium luas = new luasTrapesium();

        //memanggil void
        luas.isi();
        luas.hitung();


    }
}

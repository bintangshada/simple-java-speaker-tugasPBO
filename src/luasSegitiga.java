import java.util.Scanner;
public class luasSegitiga {
    //deklarasi objek
    double tinggi, alas;

    void input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("masukkan tinggi = ");
        tinggi = keyboard.nextDouble();
        System.out.println("masukkan alas = ");
        alas = keyboard.nextDouble();
    }

    void hitung(){
        double segitigaluas = (alas*tinggi)*0.5;
        System.out.println("jadi luas segitiga adalah = "+segitigaluas);
    }
    public static void main(String[] args){

        // pembuatan objek baru
        luasSegitiga luas = new luasSegitiga();

        //memanggil void
        luas.input();
        luas.hitung();
    }
}

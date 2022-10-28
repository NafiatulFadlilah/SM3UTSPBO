package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Main {
    public static void main(String[] args){
        System.out.println("====||PROGRAM BANGUN RUANG||=====");
        
        System.out.println("---Bola---");
        Lingkaran l = new Lingkaran(7);
        Bola bola = new Bola(l);
        
        System.out.println("Volume Bola: " + bola.volume());
        System.out.println("Luas Permukaan Bola: " + bola.luasPermukaan());
        
        System.out.println("\n---Kubus---");
        Persegi p = new Persegi(16);
        Kubus kubus = new Kubus(p);
        System.out.println("Volume Kubus: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
        
        System.out.println("\n---Limas Segitiga---");
        Segitiga s = new Segitiga(12, 9);
        LimasSegitiga ls = new LimasSegitiga(s);
        System.out.println("Volume Limas Segitiga: " + ls.volume());
        System.out.println("Luas Permukaan: " + ls.luasPermukaan());
        
        System.out.println("\n---Limas Segiempat---");
        LimasSegiempat lsg = new LimasSegiempat(p, s);
        System.out.println("Volume Limas Segiempat: " + lsg.volume());
        System.out.println("Luas Permukaan: " + lsg.luasPermukaan());
    }
}
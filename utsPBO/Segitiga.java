package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Segitiga extends LimasSegitiga{
    public float keliling;
    
    Segitiga(float alas, float tinggi){
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        luas = super.luas() + (alas * tinggi / 2);
        return luas;
    }
    
    public float keliling(){
        float samping = (float) Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        keliling = alas + tinggi + samping;
        return keliling;
    }
}
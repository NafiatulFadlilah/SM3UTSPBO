package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class LimasSegitiga extends BangunRuang{
    public float alas;
    public float tinggi;
    public float luas;
    public Segitiga s;
    
    LimasSegitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    LimasSegitiga(Segitiga s){
        this.s = s;
    }
    
    public float luas(){
        return luas;
    }
    
    @Override 
    public float volume(){
        volume = super.volume() + (s.luas() * s.tinggi / 3);
        return volume;
    }
    
    @Override
    public float luasPermukaan(){
        luasPermukaan = super.luasPermukaan() + (5 * s.luas());
        return luasPermukaan;
    }   
}
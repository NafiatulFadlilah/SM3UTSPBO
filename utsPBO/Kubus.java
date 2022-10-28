package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Kubus extends BangunRuang{
    public float s;
    public float luas;
    public Persegi p;
    
    Kubus(float s){
        this.s = s;
    }
    
    Kubus(Persegi p){
        this.p = p;
    }
    
    public float luas(){
        return luas;
    }
    
    @Override
    public float volume(){
        return volume = super.volume() + (p.luas() * p.s);
    }
    
    @Override
    public float luasPermukaan(){
        return luasPermukaan = super.luasPermukaan() + (6 * p.s);
    }
}
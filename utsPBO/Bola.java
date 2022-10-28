package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Bola extends BangunRuang{
    public float phi = (float) 3.14;
    public float r;
    public float luasLingkaran;
    public Lingkaran l;
    
    Bola(float r){
        this.r = r;
    }
    
    Bola(Lingkaran l){
        this.l = l;
    }
    
    public float luas(){
        return luasLingkaran;
    }
    
    @Override
    public float volume(){
        volume = super.volume() + (l.luas() * l.r * 4 / 3);
        return volume;
    }
    
    @Override
    public float luasPermukaan(){
        luasPermukaan = super.luasPermukaan() + (4 * l.luas());
        return luasPermukaan;
    }
}
package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class LimasSegiempat extends BangunRuang{
    public float s;
    public float tinggi;
    public float luas;
    public Persegi ps;
    public Segitiga st;
    
    LimasSegiempat(Persegi ps, Segitiga st){
        this.ps = ps;
        this.st = st;
    }
    
    public float luas(){
        return luas;
    }
    
    @Override
    public float volume(){
        volume = super.volume() + (ps.luas() * st.tinggi / 3);
        return volume;
    }
    
    @Override
    public float luasPermukaan(){
        luasPermukaan = super.luasPermukaan() + (4 * st.luas() + ps.luas());
        return luasPermukaan;
    }
}
package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Lingkaran extends Bola{ 
    public float keliling;
    
    Lingkaran(float r){
        super(r);
        this.r = r;
    }

    @Override
    public float luas(){
        super.luasLingkaran = super.phi * super.r * super.r;
        return luasLingkaran;
    }
    
    public float keliling(){
        keliling = 2 * phi * r; 
        return keliling;
    }
}
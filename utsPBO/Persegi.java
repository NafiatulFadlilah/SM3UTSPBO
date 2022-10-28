package utsPBO;
/*
NIM: 2141762030
Nama: Nafiatul Fadlilah (13)
Kelas: SIB 2E
*/
/*
 * @author Nafiaaeluv
 */
public class Persegi extends Kubus{
    public float keliling;
        
    Persegi(float s){
        super(s);
        this.s = s;
    }
    
    @Override
    public float luas(){
        luas = super.luas() + s * s;
        return luas;
    }
    
    public float keliling(){
        return keliling = 4 * s;
    }
}
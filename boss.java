  package emplooyee;

import java.util.Scanner;


    public class boss extends Kantor {
    
        public void setlamakerja() {
            lamakerja = 450;
        }
        
        public void gaji (){
            gaji = 50000000;
        }
  
        int potongan(int jam){
            if(jam >= 450){
                jam=450;
            }
            setlamakerja();
            gaji();
            int jamterlewat = lamakerja - jam;
            int gajiakhir = gaji -(50000*jamterlewat);
             System.out.println("Potongan kamu :"+(50000*jamterlewat));
            return gajiakhir;
        }
        
}

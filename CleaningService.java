  package emplooyee;

    public class CleaningService extends Kantor{
    
         public void setlamakerja() {
            lamakerja = 450;
        }

        public void gaji() {
            gaji = 3000000;
        }
       
        
        
        int potongann(int jam){
            if(jam >= 450){
                jam=450;
            }
            setlamakerja();
            gaji();
            int jamterlewat = lamakerja - jam;
            int gajiakhir = gaji -(50000*jamterlewat);
             System.out.println("Potongan kamu :"+(5000*jamterlewat));
            return gajiakhir;
        }
        
}

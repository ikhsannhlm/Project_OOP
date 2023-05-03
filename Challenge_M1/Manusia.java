class Manusia{
    String nama;
    int amal=0;

    void bilang(String kata){
        System.out.println(this.nama + " berbuat " + kata);
    }

    void Amalan(String amalan){
        this.bilang(amalan);
        if(amalan=="baik"){
            System.out.println("Masyaallah selamat ya..");
            amal++;
        }
        else if(amalan=="buruk"){
            System.out.println("Segera istigfar dan bertaubatlah..");
            amal--;
        }
        else {
            System.out.println("Belum bisa kedetect amalan nya, comingsoon..");
        }
    }

    void StatusAmal(){
        System.out.println("Point Amal: "+amal);
        
    }

}

package com.mycompany.drone;

class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi--;
        if(energi>10){
            ketinggian++;
            System.out.println("Drone Terbang");
        }else {
            System.out.println("Energi lemah");
        }
    }
    void MatikanMesin(){
        if(ketinggian>0){
            System.out.println("Mesin tidak bisa dimatikan");
        }else {
            System.out.println("Mesin dimatikan");
        }
    }
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    
      public static void main(String[] args) {
        Drone2 drone = new Drone2();
        
        drone.energi = 15;
        drone.ketinggian = 200;
        drone.kecepatan = 100;
        
        drone.terbang();
    }
    
}
    

   

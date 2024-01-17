
package com.mycompany.drone;


class Drone2 {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi--;
        if(energi>10){
            ketinggian++;
            System.out.println("Ketinggian "+ketinggian);
            System.out.println("energi "+energi);
            System.out.println("Drone terbang");
        }else{
            System.out.println("Energi lemah");
            System.out.println("Drone jatuh");
            System.out.println("ketinggian "+ketinggian);
            System.out.println("energi "+energi);
        }
    }
    
    void matikanMesin(){
        if(ketinggian>0){
            System.out.println("Mesin tidak bisa dimatikan");
        }else{
            System.out.println("Mesin dimatikan");
        }
    }
    
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
        System.out.println("Ketinggian "+ketinggian);
        System.out.println("energi "+energi);
    }
    
    void belok(){
        energi--;
        System.out.println("Drone belok");
        System.out.println("ketinggian "+ketinggian);
        System.out.println("energi "+energi);
    }
    
    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        System.out.println("ketinggian "+ketinggian);
        System.out.println("energi "+energi);
        System.out.println("kecepatan "+kecepatan);
        kecepatan++;
    }
    
    
    
}

package UNIDAD_2_PA;
public class P03_PC_Test {

    public static void main(String[] args) {
        P03_PC lap = new P03_PC();
        P03_Procesador proc = new P03_Procesador();
        Almacenamiento alm = new Almacenamiento();
        Memoria memo=new Memoria();
        Tarjeta_madre madre=new Tarjeta_madre();
        fuente_De_poder poder=new fuente_De_poder();
        
        proc.setMARCA("Intel");
        proc.setMODELO("i7-7700HQ");
        proc.setGENERACION("7");
        proc.setGHz(2.80);
        proc.setCORES(8);
        proc.setTHREADS(4);
        proc.setAPU(true);
        proc.setCOST(799);

        alm.setID("12345");
        alm.setCAPACIDAD("1 TB");
        alm.setCOSTO(305.50);
        alm.setMARCA("-");
        alm.setTIPO("-");
        
        memo.setCAPACIDAD("8 GB");
        memo.setCOSTO(402.40);
        memo.setDIMENSIÓN("-");
        memo.setGENERACIÓN("6ta");
        memo.setID("9876");
        memo.setMARCA("-");
        
        madre.setCOSTO(500.20);
        madre.setDIMENSIÓN("-");
        madre.setID("567");
        madre.setMARCA("-");
        madre.setMODELO("-");
        
        poder.setCOSTO(300.10);
        poder.setID("3495");
        poder.setMARCA("-");
        poder.setMODELO("-");
        poder.setWATTS(300);
        
        lap.setID("2113330259");
        lap.setMARCA("Dell");
        lap.setMODELO("XPS 15 9560");
        lap.setANIO("2018");
        lap.setPROC(proc);
        lap.setALM(alm);
        lap.setFuente(poder);
        lap.setMADRE(madre);
        lap.setMEMO(memo);
        System.out.println(lap.toString() + " $" + lap.getCOST());
        
    }
}

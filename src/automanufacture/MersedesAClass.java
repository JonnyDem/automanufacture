package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class MersedesAClass extends MercedesIndustry {


    MersedesAClass(){
        System.out.println(name+" А класса без кондиционера, без GPS и с обычным двигателем");
    }

    MersedesAClass(boolean conditioner){
        if(conditioner){
            System.out.println(name+" А класса с кондиционером (без GPS и с обычным двигателем)");
        }else{
            System.out.println(name+" А класса без кондиционера, без GPS без форсированного двигателя");
        }
    }
    MersedesAClass(boolean gps, boolean forcedEngine, boolean conditioner){
        System.out.print(name+" А класса: ");
     if(gps||forcedEngine||conditioner) {
         if (gps) {
             System.out.print("с GPS ");
         }
         if (forcedEngine) {
             System.out.print("c форсированым двигателем");
         }
         if(conditioner){
             System.out.print(" с кондиционером");
         }
     }else{
         System.out.print("без ничего");
     }
        System.out.println(".");
    }
}

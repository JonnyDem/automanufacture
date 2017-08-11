package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class MercedesEClass extends MercedesIndustry {

    MercedesEClass() {
        System.out.println(name + " Е класса: с кондиционером, с GPS, с форсированным двигателем.");
    }

    MercedesEClass(boolean electroGlassLifter) {
        if (electroGlassLifter) {
            System.out.println(name + " Е класса: с кондиционером, с GPS, с форсированным двигателем и електростеклоподъемнками");
        } else {
            System.out.println(name + " Е класса: с кондиционером, с GPS, с форсированным двигателем без електростеклоподъемнков");
        }
    }
    MercedesEClass(boolean chairsWithElectroSettings,boolean withTvInHeadrests){
        System.out.print("Этот "+name+" Е класса: с двигателем внутреннего сгорания");
        if (chairsWithElectroSettings || withTvInHeadrests) {
            if (chairsWithElectroSettings) {
                System.out.print(" с електронастройкой сидений");
            }
            if (withTvInHeadrests) {
                System.out.print(" c телевизорами в подголовниках");
            } else {
                System.out.print("без електронастройки сидений и телевизорами в подголовниках");
            }
            System.out.println(".");
        }
    }
    MercedesEClass(boolean chairsWithElectroSettings,boolean withTvInHeadrests,boolean electroEngine ){
        System.out.print("Этот " + name + " Е класса:");
        if (chairsWithElectroSettings || withTvInHeadrests || electroEngine) {
            if (electroEngine) {
                System.out.print(" с електродвигателем");
            }
            if (chairsWithElectroSettings) {
                System.out.print(" с електронастройкой сидений");
            }
            if (withTvInHeadrests) {
                System.out.print(" c телевизорами в подголовниках");
            }
        }else {
                System.out.print(" без електронастройки сидений и телевизорами в подголовниках");
            }
            System.out.println(".");

        }
    }

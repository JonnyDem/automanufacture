package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class VolvoIndustry extends AutoIndustry{

    String name = "Volvo";
    boolean electroEngine;
    String[] arrayOfCargoName = {"fm 10", "fm 11", "fm 12", "fh 10", "fh 11", "fh 12", "fh 13"};   // Массив марок грузовыйх автомобилей.

    @Override
    public void engineringAuto() {                 // Переопределенный метод от суперкласса AutoIndustry.
        System.out.println("Разроботка легковыйх автомобилей " + name);
    }

    @Override
    public void engineringCargoViacle(String name, String mark) {  // Не переопределенный метод унаследованный от AutoIndustry
        super.engineringCargoViacle(name, mark);
    }

    int carringCapasyty7(){                     // Разная грузоподъемность.(методы)
        int carringCapasyty = 7;
        System.out.println("У этого грузовика " + name + " грузоподьемность "+carringCapasyty+" тонн.");
        return carringCapasyty;
    }
    int carringCapasyty14(){
        int carringCapasyty = 14;
        System.out.println("У этого грузовика " + name + " грузоподьемность "+carringCapasyty+" тонн.");
        return carringCapasyty;
    }
    int carringCapasyty20(){
        int carringCapasyty = 20;
        System.out.println("У этого грузовика " + name + " грузоподьемность "+carringCapasyty+" тонн.");
        return carringCapasyty;
    }
}

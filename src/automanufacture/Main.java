package automanufacture;

/**                                               // Описание всех классов в классе AutoIndustry
 * Created by Ваня on 11.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        VolvoPassengerCar volvo = new VolvoPassengerCar();                    // Создание пассажирской Вольво с ДВС.
        VolvoPassengerCar electroVolvo=new VolvoPassengerCar(true); //Создание пассажирской Вольво с електродвигателем.
       electroVolvo.acceleration4();                         // Метод при котором Вольва разгоняеться за 4 сек. до сотни

        VolvoCargoIndustry volvoCargo = new VolvoCargoIndustry("fh 10");// Грузовая вольва из массива
        VolvoCargoIndustry fm15 = new VolvoCargoIndustry("fm 15"); // Этой модели нет в массиве

        volvo.engineringAuto();   // Метод который переопределен в VolvoIndustry
        volvoCargo.engineringCargoViacle(volvoCargo.name, volvoCargo.arrayOfCargoName[6]); // Метод из AutoIndustry
        volvoCargo.carringCapasyty14(); // Грузопедъемность 14 тонн.


        // Создание мерсов разных классов и разной комплектации.
        MersedesAClass mersA = new MersedesAClass(false, false, false);
        MersedesAClass mers2A = new MersedesAClass(false, true, true);
        mers2A.acceleration8();
        MercedesEClass mersE = new MercedesEClass(false, false, true);

    }
}

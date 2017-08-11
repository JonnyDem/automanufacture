package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 *
*  В этом "проэкте" )) два производителя: Мерседес и Вольво (MercedesIndustry и VolvoIndustry)
 *  они наследуют клас AutoIndustry. Вольво выпускает легковые и грузовые автомобили(VolvoPassengerCar и VolvoCargoIndustry),
 *  а Мерседес только легковые но нескольких видов(MersedesAClass, MercedesEClass).
 *  В классах VolvoPassengerCar, VolvoCargoIndustry, MersedesAClass и MercedesEClass перегружаються конструкторы,
 *  в зависимости от требуемой комплектации. Так же в разных классах есть разный методы (ускорение, грузоподъемность и т.д.)
 */
public class AutoIndustry {      //Суперкласс для всех классов

    public void engineringAuto(){
        System.out.println("Разработка легковых автомобилей");
    }

    public void engineringCargoViacle(String name ,String mark){
        System.out.println("(Это метод из суперкласса AutoIndustry).Разработка грузового автомобиля "+name+":"+mark);
    }
}

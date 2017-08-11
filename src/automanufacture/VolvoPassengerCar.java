package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class VolvoPassengerCar extends VolvoIndustry {

    VolvoPassengerCar(){
        System.out.println("Лекковой автомобиль " +name+" со всеми прибамбасами но с двигателем внутреннего сгорания");
    }
    VolvoPassengerCar(boolean electroEngine){
        if(electroEngine) {
            System.out.println("Лекковой автомобиль " + name + " со всеми прибамбасами и с електродвигателем");
        }else {
            System.out.println("Лекковой автомобиль " + name + " со всеми прибамбасами без електродвигателя");
        }
    }
    public void engineringAuto() {         // Переопределенный метод от AutoIndustry.
        System.out.println("Разработка легковыйх автомобилей " + name);
    }
    void acceleration11(){              // Разное ускорение.
        System.out.println("Этa "+name+" разгоняеться до 100 км/ч за 11 секунд.");
    }
    void acceleration7(){
        System.out.println("Этa "+name+" разгоняеться до 100 км/ч за 7 секунд.");
    }
    void acceleration4(){
        System.out.println("Этa "+name+" разгоняеться до 100 км/ч за 4 секунды.");
    }
}

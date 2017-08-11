package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class MercedesIndustry extends AutoIndustry {

    String name="Mercedes";



    @Override
    public void engineringAuto() {         // Переопределенный метод от AutoIndustry.
        System.out.println("Разработка легковыйх автомобилей " + name);
    }
    void acceleration10(){
        System.out.println("Этот "+name+" разгоняеться до 100 км/ч за 10 секунд.");
    }
    void acceleration8(){
        System.out.println("Этот "+name+" разгоняеться до 100 км/ч за 8 секунд.");
    }
    void acceleration4(){
        System.out.println("Этот "+name+" разгоняеться до 100 км/ч за 4 секунды.");
    }
}

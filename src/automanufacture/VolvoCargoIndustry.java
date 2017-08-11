package automanufacture;

/**
 * Created by Ваня on 11.08.2017.
 */
public class VolvoCargoIndustry extends VolvoIndustry {


    VolvoCargoIndustry(String nameOfCargoViacle){ // Конструктор для грузовыйх авто.
        int count = 0;
        for (int i = 0; i <arrayOfCargoName.length ; i++) {
            count++;
            if (nameOfCargoViacle == arrayOfCargoName[i]) {
                System.out.println("Грузовай овтомобиль Volvo " + nameOfCargoViacle);
                return;
            }
        }
        if(count==arrayOfCargoName.length) {
            System.out.println("Такой марки грузового автомобиля Volvo нет!");
        }
    }
}

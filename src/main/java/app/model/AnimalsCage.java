package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component      //добавляем аннотация, чтоб спринг сканировал и создавал объекты Бины
public class AnimalsCage {
    @Autowired //отмечаем объект класса таймер, БИН которого на нужно будет создать
    private Timer timer;    //декларируем объект класса таймер
    @Autowired          //отмечаем объект класса Животные, чьи БИНы нам нужно создать
    @Qualifier("dog")       //создаем бин только класса ДОГ
    private Animal animal;  //декларируем объект класса Животное

    @Autowired  //конструктор можно не помечать, как требующий автозаполнения
    public AnimalsCage(){
        System.out.println("Constructor AnimalsCage for Bean"); //будем видеть, создается ли Бин класса AnimalsCage
    }


    public Timer getTimer() {       //внедреям бин класса собака в метод AnimalsCage
//        System.out.println("!!!!!!!!!!!");      //смотрим, вызывается ли метод и скольок раз
        return timer;                //возвращаем время из перемнной timer
    }


    public void whatAnimalSay() {       //метод класса AnimalsCage
        System.out.println("Say:");     //просто строка Say
        System.out.println(animal.toString());      //вызываем метод toString на Бине Собака
        System.out.println("At:");
        System.out.println(timer.getTime());        //вызываем метод getTimer на Бине (объекте) timer
        System.out.println("________________________"); //визуально разделяем цикл в консоли
    }
}

package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dog")      //добавляем аннотация компонент, чтоб спринг создавал бины класса Дог
public class Dog extends Animal {        //наследуемся от абстрактного класса животные

    public Dog() {           //конструктор по умолчанию без парметров
//        System.out.println("create Bean dog");  //смотрим, сколько раз будет создаваться Бин ДОГ
    }

    @Override
    public String toString() {       //переопределяем ToString для ДОГ
        return "I am a dog!";
    }
}

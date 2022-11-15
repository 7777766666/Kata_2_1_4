package app.model;

import org.springframework.stereotype.Component;

@Component("cat")          //даём понять спрингу, что надо сканировать и создавать бины класса КЭТ
public class Cat extends Animal {       //класс кэт наследуется от абстрактного класса животные
    @Override
    public String toString() {
        return "Im a Cat";
    }   //Пееназначаем метод toString
}

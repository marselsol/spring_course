package org.spring_introduction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Создаем спринг контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);

        Person person = context.getBean("myPerson", Person.class);
//        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
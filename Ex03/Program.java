package Ex03;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        
        Worker worker = new Worker("Имя", "Фамилия", 23, 4567);

        Iterator<String> components = worker;
        while (components.hasNext()) {
            System.out.println(worker.next());
        }

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

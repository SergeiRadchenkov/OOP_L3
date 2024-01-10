package Ex04;

public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}

package JavaProjects.Cafeteria.src;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("Televisão", 20, 1);
        Item item2 = new Item ("Computador", 30, 2);

        Chart chart = new Chart();

        chart.addItem(item1);
        chart.addItem(item2);

        chart.calculatePrice();

        chart.removeItem(2);

        chart.calculatePrice();
    }
}
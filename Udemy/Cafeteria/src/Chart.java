package JavaProjects.Cafeteria.src;

import java.util.ArrayList;

public class Chart {
    private ArrayList<Item> itens;

    public Chart() {
        itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public void removeItem(int productId) {
        for (int i = 0; i<itens.size(); i++) {
            if (itens.get(i).getProductId() == productId) {
                System.out.println(itens.get(i).getProductName() + " foi removido do carrinho!");
                itens.remove(i);
            }
        }
    }

    public void calculatePrice() {
        double price = 0;
        for (int i = 0; i<itens.size(); i++) {
            System.out.println("O produto "+itens.get(i).getProductName() + " custa R$"+itens.get(i).getPrice());
            price += itens.get(i).getPrice();
        }

        System.out.println("Total é R$"+price);
    }
}

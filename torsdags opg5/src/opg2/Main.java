package opg2;

public class Main {
    public static void main(String [] args){
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for (String c:cafe.coffemenu) {
            System.out.println(c);
        }
    }

}

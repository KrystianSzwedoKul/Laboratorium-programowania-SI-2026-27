public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int a = 1;
        double b = 2.0;
        char c = 'c';
        String d = "text";
        boolean e = false;
        d = d + " przykładowy";
        System.out.println(d);
        if (b > 1) {
            System.out.println("Liczba jest większa od 1");
        } else if (b == 2) {
            System.out.println("Liczby sa równe");
        } else {
            System.out.println("Liczba jest mniejsza od 1");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(i * i);
        }
        while (a < 5) {
            System.out.println(++a);
        }
        do {
            System.out.println(a--);
        } while (a > 1);

        Car car1 = new Car("Audi", "A3", 6);
        System.out.println(car1.getModel());
        car1.setModel("A4");
        System.out.println(car1.getModel());
        Car car2 = new Car("BMW","E35", 12);
        System.out.println(car2.getModel());
        System.out.println();
        System.out.println(car1.getInformacje());
        System.out.println(car2.getInformacje());
        Operacje operacje = car2;
        operacje.start();
    }
}

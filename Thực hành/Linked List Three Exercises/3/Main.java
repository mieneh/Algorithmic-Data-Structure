public class Main {
    public static void main(String[] args) {
        // create few faction
        Fraction f1 = new Fraction(2, 10);
        Fraction f2 = new Fraction(4, 10);
        Fraction f3 = new Fraction(4, 8);
        Fraction f4 = new Fraction(20, 3);
        Fraction f5 = new Fraction(-3, 9);
        f1.simplify();

        // create linkedFraction
        LinkedFraction list = new LinkedFraction();

        // add few Faction to my linked
        list.addFirst(f1);
        list.addFirst(f2);
        list.addFirst(f3);
        list.addFirst(f5);
        list.addFirst(f4);

        // list after add
        System.out.println("danh sach lien ket");
        list.print();

        // request 1
        // simplify all faction in my linked
        System.out.println("1. rut gon phan so");
        list.simplify();
        list.print();

        // request 2
        // sum all faction
        System.out.println("2. tinh tong");
        System.out.println(list.sumAll());

        // request 3
        // show faction greater than 1
        System.out.println("3. phan so > 1");
        list.showAllGreaterThanOne();

        // request 4
        // sort
        System.out.println("4. sap xep");
        list.sort();
        list.print();

    }

}

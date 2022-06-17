package pal.paragi;

public class Main {

    public static void main(String[] args) {
        //ellenőrzés, hogy a VipCustomer.java működik-e
        VipCustomer vipPerson1 = new VipCustomer();
        System.out.println(vipPerson1.getName()); // a default nevet hozza mert fent nem adtunk meg semmit
        System.out.println(vipPerson1.getCreditLimit()); // defeult értéket hoz, mert fent nem adtunk meg semmit
        System.out.println(vipPerson1.getEmailAddress()); // default érték lesz itt is

        System.out.println();

        VipCustomer vipPerson2 = new VipCustomer("Bob", 24000.0);
        System.out.println(vipPerson2.getName()); // a fent megadott értéket hozza
        System.out.println(vipPerson2.getCreditLimit()); // a fent megadott értéket hozza
        System.out.println(vipPerson2.getEmailAddress()); // a default értéket hozza, mert külön nem adtunk meg semmit fentebb

        System.out.println();

        VipCustomer vipPerson3 = new VipCustomer("Palika", 100.0, "pal.paragi@gmail.com");
        System.out.println(vipPerson3.getName()); // a fent megadott értéket hozza
        System.out.println(vipPerson3.getCreditLimit()); // a fent megadott értéket hozza
        System.out.println(vipPerson3.getEmailAddress()); // a fent megadott értéket hozza

        System.out.println();

        System.out.println(vipPerson2.getName());
    }
}

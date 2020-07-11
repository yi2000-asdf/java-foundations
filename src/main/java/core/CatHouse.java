package core;

public class CatHouse {
    public static void main(String[] args) {

        Cat tommy = new Cat();
        tommy.sayMeow();

        Lion mufasa = new Lion();
        mufasa.sayMeow();

        Cat bagira=new Panter();
        bagira.sayMeow();

        DomesticCat murka=new DomesticCat("Murka",3,true);
        System.out.println(murka.getName());
    }
}

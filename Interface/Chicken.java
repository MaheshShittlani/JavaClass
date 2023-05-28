public class Chicken extends Animal implements Edible, Cookable{
    @Override
    public void eat() {
        System.out.println("Chicken eats grains");
    }

    @Override
    public void sound() {
        System.out.println("Cock Cock");
    }

    @Override
    public void howToEat() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void howToCook() {
        // TODO Auto-generated method stub
        
    }
}

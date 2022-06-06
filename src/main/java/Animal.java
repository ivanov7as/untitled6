abstract class Animal {
    private final int maxRunLength;
    private final int maxSwimLength;
    private final int maxJumpLength;

    public Animal(int maxRunLength, int maxSwimLength, int maxJumpLength, int numb) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpLength = maxJumpLength;
    }


    public static Animal of(AnimalType animalType){
        switch(animalType){
            case Cat: return new Cat();
            case Dog: return new Dog();
            default: throw new UnsupportedOperationException();
        }
    }

    public String run(int length) {
        return print ("run",length<=maxRunLength,length);
    }

    public String swim(int length) {
        return print ("swim",length<=maxSwimLength,length);
    }

    public String jump(double length) {
        return print ("jump",length<=maxJumpLength,length);
    }

    private String print(String move, boolean done, double length){
        return name() +"."+move+"("+length+")"+"; -> результат: "+move+": "+done;
    }

    public abstract String name();

}

enum AnimalType{
    Cat,Dog;
}



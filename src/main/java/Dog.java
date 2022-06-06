class Dog extends Animal {

    private static int counter=1;

    private final static int MAX_RUN_LENGTH = 500;
    private final static int MAX_SWIM_LENGTH = 10;
    private final static int MAX_JUMP_HEIGTH = 2;

    public Dog() {
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH, MAX_JUMP_HEIGTH, counter++);
    }

    @Override
    public String name() {
        return "dog";
    }

}
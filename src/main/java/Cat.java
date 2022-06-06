class Cat extends Animal {

    private static int counter=1;

    private final static int MAX_RUN_LENGTH = 200;
    private final static int MAX_SWIM_LENGTH = 0;
    private final static int MAX_JUMP_HEIGTH = 1;

    //при создании экземпляра класса в конструкторе определяется максимальная длина прыжка, бега, плавания конкретно для кота 
    public Cat() {
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH, MAX_JUMP_HEIGTH, counter++);
    }

    @Override
    public String name() {
        return "cat";
    }

}
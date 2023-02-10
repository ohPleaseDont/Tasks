package pattern_Tasks.factory;

public class Factory {
    public FactoryBase doSomething(Anything type) {
        FactoryBase something = null;

        switch (type) {
            case FIRST_THING:
                something = new FirstThing();
                break;
            case SECOND_THING:
                something = new SecondThing();
                break;
        }
        something.doAnything();
        something.takeAnything();
        System.out.println("Паттерн работает");
        return something;
    }
}
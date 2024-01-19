package classes;

import abstract_classes.Entity;
import exceptions.ToManyArgumentsException;
import exceptions.WrongTypeArgumentsException;

public class Alive extends Entity {

    public Alive(String name) {
        super(name);
    }

    private void checkIntersectException(Object... objects) {
        String message = "Неверные входные данные";

        for (Object obj : objects) {
            if (obj == this) {
                throw new UnsupportedOperationException(message);
            }
        }
        if (objects.length == 2 && objects[1] == objects[0]) {
            throw new UnsupportedOperationException(message);
        }
    }

    private void checkTypeException(Object obj1, Object obj2) throws WrongTypeArgumentsException {
        if (obj1 instanceof Alive && obj2 instanceof Alive) {
            throw new WrongTypeArgumentsException();
        }
    }

    public void came(Inanimate obj) {
        System.out.println(getName() + " вернулся " + obj.getName());
    }

    public void was_silent(Entity obj) {
        checkIntersectException(obj);

        System.out.println(getName() + " умолчал обо" + obj.getName());
    }

    public void wasnt_happy() {
        System.out.println(getName() + " был(а) расстроен(а) ");
    }

    public void was_thinking() {
        System.out.println(getName() + " сильно задумался ");
    }

    public void called_on(Entity obj1, Entity obj2) throws WrongTypeArgumentsException {
        checkIntersectException(obj1, obj2);
        checkTypeException(obj1, obj2);

        System.out.println(getName() + " позвал(а) " + obj1.getName() + " на " + obj2.getName());
    }

    public void sit_down(Inanimate obj) {
        System.out.println(getName() + " сел(а) за " + obj.getName());
    }

    public void loves(Entity obj) {
        checkIntersectException(obj);

        System.out.println(getName() + " любит только " + obj.getName());
    }

    public void threw_away(Entity obj1, Entity obj2) throws WrongTypeArgumentsException {
        checkIntersectException(obj1, obj2);
        checkTypeException(obj1, obj2);

        System.out.println(getName() + " выбросил " + obj1.getName() + " на " + obj2.getName());
    }

    public void unwrapped(Inanimate obj) {
        System.out.println(getName() + " развернул " + obj.getName());
    }


}
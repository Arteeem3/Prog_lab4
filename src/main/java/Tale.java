import classes.Alive;
import classes.Inanimate;
import enums.*;
import exceptions.WrongTypeArgumentsException;

public class Tale {
    static Alive baby = new Alive("Малыш");
    static Alive betan = new Alive("Бетан");
    static Alive bosse = new Alive("Боссе");
    static Alive dad = new Alive("Папа");
    static Alive mom = new Alive("Мама");
    static Alive everyone = new Alive("всех");

    static Inanimate golubtzi = new Inanimate("голубцы", Details.DINNER);
    static Inanimate roof = new Inanimate("с крыши");
    static Inanimate everything = new Inanimate("всём");
    static Inanimate dinner = new Inanimate("обед");
    static Inanimate table = new Inanimate("стол");
    static Inanimate food = new Inanimate("еду", Details.UNHEALTY);
    static Inanimate floor = new Inanimate("пол");
    static Inanimate cabbage = new Inanimate("капусту");

    static public void telltale() {
        baby.came(roof);
        baby.was_silent(everything);
        mom.wasnt_happy();
        baby.was_thinking();

        try {
            mom.called_on(everyone, dinner);
        } catch (WrongTypeArgumentsException e) {
            System.out.println(e.getMessage());
        }

        mom.sit_down(table);
        dad.sit_down(table);
        bosse.sit_down(table);
        betan.sit_down(table);
        baby.sit_down(table);

        System.out.println(golubtzi.getName());
        golubtzi.setDetail(Details.DEFAULT);

        baby.loves(food);
        baby.unwrapped(golubtzi);

        try {
            baby.threw_away(cabbage, floor);
        } catch (WrongTypeArgumentsException e) {
            System.out.println(e.getMessage());
        }

    }
}
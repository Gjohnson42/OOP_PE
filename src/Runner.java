/**
 *
 */

public class Runner {
    public static void main(String[] args) {
        BattleController starter= new BattleController();
        Permanent al = new Permanent(3,"Al the AI has come to say hi!","Al");
        Permanent bear = new Permanent(5,"This is bad news bears.","Bear");
        Permanent GreaterRedDragon= new Permanent(4, "The Great Red Dragon's wings whip up a great storm as it enters!", "Great Red Dragon");
        starter.addPermanent(al);
        starter.addPermanent(GreaterRedDragon);
        starter.displayETBMessage(starter.initial);
        starter.printContents(starter.initial);
        starter.sortByInit(starter.getInitial());

    }

}


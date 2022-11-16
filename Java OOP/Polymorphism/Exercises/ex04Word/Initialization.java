package polymorphism.exercises.ex04Word;

public class Initialization {

    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface command = new AdvancedCommandInterface(text);
        command.init();

        return command;
    }
}

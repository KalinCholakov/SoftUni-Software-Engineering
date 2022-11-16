package polymorphism.exercises.ex04Word;

import java.util.List;

public class AdvancedCommandInterface extends CommandInterfaceImpl {

    public AdvancedCommandInterface(StringBuilder text) {
        super(text);
    }

    @Override
    protected List<Command> initCommands() {
        List<Command> commands = super.initCommands();

        CutTransform cutTransform = new CutTransform();
        Command cut = new Command("cut", cutTransform);
        commands.add(cut);

        Command paste = new Command("paste", new PasteTransform(cutTransform));
        commands.add(paste);

        return commands;
    }
}

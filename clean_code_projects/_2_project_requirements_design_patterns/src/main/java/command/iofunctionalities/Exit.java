package command.iofunctionalities;

import command.Command;

/**
 * Concrete command, implementing abstract {@link Command} interface from command design pattern
 * <p>
 *     This specific command will terminate the program, receives no parameters
 * </p>
 */

public class Exit implements Command {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        System.exit(1);
    }
}

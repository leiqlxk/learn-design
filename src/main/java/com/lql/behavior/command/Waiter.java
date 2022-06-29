package com.lql.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Waiter <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:24 <br>
 */
public class Waiter {
    private List<Command> commands;

    public Waiter() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void orderUp() {
        for (Command command : this.commands) {
            command.exec();
        }
    }
}

package com.lql.behavior.command;

/**
 * Title: Invoker <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:53 <br>
 */
public class Invoker {

    private Command[] onCommands;

    private Command[] offCommands;

    private final int slotNum = 7;

    public Invoker() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommands(Command command, int slot) {
        this.onCommands[slot] = command;
    }

    public void setOffCommands(Command command, int slot) {
        this.offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }
}

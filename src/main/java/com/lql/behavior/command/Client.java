package com.lql.behavior.command;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:57 <br>
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        invoker.setOffCommands(lightOffCommand, 0);
        invoker.setOnCommands(lightOnCommand, 0);

        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}

package com.lql.behavior.memento.demo;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:39 <br>
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        MementoCaretaker caretaker = new MementoCaretaker();
        gameRole.init();
        caretaker.saveMemento(gameRole.save());


        System.out.println("============战斗前==============");
        System.out.println(gameRole);
        gameRole.fight();

        System.out.println("============战斗后==============");
        System.out.println(gameRole);
        gameRole.recover(caretaker.getMemento());

        System.out.println("============恢复后==============");
        System.out.println(gameRole);
    }
}

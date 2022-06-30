package com.lql.behavior.memento.demo1;

/**
 * Title: MementoCaretaker <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:37 <br>
 */
public class MementoCaretaker {

    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }
}

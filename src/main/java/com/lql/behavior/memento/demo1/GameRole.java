package com.lql.behavior.memento.demo1;

/**
 * Title: GameRole <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/30 20:32 <br>
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public Memento save() {
        return new RoleMemento(this.vit, this.atk, this.def);
    }

    public void recover(Memento memento) {
        RoleMemento roleMemento = (RoleMemento) memento;
        this.vit = roleMemento.getVit();
        this.atk = roleMemento.getAtk();
        this.def = roleMemento.getDef();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }

    private class RoleMemento implements Memento{
        private int vit;
        private int atk;
        private int def;

        public RoleMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}

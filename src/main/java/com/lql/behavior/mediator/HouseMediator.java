package com.lql.behavior.mediator;

/**
 * Title: HouseMediator <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:35 <br>
 */
public class HouseMediator implements Mediator{
    private Person houseOwner;
    private Person tenant;

    public HouseMediator(Person houseOwner, Person tenant) {
        this.houseOwner = houseOwner;
        this.tenant = tenant;
    }

    @Override
    public void concat(String msg, Person person) {
        if (person == houseOwner) {
            tenant.getMsg(msg);
        }else {
            houseOwner.getMsg(msg);
        }
    }
}

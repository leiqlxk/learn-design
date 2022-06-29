package com.lql.behavior.mediator;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:41 <br>
 */
public class Client {

    public static void main(String[] args) {
        HouseOwner houseOwner = new HouseOwner();
        Tenant tenant = new Tenant();

        HouseMediator houseMediator = new HouseMediator(houseOwner, tenant);
        houseOwner.setMediator(houseMediator);
        tenant.setMediator(houseMediator);

        houseOwner.concat("三房两室出租");
        tenant.concat("租金多少");
    }
}

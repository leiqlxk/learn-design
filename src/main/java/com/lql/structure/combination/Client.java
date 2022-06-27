package com.lql.structure.combination;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:15 <br>
 */
public class Client {

    public static void main(String[] args) {
        Menu rootMenu = new Menu("系统配置", 1);

        Menu menu = new Menu("菜单管理", 2);
        MenuItem menuItem = new MenuItem("页面访问", 3);
        MenuItem menuItem1 = new MenuItem("展开菜单", 3);
        MenuItem menuItem2 = new MenuItem("编辑菜单", 3);
        MenuItem menuItem3 = new MenuItem("删除菜单", 3);
        MenuItem menuItem4 = new MenuItem("新增菜单", 3);
        menu.add(menuItem);
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);

        Menu permission = new Menu("权限配置", 2);
        MenuItem menuItem5 = new MenuItem("页面访问", 3);
        MenuItem menuItem6 = new MenuItem("提交保存", 3);
        permission.add(menuItem5);
        permission.add(menuItem6);

        Menu role = new Menu("角色管理", 2);
        MenuItem menuItem7 = new MenuItem("页面访问", 3);
        MenuItem menuItem8 = new MenuItem("新增角色", 3);
        MenuItem menuItem9 = new MenuItem("修改角色", 3);
        role.add(menuItem7);
        role.add(menuItem8);
        role.add(menuItem9);

        rootMenu.add(menu);
        rootMenu.add(permission);
        rootMenu.add(role);

        rootMenu.print();
    }
}

package com.lql.creator.prototype.demo1;

/**
 * Title: Prototype <br>
 * ProjectName: learn-design <br>
 * description: 浅拷贝原型模式，对于类中有类类型的成员变量时，浅拷贝只拷贝了引用，原型模式用于创建对象非常复杂时能够通过对象原型快速的创建新对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:38 <br>
 */
public class Prototype implements Cloneable{

    public Prototype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Prototype) super.clone();
    }
}

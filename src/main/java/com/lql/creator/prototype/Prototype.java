package com.lql.creator.prototype;

/**
 * Title: Prototype <br>
 * ProjectName: learn-design <br>
 * description: 原型模式 <br>
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 16:01 <br>
 */
public abstract class Prototype {

    abstract Prototype myClone();
}

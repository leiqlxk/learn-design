package com.lql.creator.singleton;

/**
 * Title: EnumSingleton <br>
 * ProjectName: learn-design <br>
 * description: 枚举实现 <br>
 *
 * 该实现可以防止反射攻击。在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，然后调用构造函数从而实例化对象，如果要防止这种攻击，
 * 需要在构造函数中添加防止多次实例化的代码。该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
 *
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法。
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 17:30 <br>
 */
public enum EnumSingleton {
    // 实例
    INSTANCE;

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public static void main(String[] args) {
        // 单例测试
        EnumSingleton firstSingleton = EnumSingleton.INSTANCE;
        firstSingleton.setObjectName("firstName");
        System.out.println(firstSingleton.getObjectName());
        EnumSingleton secondSingleton = EnumSingleton.INSTANCE;
        secondSingleton.setObjectName("secondName");
        System.out.println(firstSingleton.getObjectName());
        System.out.println(secondSingleton.getObjectName());

        // 反射获取实例测试
        try {
            EnumSingleton[] enumConstants = EnumSingleton.class.getEnumConstants();
            for (EnumSingleton enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

## 设计模式遵循六大原则
1. 单一职责原则：一个类或者方法只做一件事
1. 里氏替换原则：多态，子类扩展父类，但不能修改父类已有功能
1. 依赖倒置原则：细节依赖抽象，下层依赖上层，抽象不应该依赖细节，细节应该依赖抽象。即变量和传参尽量使用抽象类或者接口
1. 接口隔离原则：建立单一接口，客户端不应该依赖它不需要的接口，类之间关系应该建立在最小的接口上
1. 迪米特原则：最少知道，降低耦合
1. 开闭原则：用抽象构建架构，用实现扩展。对修改封闭，对扩展开放
## 分类
### 创建型模式
    此类模式提供创建对象机制，能够提升已有代码的灵活性和可复用性(创单简工抽生原)
#### 工厂方法
1. 业务场景：多种类型奖品发放
1. 实现要点：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
#### 抽象工厂
1. 业务场景：替换Redis双集群升级，代理类抽象场景
1. 实现要点：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。抽象工厂模式和工厂方法模式主要意图都是为了解决接口问题
但实现上抽象工厂是一个中心工厂，创建其他工厂的模式。如不同系统里的回车换行、idea开发工具的差异
#### 建造者
1. 业务场景：各项装修物料组合套餐选配场景
1. 实现要点：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
#### 原型
1. 业务场景：上机考试多套试题，没人题目和答案乱序排列场景
1. 实现要点：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
#### 单例
1. 业务场景：全局只需要一个实例对象
1. 实现要点：保证一个类仅有一个实例，并提供一个访问它的全局访问点
### 结构型模式
    此类模式介绍如何将对象和类组装成较大的结构，并同时保持结构的灵活和高效（结外装适代享桥组）
#### 适配器
1. 业务场景：从多个MQ消息体中，抽取指定字段值场景
1. 实现要点：将一个类的接口转换成客户希望的另一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
#### 桥接
1. 业务场景：多支付渠道（微信、支付宝）与多支付模式（刷脸、指纹）场景
1. 实现要点：将抽象部分与实现不符分离，使它们都可以独立变化
#### 组合
1. 业务场景：营销差异化人群发券，决策树引擎搭建场景
1. 实现要点：将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
#### 装饰
1. 业务场景：sso单点登录功能扩展，增加拦截用户访问方法范围场景
1. 实现要点：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式比生成子类更为灵活
#### 外观
1. 业务场景：基于SpringBoot开发门面模式中间件，统一控制接口白名单场景
1. 实现要点：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更容易使用
#### 享元
1. 业务场景：既有redis秒杀，提供活动与库存信息查询场景
1. 实现要点：运用共享技术有效地支持大量细粒度的对象
#### 代理
1. 业务场景：模拟mybatis-spring中定义DAO接口，使用代理类方式操作数据库原理实现场景
1. 实现要点：为其他对象提供一种代理以控制对这个对象的访问
### 行为模式
    此类模式负责对象间的高效沟通和职责委派
#### 责任链
1. 业务场景：模拟618电商大促期间，项目上线流程多级负责人审批场景
1. 实现要点：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
#### 命令
1. 业务场景：模拟高档餐厅八大菜系，小二点单厨师烹饪场景
1. 实现要点：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化
#### 迭代器
1. 业务场景：模拟公司组织架构树结构关系，深度迭代遍历人员信息输出场景
1. 实现要点：提供一种方法顺序访问一个聚合对象中各个元素，而又无须暴露该对象的内部表示
#### 中介
1. 业务场景：按照mybatis原理手写ORM框架，给JDBC方式操作数据库增加中介者场景
1. 实现要点：用一个中介对象来封装一系列的对象交互，中介者使各个对象不需要显示地相互引用吗，从而使其耦合松散，而且可以独立地改变它们之间的交互
#### 备忘录
1. 业务场景：模拟互联网系统上线过程中，配置文件回滚场景
1. 实现要点：在不破坏封装性的前提下，捕获一个对象内部状态，并在该对象之外保存这个状态
#### 观察者
1. 业务场景：模拟类似小客车指标摇号过程，监听消息通知用户中签场景
1. 实现要点：定义对象间的一种一对多的依赖关系，当一个对象状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
#### 状态
1. 业务场景：模拟系统营销活动，状态流程审核发布上线场景
1. 实现要点：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类
#### 策略模式
1. 业务场景：模拟多种营销类型优惠券，折扣金额计算策略场景
1. 实现要点：定义一系列的算法，把它们一个个封装起来，并且使它们可以相互替换
#### 模板方法
1. 业务场景：模拟爬虫各类电商商品，生成营销推广海报场景
1. 实现要点：定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以改变一个算法的结构即可重定义该算法的某些特定步骤
#### 访问者
1. 业务场景：模拟家长与校长对学生和老师的不同视角信息的访问场景
1. 实现要点：主要将数据结构和数据操作分离

##### 面向对象的三大特性
- 封装（Encapsulation）

隐藏对象的具体实现细节，通过共有方法暴露对象的功能。内部结构可以自由修改，同时可对成员进行更加精确的控制 (比如在setter方法中加值合法判断)

- 继承（Inheritance）

使用已经存在的类作为基础类（父类），在此基础上建立新类（子类），子类既可复用父类的功能，也能进行扩展，从而实现代码复用。 另外Java是单继承的，可以通过接口和内部类实现多继承。但是有几点需要注意一下：

    1.子类拥有父类非private的属性与方法
  
    2.构造方法只能调用，不能实现，子类默认调用父类的无参构造方法，如果父类没有无参的构造方法，需要使用super显式调用！
  
    3.慎用继承，要考虑是否需要从子类向父类进行向上转型！(转型要instanceof)
  
  
- 多态（Polymorphism）

一个类实例的相同方法在不同的情形下有不同的表现形式。多态分为两种：方法重载和重写（主要描述父类和子类之前的多态）。

##### 类与类间的关系
- 继承，实现，依赖，关联，聚合，组合
- 类的相关程度：继承 < 实现 < 依赖 < 关联 < 聚合 < 组合
- 依次的UML类图标记
    - 继承
    
    ![继承](https://user-images.githubusercontent.com/17539174/61340379-a639f680-a874-11e9-9088-640522b3fde5.png)
    
    - 实现
    
    ![实现](https://user-images.githubusercontent.com/17539174/61340401-b3ef7c00-a874-11e9-9d7a-da298803ce6d.png)
    
    - 依赖
    
    ![依赖](https://user-images.githubusercontent.com/17539174/61340427-d4b7d180-a874-11e9-81a7-ca359613eaab.png)
    
    - 关联
    
    ![关联](https://user-images.githubusercontent.com/17539174/61340436-e1d4c080-a874-11e9-9b27-0c37737411c5.png)
    
    - 聚合
    
    ![聚合](https://user-images.githubusercontent.com/17539174/61340444-f022dc80-a874-11e9-9d63-a9265f565759.png)
    
    - 组合
    
    ![组合](https://user-images.githubusercontent.com/17539174/61340457-fca73500-a874-11e9-9cce-b2ee3690e7cc.png)

- [设计模式之六大设计原则](https://blog.csdn.net/wangchengming1/article/details/83090643)
- [单例模式(Singleton Pattern)](https://blog.csdn.net/wangchengming1/article/details/83311035)
- [工厂模式(Factory Pattern)](https://blog.csdn.net/wangchengming1/article/details/83377635)
- [抽象工厂模式(Abstract Factory Pattern)](https://blog.csdn.net/wangchengming1/article/details/83542422)
- [模板方法模式(Template Method Pattern)](https://blog.csdn.net/wangchengming1/article/details/83621035)
- [建造者模式(Builder Pattern)](https://blog.csdn.net/wangchengming1/article/details/83788919)
- [代理模式(Proxy Pattern)](https://blog.csdn.net/wangchengming1/article/details/83858767)
- [原型模式(Prototype Pattern)](https://blog.csdn.net/wangchengming1/article/details/84107248)
- [中介者模式(Mediator Pattern)](https://blog.csdn.net/wangchengming1/article/details/84768795)
- [命令模式(Command Pattern)](https://blog.csdn.net/wangchengming1/article/details/84927843)
- [责任链模式(Chain of Responsibility Pattern)](https://blog.csdn.net/wangchengming1/article/details/85049192)
- [策略模式(Strategy Pattern)](https://blog.csdn.net/wangchengming1/article/details/85068565)
- [适配器模式(Adapter Pattern)](https://blog.csdn.net/wangchengming1/article/details/85096998)
- [迭代器模式(Iterator Pattern)](https://blog.csdn.net/wangchengming1/article/details/85252054)
- [观察者模式(Observer Pattern)](https://blog.csdn.net/wangchengming1/article/details/86624109)
- [装饰模式(Decorator Pattern)](https://blog.csdn.net/wangchengming1/article/details/86644556)

### 1、用UML绘制出三种工厂模式的类结构图。
###### 简单工厂模式
![UML](https://github.com/qilily/gupao-study/blob/master/Chapter1-1%20-%20Factory_Pattern/images/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%20-%20%E7%B1%BB%E5%9B%BE.png)

###### 工厂方法模式
![UML](https://github.com/qilily/gupao-study/blob/master/Chapter1-1%20-%20Factory_Pattern/images/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F%20-%20%E7%B1%BB%E5%9B%BE.png)

工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类(出自 Head First设计模式中文版)。

###### 抽象工厂模式
![UML](https://github.com/qilily/gupao-study/blob/master/Chapter1-1%20-%20Factory_Pattern/images/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%20-%20%E7%B1%BB%E5%9B%BE.png)

抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

### 2、深刻理解产品族和产品等级结构之间的关系。

1. 产品既可以纵向扩展成产品族，横向也能扩展成产品结构。
2. 产品的不同种类、参数、型号、规格属于一个产品结构。
3. 产品族是指同一个工厂创建的，在一个产品结构中的产品。

### 3、自主完成三种工厂模式的代码实现，理解简单工厂、工厂方法和抽象工厂的区别。

工厂方法让子类决定如何实现，而简单工厂则是把对象创建全部处理完成，简单工厂不具备工厂方法的弹性，工厂方法能够解决产品扩展的问题。
抽象工厂可以方便地扩展抽象产品，创建一个产品族，实现不同参数的产品创建，每一个具体子类都能创建一个产品族。
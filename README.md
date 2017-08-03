# think_in_java-typeinfo
编程思想第14章 类型信息的阅读

# typeInfo

​	运行时类型信息,使得你可以在程序运行时发现和使用类型信息

​	这一章将要讨论如何在运行时识别对戏那个和类的信息,主要方式有两种,

## 传统RTTI

​	假定我们在编译时就已经知道了所有的类型

##  反射机制

允许我们在运行时发现和使用类的性息

 RTTI（Run-Time Type Identification，通过运行时类型识别）的含义就是在运行时识别一个对象的类型，其对应的类是Class对象，每个java里面的类都对应一个Class对象(在编写并且编译后)，这个对象被保存在这个类的同名class文件里。

类加载器在类被第一次静态调用(比如一个静态方法，一个静态代码块或者new关键字调用构造器，注意contructors其实都是静态的)时会把那个对应的Class对象加载到内存中。

Class类有名的一个static方法是forName。Class.forName("classname with packagepath");通过这个静态方法返回的一个对类的Class对象的引用，用户可以在运行时动态得到大量关于这个类的信息，包括接口，父类，方法，静态成员，甚至是像newInstance()方法这样的一个实现“虚拟构造器”的一种方式。所谓的虚拟构造器，就是声明“我不知道你的确切类型，至少在编译期不知道，但是我就是要正确的创建你的一个对象”。

比如说c是某个类的Class对象
Class superc = c.getSuperClass();
Object obj = null;
obj = c.newInstance();
毫无疑问，这个obj实际指向的对象是c的父类的一个对象。
鉴于java的单继承模式，这个父类显然是唯一确定的，尽管在编译时我完全不知道它的类名。

Java提供的另外一种更加安全的得到Class类的对象的方式是，使用类字面常量。
classname.class;

Java在RTTI中的第三种形式是最常见的。就是instanceof关键字，用法就不多说了。该关键字的调用其实就是使用了Class对象，并且返回一个布尔值。如果说instanceof和Class的比较唯一的不同，那就是instanceof如果是其子类的对象也会返回true，而Class对象比较的会是确切的那个类型。

这样得到类的Class对象可以在编译器就得到检查。


自己的博客  [马睿隆](www.itmasir.com)
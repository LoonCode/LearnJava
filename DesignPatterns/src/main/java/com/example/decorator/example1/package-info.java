/**
 * @link  http://blog.csdn.net/sadfishsc/article/details/7307309
 * 设计模式  策略模式
 * 通过包装类实现额外功能，无需改变原有结构
 * Created by Loon on 2015/3/12.
 *
 * 1.      装饰对象和真实对象拥有相同的接口或父类；

2.      装饰对象中包含真实对象的引用，真实对象包装在装饰对象中；

3.      客户端中不再操作真实对象，而是通过装饰对象把请求/参数传递给真实对象，通过装饰对象来操作真实对象；

4.      装饰对象在操作真实对象之前或之后可以进行一些额外的操作以满足特定的需求；

5.      如果包裹多个装饰对象，那么装饰对象的操作是有序的：越在外层的装饰对象越先执行。
 */
package com.example.decorator.example1;
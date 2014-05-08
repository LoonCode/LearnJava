package com.example.decorator;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-4-6
 * Time: 下午1:26
 * To change this template use File | Settings | File Templates.
 */
public class DecoratorDemo {

    public static void main(String[] args) {

        TimeStamped timeStamped  = new TimeStamped(new Basic());
        TimeStamped timeStamped2 = new TimeStamped(new SerialNumbered(new Basic()));
        timeStamped2.getTimeStamp();
//        timeStamped2.getSerialNumber();      not available

        SerialNumbered serialNumbered  = new SerialNumbered(new Basic());
        SerialNumbered serialNumbered2 = new SerialNumbered(new TimeStamped(new Basic()));

        serialNumbered2.getSerialNumber();
//        serialNumbered2.getTimeStamp(); not available


    }
}


class  Basic{

    private  String  value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

// 装饰器
class  Decorator extends Basic {
    protected Basic basic;

    public  Decorator (Basic basic){

        this.basic =basic;
    }

    public String getValue() {
        return basic.getValue();
    }

    public void setValue(String value) {
        basic.setValue(value);
    }

}

class  TimeStamped extends Decorator {

    private  final  long  timeStamp;

    public TimeStamped(Basic basic) {
        super(basic);
        this.timeStamp = Calendar.getInstance().getTimeInMillis();
    }

    public  long  getTimeStamp(){
        return  timeStamp;
    }
}

class  SerialNumbered extends Decorator {

    private  static  long  counter =1;

    private  final  long  serialNumber = counter++;

    public SerialNumbered(Basic basic) {
        super(basic);
    }

    public  long  getSerialNumber(){
        return  serialNumber;
    }
}

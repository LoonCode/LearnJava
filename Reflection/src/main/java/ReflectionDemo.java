import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-31
 * Time: 下午3:25
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
        Class cls = Class.forName("Dog");

        Object dog = cls.newInstance();
        Method[] superMethods = null;
        if (cls.getGenericSuperclass() != null) {
            Class superClass = cls.getSuperclass();
            superMethods = superClass.getDeclaredMethods();
            Method setAge = superClass.getDeclaredMethod("setAge", int.class);
            Method setGender = superClass.getDeclaredMethod("setGender", String.class);
            setAge.invoke(dog, 1);
            setGender.invoke(dog, "male");
        }

        Method[] methods = cls.getDeclaredMethods();
        Method[] allMethods = new Method[methods.length+superMethods.length];
        System.arraycopy(methods, 0, allMethods, 0, methods.length);
        System.arraycopy(superMethods, 0, allMethods, methods.length, superMethods.length);
        for (Method method : allMethods) {
            if (method.getName().startsWith("get")) {
                Object value = method.invoke(dog);
                System.out.println(method.getName() +" == "+value);
            }
        }

        Method setFoot = cls.getDeclaredMethod("setFoot", int.class);
        setFoot.invoke(dog, 4);

        Method getFoot = cls.getDeclaredMethod("getFoot");
        System.out.println(getFoot.invoke(dog));

        Field foot = cls.getDeclaredField("foot");
        // set Field public
        foot.setAccessible(true);
        foot.set(dog, 8);
        System.out.println(getFoot.invoke(dog));
    }
}

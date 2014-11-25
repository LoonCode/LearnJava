import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Loon on 2014/11/25.
 */
public class ClassInfo {

    public static void main(String[] args) {

        Class dog = Dog.class;

        String className = dog.getName();
//        获取类名
        System.out.println(className);

        String simpleClassName = dog.getSimpleName();
        System.out.println("simpleClassName: " + simpleClassName);

        int modifiers = dog.getModifiers();
        System.out.println("modifiers: " + modifiers);

        Modifier.isAbstract(modifiers);
//        获取修饰符
        System.out.println(Modifier.isAbstract(modifiers));
        Modifier.isFinal(modifiers);
        Modifier.isInterface(modifiers);
        Modifier.isNative(modifiers);
        Modifier.isPrivate(modifiers);
        Modifier.isProtected(modifiers);
        Modifier.isPublic(modifiers);
        Modifier.isStatic(modifiers);
        Modifier.isStrict(modifiers);
        Modifier.isSynchronized(modifiers);
        Modifier.isTransient(modifiers);
        Modifier.isVolatile(modifiers);

        Package packageInfo = dog.getPackage();
//        默认无包名
//        System.out.println("packageInfo name :" +  packageInfo.getName());

        Class superclass = dog.getSuperclass();
        System.out.println("superclass name : " + superclass.getName());

        Class[] interfaces = dog.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface name: " + anInterface.getName());
        }

        Constructor[] constructors = dog.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor name: " + constructor.getName());
        }

        Method[] methods = dog.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Field[] fields = dog.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Annotation[] annotations = dog.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
        }

    }
}

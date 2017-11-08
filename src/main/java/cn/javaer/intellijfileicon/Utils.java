package cn.javaer.intellijfileicon;

import com.intellij.openapi.ui.Messages;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Optional;

/**
 * 工具类.
 *
 * @author zhangpeng
 */
public final class Utils {

    private Utils() {}

    /**
     * 为 final static 字段赋值.
     *
     * @param cls       class
     * @param fieldName 要赋值的字段名称
     * @param newValue  新值
     */
    public static void setFinalStatic(Class cls, String fieldName, Object newValue) {
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                setFinalStatic(field, newValue);
                return;
            }
        }
    }

    /**
     * 为 final static 字段赋值.
     *
     * @param field    要赋值的字段
     * @param newValue 新值
     */
    public static void setFinalStatic(Field field, Object newValue) {
        try {
            field.setAccessible(true);

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            field.set(null, newValue);

            modifiersField.setInt(field, field.getModifiers() | Modifier.FINAL);
            modifiersField.setAccessible(false);

            field.setAccessible(false);

        } catch (IllegalAccessException | NoSuchFieldException e) {
            Messages.showInfoMessage(e.getMessage(), "intellij-file-icon");
        }
    }

    /**
     * 以 <code> Class.forName(className) </code> 避免硬编码的方式加载 class.
     *
     * @param className 要加载的 class
     * @return 返回 class，如果 class 不存在返回 Optional.empty()
     */
    public static Optional<Class> classForName(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return Optional.of(clazz);
        } catch (ClassNotFoundException e) {
            return Optional.empty();
        }
    }
}
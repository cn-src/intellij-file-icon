package cn.javaer.intellijfileicon;

import com.intellij.openapi.ui.Messages;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Optional;

public final class StaticPatcher {

    private StaticPatcher() {
    }

    public static void setFieldValue(Object object, String fieldName, Object value) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (Exception e) {
            Messages.showInfoMessage(e.getMessage(), "intellij-file-icon");
        }
    }

    public static void setFinalStatic(Class cls, String fieldName, Object newValue) {
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                setFinalStatic(field, newValue);
                return;
            }
        }
    }

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

    public static Optional<Class> classForName(String className) {
        try {
            Class<?> aClass = Class.forName(className);
            return Optional.of(aClass);
        } catch (ClassNotFoundException e) {
            return Optional.empty();
        }
    }
}
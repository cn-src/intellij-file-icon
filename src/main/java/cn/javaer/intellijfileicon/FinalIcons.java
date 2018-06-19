package cn.javaer.intellijfileicon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.Icon;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件图标.
 *
 * @author zhangpeng
 */
public class FinalIcons {
    private static final Map<String, Icon> fileIconMapping;

    static {
        fileIconMapping = new HashMap<>();
        fileIconMapping.put("csv", IconLoader.getIcon("/icons/file_type_csv.png"));
        fileIconMapping.put("cmd", IconLoader.getIcon("/icons/file_type_windows.png"));
        fileIconMapping.put("bat", IconLoader.getIcon("/icons/file_type_windows.png"));
        fileIconMapping.put("md", IconLoader.getIcon("/icons/MarkdownPlugin.png"));
        fileIconMapping.put("prop", IconLoader.getIcon("/icons/prop.png"));
        fileIconMapping.put("prop@2x", IconLoader.getIcon("/icons/prop@2x.png"));
    }

    private FinalIcons() {}

    public static boolean containsKeyIgnoreCase(final String key) {
        return fileIconMapping.containsKey(key.toLowerCase());
    }

    public static Icon get(final String key) {
        return fileIconMapping.get(key.toLowerCase());
    }
}

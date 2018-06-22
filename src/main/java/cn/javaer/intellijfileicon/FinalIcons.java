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
        fileIconMapping.put(".csv", IconLoader.getIcon("/icons/file_type_csv.png"));
        fileIconMapping.put(".cmd", IconLoader.getIcon("/icons/file_type_powershell.png"));
        fileIconMapping.put(".bat", IconLoader.getIcon("/icons/file_type_powershell.png"));
        fileIconMapping.put(".sh", IconLoader.getIcon("/icons/file_type_shell.png"));
        fileIconMapping.put(".md", IconLoader.getIcon("/icons/MarkdownPlugin.png"));
        fileIconMapping.put(".prop", IconLoader.getIcon("/icons/prop.png"));
        fileIconMapping.put("prop@2x", IconLoader.getIcon("/icons/prop@2x.png"));
    }

    private FinalIcons() {}

//    public static boolean containsKeyIgnoreCase(final String key) {
//        return fileIconMapping.containsKey(key.toLowerCase());
//    }

    public static Icon get(final String fileName) {
        return fileIconMapping.entrySet().stream()
                .filter(entry -> fileName.endsWith(entry.getKey()))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);
    }
}

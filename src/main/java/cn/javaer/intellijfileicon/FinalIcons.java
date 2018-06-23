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
    private static final Map<String, Icon> ICONS;

    static {
        ICONS = new HashMap<>();
        ICONS.put(".csv", IconLoader.getIcon("/icons/file_type_csv.png"));
        ICONS.put(".cmd", IconLoader.getIcon("/icons/file_type_windows.png"));
        ICONS.put(".bat", IconLoader.getIcon("/icons/file_type_windows.png"));
//        ICONS.put(".sh", IconLoader.getIcon("/icons/file_type_shell.png"));
        ICONS.put(".md", IconLoader.getIcon("/icons/MarkdownPlugin.png"));
        ICONS.put(".props", IconLoader.getIcon("/icons/props.png"));
        ICONS.put("prop@2x", IconLoader.getIcon("/icons/props@2x.png"));
        ICONS.put(".travis.yml", IconLoader.getIcon("/icons/file_type_travis.png"));
        ICONS.put(".kt", IconLoader.getIcon("/icons/kotlin.png"));
        ICONS.put(".gitignore", IconLoader.getIcon("/icons/git.png"));
        ICONS.put("TODO.md", IconLoader.getIcon("/icons/todo.png"));
    }

    private FinalIcons() {}

    public static Icon get(final String file) {
        final Icon icon = ICONS.get(file);
        if (icon != null) {
            return icon;
        }
        return ICONS.entrySet().stream()
                .filter(entry -> file.toLowerCase().endsWith(entry.getKey()))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);
    }
}

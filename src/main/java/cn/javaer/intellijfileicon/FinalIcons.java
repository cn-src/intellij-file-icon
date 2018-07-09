package cn.javaer.intellijfileicon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.Icon;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件图标.
 *
 * @author cn-src
 */
public class FinalIcons {
    public static final Map<String, Icon> NODE_ICONS;
    private static final Map<String, Icon> FILE_ICONS;

    static {
        FILE_ICONS = new HashMap<>();
        FILE_ICONS.put(".csv", IconLoader.getIcon("/icons/file_type_csv.png"));
        FILE_ICONS.put(".cmd", IconLoader.getIcon("/icons/file_type_windows.png"));
        FILE_ICONS.put(".bat", IconLoader.getIcon("/icons/file_type_windows.png"));
        FILE_ICONS.put(".md", IconLoader.getIcon("/icons/MarkdownPlugin.png"));
        FILE_ICONS.put(".props", IconLoader.getIcon("/icons/props.png"));
        FILE_ICONS.put("prop@2x", IconLoader.getIcon("/icons/props@2x.png"));
        FILE_ICONS.put(".travis.yml", IconLoader.getIcon("/icons/file_type_travis.png"));
        FILE_ICONS.put(".kt", IconLoader.getIcon("/icons/kotlin.png"));
        FILE_ICONS.put(".gitignore", IconLoader.getIcon("/icons/git.png"));
        FILE_ICONS.put("todo.md", IconLoader.getIcon("/icons/todo.png"));
        FILE_ICONS.put("readme.md", IconLoader.getIcon("/icons/readme.png"));
        FILE_ICONS.put("license", IconLoader.getIcon("/icons/license.png"));
        FILE_ICONS.put("license.txt", IconLoader.getIcon("/icons/license.png"));
        // ----
        NODE_ICONS = new HashMap<>();
        NODE_ICONS.put("view", IconLoader.getIcon("/icons/view.png"));
    }

    private FinalIcons() {}

    public static Icon get(final String file) {
        final Icon icon = FILE_ICONS.get(file.toLowerCase());
        if (icon != null) {
            return icon;
        }
        return FILE_ICONS.entrySet().stream()
                .filter(entry -> file.toLowerCase().endsWith(entry.getKey()))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);
    }
}

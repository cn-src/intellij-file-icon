package cn.javaer.intellijfileicon;


import com.intellij.ide.FileIconProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.VirtualFile;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 更改默认图标.
 *
 * @author zhangpeng
 */
public class FinalFileIconProvider implements FileIconProvider {

    public static final Map<String, Icon> FILE_ICON_MAPPING;

    static {
        FILE_ICON_MAPPING = new HashMap<>();
        FILE_ICON_MAPPING.put("csv", IconLoader.getIcon("/icons/file_type_csv.png"));
        FILE_ICON_MAPPING.put("cmd", IconLoader.getIcon("/icons/file_type_windows.png"));
        FILE_ICON_MAPPING.put("bat", IconLoader.getIcon("/icons/file_type_windows.png"));
        FILE_ICON_MAPPING.put("md", IconLoader.getIcon("/icons/MarkdownPlugin.png"));
    }

    @Nullable
    @Override
    public Icon getIcon(@NotNull VirtualFile file, int flags, @Nullable Project project) {
        for (Map.Entry<String, Icon> entry : FILE_ICON_MAPPING.entrySet()) {
            if (null != file.getExtension() && entry.getKey().equalsIgnoreCase(file.getExtension())) {
                return entry.getValue();
            }
        }
        return null;
    }
}

package cn.javaer.intellijfileicon;

import com.intellij.ide.FileIconProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;


/**
 * 更改默认图标.
 *
 * @author zhangpeng
 */
public class FinalFileIconProvider implements FileIconProvider {

    @Nullable
    @Override
    public Icon getIcon(@NotNull VirtualFile file, int flags, @Nullable Project project) {
        String fileExtension = file.getExtension();
        if (null != fileExtension && FinalIcons.containsKeyIgnoreCase(fileExtension)) {
            return FinalIcons.get(fileExtension);
        }
        return null;
    }
}

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
    public Icon getIcon(@NotNull final VirtualFile file, final int flags, @Nullable final Project project) {
        return FinalIcons.get(file.getName());
    }
}

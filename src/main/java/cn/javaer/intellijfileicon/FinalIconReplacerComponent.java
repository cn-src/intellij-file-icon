package cn.javaer.intellijfileicon;

import com.intellij.openapi.components.ApplicationComponent;

/**
 * @author zhangpeng
 */
public class FinalIconReplacerComponent implements ApplicationComponent {
    @Override
    public void initComponent() {
        StaticPatcher.classForName("net.seesharpsoft.intellij.plugins.csv.CsvIconPovider").ifPresent(clz -> {
            StaticPatcher.setFinalStatic(clz, "FILE", FinalFileIconProvider.FILE_ICON_MAPPING.get("csv"));
        });
        StaticPatcher.classForName("com.vladsch.idea.multimarkdown").ifPresent(clz -> {
            StaticPatcher.setFinalStatic(clz, "FILE", FinalFileIconProvider.FILE_ICON_MAPPING.get("md"));
        });
    }
}

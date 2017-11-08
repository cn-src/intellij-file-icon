package cn.javaer.intellijfileicon;

import com.intellij.openapi.components.ApplicationComponent;

/**
 * 替换其它插件的图标.
 *
 * @author zhangpeng
 */
public class FinalIconReplacerComponent implements ApplicationComponent {
    @Override
    public void initComponent() {
        Utils.classForName("net.seesharpsoft.intellij.plugins.csv.CsvIconPovider")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.get("csv")));

        Utils.classForName("com.vladsch.idea.multimarkdown.MultiMarkdownIcons")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.get("md")));

        Utils.classForName("icons.MarkdownIcons")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.get("md")));
    }
}

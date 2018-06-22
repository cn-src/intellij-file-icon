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

        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE_ICON", FinalIcons.get("prop")));
        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "ICON_16", FinalIcons.get("prop")));
        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "ICON_32", FinalIcons.get("prop@2x")));
        Utils.classForName("com.ansorgit.plugins.bash.util.BashIcons")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "BASH_FILE_ICON", FinalIcons.get("sh")));
    }
}

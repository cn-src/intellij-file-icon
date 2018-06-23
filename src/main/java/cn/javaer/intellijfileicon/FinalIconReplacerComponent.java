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
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.getWithKey(".csv")));

        Utils.classForName("com.vladsch.idea.multimarkdown.MultiMarkdownIcons")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.getWithKey(".md")));

        Utils.classForName("icons.MarkdownIcons")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE", FinalIcons.getWithKey(".md")));
        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "FILE_ICON", FinalIcons.getWithKey(".props")));
        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "ICON_16", FinalIcons.getWithKey(".props")));
        Utils.classForName("jodd.idea.props.Props")
                .ifPresent(clz ->
                        Utils.setFinalStatic(clz, "ICON_32", FinalIcons.getWithKey("props@2x")));
//        Utils.classForName("com.ansorgit.plugins.bash.util.BashIcons")
//                .ifPresent(clz ->
//                        Utils.setFinalStatic(clz, "BASH_FILE_ICON", FinalIcons.getWithKey("sh")));
    }
}

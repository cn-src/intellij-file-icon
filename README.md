IntelliJ file icon plugin
-------------------------

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![GitHub release](https://img.shields.io/github/release/javaercn/intellij-file-icon.svg)]()

[![Build Status](https://travis-ci.org/cn-src/intellij-file-icon.svg?branch=master)](https://travis-ci.org/cn-src/intellij-file-icon)

* intellij 插件, 改变文件图标
* 图标主要来源于 [a-file-icon](https://github.com/ihodev/a-file-icon)
* 部分图标来源于其它插件
* 参考主题插件 [Material Theme UI](https://plugins.jetbrains.com/plugin/8006-material-theme-ui) 的方式，对其它插件或内置的图标进行反射替换，没有对其它插件进行直接修改

## 对以下插件的图标进行了替换

* [CSV Plugin](https://plugins.jetbrains.com/plugin/10037-csv-plugin)
* [Markdown Navigator](https://plugins.jetbrains.com/plugin/7896-markdown-navigator)
* [Jodd Props Support](https://plugins.jetbrains.com/plugin/5984-jodd-props-support)

## 图标列表

| 图标                    | 文件后缀  |
|:-----------------------|:---------|
| ![][file_type_csv]     | csv      |
| ![][file_type_windows] | bat, cmd |
| ![][MarkdownPlugin]    | md       |
| ![][prop]    | prop       |

[file_type_csv]: src/main/resources/icons/file_type_csv.png
[file_type_windows]: src/main/resources/icons/file_type_windows.png
[MarkdownPlugin]: src/main/resources/icons/MarkdownPlugin.png
[prop]: src/main/resources/icons/prop.png

[a-file-icon]: https://github.com/ihodev/a-file-icon

## 下载

[intellij-file-icon-1.1.zip](https://github.com/cn-src/intellij-file-icon/files/2113615/intellij-file-icon-1.1.zip)

## 其它
[Armory 插件修改版](others/Armory.jar)

* 使用反编译和字节码修改技术，在原插件基础上去除了view的左侧工具栏并调整边框大小。
* 对插件其它功能无影响，未破解其注册授权。
* [官网: http://www.visprogramming.com/armory/docs/](http://www.visprogramming.com/armory/docs/)

# hospital
2020 夏学期实训

## 通知：
- 请不要直接commit到master分支，首先建自己的分支，然后任何改变commit到那边。
- 如果你代码没有任何问题，建pull request，这样就可以把你的更改合并到master。
- 所有任务请在[projects](https://github.com/darknessest/hospital/projects/1)列出。
- 如果你有任何maven的问题，查看Preferences -> Build, Execution, Deployment -> Build Tools -> Maven -> Repositories 
如果有红的URL，回来到Build Tools -> Maven 更改你的maven路径和什么相关的设置。

## 项目结构
### SQL
#### 导入数据
这里有两个选择：

1. 使用/sql/dump的任何.sql脚本（一个有所有数据，另一个仅有测试数据）
2. 使用/sql/original的.sql脚本。推荐按下来的顺序导入：database.sql -> tables.sql -> data.sql 

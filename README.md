# 适用于《Minecraft：Java版》的散列资源文件提取器（仅声音）
从 [DTXingFeng/MinecraftSounds](https://github.com/DTXingFeng/MinecraftSounds "DTXingFeng/MinecraftSounds") 分叉，用于提取《Minecraft：Java版》的散列资源文件（仅声音）
**本软件需要在桌面环境下才能工作**
## 与上游对比
#### 修复问题：
运行在 类Unix操作系统 下找不到文件
#### 其他改动：
选择.minecraft路径 被替换为 选择assets路径，这有助于[MultiMC](https://github.com/MultiMC/Launcher)及其分叉（例如[PrismLauncher](https://github.com/PrismLauncher/PrismLauncher)）启动器的用户，并且不影响原有的效果
## 教程
使用前，请确保已经安装了Minecraft客户端实例并且已经获取资源文件
**官方启动器assets路径:**
Linux: `~/.minecraft/assets`
macOS: `~/Library/Application Support/minecraft/assets`
Windows: `%APPDATA%\.minecraft\assets`
**第三方启动器用户，请查阅您所使用的启动器的帮助文档以了解assets所在路径**

[上游教程视频(BiliBili)](https://www.bilibili.com/video/BV1nY4y1c76h/)
## 版本选择
参考 [散列资源文件 - 中文 Minecraft Wiki](https://zh.minecraft.wiki/w/%E6%95%A3%E5%88%97%E8%B5%84%E6%BA%90%E6%96%87%E4%BB%B6#%E7%B4%A2%E5%BC%95%E5%90%8D%E7%A7%B0)
## 提示
本软件只能提取 1.8和/或更新版本 的资源文件，在更旧的版本中，资源文件的存储方式与现在不同

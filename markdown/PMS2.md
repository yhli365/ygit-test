目标
====================
- 复制HiBench项目代码用于学习。
- https://github.com/intel-hadoop/HiBench.git
- Tags
    * HiBench-4.0.zip

Git
====================
- Clone

        git clone https://github.com/yhli365/YHiBench.git

## 同步HiBench版本

- 切换到主分支

        git checkout master

- 解压HiBench-4.0.zip

- 上传代码

        git add .
        git commit -m "HiBench-4.0.zip"
        git push

- 标签

        git tag -a HiBench-4.0 -m 'HiBench 4.0'
        git push origin --tags

## 创建HiBench版本本地分支

- 切换版本

        git checkout HiBench-4.0

- 查看远程分支

        git branch -a

- 查看本地分支

        git branch

- 创建本地分支

        git branch v4.0-study

- 把本地分支推到远程分支

        git push origin v4.0-study

- 切换分支

        git checkout v4.0-study
        git push --set-upstream origin v4.0-study


TDDBC for Groovy with Spock
====================================

#task list
    ==TODOを追加できる
    ==最後に追加したTODOのみの詳細を見れる
    最初に追加したTODOのみの詳細を見れる
    追加したTODO全てを一覧で見れる
    最初に追加したTODOを削除できる
    最後に追加したTODOを削除できる
    追加した全てのTODOを削除できる
    TODOの順序を入れ替えられる




これは、TDDBCのGroovy向けSpockプロジェクトです。

## gradleを使う場合

### gradleのインストール(wrapperを使わない場合)

```bash
# Mac
$ brew install gradle
または、
$ gvm install gradle

# Unix
$ gvm install gradle
```
gvmについては、以下のURLを参考にしてインストールしてください

http://gvmtool.net/

#### Windows
以下のURLを参考にしてインストールしてください。

http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備

gradleをインストールしない場合は、このプロジェクトをcloneしてから以下のコマンドを実行してください。

```bash
# Mac, Unix
$ chmod +x gradlew
$ ./gradlew -v

# Windows
$ gradlew.bat -v
```

wrapperを利用する際は、以下のgradleコマンドを **gradlew** に置き換えて利用してください。

### プロジェクトの変換

```bash
# for. IntelliJ IDEA
$ gradle idea

# for. Eclipse
$ gradle eclipse
```

### テストの実行

```bash
$ gradle test
```

### gradleによるGroovy Projectの作成(gradle 1.10以降)

gradleがインストールされている環境では、以下のコマンドを実行することで、Groovyのプロジェクトを作成することが出来ます。

```bash
$ mkdir tddbc-groovy
$ cd tddbc-groovy
$ gradle init --type groovy-library
```

## その他

動作環境、IDEについては[Wiki](https://github.com/tddbc/groovy_spock/wiki)を参照してください。

## ライセンス
Apache License, Version 2.0です (詳しくはプロジェクト直下の LICENSE-2.0.txt をご覧ください)

# GsonFormatPlus

[![GitHub](https://img.shields.io/badge/GitHub-Repository-blue)](https://github.com/mars-men/GsonFormatPlus)
[![JetBrains Plugin](https://img.shields.io/jetbrains/plugin/v/14949-gsonformatplus)](https://plugins.jetbrains.com/plugin/14949-gsonformatplus)

<!-- Plugin description -->
GsonFormatPlus This is a plugin you can generate Json model from Json String.
**This Plugin is only for IntelliJ IDEA And Android Studio**.
which is base on GsonFormat and more flexible and convenient. Welcome to issue and PR.

## Install

### Using IDE built-in plugin system on Windows:
`File` > `Settings` > `Plugins` > `Browse repositories...` > `Search for "GsonFormatPlus"` > `Install Plugin`

### Using IDE built-in plugin system on MacOs:
`Preferences` > `Settings` > `Plugins` > `Browse repositories...` > `Search for "GsonFormatPlus"` > `Install Plugin`

### Manually:
- Download the [latest release](https://github.com/mars-men/GsonFormatPlus/releases) and install it manually using `Preferences` > `Plugins` > `Install plugin from disk...`
- From official jetbrains store from [download](https://plugins.jetbrains.com/plugin/14949-gsonformatplus/)

Restart IDE.

## Usage

### 1. Use IDE menu
![Generate](https://raw.githubusercontent.com/sun-men/Figurebed/master/2020/03/12-11-12-47-gsonformat-insert.png)

### 2. Use hotkey
Default **Option + s**(Mac), **Alt + s** (win)

You can change the hotkey via: 
![Modify Shortcut](https://raw.githubusercontent.com/sun-men/Figurebed/master/2020/03/12-11-13-43-gsonformat-keymap.png)

### 3. Use Demo
![Demo GIF](https://raw.githubusercontent.com/sun-men/Figurebed/master/2020/03/12-11-18-54-gsonformat-generator.gif)

### 4. Setting
![Settings](https://raw.githubusercontent.com/sun-men/Figurebed/master/2020/03/12-11-18-09-gsonformat-setting.png)

## Configuration Options

| Module | Value | Default | Description |
|--------|-------|---------|-------------|
| Convert Method | object/arrayFromData | false | Gson convert method |
| Generate | virgo mode | true | virgo mode |
| Generate | generate comments | false | generate comments |
| Generate | split generate | false | split generate sub class |
| Bean | reuse bean | false | TODO |
| Field | name suffix | true | class suffix |
| Field | field(private/public) | true | access level |
| Field | name prefix | true | field name prefix |
| Field | use serialized name | true | use serialized name |
| Field | use wrapper class | true | use wrapper class，eq: int convert Integer |
| Field | use lombok | true | use lombok replace Getter/Setter |
| Field | use number key as map | true | use number key as map，TODO |
| Convert library | jackson/fastjson | true | jackson/fastjson convert library |

## Version History

See [CHANGELOG.md](CHANGELOG.md) for detailed version history.
<!-- Plugin description end -->

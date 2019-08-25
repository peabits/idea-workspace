---
---

# 第十章 Java IO 系统

## 10.1 输入和输出

### 10.1.1 InputStream 的类型

InputStream 的作用是标志那些从不同起源地产生输入的类。

这些起源地包括（每个都有一个相关的 InputStream 子类）：

- 字节数组
- String 对象
- 文件
- "管道"，它的工作原理与现实生活中的管道类似：将一些东西置入一端，它们在另一端出来。
- 一系列其他流，以便我们将其统一收集到单独一个流内。
- 其他起源地，如Internet 连接等

表10.1 InputStream 的类型

<!--
类|功能|构建器参数|如何使用
:-:|:-:|:-:|:-:
|||
-->

<table>
    <th>
        <td>类</td>
        <td>功能</td>
        <td>构建器参数</td>
        <td>如何使用</td>
    </th>
    <tr>
        <td>ByteArrayInputStream</td>
        <td>允许内存中的一个缓冲区作为InputStream 使用</td>
        <td>从中提取字节的缓冲区</td>
        <td>作为一个数据源使用。通过将其同一个 FilterInputStream 对象连接，可提供一个有用的接口</td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr><tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr><tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>

### 10.1.2 OutputStream 的类型

## 10.2 增添属性和有用的接口

### 10.2.1 通过 FilterInputStream 从 InputStream 里读入数据

### 10.2.2 通过 FilterOutputStream 向 OutputStream 里写入数据

## 10.3 本身的缺陷：RandomAccessFile



## 10.4 File 类

### 10.4.1 目录列表器

## 10.5 IO 流的典型应用

### 10.5.1 




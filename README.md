# -FirstOrderFormula

 

[TOC]

## 概述

​	输入一个一阶闭公式集，以这个公式集中出现的常量的集合为论域	，将这个一阶公式集转化为和它等价的命题公式集。

​	1. 输入的公式集用文本保存。设计一个语言可以表述上述的一阶公式集，给出这个语言的词法和语法。

​	2. 对输入的文件进行语法分析：

​		定义相应的数据结构保持这个这个公式集和其中出现的常量；

​		定义相应的语法树，并且可以输出语法树的结果；

​		当出现输入错误时，可以指出出错的位置和可能的原因；

​	3. 将这个公式集实例化并化简，并将结果输出；



## 系统设计

### 简述

本系统是一个简单的一阶公式实例化工具，主要功能包括：

1. 以文件形式输入一阶公式
2. 查看语法树
3. 实例化一阶公式
4. 化简一阶公式
5. 将结果保存到文件

### 开发环境

> *操作系统* ：win10
>
> *编译环境* ：java 、jdk1.8
>
> *开发工具* ：IntelliJ IDEA 、Antlr4  

### 词法设计

> 个体词：用大写字母[A-Z]或数字[0-9]表示
>
> 谓词：用小写字母[a-z]表示
>
> 量词： 全称量词（$）、存在量词（%）
>
> 逻辑关系符：与(&&)、 或(||)、 非(!)、大于(>)、小于(<)、等于(=)、大于等于(>=)、小于等于(<=)、推导(->)、不等于(!=)
>
> 括号：（）

### 语法设计

lzjAntlr.g

```
grammar LzjAntlr;
program :  ( (tagState | exp) ';')*;   
tagState: tag (LContent)? exp (RContent)? ;
tag : ( key var )+;
key : '$' | '%' ;
exp : term (to_op term)*;
to_op : '->';
term : factor (or_op factor)*;
or_op : '||';
factor : other (and_op other)*;
and_op : '&&';
other : tagState | preState | logicState |  LContent exp RContent; 
preState: (not_op)? predicate LContent var RContent;
logicState : var ( compare_op var )?;
predicate : Lower;
var : Upper | Digit;
compare_op : '>' | '<' | '=' | '!=' | '>=' | '<=';
LContent : '(';
RContent : ')';
Lower: [a-z] ;
Upper : [A-Z];
Digit : [0-9];
not_op : '~';
WS : [ ' '\t\r\n]+ -> skip ;  
```

## 设计步骤

### 准备工作

本系统的开发是利用antlr4工具生成相应的核心代码，在这些源代码的基础上实现所需要的语义动作，最终达到自己所需要的效果。因此在开始动手前，需要了解一下antlr4的相关知识。

首先你可以去antlr官网下载工具包（这里用的是antlr-4.5.3-complete.jar），官网也有一些示例可以教会你怎么使用antlr，这里我也提供一个网上资料http://www.crifan.com/files/doc/docbook/antlr_tutorial/release/html/antlr_tutorial.html

安装antlr4：http://blog.csdn.net/shine_journey/article/details/17952163

antlr4 API:http://www.antlr.org/api/Java/

与此同时你还需要了解一下antlr是如何解析和分析你所输入的语法，这里也提供一个网上资料http://blog.csdn.net/dc_726/article/details/45399371

再者，如果你认为这些东西不够详细，那么你可以去阅读《antlr4权威指南》是英文版的，写的很详细。

上面简单介绍了一下antlr,相信你已经有了一定的理解，那么接下来，你需要编写你的语法，上面我已经给出了“lzjAntlr.g”。同时你也可以修改对应的语法，改成你需要的。紧接着你可以利用工具生成你的源代码（上述资料有说明怎么使用），然后开打你的IDE，将所生存的代码导入进你的项目。


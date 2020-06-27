# TexaPoker(标准牌型大小)

## TDD
> 采用TDD模式进行开发，每个方法都采用测试先行，驱动开发的模式。除TexaPoker类外，其他类均有对应测试类，并且测试类中有注释开发过程中使用的测试用例

## 牌型大小
> 采用标准牌型大小规则，项目中有规则图片，具体规则如下  
> `皇家同花顺>同花顺>四条>葫芦>同花>顺子>三条>两对>对子>高牌(散牌)`

## 思路
> `提取信息`->`判断牌型`->`比较大小`

## 代码概述
### Poker类
> 类变量包含一方手牌的牌面数字`num[5]`、牌面花色`col[]`、牌型大小`level`(`level`从1到10依次代表由小到大的10中牌型)及同等牌型时比较点`comparePoint[5]`

> 类方法包含从所给字符串提取Black方牌面数字方法`getBlackNumAndProcess()`、提取White方牌面数字方法`getWhiteNumAndProcess()`、提取Black方牌面花色方法`getBlackColors()`、提取White方牌面花色方法`getWhiteColors()`

### Judge类
> 包含11个类方法，其中前10个为具体牌型的判断方法，并在方法中给比较点赋值，最后一个方法`judgeType()`，可以对一个传入的Poker类的对象进行牌型判断并为比较点赋值

### Compare类
> 仅有一个类方法`isCompareCardSize()`，对传入的两个Poker类的对象进行大小比较，并返回输赢信息

### TexaPoker类
> 主函数所在类，实现控制台交互，严格按以下输入格式输入数据时，控制台输出游戏结果  
`Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH`

## 测试用例
> 题目所给测试用例(按照标准规则进行判断)  
> `Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH` 输出: White wins 牌型(1-1)  
> `Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S` 输出: Black wins 牌型(7-6)  
> `Black: 2H 3H 5H 9H KH White: 2C 3H 4S 5C 6H` 输出: Black wins 牌型(6-5)  
> `Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH` 输出: Tie 牌型(1-1)  
>  自己写的测试用例  
> `Black: TC JC QC AC KC White: 2S 3S 6S 4S 5S` 输出: Black wins 牌型(10-9)  
> `Black: 6C 8C 6D 8C 6H White: 2D 2H 2S 2C 5S` 输出: White wins 牌型(7-8)  
> `Black: 2S 4S 6S 9S 5S White: 2D 3H 4S 5C 6S` 输出: Black wins 牌型(6-5)  
> `Black: 2D 2H 4S 6C 6S White: 2S 2D 2S 9H 5S` 输出: White wins 牌型(3-4)  
> `Black: 2D 2H 4S 7C 6S White: 2S 4D 6S 8H TS` 输出: Black wins 牌型(2-1)  
> `Black: TC JC QC AC KC White: TC JC QC AC KC` 输出: Tie 牌型(10-10)  
> `Black: 7C JC TC 9C 8C White: 2S 3S 6S 4S 5S` 输出: Black wins 牌型(9-9)  
> `Black: 7C 1C 3C TC 8C White: 2S TS 9S 4S 5S` 输出: White wins 牌型(6-6)  
> `Black: 7H 7C 3D TC 7S White: 8S 5C 8H 4S 8D` 输出: White wins 牌型(4-4)  
> `Black: 2D 2H 4S 6C 6S White: 6S 4C 2H 6S 2D` 输出: Tie 牌型(3-3)
# clj-easy-ocr

Clojure文字识别, 基于tesseract

## Usage
* 英文识别:
```clojure
clj-easy-ocr.core=> (get-img-string "demo_eurotext.png")

"The (quick) [brown] {fox} jumps!\nOver the $43,456.78 <lazy> #90 dog\n& duck/goose, as 12.5% of E-mail\nfrom aspammer@website.com is spam.\nDer ,,schnelle” braune Fuchs springt\nﬁber den faulen Hund. Le renard brun\n«rapide» saute par-dessus le chien\nparesseux. La volpe marrone rapida\nsalta sopra i] cane pigro. El zorro\nmarrén répido salta sobre el perro\nperezoso. A raposa marrom répida\nsalta sobre 0 C50 preguieoso."

clj-easy-ocr.core=>

```
* 中文识别: ` mv ~/Desktop/chi_sim.traineddata  /usr/local/Cellar/tesseract/3.05.00_1/share/tessdata/eng.traineddata `
```clojure
clj-easy-ocr.core=> (print (get-img-string "ch123.png"))
什么叫复盘】 如何复盘

简单点说】 复盘就是对当夭的走势进行_次回顾和总结】 从中发现问题和姝丝马迹】 并据此确立自己在第二
夭或者是_段时间内的操作方向 及时修改计划和目标。

炒股好比读书】 庄家好比老师， K线禾口分时图是上课的内睿, 而我们就是学生, 复盘就是回家作业, 其
重要性可想而知。 功课做得好】 成绩肯定高 老师会奖励糖吃 做的不好的】 对不起】 留级都有份。

言归正传】 大家都知道复盘重要】 但是不知道如何着手】 这里我和大家谈谈_些自己的体会。 纯粹是个

复盘需要的硬件设备二 能联网的电脑_台】 必须是联网的】 有些数据只有服务器上有】 本地机子是不储
存的。 分析软件_套】 通达信` 大智慧` 同花顺这几个常用软件都可以。 只要是具备历史回忆功能和分时重
播的股软都可以用】 划线功能强_点的股软更好!

女子】 我们现在开始复盘。 先做什么? _时有些不知女口何入手。 没有关系】 打开股软的当日排名】 先看清
楚当日涨幅上和跌幅上有那些英雄】 之间有没有板块连动效应】 然后检查_下自己的持仓和这些老兄有没有nil
clj-easy-ocr.core=>
```
* 用于视频截图的文字识别
```clojure
clj-easy-ocr.core=> (get-img-string "ch333.png")

"〇 WWWquchom/V_吓 9「「j6寸 厂eW′htm\\?me:2OO8_a|dbd\n\n \n\n〉 鼾 04:23/45:55 高清 〔I` 匡] 尺】\n\n弹幕 设置 登录或注册后来_发吧!\n\n李小龙传奇第43集"

clj-easy-ocr.core=>
```
## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

Markdown的教程内容，来源于[Markdown tutorial](https://www.markdowntutorial.com)，英文的，总结后翻译过来。
内容分为七部分:
1. 斜体和粗体
2. 标题
3. 链接
4. 图片
5. 引用
6. 列表
7. 段落

#1. 斜体和粗体
正常：知乎
斜体：*知乎*   
> (\*知乎\*) (\_知乎\_) 
  
粗体：**知乎** 
>（\*\*知乎\*\*）（\_\_知乎\_\_）

用\*和\_，斜体前后插入一个，粗体两个。
可以混用，粗斜体：***知乎*** 
> (\*\*\*知乎\*\*\*)  
# 2. 标题
在正文前加几个#就是几级标题

># Header one  
>## Header two  
>### Header three  
>#### Header four  
>##### Header five  
>###### Header six  

>#Header one  
>##Header two  
>###Header three  
>####Header four  
>#####Header five  
>######Header six  
 
#3. 链接
Markdown有两种不同的链接方式
 * inline link
 * reference link
## 3.1. inline link
举例：[知乎](www.zhihu.com)是个好网站。用 [ ] 和 ( ) 包含内容和对应网址即可。

    \[知乎\](www.zhihu.com)是个好网站
## 3.2 reference link
举例：
[知乎][ex1]是个好网站。

[ex1]:www.zhihu.com
    
    [知乎][ex1]是个好网站。    
    [ex1]:www.zhihu.com
inline就像是常量，自己设置，reference link像是变量，可以全局配置。
# 4. 图片
图片导入方法跟链接相似，两种。
 * inline image link
 * reference image link
## 4.1 inline image link
在开头加入感叹号!，用 [ ] 包含图片名称，用 ( ) 包含图片链接。
举例：
![凉宫春日](http://upload-images.jianshu.io/upload_images/7981571-fc1329b2b2ae873e?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

>\![凉宫春日](http://upload-images.jianshu.io/upload_images/7981571-1def1efce384ef09?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  
## 4.2 reference image link
类似链接，不同的是在前面加个 "!" 。
注：需要加一个空行。
![Wallpaper][ex2]

[ex2]: https://github.com/Sherry720/Life/blob/master/Violet%20Evergarden.png?raw=true

    ![Wallpaper][ex2]

    [ex2]:https://github.com/Sherry720/Life/blob/master/Violet%20Evergarden.png?raw=true
# 5. 引用
在引用内容前加入“>”即可。可连续插入引用符号。
举例：
>这话是鲁迅说的

    >这话是鲁迅说的
# 6.列表
有两种排序方式，无序和有序。
## 6.1 无序
在排序内容前加星号*，记得空一格。
* 我
* 是
* 火
* 车
* 王

      * 我
      * 是
      * 火
      * 车
      * 王
## 6.2 有序
把星号改成数字顺序排列就行。
1.  我
2.  是
3.  火
4.  车
5.  王

        1.  我
        2.  是
        3.  火
        4.  车
        5.  王
# 6.3 列表插入列表
加个空格即可。
1. 天上飞的
    * 麻雀
    * 嫦娥
2. 水里游的
    * 鱼
    * 波塞冬


       1. 天上飞的
            * 麻雀
            * 嫦娥
        2. 水里游的
            * 鱼
            * 波塞冬
# 7. 段落
输入：

    东风夜放花千树，
    更吹落，星如雨。
    宝马雕车香满路。
    凤箫声动，玉壶光转，一夜鱼龙舞。
    蛾儿雪柳黄金缕，
    笑语盈盈暗香去。
    众里寻他千百度，
    蓦然回首，那人却在，灯火阑珊处。
显示结果：
>东风夜放花千树，
更吹落，星如雨。
宝马雕车香满路。
>凤箫声动，玉壶光转，一夜鱼龙舞。
蛾儿雪柳黄金缕，
笑语盈盈暗香去。
众里寻他千百度，
蓦然回首，那人却在，灯火阑珊处。

markdown语法并没有将句子进行分段，解决方法：每句话后面空两行，它把这称为soft break，直接打回车称为hard break。  

修改后：
>东风夜放花千树，  
更吹落，星如雨。  
宝马雕车香满路。  
>凤箫声动，玉壶光转，一夜鱼龙舞。  
蛾儿雪柳黄金缕，  
笑语盈盈暗香去。  
众里寻他千百度，  
蓦然回首，那人却在，灯火阑珊处。  

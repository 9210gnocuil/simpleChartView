# simpleChartView
 
很久之前写过一个天气APP，不过当时写到一半就没写了，当初有事耽搁了后来就把这事儿忘了。这两天突然想起来了，就抽空把它完善下。里面涉及到显示一天中几个时间的温度变化，本来是想用MPAndroidChart的，不过为了这个一个小小的需求倒是有点大材小用了。所以我自己就写了一个简单的chart控件，用来显示一天中温度的变化。

how to use
----------------------------
  1. 在布局文件中引入;
  2. 在activity中拿到该控件的引用，并设置相关属性和数据.

Simple Example
-------
```java
    //1.拿到引用
    SimpleChartView mainSCV = (SimpleChartView)findViewById(R.id.main_scv);
    //2.设置相关属性
    //2.1先设置相关线或者点的颜色 里面还有透明度设置 只是没有暴露出来
    // 默认都是白色 0.7的透明度
    mainSCV.setColorDrawBottemText(int );//设置底部文字颜色 
    mainSCV.setColorDrawImaginaryLine(int );//设置虚线颜色
    mainSCV.setColorDrawPoint2Point(int );//设置相邻点的连线的颜色
    mainSCV.setColorDrawXAxisLine(int );//设置xy轴的颜色
    mainSCV.setColorDrawDateText(int );//设置数据文字的颜色
    mainSCV.setColorDrawPoint(int );//设置数据圆点的颜色
    mainSCV.setColorDrawXAxisPoint(int );//设置x坐标轴上面的刻度点的颜色

    //2.2 设置某些线或者点是否可见
    mainSCV.setAxisAvailable(true);//是否显示xy轴 默认显示
    mainSCV.setPoint2PointLineAvailable(true);//是否显示相邻数据点之间的连线 默认显示
    mainSCV.setDateTextAvailable(true);//是否需要显示数据文字 默认显示
    mainSCV.setBottemTextAvailable(true);//是否需要显示底部文字 默认显示
    mainSCV.setImaginaryLineAvailable(true);//是否需要显示虚线 默认显示

    //2.3 设置点或者线的颜色
    mainSCV.setBottomTextSize(int );//设置底部文字大小 单位为dp 默认为16dp
    mainSCV.setBottomTextSize(int );//设置数据文字大小 单位同样为dp 默认为12dp

    //3.最重要的一点，最后要设置数据进去，如果某些属性是在这个方法之后设置的则会无效。
    dataList = new ArrayList<Integer>();
    dataList.add(12);
    dataList.add(6);
    dataList.add(15);
    dataList.add(5);
    dataList.add(24);
    dataList.add(3);
    dataList.add(22);

    bottomTextList = new ArrayList<String>();
    bottomTextList.add("04:00");
    bottomTextList.add("07:00");
    bottomTextList.add("10:00");
    bottomTextList.add("13:00");
    bottomTextList.add("16:00");
    bottomTextList.add("19:00");
    bottomTextList.add("22:00");

    //默认最大值
    max = 25;//max的作用是以免数据过大绘制超过了范围，这个max是确保所有的点都能画在坐标点上。 
    
    //**********最重要的方法******************
    //如果不设置数据，控件内部有测试数据。
    mainSCV.setData(dataList,bottomTextList,max);
    

```

XML Usage
------
```xml
<com.liucong.customview.SimpleChartView
        android:layout_width="match_parent"
        android:layout_height="400dp" />
```

待完善:
1. 温度是有可能是负数的，所以目前这个控件如果有负数数据的话就显示不出来，这两天会解决这个问题;
2. 目前界面的画还是太简单，都是静态的，并且点之间的连线感觉有点生硬，后期考虑加入动画；
3. 等等，其他的慢慢再完善。
 
Screenshots
------------
![1](https://github.com/9210gnocuil/simpleChartView/Screenshots/1.png) ![2](https://github.com/9210gnocuil/simpleChartView/Screenshots/2.png)

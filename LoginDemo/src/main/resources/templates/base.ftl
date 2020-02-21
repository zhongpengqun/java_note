<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no" />
    <title></title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<style type="text/css">
* {
    padding:0;
    margin: 0;
}

html, body {
    width: 100%;
}

#header {
    background-color: #333;
    padding: 10px 10%;
}

#header a {
    text-decoration: none;
    color: white;
}

#header a:hover {
    color: #DDD;
}
/* 导航栏按钮 */
.btn {
    display: none;
    float:right;
    margin-top: 5px;
    border: 0;
    border-radius: 5px;
    width: 40px;
    height: 40px;
}
/* 文字Logo */
#header a.logo {
    float:left;
    font-weight: bold;
    font-size: 39px;
    line-height: 50px;
}

#header div.nav {
    height: 50px;
}

#header ul.nav-bar {
    list-style: none;
    float: right;
    line-height: 50px;
}
#header ul.nav-bar li {
    float:left;
    padding: 0 10px;
}

@media screen and (max-width: 768px){
    #header {
        padding: 10px 5%;
        height: 50px;
        overflow: hidden;
    }
    #header a.logo {
        line-height: 55px;
        font-size: 30px;
    }
    .btn {
        display: block;
    }
    #header ul.nav-bar {
        margin-top: 15px;
        border-top: solid 1px #111;
        width:100%;
    }
    #header ul.nav-bar li {
        float: none;
        padding: 0 10px;
    }
}

#container {
    width: 100%;
    background:#444;
}
</style>
</head>
<body>

<div id="header">
    <div class="nav">
        <a href="#" class="logo">自适应导航栏</a>
        <div id="nav-btn" class="btn">
            <img src="./menu.png" style="margin: 5px;width: 30px;height:30px;" />
        </div>
        <ul class="nav-bar">
            <li><a href="#">首页</a></li>
            <li><a href="#">归档</a></li>
            <li><a href="#">标签</a></li>
            <li><a href="#">关于</a></li>
        </ul>
    </div>
</div>

<div id="container">
<@block name="content">base_content</@block>
</div>

</body>
<script type="text/javascript">
        // 开关状态
    var open = false;
    $('#nav-btn').click(function (){
                // 按钮状态
        $(this).css("background-color", open ? '#333' : '#222');
        var navBar = $('.nav-bar');
                // 设置header的高度，将导航列表显示出来
        var height = navBar.offset().top + navBar.height();
        $('#header').animate({
            height: open ? 50 : height
        });
                // 修改开关状态
        open = !open;
    });

</script>
<@block name="js_block">js_block</@block>
</html>

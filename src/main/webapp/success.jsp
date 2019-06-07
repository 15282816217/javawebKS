<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/6/1
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统界面</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>

    <!-- 引入jquery  -->
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <!--  引入bootstrap样式  -->
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <%--<link rel="stylesheet" href="css/yyy.css">--%>
</head>
<body>

<nav class="navbar navbar-default navbar-static-top navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="index.jsp" class="btn-info">员工管理</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="zhaoping.jsp" class="btn-info">招聘管理</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="http://www.iqiyi.com/lib/m_212137614.html" class="btn-info">火影忍者</a></li>
                    </ul>
                </li>
            </ul>
            <form  name="form" method="get" class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search" name="serch" id="serch">
                </div>
                <button type="submit" class="btn btn-default"  >Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人中心 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="Text.jsp" class="btn btn-info">修改密码</a></li>
                        <li><a href="login.jsp" class="btn btn-danger">用户注销</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<%--<div class="container">--%>
<%--<div class="row">--%>
    <%--<div class="col-md-4">--%>
        <%--<button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next()">员工管理</button>--%>
    <%--</div>--%>
    <%--<div class="col-md-4">--%>
        <%--<button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next2()">薪资管理</button>--%>
    <%--</div>--%>
    <%--<div class="col-md-4">--%>
        <%--<button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next1()">招聘管理</button>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>

<%--<div class="row">--%>
    <%--<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 ">--%>
        <%--<img src="img/afei.png" class="img-responsive img-thumbnail">--%>
        <%--<h1 class="page-header" >公司简介</h1>--%>
        <%--<p>--%>
            <%--网页栅格系统是从平面栅格系统中发展而来。对于网页设计来说，栅格系统的使用，不仅可以让网页的信息呈现更加美观易读，更具可用性。而且，对于前端开发来说，网页将更加的灵活与规范。</p>--%>
    <%--</div>--%>

<%--<div class="row">--%>
    <%--<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 col-md-offset-1">--%>
        <%--<img src="img/ban.jpg" class="img-responsive img-thumbnail">--%>
        <%--<h1 class="page-header" style="text-align: center" >主要模型</h1>--%>
        <%--<!--<p>--%>
            <%--<a href="#">火影忍者</a> <br>--%>
            <%--<a href="#">海贼王</a> <br>--%>
            <%--<a href="#">进击的巨人</a> <br>--%>
            <%--<a href="#">刀剑神域</a> <br>--%>

        <%--</p>-->--%>
    <%--</div>--%>
<%--<div class="row">--%>
    <%--<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 col-md-offset-1">--%>
        <%--<img src="img/weishou.jpg" class="img-responsive img-thumbnail">--%>
        <%--<h1 class="page-header" >人气作品在线看</h1>--%>
        <%--<p> <a href="http://www.iqiyi.com/lib/m_212137614.html">火影忍者</a> <br>--%>
            <%--<a href="http://www.iqiyi.com/a_19rrhb3xvl.html?vfm=2008_aldbd">海贼王</a> <br>--%>
            <%--<a href="http://www.iqiyi.com/lib/m_212137614.html">进击的巨人</a> <br>--%>
            <%--<a href="#">刀剑神域</a> <br></p>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>

<%--<div class="row">--%>
    <%--<div class="col-md-12">--%>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>
    <%--<div class="row">--%>
        <%--<div class="col-md-11">--%>
            <%--<div class="slidershow middle">--%>
                <%--<div class="slides">--%>
                    <%--<input type="radio" name="r" id="r1" >--%>
                    <%--<input type="radio" name="r" id="r2" checked>--%>
                    <%--<input type="radio" name="r" id="r3">--%>
                    <%--<input type="radio" name="r" id="r4">--%>
                    <%--<input type="radio" name="r" id="r5">--%>

                    <%--<div class="slide s1">--%>
                        <%--<a href="update02.jsp">--%>
                            <%--<img src="img/ban.jpg" alt="">--%>
                        <%--</a>--%>
                    <%--</div>--%>
                    <%--<div class="slide">--%>
                        <%--<a href="haizei.jsp">--%>
                            <%--<img src="img/afei.png" alt="">--%>
                        <%--</a>--%>
                    <%--</div>--%>
                    <%--<div class="slide">--%>
                        <%--<img src="img/p3.jpg" alt="">--%>
                    <%--</div>--%>
                    <%--<div class="slide">--%>
                        <%--<img src="img/ban.jpg" alt="">--%>
                    <%--</div>--%>
                    <%--<div class="slide">--%>
                        <%--<img src="img/weishou.jpg" alt="">--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="navigation">--%>
                    <%--<label for="r1" class="bar"></label>--%>
                    <%--<label for="r2" class="bar"></label>--%>
                    <%--<label for="r3" class="bar"></label>--%>
                    <%--<label for="r4" class="bar"></label>--%>
                    <%--<label for="r5" class="bar"></label>--%>
                <%--</div>--%>
            <%--</div>--%>

        <%--</div>--%>
    <%--</div>--%>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <img src="img/afei.png" class="img-responsive img-thumbnail">
            <h1 class="page-header" >公司简介</h1>
            <p>
            网页栅格系统是从平面栅格系统中发展而来。对于网页设计来说，栅格系统的使用，不仅可以让网页的信息呈现更加美观易读，更具可用性。而且，对于前端开发来说，网页将更加的灵活与规范。</p>
        </div>
        <div class="col-md-4 col-md-offset-4">
            <img src="img/weishou.jpg" class="img-responsive img-thumbnail">
            <h1 class="page-header" >人气作品在线看</h1>
            <p> <a href="http://www.iqiyi.com/lib/m_212137614.html">火影忍者</a> <br>
            <a href="http://www.iqiyi.com/a_19rrhb3xvl.html?vfm=2008_aldbd">海贼王</a> <br>
            <a href="http://www.iqiyi.com/lib/m_212137614.html">进击的巨人</a> <br>
            <a href="#">刀剑神域</a> <br></p>

        </div>

    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-12" style="text-align: center">
            <h2>主要模型</h2>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="img/afei.png" alt="">
                        <div class="carousel-caption">

                        </div>
                    </div>
                    <div class="item">
                        <img src="img/weishou.jpg" alt="">
                        <div class="carousel-caption">

                        </div>
                    </div>

                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        </div>
</div>

    <%--<nav class="navbar navbar-default navbar-static-top navbar-inverse">--%>
        <%--<div class="container-fluid">--%>
            <%--<!-- Brand and toggle get grouped for better mobile display -->--%>
            <%--<div class="navbar-header">--%>
                <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">--%>
                    <%--<span class="sr-only">Toggle navigation</span>--%>
                    <%--<span class="icon-bar"></span>--%>
                    <%--<span class="icon-bar"></span>--%>
                    <%--<span class="icon-bar"></span>--%>
                <%--</button>--%>
                <%--<a class="navbar-brand" href="#">Brand</a>--%>
            <%--</div>--%>

            <%--<!-- Collect the nav links, forms, and other content for toggling -->--%>
            <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
                <%--<ul class="nav navbar-nav">--%>
                    <%--<li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>--%>
                    <%--<li><a href="#">Link</a></li>--%>
                    <%--<li class="dropdown">--%>
                        <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>--%>
                        <%--<ul class="dropdown-menu">--%>
                            <%--<li><a href="index.jsp" class="btn-info">员工管理</a></li>--%>
                            <%--<li role="separator" class="divider"></li>--%>
                            <%--<li><a href="zhaoping.jsp" class="btn-info">招聘管理</a></li>--%>
                            <%--<li role="separator" class="divider"></li>--%>
                            <%--<li><a href="http://www.iqiyi.com/lib/m_212137614.html" class="btn-info">火影忍者</a></li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                <%--</ul>--%>
                <%--<form  name="form" method="get" class="navbar-form navbar-left">--%>
                    <%--<div class="form-group">--%>
                        <%--<input type="text" class="form-control" placeholder="Search" name="serch" id="serch">--%>
                    <%--</div>--%>
                    <%--<button type="submit" class="btn btn-default"  >Submit</button>--%>
                <%--</form>--%>
                <%--<ul class="nav navbar-nav navbar-right">--%>
                    <%--<li><a href="#">Link</a></li>--%>
                    <%--<li class="dropdown">--%>
                        <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人中心 <span class="caret"></span></a>--%>
                        <%--<ul class="dropdown-menu">--%>
                            <%--<li><a href="Text.jsp" class="btn btn-info">修改密码</a></li>--%>
                            <%--<li><a href="login.jsp" class="btn btn-danger">用户注销</a></li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</div><!-- /.navbar-collapse -->--%>
        <%--</div><!-- /.container-fluid -->--%>
    <%--</nav>--%>
    <div class="container">
    <div class="row">
    <div class="col-md-4">
    <button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next()">员工管理</button>
    </div>
    <div class="col-md-4">
    <button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next2()">薪资管理</button>
    </div>
    <div class="col-md-4">
    <button type="button" class="btn btn-primary btn-lg btn-block btn btn-info"  onclick="next1()">招聘管理</button>
    </div>
    </div>
    </div>
　　<script type="text/javascript">
    function next(){
        window.location = "index.jsp";
    }
    function next1(){
        window.location = "zhaoping.jsp";
    }
    function next2(){
        window.location = "xinzi.jsp";
    }
    //function serchy(){
       // alert("hahah");
       // window.location = "index.jsp";
   // }
        $("form").submit(function (e) {
            var $serch = $("#serch").val();
            if ($serch =="员工管理") {
                e.preventDefault();
                window.location.href = "index.jsp";
                return ;
            }else if($serch =="招聘管理"){
                e.preventDefault();
                window.location.href = "zhaoping.jsp";
                return ;
            }else if($serch =="火影忍者"){
                e.preventDefault();
                window.location.href = "http://www.iqiyi.com/lib/m_212137614.html";
                return;
            }else{
                e.preventDefault();
                return;
            }
        });




</script>
</body>
</html>

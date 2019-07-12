<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>首页</title>
    <style>
    iframe{
    overflow:none;
    }
        #iframeTop{
            width: 100%;
            height: 70px;
        }
        #iframeLeft{
            width: 15%;
            height: 700px;
            float: left;
        }
        #iframeContent{
            width: 84%;
            height: 700px;
        }
    </style>
<body>
<div>
    <iframe id="iframeTop" name="iframeTop"  src="${pageContext.request.contextPath }/top.jsp" ></iframe>
    <iframe id="iframeLeft" name="iframeLeft"  src="${pageContext.request.contextPath }/left.jsp" ></iframe>
    <iframe id="iframeContent" name="iframeContent" ></iframe>
</div>
</body>
</html>
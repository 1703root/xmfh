<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>
<html>



<body data-type="chart" style="margin:0 200px">

<%@include file="/WEB-INF/center/center_head.jsp"%>


    <div class="tpl-page-container tpl-page-header-fixed">



       <div class="tpl-content-wrapper">
            <div class="tpl-content-page-title">
                	旅途故事
            </div>
            <ol class="am-breadcrumb">
            </ol>

           <div class="tpl-content-scope">
               <div class="note note-info">
                   <h3 font="微软雅黑">分享你的旅途故事
                       <span class="close" data-close="note"></span>
                   </h3>
                   <p font="微软雅黑">记录下旅途中的欢笑与泪水</p>
                   <p font="微软雅黑">与他人分享，也给自己留下一份记忆</p>
               </div>
           </div>


            <div class="row">
                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">
                        <div class="tpl-portlet-title">
                            <div class="tpl-caption font-green ">
                                <span>已经发布的故事</span>
                            </div>
                        </div>
                        <c:forEach items="${storyList}" var="s">
                        	<a href="storyInfo.action?storyId=${s.storyId}">${s.name}</a>
                            <br/>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>

</html>
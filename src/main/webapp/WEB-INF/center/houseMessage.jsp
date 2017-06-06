<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>
<html>

<body data-type="chart" style="margin:0 200px">
<%@include file="/WEB-INF/center/center_head.jsp" %>


    <div class="tpl-page-container tpl-page-header-fixed">
        <div class="tpl-content-wrapper">
            <div class="tpl-content-page-title">
                房屋信息
            </div>
            <ol class="am-breadcrumb">
                <li><a href="addHouse.action" class="am-icon-home"><button type="submit" class="btn btn-default">新增</button></a></li>

            </ol>

            <c:forEach items="${houseList}" var="h">
            <div class="row">
                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">
                        <div class="tpl-portlet-title">
                            <div class="tpl-caption font-green ">
                                <i class="am-icon-cloud-download"></i>
                                <span>城市</span>
                            </div>
                        </div>
                            ${h.city}
                    </div>
                </div>
                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">
                        <div class="tpl-portlet-title">
                            <div class="tpl-caption font-red ">
                                <i class="am-icon-bar-chart"></i>
                                <span> 详细地址</span>
                            </div>

                        </div>
                            ${h.address}
                    </div>
                </div>
            </div>


            <div class="row">
                <div class="am-u-md-6 am-u-sm-12 row-mb">

                    <div class="tpl-portlet">
                        <div class="tpl-portlet-title">
                            <div class="tpl-caption font-green ">
                                <span>联系方式</span>
                                <span class="caption-helper">16 件</span>
                            </div>
                        </div>
                            ${h.tel}
                    </div>
                </div>
                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">
                        <div class="tpl-portlet-title">
                            <div class="tpl-caption font-green ">
                                <span>配套设施</span>
                            </div>

                        </div>
                            ${h.device}

                    </div>
                </div>

                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">


                    </div>
                </div>
                <div class="am-u-md-6 am-u-sm-12 row-mb">
                    <div class="tpl-portlet">


                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>


</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="/resources/bootstrap-3.3.7/dist/css/bootstrap.min.css"/>
<link rel="stylesheet" href="/resources/bootstrap-table/dist/bootstrap-table.min.css"/> 
<script type="text/javascript" src="/resources/jquery-2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="/resources/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script type="text/javascript" src="/resources/bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>

<style type="text/css">
.person-address{
min-width: 200px;
}
</style>
<title>居住信息</title>
</head>
<body>
    <div class="row base-margin" id="query">
        <ol class="breadcrumb">
            <li><strong><span style="color: #27a0d7">用户列表</span></strong></li>
        </ol>
        <form class="form-inline" role="form" style="float: left; width: 100%" method="post" id="queryForm">
            <div class="form-group">
                <label for="orgCode">部门:</label> 
                <select class="form-control" id="orgCode" name="orgCode">   
                    <option value="">默认选择</option>
                   <%--  <c:forEach var="data" items="${orgList}">
                        <option value="${data.orgCode }">${data.orgName }</option>
                    </c:forEach> --%>
                </select>
            </div>
            <div class="form-group">
                <label for="userName">名称:</label> 
                <input type="text" class="form-control" name="userName" id="userName"  placeholder="请输入名称">
            </div>
            <div class="form-group">
                <label >日期:</label>
                <input placeholder="开始日期" class="form-control layer-date" id="startDate" name="startDate">
                <input placeholder="结束日期" class="form-control layer-date" id="endDate" name="endDate">
            </div>
            <div class="form-group">
                <button type="button" id="queryBtn" onclick="doQuery();" class="btn btn-primary">查询</button>
            </div>
            <div class="form-group btn-right">
                <button type="button" class="btn btn-primary" id="addBtn" onclick="addUser();">新增用户</button>
            </div>
        </form>
    </div>
    <div class="container" style="width: 100%">
        <table id="table">
        </table>
    </div>
</body>
<script type="text/javascript">
$(function () {
	 
    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();
    //2.初始化Button的点击事件
    /* var oButtonInit = new ButtonInit();
    oButtonInit.Init(); */

});


var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#table').bootstrapTable({
            url: '/personLive/pagelist',         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
          	//设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
            //设置为limit可以获取limit, offset, search, sort, order  
            queryParamsType : "limit",  
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 50,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            strictSearch: true,
            clickToSelect: true,                //是否启用点击选中行
            height: 460,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                field: 'id',
                title: '序号'
            }, {
                field: 'person.name',
                title: '居住人',
                class: 'person-name'
            },{
            	field: 'sex',
            	title: '性别'
            },{
            	field: 'personCred.address',
            	title: '住址',
            	class: 'person-address'
            	
            },{
            	field: 'person.political',
            	title: '政治面貌'
            },{
            	field: 'person.mariaType',
            	title: '婚姻状况'
            },{
            	filed: 'person.credType',
            	title: '证件类型'
            },{
            	field: 'personCred.credNum',
            	title: '证件号'
            }, {
                field: 'buildId',
                title: '建筑序号'
            }, {
                field: 'floorId',
                title: '楼层序号',
                visible: false
            }, {
                field: 'roomId',
                title: '房间序号',
                visible: false
            }, {
                field: 'liveSdate',
                title: '入住时间'
            },  {
                field: 'liveEdate',
                title: '离开时间'
            },  {
                field: 'liveReason',
                title: '租住事由'
            }, {
                field: 'createDate',
                title: '创建时间'
            },{
                field: 'createBy',
                title: '创建人'
            },{
                field: 'updateDate',
                title: '更新时间'
            },{
                field: 'updateBy',
                title: '更新人'
            }]
        });
    };

    //得到查询的参数
  oTableInit.queryParams = function (params) {
    	console.log(params);
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        	pageSize: params.limit,   //页面大小
        	pageNum: params.offset,  //页码
            sdate: $("#stratTime").val(),
            edate: $("#endTime").val(),
            sellerid: $("#sellerid").val(),
            orderid: $("#orderid").val(),
            CardNumber: $("#CardNumber").val(),
            maxrows: params.limit,
            pageindex:params.pageNumber,
            portid: $("#portid").val(),
            CardNumber: $("#CardNumber").val(),
            tradetype:$('input:radio[name="tradetype"]:checked').val(),
            success:$('input:radio[name="success"]:checked').val(),
        };
        return temp;
    };
    return oTableInit;
};
</script>
</html>
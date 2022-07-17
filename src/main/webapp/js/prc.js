layui.use(['element', 'layer', 'jquery'], function () {
    var element = layui.element;
    // var layer = layui.layer;
    var $ = layui.$;
    // 配置tab实践在下面无法获取到菜单元素
    $('.site-demo-active').on('click', function () {
        var dataid = $(this);
        //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
        if ($(".layui-tab-title li[lay-id]").length <= 0) {
            //如果比零小，则直接打开新的tab项
            active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
        } else {
            //否则判断该tab项是否以及存在
            var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
            $.each($(".layui-tab-title li[lay-id]"), function () {
                //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
                if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                    isData = true;
                }
            })
            if (isData == false) {
                //标志为false 新增一个tab项
                active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
            }
        }
        //最后不管是否新增tab，最后都转到要打开的选项页面上
        active.tabChange(dataid.attr("data-id"));
    });

    var active = {
        //在这里给active绑定几项事件，后面可通过active调用这些事件
        tabAdd: function (url, id, name) {
            //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
            //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
            element.tabAdd('demo', {
                title: name,
                content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:99%;"></iframe>',
                id: id //规定好的id
            })
            FrameWH();  //计算ifram层的大小
        },
        tabChange: function (id) {
            //切换到指定Tab项
            element.tabChange('demo', id); //根据传入的id传入到指定的tab项
        },
        tabDelete: function (id) {
            element.tabDelete("demo", id);//删除
        }
    };
    function FrameWH() {
        var h = $(window).height();
        $("iframe").css("height",h+"px");
    }
});
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
    var element = layui.element;

    //…
});
layui.use(['element', 'layer', 'jquery'], function () {
    var element = layui.element;
    // var layer = layui.layer;
    var $ = layui.$;
    // 配置tab实践在下面无法获取到菜单元素
    $('.site-demo-active').on('click', function () {
        var dataid = $(this);
        //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
        if ($(".layui-tab-title li[lay-id]").length <= 0) {
            //如果比零小，则直接打开新的tab项
            active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
        } else {
            //否则判断该tab项是否以及存在
            var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
            $.each($(".layui-tab-title li[lay-id]"), function () {
                //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
                if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                    isData = true;
                }
            })
            if (isData == false) {
                //标志为false 新增一个tab项
                active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
            }
        }
        //最后不管是否新增tab，最后都转到要打开的选项页面上
        active.tabChange(dataid.attr("data-id"));
    });

    var active = {
        //在这里给active绑定几项事件，后面可通过active调用这些事件
        tabAdd: function (url, id, name) {
            //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
            //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
            element.tabAdd('demo', {
                title: name,
                content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:99%;"></iframe>',
                id: id //规定好的id
            })
            FrameWH();  //计算ifram层的大小
        },
        tabChange: function (id) {
            //切换到指定Tab项
            element.tabChange('demo', id); //根据传入的id传入到指定的tab项
        },
        tabDelete: function (id) {
            element.tabDelete("demo", id);//删除
        }
    };
    function FrameWH() {
        var h = $(window).height();
        $("iframe").css("height",h+"px");
    }
});
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
    var element = layui.element;

    //…
});
$(function(){
    $(".main_left li").on("click",function(){
        var address =$(this).attr("data-src");
        $("iframe").attr("src",address);
    });
});
function add(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '更新商品信息',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function success(){
    layer.msg('更新商品信息成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success14(){
    layer.msg('查找成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
layui.use('element', function(){
    var element = layui.element;

    //…
});
function success1(){
    layer.msg('上架商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function add1(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '上架商品',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function success2(){
    layer.msg('下架商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success3(){
    layer.msg('删除订单成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success4(){
    layer.msg('修改订单成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function add2(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '更新订单信息',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });
}
function success5(){
    layer.msg('下架商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success6(){
    layer.msg('修改商品信息成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function add3(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '更新商品信息',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function success7(){
    layer.msg('删除用户成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success8(){
    layer.msg('修改用户信息成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function add4(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '更新用户信息',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function add7(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '举报商品',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function success9(){
    layer.msg('添加商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function success10(){
    layer.msg('查找商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}
function add5(){
    //window.open("/WEB-INF/jsp/up.jsp",null,"height=480,width=640,top=400,left=200,status=yes,toolbar=no,menubar=no");
    layer.open({
        //基本层类型
        type:1,
        //宽高
        area:['400px','300px'],
        //标题
        title: '更新购物车信息',
        //内容
        content: $('#create_table_from'),
        //按钮
        //确定按钮
        yes:() => {
            //开启loading
            const loading = layer.load(2);
            //获取表单内的所有值
            const formData = layui.form.val("create_table_from");
            //发送数据到接口
            $.post('__URL__/table/post_table', formData, (res)=>{
                //关闭loading
                layer.close(loading);
                console.log(res);
            });
        },
    });

}
function success11(){
    layer.msg('删除商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });
}

function success12(){
    layer.msg('删除商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });}
function success13(){
    layer.msg('举报商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });}
function success14(){
    layer.msg('删除举报信息成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });}
function success15(){
    layer.msg('下架该商品成功!', { icon: 1, time: 1000 },function(){
        location.reload();//刷新当前页面
    });}

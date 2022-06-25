function checkid(obj){
    var str=obj.value;
    var reg = /^\d{1,8}$/;
    if (str !=""){
        if (!reg.test(str)) {
            document.getElementById('id').value = '';
            setTimeout(function () {
                document.login.focus();
            }, 1000)
            document.getElementById("span1").innerHTML = "ID格式错误";
        }else{
            document.getElementById("span1").innerHTML ="";
        }
    }
}
function checkloginname(obj){
    if(obj.value.length>10) {
        document.getElementById("span2").innerHTML = "输入长度大于10";
        document.getElementById('login_name').value = '';
        setTimeout(function () {
            document.login.focus();
        }, 1000)
    }
    else{
        document.getElementById("span2").innerHTML ='';
    }

}

function checkpwd(obj){
    if(obj.value.length>10) {
        document.getElementById("span4").innerHTML = "输入长度大于10";
        document.getElementById('password').value = '';
        setTimeout(function () {
            document.login.focus();
        }, 1000)
    }
    else{
        document.getElementById("span4").innerHTML ='';
    }
}

function checktel(obj) {
    var str=obj.value;
    if (str != "") {
        var strRegex = /^(13|14|15|17|18)\d{9}$/;
        if (!strRegex.test(str)) {
            document.getElementById('mobile').value = '';
            setTimeout(function () {
                document.login.focus();
            }, 1000)
            document.getElementById("span5").innerHTML = "电话号码格式错误";
        }else{
            document.getElementById("span5").innerHTML = "";
        }
    }
}

function checkemail(obj){
    var str=obj.value;
    var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
    if (str !=""){
        if (!reg.test(str)) {
            document.getElementById('email').value = '';
            setTimeout(function () {
                document.login.email.focus();
            }, 1000)
            document.getElementById("span3").innerHTML = "电子邮箱格式错误";
        }else{
            document.getElementById("span3").innerHTML ="";
        }
    }
}

function checktype(obj) {
    var str=obj.value;
    var reg = /^([|1|2|3])$/;
    if (str !=""){
        if (!reg.test(str)) {
            document.getElementById('type').value = '';
            setTimeout(function () {
                document.login.focus();
            }, 1000)
            document.getElementById("span6").innerHTML = "输入类型错误";
        }else{
            document.getElementById("span6").innerHTML ="";
        }
    }
}

function checkname(obj) {
    if (obj.value.length > 5) {
        document.getElementById("span7").innerHTML = "输入长度大于5";
        document.getElementById('name').value = '';
        setTimeout(function () {
            document.login.focus();
        }, 1000)
    } else {
        document.getElementById("span7").innerHTML = '';
    }
}
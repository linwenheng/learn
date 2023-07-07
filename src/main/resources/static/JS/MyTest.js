async function sendData(url = "", data = {}) {
    var XHR = new XMLHttpRequest();
    var FD = new FormData(data);
    console.log(FD.get("userName"));
    console.log(FD.get('userPassword'));
    const response = await fetch(url, {
        method: "POST",
        body: FD
    });
    return response.json();
}

// 我们需要获取表单元素
var form = document.getElementById("testForm");

// ...然后接管表单的提交事件
form.addEventListener("submit", function (event) {
    event.preventDefault();

    sendData("/login", form).then(res => {
        if(res.code == -1){
            console.log(res.msg);
        }else {
            location.href = "/index";
        }
    })
});
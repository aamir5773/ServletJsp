function validateCollege(){
    var cid = document.getElementById("cid").value;
    var cname = document.getElementById("cname").value;
    var ctype = document.getElementById("ctype").value;
    var city = document.getElementById("city").value;
    var fees = document.getElementById("fees").value;
    var pin = document.getElementById("pin").value;
    
    
    if(cid == ""){
        alert("College Id cannot be blank.");
        return false;
    }else if(cname == ""){
        alert("College Name cannot be blank.");
        return false;
    }else{
        var form = document.getElementById("frm");
        form.action = "register.do";
        form.submit();
    }
}


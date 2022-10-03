function check(){
    var email = document.getElementById("a1").value;
    let password = document.getElementById("a2").value;
    if(email.length==0)
    {
        alert("Plz enter email id")
        return false;
    }
    else if(password.length==0)
    {
        alert("Plz enter the password")
        return false;
    }
    else if(email=="raj@gmail.com" && password=="456")
    {
        alert("successfully login")
        return true;
    }
    else {
        alert("failure try once again")
        return false;
    }
}
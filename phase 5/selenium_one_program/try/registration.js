function storaData()
{
    // get emailId and password using id attribute 

    // store both informatiom on localstorage or sessionStroage
    
}
function validateRegisteration()
{
    var fname=document.getElementById("m1").value;
    var lname=document.getElementById("m2").value;
    var age=document.getElementById("m3").value;
    var email=document.getElementById("n1").value;
    let pass=document.getElementById("n1").value;
    if(fname.length==0)
    {
        alert("plz eneter first name");
        return false;
    }
    else if(lname.length==0)
    {
        alert("plz enter last name");
        return false;
    }
    else if(age.length==0)
    {
        alert("plZ enter age ");
        return false;
    }
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
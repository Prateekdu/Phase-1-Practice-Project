function store(){
  
    var fname = document.getElementById("m1").value;
    let lname = document.getElementById("m2").value;
    var email = document.getElementById("m3").value;
    let pass = document.getElementById("m4").value;
    
    if(fname.length == 0){
        alert('Please enter first name');
        return false;

    }
    else if(lname.length == 0){
        alert('Please enter last name');
        return false;

    }
    else if(email.length == 0){
        alert('Please enter the email');
        return false;

    }
    else if(pass.length == 0){
        alert('Please enter the password');
        return false;

    }
   
       else if(email=="raj@gmail.com" && pass=="456" && fname=="Raj" && lname=="Kumar")
    {
        alert("successfully registered")
        return true;
    }
    else{
        alert("failure try once again")
        return false;
    }
}
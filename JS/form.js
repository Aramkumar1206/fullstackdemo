let div = document.createElement('div');
div.classlist = 'voterlist';
let containerdiv = document.querySelector('.container');
containerdiv.appendChild(div);

let submitbtn = document.getElementById('button');
submitbtn.addEventListener('click', displayuserdetail);

let i=0;
//create displaydetails

function displayuserdetail() {
    let fname = document.getElementById('fname').value;
    let lname = document.getElementById('lname').value;
    let email = document.getElementById('email').value;
    let state = document.getElementById('state').value;
    let address = document.getElementById('address').value;
    let country = document.getElementById('country').value;

    let gender = document.querySelector('input[name="gender"]:checked').value;
    let source = gender === 'male'? '../IMAGE/hotel 2.jpg' : '../IMAGE/hotel 2.jpg';


    let html = `<div class="dynamicuser">

                <img src=${source} height="70" width="90"> 
                <div class="userdetail">
                <div class= "username"> ${fname} ${lname}</div>
                <div class= "useremail"><i>${email}</i></div>
                <div class= "userstate"><i>${state}</i></div>
                <div class= "address"><i>${address}</i></div>
                <div class= "usercountry">${country}</div>
                </div>

                <div class= "removecard">
                <button class= "remove" id="remove${i}">X  Remove</button>
                </div>      
                </div>`;

div.insertAdjacentHTML('beforeend', html)


document.querySelector('#remove' + i)
.addEventListener('click', function() {
let removeEl = this.parentNode.parentNode;
div.removeChild(removeEl)
})

i++;
}
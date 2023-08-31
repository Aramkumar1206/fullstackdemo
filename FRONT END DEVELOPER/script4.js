/*
Truth table for And
1 1 1
1 0 0 
0 1 0
0 0 0

truth table for!
1 1 1
1 0 1
0 1 1
0 0 0

truth table for ~
1 0
0 1 

truth table for ^
1 0 1
0 1 1
1 1 0
0 0 0


10 - 01010
25 - 11001
*/

console.log(10^25)

/*
conditional statements
if(condition){
    code of experssion
}
else if(comdition){
    code of experssion
}
else if(comdition){
    code of experssion
}
else if(comdition){
    code of experssion
}
else{
    
}

If else ladder

Event Listeners -- onclick
Event handlers  -- check()
Event --click
 */

// let para = document.querySelector("p");
// let input = document.querySelector("input");
// let button = document.querySelector("button");

// function check(){
//     let age = input.value;
// if(age<18){
//     para.innerHTML="You are not eligible for voting";
// }
// else if (age == 18){
//     para.innerHTML="you are First time voter";
// }
// else{
//     para.innerHTML="You are eligible for voting";
// }


// }

// button.onkeydown = function(){
//     document.body.style.backgroundColor = "red";
// }
// button.onkeyup = function(){
//     document.body.style.backgroundColor = "green";
// }

// input.oninput = function(){
//     check();

// }

let userChoice = document.querySelector("input");

userChoice.oninput = function(){
    // document.body.style.fontSize = "3rem"
    // document.body.style.fontSize = userChoice.value;
    document.body.style.fontSize = userChoice.value + "rem";

}
// Anonymous Funtion

let img = document.querySelector("img");
let minBtn = document.querySelector(".min");
let maxBtn = document.querySelector(".max");

minBtn.onclick = function(){
    img.style.height = "100px"
}
maxBtn.onclick = function(){
    img.style.height = "600px"
}
let imgHeight = prompt("Kindly type your image height ");

img.style.height = imgHeight;





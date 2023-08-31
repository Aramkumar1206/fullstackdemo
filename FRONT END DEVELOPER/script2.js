/* 
variables
variables declaring keywards
var(global scope) 
it can be redeclared and reassigned

,let(block scope)
it cannot be redeclared but can be reassigned

, const(block scope)
it cannot be redeclared and reassigned

global scope, local scope
*/
/*
let box ="Global scope"; // global scope
{
    let box ="Block scope";
    console.log(box);// local scope
}
*/

/*
box= "Global scope";
var box;
console.log(box);
*/

// const box = 15;
// {
//     const box =45;
// }

// console.log(box);


// Data types

// Primitive data type

// String ="Hello world"
// Number = 123,34.23
// Boolean = True or false
// undefined -variable declared without assignment
// null - which represent emptyness

// Non primitive data type(reference datatypes)- complex values

// objects
// Arrays
// Function



// let _Name = "ram";
// let $Name = "kumar";
// console.log(_Name);
// console.log($Name);


let _Name ;
let $Name = null;
document.getElementById("first").innerText = _Name;
document.getElementById("second").innerText = $Name;

let car1color = "red";
let car1price = 20000;
let car1engine = "turbo";

let car1 ={  //Properties
    color:"red",
    price:20000,
    engine:"turboplus"
}; //object

let list = ["blue",2300,true];//Array
console.log(list[1]);


let box ="green";
function task(){
    // alert("im executed by the system");
     document.body.style.background = "red";
}

function blue(value){
    document.body.style.background= value;
}




/*Function identifier
parantheses(parameters)
curly braces(//code of expression)
*/

/*
Object - key value pairs,named index
Array -List,numered  index
 */

console.log(car1.color,car1.price,car1.engine);

/*
operators

Arithmetic operators
+,-,*,/,%,++,,==
assignment operators
logical operators
comparison operators
ternary operators
bitwise operator
typeof operator
 */


// let num = 12;

// console.log(++num);
// console.log(num);
// console.log(17/3);

// console.log(2**5)

let myBox =12;
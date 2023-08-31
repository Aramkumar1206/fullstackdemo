/*
String methods and properties
Length
charAt()
replace
split - into array
toLowercase
toUppercase
match - it matches for keywords and returns the list of informations
startswith
endswith
includes
index of
lastindexof
trim
start
end
ends


Number
parseInt
parsefloat


Math
math.floor,ceil,round,random,pi,min,max


Boolean
Truthy statements and falsy statements
"",Nan,0,false,undefined,null

string -""
number - 0,Nan
boolean  false
null - null
undefined - undefined

{}.[]

 */

// let box ="Javascript String";
// console.log(box);
// console.log(box.charAt(6));
// console.log(box.length);
// console.log(box.replace("Java"," "));
// console.log(box.split(" "));
// console.log(box.split(""));
// console.log(box.split("a"));
// console.log(box.toUpperCase());
// console.log(box.toLowerCase());
// console.log(box.match("s"));
// console.log(box.charCodeAt(4));


/*let box ="Javascript String1";
let box1 ="Javascript String2";
let box2 ="Javascript String3";
// let result =box.concat(box1,box2);
let result =box1.endsWith(".com");
console.log(result);
*/

/** 
let box ="Javascript String1";
let box1 ="alvarramkumar";
// let box2 ="alvarramkumar@gmail.com";
// let result =box2.endsWith(".com");
// let result =box2.startsWith("alvar");
// let result =box2.includes("@");
// let result =box2.lastIndexOf("m");
// let result =box2.padEnd();
// let result =box2.padStart(4);
// let result =box2.trimEnd();
let box2 = "40.776";
// let result =box2.toString();
// let result =Number(box2);
// let result =parseInt(box2);
let result =parseFloat(box2);
// console.log(result,result.length);
// console.log(result,typeof(result));
// console.log(Math.min(2,4,6),typeof(result));
console.log(Math.max(2,4,6),typeof(result));

// console.log(box.concat(box1,box2));
*/

//Boolean
let box ="Javascript String1";
let box1 ="alvarramkumar";
let box2 = [];
let result = Boolean(box2);
console.log(result,typeof(result));





/*
index

charAt - returns charactor in the positions
charCodeAt - returns charcode in the positions

Array methods and Properties
length
pop
push
shift
unshift

splice (index,no of elements to be removed,{add parameter })

 */

let myArray = ["John",34,true];
// let newArray = myArray.length;
// let newArray = myArray.push("End",478);
// let newArray = myArray.pop();
// let newArray = myArray.shift();
 myArray.splice(1,0,"Hello",true);

console.log(myArray);
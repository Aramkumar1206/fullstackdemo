/*
callback function
setInterval(function,time in milliseconds)
*/

// function repeat(){
//     console.log("Hello to console");
//     document.querySelector("div").innerHTML+= "hello to world";
// }

// let btn = document.querySelector("button");
// function myclock(){
//      let now =  new Date();
//      document.querySelector("div").innerHTML =
//      now.getHours()+ ":" +
//      now.getMinutes()+ ":" +
//      now.getSeconds()
// }
// // setInterval(myclock,1000)\
// let myTiming = setInterval(myclock,1000)

// btn.onclick=() =>{
//     clearInterval(myTiming)

// }

// let btn = document.querySelector("button");
// function display(){
//     document.querySelector("div").innerHTML=
//     "you waited for me"
// }
// let myTimeout = setTimeout(display,5000);

// btn.onclick = ()=>{
//     clearTimeout(myTimeout)
// }


// callBack function ----parentheses should not use when passed as parameter

// let myArray = ["HTML","CSS","JAVA SCRIPT","REACT JS"]

// for(let key of myArray){
//     document.querySelector("ol").innerHTML +=
//     "<li>" +key+"</li>";
// }

// myArray.map(
//     (val,i,arr) =>{

//         document.querySelector("ol").innerHTML +=`<li> ${val} </li>`;
            
//         }
// )
   
//value,index,array
// let myArray = [2,6,3,5]
// let total = myArray.reduce(
//     (prevValue,value,i,arr) =>{
//          return prevValue += value;
//     }
// );

// console.log(total);


// let myArray =[1,3,6,7]
// let myArray2 =[2,4,6,8]
// let myArray3 = [3,5,67,4]

// let newArray = [...myArray,"hello",...myArray2,...myArray3]

// // let newArray = myArray.concat(myArray2);
// console.log(newArray);


// let myArray =[1,3,6,7]
// let myArray2 =[2,4,6,8]
// let myArray3 = [3,5,[23,4,65],67,4]

// document.querySelector("div").innerHTML = myArray3
// console.log(myArray3.flat());

// console.log(myArray3[2][2]);


// let myArray = [3,5,{name:"ram",age:23}]

// console.log(myArray[2].name);

let myArray3 = [22,44,5,62,3]

// console.log(myArray3.sort().reverse());

let sortedArray = myArray3.sort(
    (a,b) =>{
        return a-b;
        /*
        if(a<b){
            return -1
        }
        else if(a>b){
            return 1
        }
        else{
            return 0
        }
         */
    }
   
)
console.log(sortedArray);




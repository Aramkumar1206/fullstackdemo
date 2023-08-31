/*
loopings(for)

myArray.sort(
    (a,b)=>{return a-b}
);



 */

// let list = document.querySelector("ol");

let list = "<ol>";

let myArray = ["HTML","CSS","JAVASCRIPT","REACT"];

// myArray.sort(
//     (a,b)=>{return a-b}
// );
// myArray.sort().reverse();

// myArray.forEach(
//     (val,i,arr)=>{console.log(arr)}
//     )

/*
myArray.forEach(
    (val,i,arr)=>{
        list +="<li>" + val +"</li>"
    }
    )
    list +="</li>";
    document.body.innerHTML +=list;

console.log(myArray);

*/

/*
let newArray = myArray.map(
    (val,i,arr)=>{
        list +="<li>" + val +"</li>"
        return i;
    }
    )
    list +="</li>";
    document.body.innerHTML +=list;

console.log(myArray);
console.log(newArray);
*/

// For loop

/*
For(intialization ,condition,increment/decrement)
//code
 */

/*
let star = "";
for(let i=1;i<=5;i++){
    star +="*";
}
star+="\n";
for(let i=1;i<=5;i++){
    star +="*";
}
star+="\n";
for(let i=1;i<=5;i++){
    star +="*";
}
star+="\n";
for(let i=1;i<=5;i++){
    star +="*";
}
star+="\n";
for(let i=1;i<=5;i++){
    star +="*";
}



console.log(star);
 */

/*increasing order of triangle
for(let i=1;i<=1;i++)

decreasing order of triangle
for(let i=1;i<=5;i++)
*/

// let star = "";
// for(let i=1;i<=5;i++){
//     for(let j=i;j<=5;j++){
//         star +=" * ";
//     }
//     star +="\n";
// }
// console.log(star);

let star = "";
for(let i=1;i<=5;i++){
    for(let j=i;j<=5;j++){
        star +=" ";
    }
    for(let j=1;j<=i;j++){
        star +="*";
    }
    for(let j=1;j<=i-1;j++){
        star +="*";
    }
    star +="\n";
}
for(let i=1;i<=5;i++){
    for(let j=1;j<=i;j++){
        star +=" ";
    }
    for(let j=i;j<=5;j++){
        star +="*";
    }
    for(let j=i;j<=5-1;j++){
        star +="*";
    }
    star +="\n";
}
console.log(star);

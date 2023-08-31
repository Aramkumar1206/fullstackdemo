/*
operators

Arithmetic operators
+,-,*,/,%,++,,==
assignment operators
logical operators
comparison operators
<,>,<=,>=,
==(checks for same value but it does not check for data type)
===(checks for same value and same data type )
!=,!==

truthy statements
falsy statement
"",0,false,null,undefined,NaN

1.String- "",''
2.Number-0,NaN
3.Boolean-false
4.null-null
5.undefined-undefined

ternary operators
(//condition)? true:false

bitwise operator

typeof operator

returns the data type of the value
 */

// console.log(1 ===  "4");
// console.log(0 ==[]);
// console.log(Boolean({}));
// console.log(true =="true");
//  console.log(4 != "4");
// console.log(true !=1);
// console.log(5 !=="5");

// console.log(typeof("3"));
// console.log(typeof(true));
// console.log(typeof(2344));

// let num1 = 3 ,num2 = 5;
// console.log(num1 + num2);
// console.log(++num1);

let age =20;


// console.log(result);

const input =document.querySelector("input");
const btn =document.querySelector("button");
const para =document.querySelector("p");

function check(){
para.innerHTML = (input.value <=18)? 
"you are not eligible for voting":
"you are eligible for voting";
}


let num1 =0 ,num2 = 3;
// console.log(num1 && num2);
// let result=((num1==20)&&(num2==30))?
let result=(!(num2==3))?
"Both values are same":
" values are not Same";
console.log(result);


/*
Bitwise operator
storage 64 bits store

32 bit number
01010100101010101011010101


Binary Numbers system--power of 2
decimal Numbers system--power of 10
octal Numbers system--power of 8
hexadecimal Numbers system--power of16


Decimal to binary number

      25
  2   12  1
  2   6   0
  2   3   0
  2   1   1

  11001

  binary to decimAL
  1 
  0
  0
  1
  1

  Bitwise operator
&,!,~

truth table Bitwise opeartor And

1  1  1
1  0  0
0  1  0
0  0  1

1`001
 */
/*
Functions
1.function
function name(){}
2.arrow function
() => {}
3.anonymous function
map(
    () => {}
)
4.callback function 
Function which is passed as parameter

5.Higher order Function
Function which accepts another functioN AS A parameter
 */

/*
function display(value){
    console.log(value);

}

function displayInAlert(value){
    alert(value);
}

function sum(num1,num2,funcName){
    let result = num1+num2;
    funcName(result)
}
sum(3,5,displayInAlert);
*/

/*
setTimeout(
    () =>{
        console.log(1)
        setTimeout(
            () =>{
                console.log(2)
                setTimeout(
                    () =>{
                        console.log(3)
                    }
                    ,2000
                )
            }
            ,2000
        )
    }
    ,2000
)


//callback hell
//promise() - class object
*/
/*
Promise(
    (resolve,reject)=>{
//code
resolve()
reject()
    }
) -- producer code
states - fulfilled ,rejected,pending

promise.then().catch()
*/

let myPromise = new Promise(
    (res,rej)=>{
        const box = 10;
        console.log(hello);
        res("Promise sucess")
        rej();
    }
);

myPromise
.then(
    (value)=>{
        console.log(value)
    }
).catch(
    (err)=>{
        console.error("Error occured-------" ,err.message)
    }
)

console.log(myPromise);

/*
error
name,message
 */
function myTiming(duration){
    return new Promise(
        (resolve)=>{
            setTimeout(resolve,duration)
        }
    )

}

myTiming(2000)
.then(
    ()=>{
        console.log(1);
        return myTiming(2000)
    }
)
.then(
    ()=>{
        console.log(2);
        return myTiming(2000)
    }
)
.then(
    ()=>{
        console.log(3);
        
    }
)


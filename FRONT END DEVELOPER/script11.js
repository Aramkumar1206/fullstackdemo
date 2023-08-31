/*
Asynchronous functions

synchronous
Asynchronouse

single threaded

async await
 */


/*
async function displayContent(){
    let myPromise = new Promise(
        (res,rej)=>{
            setTimeout(
                ()=>{
                    res("you waited for me-----")
                },5000
             )
        }
    )
    document.querySelector("body").innerHTML +=
      await myPromise;
} 

displayContent()

*/

/*
XMLHttpRequest()-class object
new keyword


statusCode

100 - 199 - Informational codes
200 - 299 - oKay Status codes
300 - 399 - Redirecting codes
400 - 499 -  client side error
500 - 599 -  server side error

response

send()

onload

Http methods
get,post,put,delete
 */


/*
async function getfile(){
    let myPromise = new Promise(
        (res)=>{
            let req = new XMLHttpRequest()
            req.open("GET","script3.html")
            req.onload=()=>{
                if(req.status == 200){
                    res(req.response)
                }else{
                    res("error file not found")
                }
            }
            req.send()
        }
    )
    document.querySelector("div").innerHTML = await myPromise;

}
getfile()
*/

/*
axios
fetch() --> promise .then ().catch()

JSON - Javascript Object Notation
Data Transfer between cient and server
Array of Object in the form of string
[
    {
        "name:"ram
    }
    ,{},{}
]
 */

let list = document.querySelector("ul");
async function getData(){
    let userData;

fetch("https://jsonplaceholder.typicode.com/users/1")
.then(
    (res)=>{
       return res.json()
    }
)
.then(
    (data) =>{
        console.log(data)
        list.innerHTML = JSON.stringify(data)  /* data .map(
            (value)=>{
                return "<li>" + JSON.stringify(value,null,10) + "</li>"
            }
        );*/
    
     
    }
)
 
}
getData()
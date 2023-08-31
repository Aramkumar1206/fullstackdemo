// class Animal{
//     eat(){
//         console.log("Eating period of time")
//     }
//     sleep(){
//         console.log("sleeping period fo 100 minutes")
//     }
// }
// class Cat extends Animal {
//     // eat(){
//     //     console.log("Eating period of time")
//     // }
//     sleep(){
//         console.log("sleeping period for cat is 10 hours")
//         super.sleep();
//     }
//     sound(){
//         console.log("meow")
//     }
// }

// class Dog extends Animal{
//     sound(){
//         console.log("Barking")
//     }
// }

// let cat = new Cat();
// let dog = new Dog();
// cat.sleep()
// // cat.eat()
// // cat.sleep()
// // dog.sleep()
// // cat.sound()
// // dog.eat()

/*
Inheritance
Polymorphoism

input --> +.jpg ==>variable

document.createElement("img")
document.body.appendChild(img)
 */

// let btn = document.querySelector("button");

// btn.onclick = function create(){

//     let inputValue = 
//     document.querySelector("input").value+ ".png";

//     let image = document.createElement("img")
//     image.src = inputValue;
//     document.body.appendChild(image);
// }

/*
class  Create {
    constructor(car){
        this.car = car ;
        alert("charactor creation intilization")

    }
    createChar(){
        let image = document.createElement("img")
        image.src = this.car;
        document.body.appendChild(image);
    }
}

let btn = document.querySelector("button");
let inputValue = document.querySelector("input");

btn.onclick = function(){
    let char = new Create(inputValue.value +".png")
    char.createChar();
}
*/

/*
 ExceptionaL handling
 try,catch,finally


 if it found an error
 the pointer thrown from the code line.
 than it will create an error object in the terminal
 name .message
  */

 try{
    let box = 35;
    console.log(box)
    throw new Error ("error found reading the code")
 }
 catch(err){
    // console.log(err);
    document.querySelector("input").value = err.message
 }
 finally{
    console.log("finally block executed")
 }

alert("hello my partner")
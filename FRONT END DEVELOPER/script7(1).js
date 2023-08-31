/*
class
methods - functions
properties  - values



predefined class object
date,promise,math

userdefined class object


by creating a object


new keyword
1.create an object from the defined class
2.it calls the costructor method in the class


 */

// let myArray = new Array(20)
// let myArray2=[20];

// console.log(myArray,myArray2);

let myTime = new Date();
document.querySelector("p").innerHTML = myTime.getHours()
let p = document.querySelector("p")
// console.log(myTime.getHours());


// class Animal{ //dog,cat
//     constructor(name,age){
//         this.name =  name;
//         this.age = age;
//         console.log("constructor is called" +this.name)
//     }
//     eat(value){
//         // p.innerHTML = "Animal is eating some food"+value ;
//        console.log("Animal is eating "+value);
//     }
//     getAge(){
//         console.log("ANimals age is " +this.age);
//     }
// }

// class Dog extends Animal{
//     bark(){
//         console.log("bark");
//     }
// }

// // inheritance - extends

// let dog = new Animal("charlie",3);//object create
// let cat = new Animal("Tom");//object create
// let chidDog = new Dog("Jerry",10);
// console.log(dog.name);
// chidDog.bark();
// chidDog.getAge();
// console.log(chidDog.name);
// dog.getAge();;

// dog.eat("bone");
// cat.eat("fish");



class Amazon{
    constructor(offers){
        this.offers = offers;
        console.log("today is the best offer " +this.offers)

    }
    shop(value){
        console.log("today offer 50% " + value);
    }
    getshoe(){
        console.log("shoes sell 100rs"+this.offers)
    }
   
}

class shopping{
    vrmall(){
        console.log("vrmall");
    }
}
let dress = new Amazon("90%");
let electronics = new Amazon("12%");
let shoppings = new shopping();
shoppings.vrmall();

dress.shop("rs.800");
electronics.shop("rs.1000");

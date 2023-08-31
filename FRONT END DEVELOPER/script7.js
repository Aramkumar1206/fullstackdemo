/*
new object - class method and property
*/

/*
let car1Color ="red";
let car1model ="low";

let car1 = {
    color: "red";
    model:"low";

};

let car2 = {
    color: "red";
    model:"low";

};

let car2Color ="blue";
let car2model ="middle";

let car3Color ="green";
let car3model ="high";

properties - variables
methods -  functions


New keyword
object create from class

*/
let input = document.querySelector("input");

class car{
    run(val){
        document.querySelector("img").src=val;
    }
}

let raceCar = new car();

// raceCar.run("car.png");
input.oninput = ()=>{
    raceCar.run(input.value);
}

/*
class --
 dictionery(value(properties),logic(methods))

pre defined - date(),promise()
user defined - your_Name

object = new class () creating a object from class

objects are instances of classes

constructor will be automatically called

once the creation of object

 */

let myTime = new Date();

console.log(myTime.getHours());

class Student{

    constructor(){
        this.standard = 10;
    }//to share properties
   getStudent(val){
        alert(val + " is being called");
    }//method
}// class creation

let john = new Student();//object creation
let ram = new Student();
ram.getStudent("ram")
john.getStudent("john");
console.log(john.standard);

/*
    CREATION OF CLASS
1.create a class
2.Constructor which is a default method
-- to store properties
3.user defined methods --any number


USAGE OF CLASS
1.you have to create a object
2.by using "new " Keyword
--It  gives methods and properties of the class
--It automatically calls constructor method
3.object.method().object.property
 */


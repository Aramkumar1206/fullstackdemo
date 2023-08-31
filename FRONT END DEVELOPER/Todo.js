

let taskList = document.querySelector("ol")
let input = document.querySelector("input")
let btn = document.querySelector("button")
btn.onclick = function(){
       taskList.innerHTML  +=
        "<li>"  + input.value + "</li>"
        input.value=""
        
}
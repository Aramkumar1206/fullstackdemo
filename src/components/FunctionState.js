
import { useState } from "react"
import DateComponent from "./DateComponent"

function FunctionState(){
    // const myArray =["one","Two","three","four","five"]
    // const [valueOne,valueTwo,...rest] = myArray
    // const[value,setValue] = useState({num:0})
    const[value,setValue] = useState({num:"ram"})
    function handleClick(){
    //   setValue({num:value.num +1})
    setValue({num:"kumar"})

    }
    return(
        <>
        <DateComponent />
        <h2>Functions Component rendered</h2>
        <h3>State value is rendered here  {}</h3>
        <button onClick={handleClick}>Add State</button>
        {/* <h1>{valueOne},{valueTwo},{rest}</h1> */}
        <h1>{value.num}</h1>
        </>
    )
}
export default FunctionState;
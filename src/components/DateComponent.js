
import Morning from "./Morning";
import Evening from "./Evening";
 const DateComponent =()  =>{
    const myDate =new Date()
   return(
    <div>
        {/* {
        
            (myDate.getHours()<10 ?
        <Morning/>:
        <Evening/>
        )
        
        } */}

        {
            myDate.getHours() === 10 && <Morning/>
        }
    </div>
   )
 }

export default DateComponent;
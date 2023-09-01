
function NavBar(){
    const myArray =["Home","Order","Support","Sign Up"]
    return(
       <nav>
        <ul>
            {
                 myArray.map((val,i)=><li key={i}>{val}</li>)
            }
        </ul>
       </nav>
    )
}

export default NavBar;
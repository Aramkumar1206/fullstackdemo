//Components has two types
//class(state ful) and Functions (stateless)

// function App(){
//     return(
//         <div>
//                <h1>App component renderd</h1>
//                <h3>Web page content</h3>
//         </div>
//     ) 
// }

// export default App;

import React from "react"
class classState extends React.Component{
    constructor(props){ //props={content:"React Data"}
        super()
        this.state={value : 0}
        this.handleClick = this.handleClick.bind(this)
       
    }
    handleClick(){
         this.setState({value:this.state.value + 10})
    }
    render(){
        return(
            <div>
                   <h1>App component renderd</h1>
                   <h3>Web {this.props.content}page content</h3>
                   <h3>state value:{this.state.value}</h3>
                   <button onClick={this.handleClick}>Add Value</button>
            </div>
        ) 
    }
    
}

export default classState;
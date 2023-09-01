

function Product(){
     const productStyle ={
        border:"2px outset",
        height:"200px",
        width:"200px",
        backgroundColor:"white"
     }
     const productList =[{
        name:"Tv",price:20000
     },{
        name:"car",price:20000
     },{
        name:"Phone",price:20000
     }]
    return(
        <div className="Product-list" style={productStyle}>
            {
                productList.map(
                    (val,i)=>{
                        return<div className="Product" key={i}>
                        <h4>{val.name}</h4>
                        <h2>Images</h2>
                        <image src="/demoproject/image/tv.jpg"  alt=""></image>
                        <span>{val.price}</span>
            
                        </div>
                    }
                )
            }
            
            
        </div>
    )
}

export default Product;
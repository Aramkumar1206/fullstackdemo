import  React from "react";
// import  ReactDOM,{createRoot}  from "react-dom/client";
import {createRoot}  from "react-dom/client";
import  App  from "./App"
import "./index.css"




// ReactDOM.render(<App content = "react Data"/>
// ,document.querySelector("div"))


const root =createRoot(document.querySelector("div"))

root.render(<App/>)


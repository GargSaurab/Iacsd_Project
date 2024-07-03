
import React from "react"
import Navbar from "./NavBar2"
import Search from "./SearchBar"
import "../Styles/HomePageComponent.css"

export default function HomePage() {

    return(

        <div>
           
           <Navbar></Navbar>
           
           
           <div className="searchBar">
              <Search></Search>
           </div>


        </div>
    )
    
}
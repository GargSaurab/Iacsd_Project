import React, { useState } from "react";
import searchService from '../Service/SearchService';
import '../Styles/SearchComponent.css';
import { SearchResult } from "./SearchResult";
const searchIcon = process.env.PUBLIC_URL + '/search.svg';

export default function Search() {
    const [input, setInput] = useState("");

    const [results, setResults] = useState([]);

    const handleSearch = (value) => {
        if (value.trim() !== "") {
            searchService.search(value)
                .then((response) => {

                    console.log("response",response.data);
                    setResults(response.data);

                })
                .catch((error) => {
                    console.error("Error fetching search results:", error);
                    setResults([]); // Handle error by setting results to empty array
                });
        }

    }

    const handleChange = (value) => {
        setInput(value);
        if (value.trim() === "") {
            setResults([]); 
        } else {
            handleSearch(value);
        }
    }

    return (

        <div >
            <div className="Search">
                <div className="searchBar">
                    <img src={searchIcon} alt="Search Icon" style={{ width: '24px', height: '24px' }} />
                    <input type="text"
                        placeholder="Type to search..."
                        id="searchInput"
                        value={input}
                        onChange={(e) => handleChange(e.target.value)} />
                    <button type="button" onClick={() => { document.getElementById("searchInput").focus(); }}>Search</button>
                </div>
                <div className="searchResults" >
                    {results && results.map((result, id) => {
                        return <SearchResult result={result} key={id} query={input}/>;
                    })}
                </div>
            </div>
        </div>
    )
}
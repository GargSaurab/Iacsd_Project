import React, { useState } from "react";
import '../Styles/CustomerComponent.css';
import medicineService from '../Service/MedicineService';
import { SearchResult } from "./SearchResult";
const searchIcon = process.env.PUBLIC_URL + '/search.svg';

export default function PharmacistComponent() {
    const [input, setInput] = useState("");

    const [results, setResults] = useState([]);

    const handleSearch = (value) => {
        if (value.trim() !== "") {
            medicineService.search(value)
                .then((response) => {

                    console.log("response",response.data);
                    setResults(response.data);

                })
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

        <div className="Customer">
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
                <div className="searchResults">
                    {results && results.map((result, id) => {
                        return <SearchResult result={result} key={id}/>;
                    })}
                </div>
            </div>
        </div>
    )
}
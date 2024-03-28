import React from 'react';
import "../Styles/SearchResultComponent.css";
import { Link } from 'react-router-dom';

export const SearchResult = ({result}) => {
 
  return(

    <Link to={`/medicineCardList`}>
      <div className='searchResult'>{result.originalName} {result.power}</div>
    </Link>
  
        );
}

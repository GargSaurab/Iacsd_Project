import React from 'react';
import "../Styles/SearchResultComponent.css";

export const SearchResult = ({result}) => {
 
  return(

    <div className='searchResult'>
      <a href="/medicineCardList" className='link'>{result.originalName} {result.power}</a>
    </div>
  
        );
}

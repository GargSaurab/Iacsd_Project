import React from 'react';
import "../Styles/SearchResultComponent.css";

export const SearchResult = ({result}) => {
  return <div className='searchResult'>{result.originalName}</div>;
  
}

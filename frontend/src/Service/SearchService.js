import axios from "axios";

const baseURL = "http://localhost:8080/search";

const SearchService={
 
    search:(value)=>{
        console.log(value);

        return axios.get(baseURL+"/search",{
            params: {
              query: value  // Sending data via params with the correct parameter name
            }
          })
    }
}

export default SearchService;
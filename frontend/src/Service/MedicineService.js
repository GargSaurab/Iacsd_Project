import axios from "axios";

const baseURL = "http://localhost:8080/medicine";

const MedicineService={
 
    search:(value)=>{
        console.log(value);

        return axios.get(baseURL+"/search",{
            params: {
              query: value  // Sending data via params with the correct parameter name
            }
          })
    }
}

export default MedicineService;
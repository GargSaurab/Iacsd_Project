import axios from "axios";

const baseURL = "http://localhost:8080/pharmacist";

const PharmacistService={
    getAuthorization:(formDetails)=>{
        console.log("in service"+formDetails.username,
        formDetails.password);
        return axios.post(baseURL+"/auth",formDetails);
    },
}

export default PharmacistService;
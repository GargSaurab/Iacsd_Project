import axios from "axios";

const baseURL = "http://localhost:8080/pharmacist";

const PharmacistService={
    getAuthorization:(formDetails)=>{
        console.log("in service"+formDetails.Username,
        formDetails.Password);
        const data = {
            id: formDetails.Username,
            password: formDetails.Password
        };
        return axios.post(baseURL+"/auth",data);
    },
}

export default PharmacistService;
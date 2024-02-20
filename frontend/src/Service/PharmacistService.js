import axios from "axios";

const baseURL = "http://localhost:8080/pharmacist";

const PharmacistService={
    getAuthorization:(username,password)=>{
        return axios.post(baseURL+"/auth",username,password);
    },
}

export default PharmacistService;
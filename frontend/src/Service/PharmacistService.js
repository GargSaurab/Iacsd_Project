import axios from "axios";

const baseURL = "http://localhost:8080/pharmacist";

const PharmacistService={
    getAuthorization:(username,password)=>{
        console.log("in service"+username,password);
        const data={id:username,password:password};
        return axios.post(baseURL+"/auth",data);
    },
}

export default PharmacistService;
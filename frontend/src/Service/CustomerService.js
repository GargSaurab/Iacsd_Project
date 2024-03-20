import axios from "axios";

const baseURL = "http://localhost:8080/customer";

const CustomerService={
    getAuthorization:(formDetails)=>{
        console.log("in service"+formDetails.username,
        formDetails.password);
        return axios.post(baseURL+"/auth",formDetails);
    },
    
    listAllCustomers(){
        return axios.get(baseURL);
    },
}

export default CustomerService;
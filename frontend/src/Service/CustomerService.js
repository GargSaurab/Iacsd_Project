import axios from "axios";

const baseURL = "http://localhost:8080/customer";

const CustomerService={
    getAuthorization:(formDetails)=>{
        console.log("in service"+formDetails.Username,
        formDetails.Password);
        const data = {
            id: formDetails.Username,
            password: formDetails.Password
        };
        return axios.post(baseURL+"/auth",data);
    },
    
    listAllCustomers(){
        return axios.get(baseURL);
    },
}

export default CustomerService;
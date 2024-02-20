import axios from "axios";

const baseURL = "http://localhost:8080/customer";

const CustomerService={
    getAuthorization:()=>{
        return axios.post(baseURL+"/auth");
    },
}

export default CustomerService;
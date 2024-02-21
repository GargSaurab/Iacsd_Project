import axios from "axios";

const baseURL = "http://localhost:8080/customer";

const CustomerService={
    getAuthorization:(username,password)=>{
        console.log("in service"+username,password);
        const data={id:username,password:password};
        return axios.post(baseURL+"/auth",data);
    },
    
    listAllCustomers(){
        return axios.get(baseURL);
    },
}

export default CustomerService;
import CustomertService from "../Service/CustomerService";
import { useState,useEffect } from "react";
const CustomerTable=(props)=>
{
    const[custarr,setCustarr]=useState([]);
    useEffect(()=>{
        CustomertService.listAllCustomers()
        .then((result)=>{
            console.log(result)
            setCustarr([...result.data]);
        })
    },[])
    return(
        <div>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">UserID</th>
                        <th scope="col">Name</th>
                        <th scope="col">DOB</th>
                        <th scope="col">Address</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone Number</th>
                        <th scope="col">Last Purchse Date</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        custarr.map(p=><tr key={p.userId}>
                            <td>{p.userId}</td>
                            <td>{p.name}</td>
                            <td>{p.dob}</td>
                            <td>{p.address}</td>
                            <td>{p.email}</td>
                            <td>{p.phnNo}</td>
                            <td>{p.lastPurchaseDate}</td>
                        </tr>)
                    }
                </tbody>
            </table>
        </div>
    )
}

export default CustomerTable;
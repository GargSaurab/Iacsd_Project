import MedicineService from "../Service/MedicineService";
import { useState,useEffect } from "react";
const CustomerTable=(props)=>
{
    const[medarr,setMedArr]=useState([]);
    useEffect(()=>{
        MedicineService.getAllMedicines()
        .then((result)=>{
            console.log(result)
            setMedArr([...result.data]);
        })
    },[])
    return(
        <div>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Medicine Id</th>
                        <th scope="col">Cost</th>
                        <th scope="col">Company</th>
                        <th scope="col">Expiry Date</th>
                        <th scope="col">Manufactured Date</th>
                        <th scope="col">M.R.P</th>
                        <th scope="col">Original Name</th>
                        <th scope="col">Power</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        medarr.map(p=><tr key={p.medicine}>
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
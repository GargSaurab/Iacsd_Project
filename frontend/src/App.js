import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Navbar';
import  Login from './Components/Login';
import Home from './Components/Home';
import Pharmacist from './Components/Pharmacist';
import CustomerList from './Components/CustomerList';
import Customer from './Components/Customer';
import Trial from './Components/trial';
import { Route,Routes } from 'react-router-dom';
import Registration from './Components/Register';
import BillComponent from './Components/BillComponent';
import MedicineCard from './Components/MedicineCardList';
function App() {
  return (
    <div>
     <Navbar></Navbar>
      <Routes>
        <Route path="/" element={<Home></Home>}></Route>
       <Route path="/login" element={<Login></Login>}></Route>
       <Route path='/pharmacist' element={<Pharmacist></Pharmacist>}></Route>
       <Route path="/customerlist" element={<CustomerList></CustomerList>}></Route>
       <Route path='/customer' element={<Customer></Customer>}></Route>
       <Route path="/registration" element={<Registration></Registration>}></Route>
       <Route path="/bill" element={<BillComponent></BillComponent>}></Route>
       <Route path="/trial" element={<Trial></Trial>}></Route>
       <Route path="/medicineCardList" element={<MedicineCard></MedicineCard>}></Route>
      </Routes>
    </div>
  );
}

export default App;

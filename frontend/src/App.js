import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Navbar';
import  Login from './Components/Login';
import Home from './Components/Home';
import Pharmacist from './Components/Pharmacist';
import Customer from './Components/Customer';
import CustSample from './Components/CustomerSample';
import { Route,Routes } from 'react-router-dom';
function App() {
  return (
    <div>
     <Navbar></Navbar>
      <Routes>
        <Route path="/" element={<Home></Home>}></Route>
       <Route path="/login" element={<Login></Login>}></Route>
       <Route path='/pharmacist' element={<Pharmacist></Pharmacist>}></Route>
       <Route path="/customer" element={<Customer></Customer>}></Route>
       <Route path='/custsample' element={<CustSample></CustSample>}></Route>
      </Routes>
    </div>
  );
}

export default App;

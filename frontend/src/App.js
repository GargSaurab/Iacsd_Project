import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Login from './Components/Login';
import Home from './Components/Home';
import Pharmacist from './Components/Pharmacist';
import CustomerList from './Components/CustomerList';
import Search from './Components/SearchBar';
import Trial from './Components/trial';
import Registration from './Components/Register';
import BillComponent from './Components/BillComponent';
import MedicineCard from './Components/MedicineCardList';
import Navbar from './Components/NavBar2'
import { Route, Routes } from 'react-router-dom';
function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/login" element={<Login/>}></Route>
        <Route path='/pharmacist' element={<Pharmacist/>}></Route>
        <Route path="/customerlist" element={<CustomerList/>}></Route>
        <Route path='/search' element={<Search/>}></Route>
        <Route path="/registration" element={<Registration/>}></Route>
        <Route path="/bill" element={<BillComponent/>}></Route>
        <Route path="/trial" element={<Trial/>}></Route>
        <Route path="/medicineCardList" element={<MedicineCard/>}></Route>
        <Route path="/nav" element={<Navbar/>}></Route>
      </Routes>
    </div>
  );
}

export default App;

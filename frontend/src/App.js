import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Navbar';
import  Login from './Components/Login';
import Home from './Components/Home';
import { Route,Routes } from 'react-router-dom';
function App() {
  return (
    <div>
     <Navbar></Navbar>
      <Routes>
        <Route path="/home" element={<Home></Home>}></Route>
       <Route path="/login" element={<Login></Login>}></Route>
      </Routes>
    </div>
  );
}

export default App;

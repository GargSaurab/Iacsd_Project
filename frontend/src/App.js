import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Navbar';
import  Login from './Components/Login';
import { Route,Routes } from 'react-router-dom';
function App() {
  return (
    <div>
     <Navbar></Navbar>
      <Routes>
       <Route path="/login" element={<Login></Login>}></Route>
      </Routes>
    </div>
  );
}

export default App;

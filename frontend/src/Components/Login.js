
import { useNavigate } from 'react-router-dom';
import '../Styles/LoginComponent.css';
import { useState, useEffect, useRef } from 'react';
import PharmaService from '../Service/PharmacistService';
import CustomerService from '../Service/CustomerService';
import ReactDOM from "react-dom";
import { X } from 'lucide-react';

const LoginComponent = ({ onClose }) => {
  const [formDetails, setFormDetails] = useState(
    {
      Username: "",
      Password: ""
    })
  const [errors, setError] = useState({});
  const navigate = useNavigate();

  useEffect(() => {
    document.body.style.overflowY = "hidden";
    return () => {
      document.body.style.overflowY = "scroll";
    };
  }, []);

  const modalLogin=useRef();

  const handleLogin = () => {

    setError({
      Username: '',
      Password: '',
      Login: ''
    }); // resets the login error after login click

    if (formDetails.Username?.trim() === '' || formDetails.Password?.trim() === '') {
      setError({ ...errors, Login: "Please fill all the fields" });

      return;
    }

    if (formDetails.Username?.match(/^emp/)) {
      PharmaService.getAuthorization(formDetails)
        .then((result) => {
          console.log(result);
          if (result.data) {
            console.log(result);
            navigate("/customerlist");
          }
          else {
            setError({ ...errors, Login: "Username or Password didn't match" });
          }
        })
    }
    else {
      CustomerService.getAuthorization(formDetails)
        .then((result) => {
          if (result.data) {
            navigate("/customer");
          }
          else {
            setError({ ...errors, Login: "Username or Password didn't match" });
          }
        })
    }
  }

  const newErrors = { ...errors };

  const handleChange = (event) => {
    let { name, value } = event.target
    setFormDetails({ ...formDetails, [name]: value });
    if (value.trim() === '') {
      newErrors[name] = `${name} is required`;
    }
    else {
      newErrors[name] = null; // Clear the error message if the field is not empty
    }
    setError(newErrors);
  }

  const closeModal=(e)=>{
    if(modalLogin.current === e.target)
    {
      onClose();
    }
  }
 

  return ReactDOM.createPortal(
   
      <div ref={modalLogin} onClick={closeModal} className='modal-wrapper'>
      <div className='login-page '>
        <button onClick={onClose}><X size={30} /></button>
        <table>
          <tbody>
            {/* <tr>
                        <td colSpan="2">
                            <img src="/images/loginSideImage.jpg" alt="Background" className='custom-image' />
                        </td>
                    </tr> */}
            <tr>
              <td>
                <label htmlFor='Username'>Username/Email</label>
              </td>

              <td>
                {errors.Username && <div className="error">{errors.Username}</div>}
              </td>
            </tr>

            <tr>
              <td colSpan="2">
                <input
                  type='text'
                  className="form-control"
                  name='Username'
                  id='Username'
                  value={formDetails.Username}
                  onChange={handleChange}
                  onBlur={handleChange}
                  onKeyDown={(event) => {
                    if (event.key === "Enter") {
                      event.preventDefault();
                      handleLogin();
                    }
                  }}
                />
              </td>
            </tr>

            <tr>
              <td>
                <label htmlFor='Password'>Password</label>
              </td>
              <td>
                {errors.Password && <div className="error">{errors.Password}</div>}
              </td>
            </tr>

            <tr>
              <td colSpan="2">
                <input
                  type='password'
                  className="form-control"
                  name='Password'
                  id='Password'
                  value={formDetails.Password}
                  onChange={handleChange}
                  onBlur={handleChange}
                  onKeyDown={(event) => {
                    if (event.key === "Enter") {
                      event.preventDefault();
                      handleLogin();
                    }
                  }}
                />
              </td>
            </tr>

            <tr>
              <td colSpan="2" align="center">
                <button type="button" className="loginbtn" onClick={handleLogin}>Login</button>
              </td>
            </tr>

            <tr>
              <td colSpan="2" align="center">
                {errors.Login && <div className="error">{errors.Login}</div>}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      </div>,
    document.querySelector(".myLoginPortal")
  );
}


export default LoginComponent;